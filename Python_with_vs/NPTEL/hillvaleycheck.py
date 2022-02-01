def hillvalley(l):
    if len(l) < 3:
        return False
    hill=0
    valley=0
    for i in range (1,len(l)-1):
        if l[i]>l[i+1] and l[i]>l[i-1]:
            hill+=1
        if l[i]<l[i+1] and l[i]<l[i-1]:
            valley+=1    
    return (hill == 1 and valley == 0) or (hill == 0 and valley == 1)
        

print (hillvalley([1,2,3,5,4]))
print (hillvalley([1,2,3,4,5]))
print (hillvalley([5,4,1,2,3]))
print (hillvalley([5,4,3,2,1]))
print (hillvalley([1,2,3,5,4,3,2,1]))
print (hillvalley([1,2,3,4,5,3,2,4,5,3,2,1]))
print (hillvalley([9,5,4,-1,-2,3,7]))
print (hillvalley([5,4,3,2,1,0,-1,-2,-3]))