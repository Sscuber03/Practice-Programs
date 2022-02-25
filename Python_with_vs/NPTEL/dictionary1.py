def count_letters(s):
    d={}
    for c in s:
        if c in d.keys():
            d[c]+=1
        else:
            d[c] = 1
    return d

print(count_letters("The joy of computing").items())
print(count_letters("Nptel!!!").items())
print(count_letters("Made in India!").items())
print(count_letters("Hello World").items())