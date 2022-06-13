#include <stdio.h>
#include <string.h>

// function definition of the revstr()
void revstr(char *str1)
{
    // declare variable
    int i, len; 
    char temp;
    len = strlen(str1); // use strlen() to get the length of str string

    // use for loop to iterate the string
    for (i = 0; i < len / 2; i++)
    {
        // temp variable use to temporary hold the string
        temp = str1[i];
        str1[i] = str1[len - i - 1];
        str1[len - i - 1] = temp;
    }
}

int main()
{
    char s[50]; // size of char string
    printf("Enter the string: ");
    scanf( "%s", &s); // use gets() function to take string

    printf("Before reversing the string: %s \n", s);

    // call revstr() function
    revstr(s);
    printf("After reversing the string: %s", s);
}