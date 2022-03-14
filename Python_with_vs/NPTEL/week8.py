def longestPalin(string):
    n = len(string)
    if (n<2):
        return n
  
    start = 0
    max_length = 1
    res = ''
    for i in range(n):
        low = i-1
        high = i+1
        while(high < n and string[high] == string[i]):
            high += 1
        while(low >= 0 and string[low] == string[i]):
            low -= 1
        while(low >= 0 and high < n and string[low] == string[high]):
            low -= 1
            high += 1
        length = high - low - 1
        if(max_length < length):
            max_length = length
            start = low + 1
            res = string[start:start + max_length]
        elif(max_length == length):
            if (res > string[start:start + max_length]):
                res = string[start:start + max_length]
    print(max_length)
    print(res)

x = int(input())
s = input()
longestPalin(s)