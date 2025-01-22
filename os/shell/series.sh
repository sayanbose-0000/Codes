# f(x, n) = 1 + x^2/2! + x^4/4! + ...
# f(x, n) = x^0/0! + x^2/2! + x^4/4! + ...

fact() {
  n=$1

  fact=1

  for (( i=1; i<=n; i++ )); do
    fact=$(( fact * i ))
  done

  echo $fact
}

main() {
  echo -n "Enter x: "
  read x

  echo -n "Enter n: "
  read n

  count=0
  i=1
  res=0

  while (( i <= n )); do
    factorial=$(fact $count)
    power=$(echo "scale=4; $x ^ $count" | bc)

    temp=$(echo "scale=4; $power / $factorial" | bc)

    res=$(echo "scale=4; $res + $temp" | bc)

    count=$((count + 2))
    i=$((i+1))
  done

  echo "Result is: $res"
}

main