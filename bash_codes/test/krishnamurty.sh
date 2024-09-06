# Factorial Function
fact() {
  n=$1
  res=1
  while [ $n -gt 1 ]
  do
    res=$((res * n))
    n=$((n - 1))
  done
  echo $res
}

# Main function
main() {
  echo -n "Enter num: "
  read num

  store_num=$num

  sum=0
  while [ $num -gt 0 ]
  do
    rem=$((num % 10))
    a=$(fact $rem)
    sum=$((sum + a))
    num=$((num / 10))
  done

  if [ $store_num -eq $sum ]
  then
    echo "Krishnamurty"
  else
    echo "Not Krishnamurty"
  fi
}


main