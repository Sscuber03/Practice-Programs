def threesquares(m):
    while m%4==0:
        m = m/4
    if m%8 == 7:
        return False
    else:
        return True
    
    
print (threesquares(6))
print (threesquares(188))
print (threesquares(1000))
print (threesquares(143)) 
print (threesquares(1024))       