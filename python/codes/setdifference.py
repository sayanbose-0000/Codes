#Set difference
#{1,2,3,4,5}-{3,4}={1,2,5}
def setDiff(s1,s2):
    return s1.difference(s2)


def main():
    ele1=input("Enter ele of set1: ").split()
    s1=set(map(int,ele1))

    ele2=input("Enter ele of set 2: ").split()
    s2=set(map(int,ele2))

    s3=setDiff(s1,s2)
    print(s3)

main()
