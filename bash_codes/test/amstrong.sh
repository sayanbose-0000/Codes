# amstrong number

num=$1
store_num=$num
count=0

while [ $num -gt 0 ]
do
  num=$((num / 10))
  count=$((count + 1))
done

num=$store_num

sum=0
while [ $num -gt 0 ]
do
  a=$((num % 10))
  pow=$(echo "$a^$count" | bc)
  sum=$((sum + pow))
  num=$((num / 10))
done

if [ $sum -eq $store_num ]
then
  echo "Amstrong Number"
else
  echo "Not Amstrong Number"
fi