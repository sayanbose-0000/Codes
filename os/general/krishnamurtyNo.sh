# Find if no is a krishnamurty number

factorial() {
  n=$1
  fact=1

  for (( i=1; i<=n; i++ )); do
    fact=$((fact * i))
  done

  echo $fact
}

krishnamurty() {
  n=$1
  x=$n
  res=0

  while (( x != 0 )); do
    dig=$(( x % 10 ))
    calc=$(factorial $dig)
    res=$(( res + calc ))
    x=$(( x / 10 ))
  done

  echo $res
}


main() {
  echo -n "Enter no: "
  read n

  res=$(krishnamurty $n)

  echo "n: $n, res: $res" 

  if (( res == n )); then
    echo "Krishnamurty"
  else
    echo "Not Krishnamurty"
  fi
}

main