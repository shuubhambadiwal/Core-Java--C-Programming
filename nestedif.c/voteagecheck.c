#include<stdio.h>

int main (){

    char a;
    printf("Enter the charcter: ");
    scanf("%c",&a);

    if (a == 'v') {
        int num;
        printf("Enter the Age: ");
        scanf("%d", &num);
        if(num>= 18) {
           printf("Age is eligible for vote");
        } else {
            printf("Minor for voting!");
        }
    } else {
        printf("Input not matched");
    }

    return 0;
}



