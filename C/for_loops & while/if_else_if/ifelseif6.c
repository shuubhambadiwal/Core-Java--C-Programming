#include<stdio.h>
int main () {
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    printf("Enter the value of Number1, Number2, Number3, Number4 and Number5");
    scanf("%d %d %d %d %d",&num1 ,&num2, &num3, &num4, &num5);
    if(num1>num2 && num1>num3 && num1 > num4 && num1 > num5) {
        printf("Num1 is maximum");
    }
    else if (num2>num1 && num2>num3 && num2>num4 && num2>num5) {
        printf("Num2 is maximum");
    }
    else if (num3>num1 && num3>num2 && num3>num4 && num3>num5) {
        printf("Num3 is maximum");
    }
     else if (num4>num1 && num4>num2 && num4>num3 && num4>num5) {
        printf("Num4 is maximum");
    } else {
         printf("Num5 is maximum");
    }
    return 0;
}