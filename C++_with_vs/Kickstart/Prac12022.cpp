#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

void solve()
{
    int n,m,sum = 0,x;
    cin >> n >> m;
    for(int i=0;i<n;i++)
    {
        cin >> x;
        sum += x;
    }
    cout << (sum%m) << endl;
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
