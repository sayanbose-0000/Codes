#find union and intersection of 2 lists

li1=list()
li2=list()

n1=int(input(("Enter size of list 1: ")))
for i in range(0,n1):
    li1.append(int(input()))

n2=int(input(("Enter size of list 2: ")))

for i in range(0,n2):
    li2.append(int(input()))

li1=set(li1)
li2=set(li2)

print("Union:",li1.union(li2))
print("Intersection:",li1.intersection(li2))