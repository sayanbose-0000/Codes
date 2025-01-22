echo -n "Enter year in dd-mm-yyyy format: "
read year

day=$(echo "$year" | cut -d "-" -f 1)
month=$(echo "$year" | cut -d "-" -f 2)
year=$(echo "$year" | cut -d "-" -f 3)

if (($month <= 12)); then
  if (($month == 2 && $day <= 28)); then
    echo "Valid"

  elif (($month != 2 && $day <= 30)); then
    echo "Valid"
  
  elif (($day == 31)); then
    if (($month == 1 || $month == 3 || $month == 5 || $month == 7 || $month == 8 || $month == 10 || $month == 12)); then
      echo "Valid"
    else
      echo "Invalid"
    fi
  else
    echo "Invalid"
  fi
else
  echo "Invalid"
fi