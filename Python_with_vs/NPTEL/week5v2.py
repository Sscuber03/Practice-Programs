g = {"A": 10,"AB": 9, "B": 8,"BC": 7,"C": 6, "CD": 5, "D": 4}

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
            if ll2[3] in dd.keys():
                dd[ll2[3]] = [(dd[ll2[3]][0]+g[ll2[4]]),(dd[ll2[3]][1]+1)]
            else:
                dd[ll2[3]] = [g[ll2[4]],1]
for i in sorted(d.keys()):
    if i in dd.keys():
        res = round(dd[i][0]/dd[i][1],2)
        print("{}~{}~{}".format(i,d[i],res))
    else:
        print("{}~{}~0".format(i,d[i]))
