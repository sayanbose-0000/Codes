num=$1
stored_num=$num

krishnamurty () {
  num=$1
  sum=0

  while [ $num -gt 0 ]
  do
    rem=$((num % 10))
    fact=$(factorial $rem)
    sum=$((sum + fact))

    num=$((num / 10))
  done

  echo $sum
}

factorial () {
  rem=$1
  i=1
  prod=1

  while [ $i -le $rem ]
  do
    prod=$((prod*i))
    i=$((i+1))
  done

  echo "$prod"
}

res=$(krishnamurty $num)

if [ $stored_num -eq $res ]
then
  echo "Krishnamurty No."
else
  echo "Not Krishnamurty No."
fi