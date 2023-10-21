"""t = (1,5,3,15,20)
for x in t:
    if(x%5==0):
        print(x)"""
# taking input from the user
numbers = tuple(input("Enter numbers separated by commas: ").split(","))
print("Element divisible by 5 are: ")
for x in numbers:
    if int(x) % 5 == 0:
        print(x)
