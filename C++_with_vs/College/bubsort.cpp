#include<bits/stdc++.h>

using namespace std;

void bubbleSort(int arr[], int n)
{
    cout << "The sorted array after sorting using bubble sort is: " << endl;;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<(n-i-1);j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        cout << arr[i] << " ";
    }
}

int main()
{
    int n;
    cout << "Enter the number of elements: " << endl;
    cin >> n;
    int a[n];
    cout << "Enter the elements: " << endl;
    for(int i=0;i<n;i++)
    {
        cin >> a[i];
    }
    cout << "The unsorted array is: " << endl;
    for(int i=0;i<n;i++)
    {
        cout << a[i] << " ";
    }
    cout << endl;
    bubbleSort(a, n);
}