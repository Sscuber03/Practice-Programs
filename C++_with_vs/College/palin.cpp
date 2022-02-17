#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cout << "Input a number to check if the number is palindrome or not" << endl;
    cin >> n;
    int copy = n;
    int rev = 0;
    while(copy>0)
    {
        int t = copy%10;
        rev = rev*10 + t;
        copy = copy/10;
    }
    if(n==rev)
        cout << n << " is a palindrome number" << endl;
    else
        cout << n << " is not a palindrome number" << endl;
    return 0;
}