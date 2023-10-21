# Calculate the sum of numbers
# using recursion
"""def sum(n):
    if n <= 1:
        return n
    else:
        return n + sum(n - 1)


num = int(input("Enter a number: "))
print("The sum is: ", sum(num))"""


# Calculate sum of numbers from 0 to 10
# using recursion
def sum(num=10):
    if num <= 0:
        return num
    else:
        return num + sum(num - 1)
print("Sum of 0 to 10 number is:",sum())

