//  8 * 1 + (4-2) / 1 + 6
#include <stdio.h>
int main()
{
    int num1 = 8;
    int num2 = 1;
    int num3 = 4;
    int num4 = 2;
    int num5 = 1;
    int num6 = 6;
    int res  = num1 * num2 + (num3 - num4) / num5 + num6;
    printf("%d", res);
    return 0;
}

