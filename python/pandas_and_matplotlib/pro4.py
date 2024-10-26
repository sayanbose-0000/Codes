# Write a program that reads a file line by line. Each line read from the file1 is copied to another file with line number specified at the beginning of the line.

data1_file=open('pro4_1.txt','r')
data1= data1_file.read()

data2_file=open('pro4_2.txt','w')

data2_file.write(data1)

print("Data copied successfully")

data1_file.close()
data2_file.close()
