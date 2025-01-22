# a)Write a shell script to find out the palindrome word from a file (omit "." or ";" or "," after the
# word)

for li in $(cat file.txt); do
  echo $li
done