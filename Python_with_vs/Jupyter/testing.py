#!/bin/python3

import math
import os
import random
import re
import sys

# + - * /     14 % 5 = 4    a % b gives the remainder when a is divided by b
# == &&  ||

if __name__ == '__main__':
    n = int(input().strip()) 
    if n%2==1:     # if (condition):      True   False
        print("Weird")
    else:
        if n>=