create_val() {
  echo -n "Enter Name, Roll and Marks: "
  read input

  name=$(echo $input | cut -d " " -f1)
  roll=$(echo $input | cut -d " " -f2)
  marks=$(echo $input | cut -d " " -f3)

  echo "$name|$roll|$marks" >> database.txt
}

read_val() {
  cat database.txt
}

update_val() {
  echo -n "Enter roll no to be edited: "
  read edit_roll

  li=2
  line_no=$(wc -l database.txt | cut -d " " -f1)

  while [ $li -le $line_no ]
  do
    curr_roll=$(head -n $li database.txt | tail -n 1 | cut -d "|" -f2)

    if [ $curr_roll -eq $edit_roll ]
    then
      echo -n "Enter Name, Roll and Marks: "
      read input

      name=$(echo $input | cut -d " " -f1)
      roll=$(echo $input | cut -d " " -f2)
      marks=$(echo $input | cut -d " " -f3)
    
      head=$(head -n $((li - 1)) database.txt)
      curr="$name|$roll|$marks"
      tail=$(tail -n $((line_no - li)) database.txt)

      printf "$head\n$curr\n$tail\n"> temp_update.txt
      $(cat temp_update.txt > database.txt)
      return
    fi

    li=$((li + 1))
  done

  echo "Roll not present in database!"
}

delete_val() {
  echo -n "Enter roll no to be deleted: "
  read del_roll

  li=2
  line_no=$(wc -l database.txt | cut -d " " -f1)

  while [ $li -le $line_no ]
  do
    curr_roll=$(head -n $li database.txt | tail -n 1 | cut -d "|" -f2)

    if [ $curr_roll -eq $del_roll ]
    then
      head=$(head -n $((li - 1)) database.txt)
      tail=$(tail -n $((line_no - li)) database.txt)

      printf "$head\n$tail\n"> temp_delete.txt
      $(cat temp_delete.txt > database.txt)
      return
    fi

    li=$((li + 1))
  done

  echo "Roll not present in database!"
}

# Main Function
main() {
  echo "1- Create, 2- Read, 3- Update, 4- Delete, 5- exit"

  while [ 1 ]
  do
    echo -n "Enter choice: "
    read ch
    case $ch in
      1)
        create_val
      ;;

      2)
        read_val
      ;;

      3)
        update_val
      ;;

      4)
        delete_val
      ;;

      5)
        echo "Exited Successfully!"
        exit 0
      ;;

      *)
        echo "Entered wrong value!"
      ;;
    esac

    echo "---------------"
    printf "\n"
  done
}

main