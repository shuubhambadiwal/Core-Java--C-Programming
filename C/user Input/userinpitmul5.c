#include <stdio.h>
int main()
{   
    char c;
    int num1;
    float num2;
    
    printf("Enter the char ");
    scanf("%c", &c);

    printf("Enter the first number ");
    scanf("%d", &num1);

    printf("Enter the second number ");
    scanf("%f", &num2);

    printf("%d", num1);
    printf("%f", num2);
    printf("%c", c);

    return 0;
}
