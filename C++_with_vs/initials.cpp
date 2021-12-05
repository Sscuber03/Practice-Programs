#include <iostream>
#include <conio.h>
#include <stdio.h>

using namespace std;

int main()
{
    char a[100],b[100],c[100];
    int q=0,r=0,p;
    cout << "Enter a sentence" << endl;
    gets(a);
    for(p=0;a[p]!='\0';p++)
    {
        if(a[p]==' ')
        {
            b[q++]=toupper(c[0]);
            b[q++]='.';
            r=0;
        }
        else
        {
            c[r++]=a[p];
        }
    }
    b[q]='\0';
    c[r]='\0';
    cout << "Type 1 - " << b << c << endl;
    cout << "Type 2 - " << b << c[0] << "." << endl;
}