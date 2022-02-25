#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t;
    cin >> t;
    
    while(t-- > 0)
    {
        int sum=0;
        int n;
        cin >> n;
        if(n<=1)
        {
            cout << sum << endl;
        }
        else if(n==2)
        {
            sum=2;
            cout << sum << endl;
        }
        else
        {
            for(int i=3;i<n;i+=2)
            {

            }
        }
    }
    return 0;
}