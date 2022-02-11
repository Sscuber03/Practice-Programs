#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t=0;
    cin >> t;
    while(--t >= 0)
    {
    long long n = 0;
    cin >> n;
    vector<int> v;
    while (n>0)
    {
        int t=n%10;
        n/=10;
        v.insert(v.begin(), t);
    }
    int l=v.size();
    for(int i=0;i<l;i++)
    {
        if(i!=0)
        {
        if(v[i]==7) 
            v[i]=9;
        else if(v[i]==8 || v[i]==2) 
            v[i]=4;
        else if(v[i]==3) 
            v[i]=9;
        else if(v[i]==4) 
            v[i]=6;
        else if(v[i]==9) 
            v[i]=1;
        }
        cout << v[i];
    }
        cout << endl;
   }
}