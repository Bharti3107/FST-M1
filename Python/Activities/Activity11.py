# creating a dictionary
fruit_dict = {"Apple": 100,
              "Guava": 120,
              "Banana": 35,
              "Grapes": 200}
# asking user to provide the input
fruit_to_check = input("Enter the fruit name that you want: ")
# checking user input fruit present or not
if fruit_to_check in fruit_dict:
    print("Fruit is available in the shop is: ",fruit_to_check)
    print(fruit_dict.items())
else:
    print("Fruit is not available in the shop")
