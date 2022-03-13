from datetime import datetime
n=int(input())
res = ""
for i in range(n):
    res = ""
    tt=input()
    nn=int(input())
    for j in range(nn):
        str1,str2 = input().split(',')
        dt1 = datetime.strptime(str1,'%I:%M %p')
        dt2 = datetime.strptime(str2,' %I:%M %p')
        dt = datetime.strptime(tt,'%I:%M %p')
        if dt1<=dt and dt<=dt2:
            res += "1"
        else:
            res += "0"
    print(res)
        
        

