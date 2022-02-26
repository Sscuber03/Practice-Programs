from re import L


lines = []
line = ""
while line != "EndOfInput":
    line = input()
    if line:
        lines.append(line)
d={}
dd={}
chkstr = ""
for l in lines:
    if l == "Courses" or l == "Students" or l == "Grades":
        chkstr = l
    elif l == "EndOfInput":
        break
    else:
        if chkstr == "Students":
            ll1 = l.split("~")
            d[ll1[0]] = ll1[1]
        elif chkstr == "Grades":
            ll2 = l.split("~")
            g=0;
            if ll2[4] == "A":
                g=10
            if ll2[4] == "AB":
                g=9
            if ll2[4] == "B":
                g=8
            if ll2[4] == "BC":
                g=7
            if ll2[4] == "C":
                g=6
            if ll2[4] == "CD":
                g=5
            if ll2[4] == "D":
                g=4
            if ll2[3] in dd.keys():
                dd[ll2[3]] = [(dd[ll2[3]][0]+g),(dd[ll2[3]][1]+1)]
            else:
                dd[ll2[3]] = [g,1]
for i in sorted(d.keys()):
    if i in dd.keys():
        res = round(dd[i][0]/dd[i][1],2)
        print("{}~{}~{}".format(i,d[i],res))
    else:
        print("{}~{}~0".format(i,d[i]))
