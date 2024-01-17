class myClass:
    def __init__(self,name,age): #constructor...self keyword is a must
        self.name=name
        self.age=age
    x=5


namez=input("Enter your name: ")
agez=int(input("Enter your age: "))
c1=myClass(namez,agez) #creating an object of myClass()

print(c1.name)
print(c1.age)

del c1.age #p1's age attribute gets deleted
print(c1.age)

del c1 #deletes the entire object
print(c1)

