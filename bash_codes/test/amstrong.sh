echo -n "Enter no: "
read num

old_num=$num
num2=$num
sum=0

p=0

while [ $num2 -gt 0 ]
do
  num2=$((num2 / 10))
  p=$((p+1))
done

while [ $num -gt 0 ]
do
  rem=$((num % 10))
  temp=$(echo "$rem ^ $p" | bc)
  sum=$((sum + temp))

  num=$((num / 10))
done

echo "$old_num $sum $p"

if [[ $old_num == $sum ]]
then
  echo "Armstrong no"
else
  echo "Not Armstrong no"
fi