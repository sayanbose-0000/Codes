#create a symmetric set difference
#{1, 2, 3, 4} sym diff {3, 4, 5}= {1, 2, 5} (contains elements that are in either A or B but not in both)
def symmetricSetDifference(s1,s2):
    s3=s1.intersection(s2)
    s1=s1.union(s2)
    s1=s1.difference(s3)
    return s1

def main():
    ele1=input("Enter ele of set1: ").split()
    s1=set(map(int,ele1))
    
    ele2=input("Enter ele of set2: ").split()
    s2=set(map(int,ele2))

    x=symmetricSetDifference(s1,s2)
    print(x)

main()
