#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cout << "Enter a three digit number to check if armstrong number or not" << endl;
    cin >> n;
    int copy=n;
    int sum=0;
    while(copy>0)
    {
        int tem=copy%10;
        copy/=10;
        sum+=pow(tem,3);
    }
    sum=(int)sum;
    if(sum==n)
    cout << n << " The number is Armstrong number!" << endl;
    else
    cout << n << " The number is not an Armstrong number!" << endl;
    return 0;
}