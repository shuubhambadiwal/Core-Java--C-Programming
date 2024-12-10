//  4.5*1.2-(82/2)-5.6 +1.234 
#include <stdio.h>
int main()
{
    float num1 = 4.5;
    float num2 = 1.2;
    int num3 = 82;
    int num4 = 2;
    float num5 = 5.6;
    float num6 = 1.234;
    float res  = num1 * num2 - (num3 / num4) - num5 + num6;    
    printf("%f", res);
    return 0;
}
