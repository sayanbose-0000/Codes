# Krishnamurty number
factorial() {
  n=$1
  fact=1

  for ((i=1; i<=n; i++)) {
    fact=$((fact * i))
  }

  echo $fact
}

num=$1
old_num=$num
new_num=0

while [ $num -gt 0 ]
do
  rem=$((num % 10))
  temp=$(factorial $rem)
  new_num=$((new_num + temp))
  num=$((num / 10))
done

if [[ $old_num == $new_num ]]
then 
  echo "Krishnamurty"
else
  echo "Not Krishnamurty"
fi