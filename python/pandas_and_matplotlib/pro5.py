# Write a program that generates a quiz and uses two files - Questions.txt and Answer.txt. The program opens Questions.txt and reads a question and displays the question with options on the screen. The program then opens the Answer.txt file and displays the correct answers.

import random

file1=open('Questions.txt','r')
file2=open('Answers.txt','r')

questions = file1.readlines()
answers=file2.readlines()

i=random.randint(0, len(questions)-1)
print(i)

print(f"Question {questions[i]}")
ans=int(input("Enter option number: "))
if (ans==int(answers[i])):
    print("Correct!")
else:
    print("Wrong correct answer is: ", answers[i])

file1.close()
file2.close()