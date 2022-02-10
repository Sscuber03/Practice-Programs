#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n ,k ,p,a[50][30];

void solve()
{
    cin >> n >> k >> p;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<k;j++)
        {
            cin >> a[i][j];
        }
    }
    
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
