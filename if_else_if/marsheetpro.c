#include <stdio.h>

int main() {
    int rollNo;
    char name, fname, mname, address, contact;
    float physics, chemistry, compApp, total, percentage;
    char division;

    printf("Input the Roll Number of the student: ");
    scanf("%d", &rollNo);

    printf("Student Name (single character): ");
    scanf(" %c", &name); 

    printf("Father's Name (single character): ");
    scanf(" %c", &fname);

    printf("Mother's Name (single character): ");
    scanf(" %c", &mname); 

    printf("Address (single character): ");
    scanf(" %c", &address); 

    printf("Contact (single character): ");
    scanf(" %c", &contact); 

    // Input marks
    printf("Input the marks of Physics: ");
    scanf("%f", &physics);

    printf("Input the marks of Chemistry: ");
    scanf("%f", &chemistry);

    printf("Input the marks of Computer Application: ");
    scanf("%f", &compApp);

    total = physics + chemistry + compApp;
    percentage = (total / 300) * 100;

    if (percentage >= 60) {
        division = 'A'; 
    } else if (percentage >= 50) {
        division = 'B'; 
    } else if (percentage >= 40) {
        division = 'C';
    } else {
        division = 'F'; 
    }

    printf("\n--- Student Details ---\n");
    printf("Roll Number: %d\n", rollNo);
    printf("Name: %c\n", name);
    printf("Father's Name: %c\n", fname);
    printf("Mother's Name: %c\n", mname);
    printf("Address: %c\n", address);
    printf("Contact: %c\n", contact);

    printf("\n--- Marks and Result ---\n");
    printf("Marks (Physics, Chemistry, Computer Application): %f, %f, %f\n", physics, chemistry, compApp);
    printf("Total Marks: %f\n", total);
    printf("Percentage: %f\n", percentage);
    printf("Division: %c\n", division); 

    return 0;
}
