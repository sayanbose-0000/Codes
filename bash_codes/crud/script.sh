# crud

echo "1- create, 2- read, 3- update, 4- delete, 5- exit"

create_fun() {
  echo -n "Enter name: "
  read name
  echo -n "Enter roll: "
  read roll
  echo -n "Enter marks: "
  read marks

  echo "$name|$roll|$marks" >> data.txt
}

read_fun() {
  echo "$(cat data.txt)"
}

update_fun() {
  echo -n "Enter roll you want to update: "
  read entered_roll

  line_no=$(wc -l < data.txt)
  li=1

  while [ $li -le $line_no ] 
  do

    curr_roll=$(head -n $li data.txt | tail -n 1 | cut -d "|" -f 2)

    if [ "$curr_roll" == "$entered_roll" ]
    then
        echo -n "Enter new name: "
        read name
        echo -n "Enter new roll: "
        read roll
        echo -n "Enter new marks: "
        read marks
        
        above_value=$(head -n $((li-1)) data.txt)
        updated_value="$name|$roll|$marks"
        below_value=$(tail -n $((line_no - li)) data.txt)

        printf "%s\n" "$above_value" "$updated_value" "$below_value" > temp_update.txt
        $(cat temp_update.txt > data.txt)
        return
    fi

    li=$((li+1))
  done

  echo "Data not found!"
}

delete_fun() {
  echo -n "Enter roll you want to delete: "
  read entered_roll

  line_no=$(wc -l < data.txt)
  li=1

  while [ $li -le $line_no ] 
  do
    curr_roll=$(head -n $li data.txt | tail -n 1 | cut -d "|" -f 2)

    if [ "$curr_roll" == "$entered_roll" ]
    then
        above_value=$(head -n $((li-1)) data.txt)
        below_value=$(tail -n $((line_no - li)) data.txt)

        printf "%s\n" "$above_value" "$below_value" > temp_delete.txt
        $(cat temp_delete.txt > data.txt)
        return
    fi

    li=$((li+1))
  done

  echo "Data not found!"
}

while [ 1 ]
do
  printf "\n"
  echo -n "Enter choice: "
  read a

  case $a in
    1)
      create_fun
    ;;

    2)
      read_fun
    ;;

    3)
      update_fun
    ;;

    4)
      delete_fun
    ;;

    5)
      echo "Exited program!"
      exit 0
    ;;

    *)
      echo "Wrong choice entered!"
    ;;
  esac

  printf "\n"
  echo "--------"
done


# Output


# User@LAPTOP-6V0P4MOJ MINGW64 /d/sayan/Codes/bash/crud (main)
# $ sh script.sh
# 1- create, 2- read, 3- update, 4- delete, 5- exit

# Enter choice: 2
# Name|Roll|Marks
# aaa|11|50
# bbb|5|59
# ccc|15|79
# ddd|99|99
# eee|20|99
# fff|62|65
# ggg|243|54
# hhh|88|96
# iii|22|66

# --------

# Enter choice: 1
# Enter name: jjj
# Enter roll: 55
# Enter marks: 66

# --------

# Enter choice: 2
# Name|Roll|Marks
# aaa|11|50
# bbb|5|59
# ccc|15|79
# ddd|99|99
# eee|20|99
# fff|62|65
# ggg|243|54
# hhh|88|96
# iii|22|66
# jjj|55|66

# --------

# Enter choice: 3
# Enter roll you want to update: 99
# Enter new name: kkk
# Enter new roll: 44
# Enter new marks: 55

# --------

# Enter choice: 2
# Name|Roll|Marks
# aaa|11|50
# bbb|5|59
# ccc|15|79
# kkk|44|55
# eee|20|99
# fff|62|65
# ggg|243|54
# hhh|88|96
# iii|22|66
# jjj|55|66

# --------

# Enter choice: 4
# Enter roll you want to delete: 243

# --------

# Enter choice: 2
# Name|Roll|Marks
# aaa|11|50
# bbb|5|59
# ccc|15|79
# kkk|44|55
# eee|20|99
# fff|62|65
# hhh|88|96
# iii|22|66
# jjj|55|66

# --------

# Enter choice: 3
# Enter roll you want to update: 555
# Data not found!

# --------

# Enter choice: 4
# Enter roll you want to delete: 666
# Data not found!

# --------

# Enter choice: 5
# Exited program!
