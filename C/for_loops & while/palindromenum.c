// palindrome number : 
// number:12321 

#include<stdio.h>
int main(){
    int n=12321,rem,sum=0;
    int temp=n;
    while(n>0){
        rem=n%10;
        sum=sum*10+rem;
        n=n/10;
    }//n=0 
    if(temp==sum){
        printf("this number is pallindrome");
    }
    else{
        printf("this number is not pallindrome");
    }
    return 0;
}