#include<stdio.h>
int main () {
    int num1;
    int num2;
    int num3;
    printf("Enter the value of Number1, Number2 and Number3");
    scanf("%d %d %d",&num1 ,&num2, &num3);
    if(num1>num2 && num1>num3) {
        printf("Num1 is maximum");
    }
    else if (num2>num1 && num2>num3) {
        printf("Num2 is maximum");
    } else {
        printf("Num3 is maximum");
    }
    return 0;
}