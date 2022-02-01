def repfree(s):
    for c in s:
        if c in s[s.index(c)+1:]:
            return False
        return True
    
print (repfree("zb%78"))
print (repfree("(7)(a"))
print (repfree("a)*(?"))
print (repfree("abracadabra"))
print (repfree("qwerty!@#2"))
print (repfree("(x+6)(y-5)"))
print (repfree("94templars"))
print (repfree("siruseri"))