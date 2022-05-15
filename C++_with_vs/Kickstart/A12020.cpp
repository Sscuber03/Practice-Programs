#include <bits/stdc++.h>

using namespace std;

int n,b,a[10000];

void solve()
{
    int counter=0;
    cin >> n >> b;
    for(int i=0;i<n;i++)
    {
        cin >> a[i];
    }
    sort(a,a+n);
    for(int i=0;i<n;i++)
    {
        if(b>=a[i])
        {
            b-=a[i];
            counter++;
        }
    }
    cout << counter << endl;
};

int main()
{
    int t,i=0;
    cin >> t;
    while(t--)
    {
        cout << "Case #" << ++i << ": ";
        solve();
    }
}