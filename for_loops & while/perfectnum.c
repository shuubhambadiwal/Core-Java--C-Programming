#include<stdio.h>

int main(){
    int i, n = 6,sum = 0;
    for( i=1; i<=n-1; i++){
      if (n%i==0){
        sum += i;
      }
    }
    if (sum == n) {
        printf("The number is perfect number");
    } else {
        printf("The Number is not a perfect number ");
    }
    return 0;
}