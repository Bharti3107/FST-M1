# import panda

import pandas

# read the data from csv file
dataframe = pandas.read_csv('UserDetails.csv')

# print full data
print("Full data is: ")
print(dataframe)

# print the value of username column
print("value of Username column are: ")
print(dataframe["Usernames"])

# print username and password of 2nd row
print("Username and password of 2 row is: ")
print("Username is: ",dataframe["Usernames"][1],"and" "Password is: ",dataframe["Password"][1])


# sort username column is asending order
print("Sort username column in Ascending order")
print(dataframe.sort_values("Usernames"))

# sort username column is desending order
print("Sort username column in descending order")
print(dataframe.sort_values("Usernames",ascending=False))

