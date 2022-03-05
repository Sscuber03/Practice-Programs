#include <bits/stdc++.h>

using namespace std;

void reverseArray(int arr[], int start, int end)
{
    while (start < end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}    

void printarray(int arr[], int n)
{
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main()
{
    int size;
    cout<<"Enter the size of the array"<<endl;
    cin>>size;
    int arr[size];
    cout<<"Enter elements of array"<<endl;
    for(int i=0; i<size; i++)
    {
        cin>>arr[i];
    }
    cout<<"Original array is"<<endl;
    
    // To print original array
    printarray(arr,size);
    
    // Function calling
    reverseArray(arr, 0, size-1);
     
    cout << "Reversed array is" << endl;
     
    // To print the Reversed array
    printarray(arr,size);

    return 0;
}