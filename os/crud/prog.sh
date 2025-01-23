# Bash code to create, read, update and delete data

createFun() {
  echo "Creating..."
  
  echo -n "Enter name: "
  read name

  echo -n "Enter roll: "
  read roll

  echo -n "Enter marks: "
  read marks

  echo "$name|$roll|$marks" >> database.txt
}

readFun() {
  echo "Reading..."
  cat database.txt
}

updateFun() {
  echo "Updating..."

  echo -n "Enter roll to be updated: "
  read roll

  li=2
  totalLines=$(wc -l database.txt | cut -d " " -f 1)

  while (($li <= $totalLines)); do
    match=$(head -n $li database.txt | tail -n 1 | cut -d "|" -f 2)

    if [ "$match" == "$roll" ]; then
      echo -n "Enter update(name, roll, marks): "
      read name roll marks 

      prevText="$(head -n $((li - 1)) database.txt)"
      nextText="$(tail -n $((totalLines - li)) database.txt)"

      echo "$prevText" > temp.txt
      echo "$name|$roll|$marks" >> temp.txt
      echo "$nextText" >> temp.txt

      cat temp.txt > database.txt

      echo "[Updation Successful]"
      return
    fi

    li=$((li + 1))
  done

  echo "Roll not found"

}

deleteFun() {
  echo "Deleting..."

  echo -n "Enter roll to be deleted: "
  read roll

  li=2
  totalLines=$(wc -l database.txt | cut -d " " -f 1)

  while (($li <= $totalLines)); do
    match=$(head -n $li database.txt | tail -n 1 | cut -d "|" -f 2)

    if [ "$match" == "$roll" ]; then
      prevText="$(head -n $((li - 1)) database.txt)"
      nextText="$(tail -n $((totalLines - li)) database.txt)"

      echo "$prevText" > temp.txt
      echo "$nextText" >> temp.txt

      cat temp.txt > database.txt

      echo "[Deletion Successful]"
      return
    fi

    li=$((li + 1))
  done

  echo "Roll not found"
}

main() {
  echo "1: Create, 2- Read, 3- Update, 4- Delete, 5- Exit"

  while((1)); do
    echo -n "Enter choice: "
    read ch

    case $ch in
      1)
        createFun
      ;;

      2)
        readFun
      ;;

      3)
        updateFun
      ;;

      4)
        deleteFun
      ;;

      5)
        echo "Exiting..."
        exit 1
      ;;

      *)
        echo "Wrong choice..."
      ;;
    esac

    printf "\n"
  done
}

main