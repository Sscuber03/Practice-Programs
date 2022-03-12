def is_vowel(c):
    cc = c.lower()
    return ((cc == 'a') or (cc == 'e') or(cc == 'i') or (cc == 'o') or (cc == 'u'))

def replaceV(s):
    i=0
    while(i<len(s)-2):
        if(is_vowel(s[i]) and s[i].lower() == s[i+1].lower() and s[i].lower() == s[i+2].lower()):
            s = s[:i] + '_' + s[i+3:]
    return s
