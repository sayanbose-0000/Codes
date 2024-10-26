import math

def circle(radius):
    return math.pi * radius * radius

def square(side):
    return math.pow(side, 2)

def rectangle(length, breadth):
    return length * breadth

def triangle(base, height):
    return 0.5 * base * height

def main():
    print("Enter choice - area of circle, square, rectangle, triangle, exit")
    while (True):
        choice = input()

        if (choice == "circle"):
            radius = float(input("Enter radius: "))
            res = circle(radius)

        elif (choice == "square"):
            side = float(input("Enter side: "))
            res = square(side)

        elif (choice == "rectangle"):
            length = float(input("Enter length: "))
            breadth = float(input("Enter breadth: "))
            res = rectangle(length, breadth)
        
        elif (choice == "triangle"):
            base = float(input("Enter base: "))
            height = float(input("Enter height: "))
            res = triangle(base, height)
        
        elif (choice == "exit"):
            exit(0)
        
        else:
            print("Wrong choice")
            continue
        
        print(f"The area of {choice} is {res}")


main()
