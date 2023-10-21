# declaring list
list1 = [1, 2, 3, 4, 5]
list2 = [6, 7, 8, 9, 10]

# declaring an empty 3rd list
list3 = []

# print the list1 and list2
print("List 1 is: ",list1)
print("List 2 is: ",list2)

# find odd numbers from list1
for i in list1:
    if i % 2 != 0:
        list3.append(i)

# find even numbers from list1
for j in list2:
  if (j % 2 == 0):
    list3.append(j)

#print new list
print("New list is")
print(list3)

