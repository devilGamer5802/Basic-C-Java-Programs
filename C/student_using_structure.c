#include <stdio.h>
#include <string.h>
//creating structure for students details.

struct student_using_structure
{
    int roll;
    char name[30], branch[10];
    float cgpa;
}s[10];

//main

int main(){
    struct student_using_structure s1;
    struct student_using_structure *p = &s1;
 
    s1.roll= 45;
    strcpy(s1.name, "Harsh Anil Tuti");
    strcpy(s1.branch, "CSE");
    s1.cgpa = 8.3;
 
    printf("Roll No.:%d;\nName:%s;\nBranch:%s;\nCGPA:%.2f\n",p->roll,p->name,p->branch,p->cgpa);

    return 0;
}
