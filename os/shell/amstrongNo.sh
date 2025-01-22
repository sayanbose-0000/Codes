# Calculate amstrong number

countDigit() {
  n=$1
  x=$n
  count=0

  while (( x != 0 )); do
    x=$((x/10));
    count=$((count + 1))
  done

  echo $count
}

amstrong() {
  digitCount=$1
  n=$2
  result=0

  x=$n

  while ((x != 0)); do
    dig=$((x % 10))
    calc=$(echo "$dig ^ $digitCount" | bc)
    res=$((res + calc))
    x=$((x/10))
  done

  echo $res
}

main() {
  echo -n "Enter n: "
  read n

  digitCount=$(countDigit $n)

  echo "No of digits: $digitCount"

  res=$(amstrong $digitCount $n)

  echo "Res: $res"

  if (( res == n  )); then
    echo "Amstrong"
  else
    echo "Not Amstrong"
  fi
}

main