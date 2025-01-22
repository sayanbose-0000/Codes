# a) Write a shell script to calculate the first n numbers of the Fibonacci series .i.e. 0 1 1 2
# 3 5 8... and store the result in an output file.

echo -n "Enter num: "
read n;

arr[0]=0
arr[1]=1

for ((i=2; i<n; i++)); do
  a=$(( ${arr[i-1]} ))
  b=$(( ${arr[i-2]} ))
  temp=$(( $a + $b ))
  arr[i]=$temp
done

echo "${arr[@]}"