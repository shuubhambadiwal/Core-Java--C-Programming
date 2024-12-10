// Q)Write a c program input character 's':
// 		four number 
// 		substraction  
// 		otherwise :input is not matched 

#include <stdio.h>
int main()
{
    char alpha;
    printf("Enter the char value");
    scanf("%c", &alpha);
    if( alpha == 's') {
        int num1;
        int num2;
        int num3;
        int num4;
        printf("Enter the num1 ,num2, num3 and num4 values here : ");
        scanf("%d %d %d %d", &num1, &num2, &num3, &num4);
        int res = num1 - num2 - num3 - num4;
        printf("The subtraction of four number is %d", res);
    } 
    else {
        printf("Input not matched");
    }
    return 0;
}

