#!/usr/bin/env python3

def hello():
    print('Hello, World')

if __name__ == '__main__':
    hello()


# -- // Program which asks for the user's name then proceeds to greet them

name = str(input("Hello, what is your name?"))
print("Hello," + name + ", nice to meet you!")

# -- // Program which converts a given temperature in Celcius to Fahrenheit

Cel = float(input("Enter temperature in Celcius:"))
Fahrenheit = Cel * 1.8 + 32
print(str(Cel) + "C is equivalent to", str(Fahrenheit) + "F")

# -- // Program which divides a given number of University Students into a given lab size

students = int(input("How many students?"))
group_size = int(input("Required group size?"))

groups = round(students / group_size)

print("There will be " + str(groups), "groups, with ", (students % group_size), " students left over")

# -- // Program which divides a number of sweets between pupils

sweets = int(input("How many sweets?"))
pupils = int(input("How many pupils?"))

sweets_given = round(sweets / pupils)

print("There will be " + str(sweets_given), "sweets handed out, with ", (sweets % pupils), " sweets left over")