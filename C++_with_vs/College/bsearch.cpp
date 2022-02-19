#include<bits/stdc++.h>

using namespace std;

void bsearch(int arr[], int n, int x)
{
    int l = 0, r = n-1;
    while(l <= r)
    {
        int m = (l+r)/2;
        if(arr[m] == x)
        {
            cout << "Element found at index " << m << endl;
            return;
        }
        else if(arr[m] > x)
        {
            r = m-1;
        }
        else
        {
            l = m+1;
        }
    }
    cout << "Element not found" << endl;
}

int main()
{
    int n;
    cout << "Enter the number of elements: " << endl;
    cin >> n;
    int a[n];
    cout << "Enter the elements in sorted in ascending manner: " << endl;
    for(int i=0;i<n;i++)
    {
        cin >> a[i];
    }
    int x;
    cout << "Enter the element to be searched: " << endl;
    cin >> x;
    bsearch(a, n, x);
    return 0;
}