# Write a shell script to find the number of characters, words and lines in a set of files
# given by user through the command line argument.

ls > filelist.txt

for file in $(cat filelist.txt); do

  char=$(wc -c $file | cut -d " " -f 1)
  word=$(wc -w $file | cut -d " " -f 1)
  lines=$(wc -l $file | cut -d " " -f 1)

  echo "$file | char: $char, word: $word, lines: $lines"
done