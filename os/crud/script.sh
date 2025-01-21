create_data() {
  echo "Creating..."
  
}

read_data() {
  echo "Reading..."
}

update_data() {
  echo "Updating..."
}

delete_data() {
  echo "Deleting..."
}

main() {
  echo "1: Create 2: Read, 3: Update, 4: Delete"

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