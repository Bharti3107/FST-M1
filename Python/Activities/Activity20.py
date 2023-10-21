# import pandas

import pandas
from pandas import ExcelFile
from pandas import ExcelWriter

# read the Excel using panda
dataframe = pandas.read_excel("StudentDetails.xlsx",sheet_name="Sheet1")

#print full data
print(dataframe)

# print number of rows and column
print("Number of rows and columns are : ",dataframe.shape)

# print data from email column only
print("Values in Email column are: ")
print(dataframe["Email"])

# Sort data based on Firstname
print("Sort data")
print(dataframe.sort_values('FirstName'))
