#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

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
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t,i=0;
    cin >> t;
    while(t--)
    {
        cout << "Case #" << ++i << ": ";
        solve();
    }
}