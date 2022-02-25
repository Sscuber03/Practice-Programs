#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int a1,a2,a3,a4;
    int y=0;
    cin >> y;
    while(1)
    {
        y++;
        int copy=y;
        a1=copy%10;
        copy/=10;
        a2=copy%10;
        copy/=10;
        a3=copy%10;
        copy/=10;
        a4=copy;
        if(a1!=a2 && a1!=a3 && a1!=a4 && a2!=a3 && a2!=a4 && a3!=a4)
        {
            cout << y << endl;
            break;
        }
    }
    return 0;
}