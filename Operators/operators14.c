
//  3.4+1.2*(3.7-1.2)/2+6.8
#include <stdio.h>
int main()
{
    float num1 = 3.4;
    float num2 = 1.2;
    float num3 = 3.7;
    float num4 = 1.2;
    int num5 = 2;
    float num6 = 6.8;
    float res  = num1 + num2 * (num3 - num4) / num5 + num6;
    printf("%f", res);
    return 0;
}
