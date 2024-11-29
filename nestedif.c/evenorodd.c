#include<stdio.h>

int main (){
    char a;
    printf("Enter the charcter: ");
    scanf("%c",&a);
    if ( a == 'e'){
        int num;
        printf("Enter the number: ");
        scanf("%d",&num);
        if (num%2 == 0){
            printf("The number is even");
        } else {
            printf("The number is odd");
        }
    } else {
        printf("Input is not matched");
    }
    return 0;
}