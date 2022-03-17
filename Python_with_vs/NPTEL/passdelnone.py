while(True):
    try:
        userdata= input("Enter a number: ")
        usernum = int(userdata)
    except ValueError:
        pass #print("Not a number, try again.")    to not do anything, we use pass
    else:
        break;
print(usernum**2)

l = list(range(10))
print(l)
del(l[4]) # also works for dictionary,in the same way
print(l)

x=7
del(x)

# try:     if this block is present, it will not give error
#     x
# except NameError:
#     x=5

# x = None      to check if a variable ha no value assigned to it
# if x is not None:
#     y=x

try:
    y = x+5
except NameError:
    print("Name error given out")
else:
    print(y)
