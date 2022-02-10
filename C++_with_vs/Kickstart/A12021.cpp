#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n,k;
string s;

void solve()
{
    int ans;
    int c = 0;
    cin >> n >> k;
    cin >> s;
    for(int i=0;i<n/2;i++)
    {
        if(s[i] != s[n-i-1])
        {
            c++;
        }
    }
    if(c==k) ans = 0;
    else if(c<k) ans = k-c;
    else ans = c-k;
    cout << ans << endl;
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
