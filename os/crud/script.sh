create_data() {
  echo "Creating..."

  echo -n "Enter name: "
  read name

  echo -n "Enter marks roll: "
  read roll

  echo -n "Enter marks: "
  read marks

  echo "$name|$roll|$marks" >> database.txt
}

read_data() {
  echo "Reading..."
  echo "$(cat database.txt)"
}

update_data() {
  echo "Updating..."

  currLineNo=0
  totalLineNo=$(wc -l database.txt | cut -d " " -f 1)
  
  echo -n "Enter roll to be updated: "
  read roll

  while (( $currLineNo <= $totalLineNo )); do
    currRoll=$(head -n $currLineNo database.txt | tail -n 1 | cut -d "|" -f 2)

    if [ "$currRoll" == "$roll" ]; then
      echo -n "Enter new name: "
      read name

      echo -n "Enter new roll: "
      read roll

      echo -n "Enter new marks: "
      read marks

      a=$( head -n $((currLineNo - 1)) database.txt )
      b=$( tail -n $((totalLineNo - currLineNo )) database.txt )
      
      echo "$a" > database.txt
      echo "$name|$roll|$marks" >> database.txt
      echo "$b" >> database.txt

      return
    fi
    currLineNo=$(( currLineNo + 1 ))
  done

  echo "Roll not found"
}

delete_data() {
  echo "Deleting..."

  currLineNo=0
  totalLineNo=$(wc -l database.txt | cut -d " " -f 1)
  
  echo -n "Enter roll to be deleted: "
  read roll

  while (( $currLineNo <= $totalLineNo )); do
    currRoll=$(head -n $currLineNo database.txt | tail -n 1 | cut -d "|" -f 2)

    if [ "$currRoll" == "$roll" ]; then
      a=$( head -n $((currLineNo - 1)) database.txt )
      b=$( tail -n $((totalLineNo - currLineNo )) database.txt )
      
      echo "$a" > database.txt
      echo "$b" >> database.txt

      return
    fi
    currLineNo=$(( currLineNo + 1 ))
  done

  echo "Roll not found"
}

main() {
  echo "1: Create 2: Read, 3: Update, 4: Delete, 5: Exit"
  printf "\n"

  while (( 1 )); do
    echo -n "Enter choice: "
    read ch
    
    case $ch in
      1)
        create_data
      ;;
      2)
        read_data
      ;;
      3)
        update_data
      ;;
      4)
        delete_data
      ;;
      5)
        echo "Exiting..."
        exit 0
      ;;
      *)
        echo "Wrong choice, Please re-enter"
      ;;
    esac

    printf "\n"
  done
}

main