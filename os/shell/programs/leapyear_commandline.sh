leapYear() {
  year=$1

  if (( year % 400 == 0 )); then
    echo "$year -> Leap Year"

  elif (( year % 4 == 0 && year % 100 != 0 )); then
    echo "$year -> Leap Year"
  
  else 
    echo "$year -> Not Leap Year"
  fi
}

arr=($@)

n=${#arr[@]}

for ((i=0; i<n; i++)); do
  leapYear ${arr[i]}
done