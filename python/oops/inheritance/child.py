#inherit parent class's properties to child class

from parent import Student #don't write parent.py

class favStudent(Student): #Student inside bracket means imported class
    pass

fp1=favStudent()

print(fp1.name)