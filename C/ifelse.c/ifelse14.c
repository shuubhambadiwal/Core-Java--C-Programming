// Q)write a c program input character 'd':
// 		two number 
// 		divide 
// 		otherwise :input is not matched 

#include <stdio.h>
int main()
{
    char alpha;
    printf("Enter the char value");
    scanf("%c", &alpha);
    if( alpha == 'd') {
        int num1;
        int num2;
        printf("Enter the num1 and num2 values here : ");
        scanf("%d %d", &num1, &num2);
        int res = num1 / num2 ;
        printf("The division of both number is %d", res);
    } 
    else {
        printf("Input not matched");
    }
    return 0;
}
