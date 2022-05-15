s = 'Sheher mein'
a = 'aeiouAEIOU'
for i in range(len(s)):
    if(s.index(s[i])%2==0):
        #print(i)
        if(s[i] in a):
            s=s.replace(s[i], '_')

print(s)