#include <stdio.h>
int main()
{
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    printf("Enter the first number");
    scanf("%d", &num1);
    printf("Enter the second number");
    scanf("%d", &num2);
    printf("Enter the thrid number");
    scanf("%d", &num3);
    printf("Enter the fourth number");
    scanf("%d", &num4);
    printf("Enter the fivith number");
    scanf("%d", &num5);
    int res = num1 + num2 + num3 + num4 + num5;
    printf("%d", res);
    return 0;
}
