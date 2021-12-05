#include <iostream>
#include <stdio.h>
#include <conio.h>
#include <string.h>

using namespace std;

int main()
{
    char a[20];
    int p=1,d,i;
    cout <<"Enter any string under 20 characters" << endl;
    gets (a);
    d=strlen(a);
    for(i=0;a[i]!='\0';i++)
    {
        if(a[i]!=a[d-1])
        {
            p=0;
            break;
        }
        d--;
    }
    if(p==1)
    {
        cout << "The String is palindrome" << endl;
    }
    else
    {
        cout << "The String is not a palindrome" <<endl;
    }
}