#repeated elements of tuple
def repeatEle(tup,n):
    print("Repeated elements are:", end=" ")
    for i in range(0,n):
        for j in range(i+1,n):
            if (tup[i]==tup[j]):
                print(tup[i],end=" ")
                break

def main():
    n=int(input("Enter size: "))
    ele=input("Enter ele: ").split()
    tup=tuple(map(int,ele))
    repeatEle(tup,n)
main()