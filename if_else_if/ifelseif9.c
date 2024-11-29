#include<stdio.h>

int main(){
    int num;
    printf("Enter the number");
    scanf("%d",&num);
    if(num>=1 && num<=5){
        printf("The number is between 1 and 5");
    } else if (num>=6 && num<=10){
        printf("The number is between 6 and 10");
    } else {
        printf("Input is not matched");
    }
    return 0;
}


