# calculate the sum of list elements
# declare a function
def calculate_sum(numbers):
    sum = 0;
    for number in numbers:
        sum += int(number)
    return sum


# call the function
list1 = [1, 2, 3, 4]
result =calculate_sum(list1)
print("Sum of the list element: ",result)
