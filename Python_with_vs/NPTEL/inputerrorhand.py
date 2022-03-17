while(True):
    try:
        userdata = input("Enter a number: ")
        usernum = int(userdata)
    except ValueError:
        print("Not a number, try again.")
    else:
        break

print(usernum ** 2)
x = int(input("Enter the value of x: "))
y = int(input("Enter the value of y: "))
print("The value of x is: ",x," and y is: ",y,sep = "",end = ".\n")