scores = {'Dhawan':[3,22],'Kohli':[200,3]}
b = 'Dhawan'
s = 35
if b in scores.key():
    scores[b].append(s)
else:
    scores[b] = [s]

try:     # This is same as given above
    scores[b].append(s)
except KeyError:
    scores[b] = [s]
