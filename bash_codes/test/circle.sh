echo -n "Enter rad: "
read r

for i in $(seq 0 5 360)
do
  th1=$(echo "scale=4; 3.4 / 180 * $i" | bc | awk '{print cos($1)}')
  th2=$(echo "scale=4; 3.4 / 180 * $i" | bc | awk '{print sin($1)}')

  x=$(echo "scale=4; $r* $th1" | bc |  awk '{print int($1)}')
  y=$(echo "scale=4; $r* $th2" | bc |  awk '{print int($1)}')

  x=$((x + 12))
  y=$((y + 40))

  tput cup $x $y
  printf "*"
done

tput cup $(tput lines)