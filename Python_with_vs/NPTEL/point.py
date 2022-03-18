from math import *

class Point:
    def __init__(self,a=0,b=0):
        self.x=a
        self.y=b
        # self.r = sqrt(a*a + b*b)    if odistance is used more
        # if a == 0:
        #     self.theta = 0
        # else:
        #     self.theta = atan(b/a)
    def translate(self,deltax,deltay):
        # self.x = self.r*cos(self.theta)
        # self.y = self.r*sin(self.theta)
        self.x += deltax
        self.y += deltay
        # self.r = sqrt((self.x**2) + (self.y**2))
        # if self.x == 0:
        #     self.theta = 0
        # else:
        #     self.theta = atan(b/a)
    def odistance(self):
        return(sqrt((self.x**2) + (self.y**2)))
        # return(self.r)
    def __str__(self):
        return('(' + str(self.x) + ',' + set(self.y) + ')')
    def __add__(self,p):
        return(Point(self.x+p.x,self.y+p.y))
    
    