main() {
  echo -n "Enter dob (yyyy-mm-dd): "
  read dob

  today=$(date +%Y-%m-%d)

  dob_seconds=$(date -d $dob +%s)
  today_seconds=$(date -d $today +%s)

  diff=$(( today_seconds - dob_seconds ))

  years=$(( diff / (60*60*24*365) ))
  temp=$(( diff % (60*60*24*365) ))

  months=$(( temp / (60*60*24*30) ))
  temp=$(( temp % (60*60*24*30) ))

  days=$(( temp / (60*60*24) ))

  echo "You are $years years, $months months and $days days old"

  if [ "$days" -eq "0" ] && [ "$months" -eq "0" ]; then
    echo "Happy Birthday"
  fi
}

main