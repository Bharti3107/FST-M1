# declaring a function to generate fibonacci number
def fibonacci_number(num):
    if num <=1:
        return num
    else:
        return (fibonacci_number(num-1)+fibonacci_number(num-2))

# user input
userInput = int(input("Enter a number: "))
if userInput <= 0:
     print("Enter the postive no:")
else:
    print("fibonacci series is: ")
for i in range(userInput):
 print(fibonacci_number(i))

