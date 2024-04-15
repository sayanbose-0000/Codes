# Write a program that counts the number of tabs, spaces and newline characters in a file.

data1=open('pro3.txt','r')
data= data1.read()

print("No of tabs:", data.count('\t'))
print("No of spaces:", data.count(' '))
print("No of new-lines:", data.count('\n'))

data1.close()