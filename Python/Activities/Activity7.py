"""list1 = [1, 2, 3, 4]
sum1 = 0
for i in list1:
    sum1 += i
    print(sum1)"""


from openpyxl.compat import numbers

numbers = list(input("Enter numbers separated by comms: ").split(","))
sum = 0

for number in numbers:
    print(number)
    sum += int(number)
print(sum)
