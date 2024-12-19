#include<stdio.h>
int main() {
    char a;
    printf("Enter the Alphabet");
    scanf("%c", &a);
    if ( a=='a') {
    int n;
    int rem,sum=0;
    int temp=n;
    printf("Enter the number value");
    scanf("%d", &n);
    while(n>0){
        rem=n%10;
        sum=sum+rem*rem*rem;
        n=n/10;
    }
    if(temp==sum){
        printf("Armstrong number");
    }
    else{
        printf("This number is not armstrong number ");
    }
    } else if (a == 'p'){
    int n,rem,sum=0;
    int temp=n;
    printf("Enter the value");
    scanf("%d", &n);
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
    } else if (a == 'r'){
    
    int n, sum = 0,rem, i;    
    printf("Enter the number for the reversing");   
    scanf("%d", &n);
    for(int i=1; i<=3; i++) {
        rem = n%10;
        sum = sum * 10 + rem;
        n = n /10;
    }
     printf("Reverse %d", sum);
    } else if (a =='c') {
        //c
    } else {
        printf("Input is not matched ");
    }
    return 0;
}