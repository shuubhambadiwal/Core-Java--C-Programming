// Armstrong number : 

#include<stdio.h>
int main(){
    int n=153;
    int rem,sum=0;
    int temp=n;
    while(n>0){
        rem=n%10;
        sum=sum+rem*rem*rem;
        n=n/10;
    }
    if(temp==sum){
        printf("armstrong number");
    }
    else{
        printf("this number is not armstrong number ");
    }
    return 0;
}