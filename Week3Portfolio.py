#!/usr/bin/env python3

def hello():
    print('Hello, World')

if __name__ == '__main__':
    hello()

# -- // Program which asks for the user's name then proceeds to greet them

name = input("Hello, what is your name?")
if name:
    print("Hello," + name + ", nice to meet you!")
else:
    print("Hello, Stranger.")

# -- // Program which simulates a password creation system

bad_passwords = ['password', 'letmein', 'sesame', 'hello', 'justinbieber']

password = input("Enter a password:")
password_set = input("Please confirm your password:")

if password == password_set and len(password) >= 8 and len(password) <= 12 and password not in bad_passwords:
    print("Password set successfully!")
else:
    print("Error, passwords do not match.")

# -- // Program which displays the seven times table

while True:
    num = int(input("Which times table do you wish to view?"))

    if 0 <= num <=12:
        for i in range(1, 13):
            print(num, "x", i, "=", num*i)
        break
    else:
        print("The value you have chosen is out of range.")
