li=1
totalLine=$(wc -l day.txt | cut -d " " -f 1)

while (($li <= $totalLine)); do 
  day=$(head -n $li day.txt | tail -n 1 | cut -d " " -f 1)
  temp=$(head -n $li day.txt | tail -n 1 | cut -d " " -f 2)

  x=$((temp))

  echo -n "$day | $temp ----> "
  if (( $temp < 15 )); then
    echo "Very Cold"
  elif (( $temp >= 15 && $temp < 25 )); then
    echo "Cold"
  elif (( $temp >= 25 && $temp < 35 )); then
    echo "Hot"
  else 
    echo "Very Hot"
  fi

  li=$((li + 1))
done