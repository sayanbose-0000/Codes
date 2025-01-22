# a)Write a shell script to find out the palindrome word from a file (omit "." or ";" or "," after the
# word)

wordReverse() {
  word=$1

  cleanWord=""
  i=0
  size=${#word}

  while (( i <= size )); do
    temp=${word:i:1}

    if [[ $temp == "." || $temp == ";" || $temp == "," || $temp == "'" ]]; then
      i=$((i+1))
      continue
    fi

    cleanWord+=$temp
    i=$((i+1))
  done





  revWord=""
  j=${#word}

  while (( j >= 0 )); do
    temp=${word:$j:1}

    if [[ $temp == "." || $temp == ";" || $temp == "," || $temp == "'" ]]; then
      j=$((j-1))
      continue
    fi

    revWord+=$temp
    j=$((j-1))
  done

  if [[ "$cleanWord" == "$revWord" ]]; then
    echo "$word"
  fi
}

palindromeChecker() {
  word=$1
  # echo $word
  
  # rev=$(wordReverse $word)
  # echo "$rev"
  wordReverse $word

}

for word in $(cat file.txt); do
  palindromeChecker $word
done