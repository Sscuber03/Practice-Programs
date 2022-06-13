#include <stdio.h>
#include <string.h>

struct employee
{
    char name[10];
    int id;
    float salary;
};

int main()
{
    int n;
    printf("Enter no. of employee details you want to store : ");
    scanf("%d", &n);

    struct employee man[50];

    for (int i = 0; i < n; i++)
    {
        printf("Enter employee %d name : ", i+1);
        scanf("%s", man[i].name);

        printf("Enter employee %d id : ", i+1);
        scanf("%d", &man[i].id);

        printf("Enter employee %d salary : ", i+1);
        scanf("%f", &man[i].salary);
    }

    for (int i = 0; i < n; i++)
    {
        printf("Name of employee %d is %s.\n", i + 1, man[i].name);
        printf("ID of employee %d is %d.\n", i + 1, man[i].id);
        printf("Salary of employee %d is %.3f.\n", i + 1, man[i].salary);
    }

    return 0;
}