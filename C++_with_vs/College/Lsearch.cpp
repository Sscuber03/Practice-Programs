#include<bits/stdc++.h>

using namespace std;

int Lsearch(int ar[], int n, int x)
{
    for(int i=0;i<n;i++)
    {
        if(ar[i]==x)
        {
            return i;
        }
    }
    return -1;
}
int main()
{
    int n,x;
    cout << "Input the size of the array" << endl;
    cin >> n;
    int arr[n];
    cout << "Input the elements of the array" << endl;
    for(int i=0;i<n;i++)
    {
        cin >> arr[i];
    }
    cout << "Input the element to be searched" << endl;
    cin >> x;
    int res = Lsearch(arr,n,x);
    if(res==-1)
        cout << "Element not found!" << endl;
    else
        cout << "Element found at position " << res+1 << "!" << endl;
    return 0;
}