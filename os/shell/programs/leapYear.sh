# Calculate leap year

echo -n "Enter year: "
read year

if (( year % 400 == 0 )); then
  echo "Leap Year"
elif (( year % 4 == 0 && year % 100 != 0 )); then
  echo "Leap Year"
else
  echo "Not Leap Year"
fi