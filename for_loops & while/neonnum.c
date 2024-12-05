// Neon Number

#include <stdio.h>

int main(){
    int n = 9, sqr, sum=0, rem, temp;
    sqr = n * n;
    temp = sqr;
    for(int i=1;i<=2;i++) {
       rem = sqr%10;
       sum = sum + rem;
       sqr = sqr / 10;
    } 
   printf("The number is %d and its sqr is %d. The sum of its sqr digits are %d",n,temp,sum);
   return 0;
}




