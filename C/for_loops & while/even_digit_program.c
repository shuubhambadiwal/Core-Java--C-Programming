// number :even digit 
// input :3653542 
// count : 3
#include<stdio.h>
int main() {
    int num,i,rem, count = 0;
    printf("Enter the number value");
    scanf("%d", &num);
    for (i=1; i<=7; i++){
        rem=num%10;
        if (rem%2 == 0){
            count++;
        }
        num=num/10;
    }
    printf("%d", count);
    return 0;
}



