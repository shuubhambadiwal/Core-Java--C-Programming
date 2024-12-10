// number :odd digit 
// input :365429 
// output : 359

#include<stdio.h>
int main() {
    int num,i,rem;
    printf("Enter the number value");
    scanf("%d", &num);
    for (i=1; i<=7; i++){
        rem=num%10;
        if (rem%2 != 0){
            printf("%d", rem);
        }
        num=num/10;
    }
    return 0;
}



