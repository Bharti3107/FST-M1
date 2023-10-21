# import pandas
import pandas
from pandas import ExcelFile
from pandas import ExcelWriter

# create data as dictionary
data = {
    "FirstName": ["Satvik", "Avinash", "Lahri"],
    "LastName": ["Shah", "Kati", "Rath"],
    "Email": ["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"],
    "PhoneNumber":[4537829158,5892184058,4528727830]
     }

# create dataframe using panda
dataframe = pandas.DataFrame(data)

# create an object for ExcelWriter
write = ExcelWriter('StudentDetails.xlsx')

# write the data into Excel file
dataframe.to_excel(write,"Sheet1",index=False)

# Save file
write._save()
print("Excel created")