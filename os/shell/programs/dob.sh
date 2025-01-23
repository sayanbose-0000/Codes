echo "Enter dob(dd-mm-yyyy): "
read dob

todayDay=$(date +%d)
todayMonth=$(date +%m)
todayYear=$(date +%Y)

dobDay=$(echo "$dob" | cut -d "-" -f 1)
dobMonth=$(echo "$dob" | cut -d "-" -f 2)
dobYear=$(echo "$dob" | cut -d "-" -f 3)

calcDay=0
calcMonth=0
calcYear=0

calcDay=$((todayDay - dobDay))
calcMonth=$((todayMonth - dobMonth))
calcYear=$((todayYear - dobYear))

if ((calcDay < 0)); then
  calcDay=$((calcDay + 30))
  calcMonth=$((calcMonth - 1))
fi

if ((calcMonth < 0)); then
  calcMonth=$((calcMonth + 12))
  calcYear=$((calcYear - 1))
fi

echo "$calcYear years, $calcMonth months and $calcDay days old"