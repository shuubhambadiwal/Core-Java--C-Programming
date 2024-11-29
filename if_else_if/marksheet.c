#include <stdio.h>

int main() {
    int subject1, subject2, subject3, total;
    float percentage;
    char grade;
    printf("Enter marks for subject 1 (out of 100): ");
    scanf("%d", &subject1);

    printf("Enter marks for subject 2 (out of 100): ");
    scanf("%d", &subject2);

    printf("Enter marks for subject 3 (out of 100): ");
    scanf("%d", &subject3);

    if (subject1 < 0 || subject1 > 100 || subject2 < 0 || subject2 > 100 || subject3 < 0 || subject3 > 100) {
        printf("Invalid marks entered. Please enter marks between 0 and 100.\n");
    }

    total = subject1 + subject2 + subject3;
    percentage = total / 3.0;
    
    if (percentage < 25) {
        grade = 'F';
    } else if (percentage < 45) {
        grade = 'E';
    } else if (percentage < 50) {
        grade = 'D';
    } else if (percentage < 60) {
        grade = 'C';
    } else if (percentage < 80) {
        grade = 'B';
    } else {
        grade = 'A';
    }
    printf("\nTotal Marks: %d/300\n", total);
    printf("Percentage: %.2f%%\n", percentage);
    printf("Grade: %c\n", grade);
    return 0;
}
