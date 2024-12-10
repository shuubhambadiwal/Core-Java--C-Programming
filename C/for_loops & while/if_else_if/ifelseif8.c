// q,w,e,r,t,y,u,i,o,p :upper line 
// 	a,s,d,f,g,h,j,k,l :mid line 
// 	z,x,c,v,b,n,m :lower line

#include<stdio.h>

int main() {
    char a;
    printf("Enter the charcter value");
    scanf("%c", &a);
    if ( a == 'q' || a == 'w' || a == 'e' || a == 'r' || a == 't' || a == 'y' || a == 'u' || a == 'i' || a == 'o' || a == 'p') {
        printf("Upperline");
    }
    else if ( a == 'a' || a == 's' || a == 'd' || a == 'f' || a == 'g' || a == 'h' || a == 'j' || a == 'k' || a == 'l') {
        printf("Midline");
    }
    else if ( a == 'z' || a == 'x' || a == 'c' || a == 'v' || a == 'b' || a == 'n' || a == 'm') {
        printf("Lowerline");
    }
    return 0;
}