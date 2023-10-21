numbers = list(input("Enter numbers separated by commas: ").split(","))
firstNumber = numbers[0]
lastNumber = numbers[-1]
if(firstNumber == lastNumber):
    print("True")
else:
    print("False")
