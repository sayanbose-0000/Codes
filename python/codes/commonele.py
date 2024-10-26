#Takes 2 lists and returns True if atleast one is common
def commonMember(li1,n1,li2,n2):
    for i in range(0,n2):
        for j in range(0,n1):
            if li1[i]==li2[j]:
                return True
def main():
    li1=list()
    li2=list()

    n1=int(input("Enter size of list 1: "))
    for i in range(0,n1):
        li1.append(int(input()))

    n2=int(input("Enter size of list 2: "))

    for i in range(0,n2):
        li2.append(int(input()))

    x=commonMember(li1,n1,li2,n2)
    if(x==True):
        print("True")
    else:
        print("False")

main()