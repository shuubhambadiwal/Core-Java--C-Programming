#include <stdio.h>

int main() {
    int roll_no, physics, chemistry, computer, total;
    float percentage;
    char name[30], fname[30], mname[30];

    printf("Enter Roll Number: ");
    scanf("%d", &roll_no);

    printf("Enter Student Name: ");
    scanf("%s", name);

    printf("Enter Father's Name: ");
    scanf("%s", fname);

    printf("Enter Mother's Name: ");
    scanf("%s", mname);

    printf("Enter marks for Physics: ");
    scanf("%d", &physics);

    printf("Enter marks for Chemistry: ");
    scanf("%d", &chemistry);

    printf("Enter marks for Computer Application: ");
    scanf("%d", &computer);

    total = physics + chemistry + computer;
    percentage = total / 3.0;

    printf("\n--- Student Report ---\n");
    printf("Roll Number: %d\n", roll_no);
    printf("Name: %s\n", name);
    printf("Father's Name: %s\n", fname);
    printf("Mother's Name: %s\n", mname);
    printf("Total Marks: %d\n", total);
    printf("Percentage: %.2f%%\n", percentage);

    if (percentage >= 60) {
        printf("Division: First\n");
    } else if (percentage >= 50) {
        printf("Division: Second\n");
    } else if (percentage >= 40) {
        printf("Division: Third\n");
    } else {
        printf("Division: Fail\n");
    }

    return 0;
}
