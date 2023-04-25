#!/usr/bin/env python3

# -- // Program which prints 'Hello world'

if __name__ == '__main__':
    
    print("Hello world")
    

# -- // Program which prints a greeting to me!

if __name__ == '__main__':
     
     print("Hello, Kav")
    

# -- // Program which converts 38.4 Celcius to Fahrenheit

if __name__ == '__main__':
    
    Cel = 38.4
    Fahrenheit = Cel * 1.8 + 32
    print(str(Cel) + "C is equivalent to", str(Fahrenheit) + "F")
    

# -- // Program which calculates the batting average of Crickiter Geoffrey Boycott

if __name__ == '__main__':
    
    runs = 48426
    not_out = 162
    times_batted = 1014
    batting_average = int((runs / (times_batted - not_out)))
                       
    print("Boycott's batting average for Yorkshire was", str(batting_average))
    

# -- // Program which displays how many lab groups will be needed for a university

if __name__ == '__main__':
    
   print("With 133 students there will be",  (113 // 24),  "full labs, with",  (113 % 24),  "students left over.")
   print("With 175 students there will be",  (175 // 24),  "full labs, with",  (175 % 24),  "students left over.")
   print("With 12 students there will be",  (12 // 24),  "full labs, with",  (12 % 24),  "students left over.") 
