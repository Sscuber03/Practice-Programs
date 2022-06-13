// program to print initials of a name
#include <stdio.h>
#include <string.h>
int main()
{
    int p = 0, i, j;
    char name[100];
    printf("Enter your name: ");
    scanf("%[^\n]", name);
    printf("Your initials are: ");
    for (i = 0; name[i] != '\0'; i++)
    {
        if (name[i] == ' ')
        {
            if (p == 0 && name[i - 1] == '.')
            {
                for (j = p; j < i; j++)
                {
                    printf("%c", name[j]);
                }
                p = i + 1;
                printf(" ");
            }
            else
            {
                printf("%c. ", name[p]);
                p = i + 1;
            }
        }
    }
    for(i=p;i<strlen(name);i++)
    {
        printf("%c",name[i]);
    }
    return 0;
}