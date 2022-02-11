#include <bits/stdc++.h>
using namespace std;


int main() 
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t=0;
    cin >> t;
    while(--t >= 0)
    {
        int a,b;
        cin >> a >> b;
        if(abs(a-b)%2==0)
            cout << "1" << endl;
        else
            cout << "0" << endl;    
    }
}