s = "brown fox grey dog brown fox"
print(s.find("brown"))
print(s.find("brown",5,len(s)))
print(s.find("yellow"))
print(s.index("fox"))
try:
    print(s.index("yellow"))
except ValueError:
    print("The last command gave a value error as the pattern was not found")

print(s.replace("brown","black"))
print(s.replace("brown","black",1)) # Does not change the value of s, just returns the changed string, the value of s is intact, as a string is immutable

csvline = "6,7,8"
print(csvline.split(","))
print(csvline.split(",",1))
columns = csvline.split(",")
csvline2 = ",".join(columns)
print(csvline2)

day = '16'
month = '08'
year = '2003'
date = "-".join([day,month,year])
print(date)

string = 'hello world'
print(string.capitalize()) # Capitalize only first character
print(string.title()) # Capitalizes first letter of every word
print(string.upper())
ss = 'Hello World'
print(ss.lower())
print(ss.swapcase())
strtest = 'hello'
print(strtest.center(50))
print(strtest.center(50, '-'))
print(strtest.ljust(50,'-'))
print(strtest.rjust(50,'-'))

print(day.isalpha())
print(day.isnumeric())
b = 'ssk647'
print(b.isalpha())
print(b.isnumeric())
