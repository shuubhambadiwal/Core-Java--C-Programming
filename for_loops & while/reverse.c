// reverse number

#include<stdio.h>

int main() {
    int n = 345, sum = 0,rem, i;       
    for(int i=1; i<=3; i++) {
        rem = n%10;
        sum = sum * 10 + rem;
        n = n /10;
    }
     printf("Reverse %d", sum);
    return 0;
}







