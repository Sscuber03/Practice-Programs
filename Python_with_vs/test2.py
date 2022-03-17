n = 10
L = list(map(int,input().split()))
c=0
l=[]
for i in L:
  if i == 0:
    c+=1
  else:
    l.append(i)
l.extend([0]*c)
print(l,end="")