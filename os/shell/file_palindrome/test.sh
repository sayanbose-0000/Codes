word=$1

rev=""

i=${#word}

while (( i >= 1 )); do
  temp=${word:$((i-1)):1}
  if [[ "$temp" == "." || "$temp" == ";" || "$temp" == "," ]]; then
    i=$(( i - 1 ))
    continue
  fi

  # echo "i: $i"
  # echo "rev: $rev"
  rev+=$temp
  i=$(( i - 1 ))
done

echo "$rev ans"
