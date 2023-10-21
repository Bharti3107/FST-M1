# Import pandas
import pandas

# create data as dictionary
data = {
        "Usernames": ["admin", "Charles", "Deku"],
        "Password": ["password", "Charl13", "AllMight"]
       }

# create new dataframe using pandas
dataframe = pandas.DataFrame(data)
print(dataframe)

# write data into dataframe
dataframe.to_csv('sample.csv')
print("Data is written into the file")
