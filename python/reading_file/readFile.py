x=open("countries.txt","r") #r-reading, w-writing, a-appending, r+ for both reading and writing
print(x.readable()) #checks if file is readable

print(x.readline()) #prints a single line

print(x.readlines()) #stores everything in the file in a list

y=open("countries.txt","w")
y.write("Catia\nCatil\nCatnada\nCatnerica\nCatnland\nCatance")

z=open("countries.txt","a")
z.write("\nWelcome to Meowtopia") #use .write() to append only by selecting "a" in open. There is no .append() in file handling

x.close()