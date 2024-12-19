#include <stdio.h>

int main() {
    
    char alpha;
    printf("Enter the Charcter value ");
    scanf("%c", &alpha);
    if (alpha == 'a') {
        int num1;
        int num2;
        printf("Enter the two numbers: ");
        scanf("%d %d", &num1, &num2);
        int res = num1 + num2;
        printf("The sum of two number is %d", res);
    } else if (alpha == 'm') {
        int num1;
        int num2;
        printf("Enter the two numbers: ");
        scanf("%d %d", &num1, &num2);
        int res = num1 * num2;
        printf("The multiplication of two number is %d", res);
    } else if (alpha == 's') {
        int num1;
        int num2;
        printf("Enter the two numbers: ");
        scanf("%d %d", &num1, &num2);
        int res = num1 - num2;
        printf("The substraction of two number is %d", res);
    } else if (alpha == 'd') {
       int num1;
        int num2;
        printf("Enter the two numbers: ");
        scanf("%d %d", &num1, &num2);
        int res = num1 / num2;
        printf("The division of two number is %d", res);
    } else {
        printf("Input is Not Matched");
    }
    return 0;
}