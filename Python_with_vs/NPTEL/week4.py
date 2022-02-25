def orangecap(d):
    dd={}
    for k,nd in d.items():
        for kk,n in nd.items():
            if kk in dd.keys():
                dd[kk] += n;
            else:
                dd[kk] = n
    max_k = max(dd,key=dd.get)
    max_v=dd[max_k]
    t=max_k,max_v
    return t

def addpoly(p1,p2):
    d={}
    for t in p1:
        d[t[1]] = t[0]
    for tt in p2:
        if tt[1] in d.keys():
            d[tt[1]] += tt[0]
        else:
            d[tt[1]] = tt[0]
    l=[]
    for dk in sorted(d.keys(),reverse=True):
        if d[dk]!=0:
            l.append((d[dk],dk))
    return l

def multpoly(p1,p2):
    d={}
    for t1 in p1:
        for t2 in p2:
            if t1[1]+t2[1] in d.keys():
                d[t1[1]+t2[1]] += (t1[0]*t2[0])
            else:
                d[t1[1]+t2[1]] = (t1[0]*t2[0])
    l=[]
    for dk in sorted(d.keys(),reverse=True):
        if d[dk]!=0:
            l.append((d[dk],dk))
    return l

print(orangecap({'match1':{'player1':57, 'player2':38}, 'match2':{'player3':9, 'player1':42}, 'match3':{'player2':41, 'player4':63, 'player3':91}}))
print(orangecap({'test1':{'Pant':84, 'Kohli':120}, 'test2':{'Pant':59, 'Gill':42}}))
print(addpoly([(4,3),(3,0)],[(-4,3),(2,1)]))
print(addpoly([(2,1)],[(-2,1)]))
print(multpoly([(1,1),(-1,0)],[(1,2),(1,1),(1,0)]))