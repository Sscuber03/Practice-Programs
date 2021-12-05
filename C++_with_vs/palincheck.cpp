#include <iostream>
#include <stdio.h>
#include <conio.h>
#include <string.h>

using namespace std;

int main()
{
    char a[20];
    char b[20];
    cout << "Enter a string of less than 20 characters to check if palindrome or not" << endl;
    gets (a);
    strcpy(b,a);
    strrev(b);
    if(strcmp(a,b)==0)
    {
        cout << "The inputed string is a palindrome" << endl;
    }
    else
    {
        cout << "The inputed string is not a palindrome" << endl;
    }
}