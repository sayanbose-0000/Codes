#Write a python function that takes a list and returns a new list with unique elements of the first list

n=int(input("Enter the size of the list: "))
li=list()

for i in range(0,n):
    li.append(int(input()))
li=set(li) #converting to set so that unique elements are selected
li=list(li) #converting back to list because answer is needed as list

print(li)