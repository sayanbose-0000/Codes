x=$1
y=$2

it=1
res=0

while [ $it -le $x -a $it -le $y ]
do
  if [ $((x % it)) -eq 0 -a $((y % it)) -eq 0 ]
  then
    res=$it
  fi

  it=$((it+1))
done

echo $res
