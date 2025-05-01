#include <stdio.h>
//creating structure for students details.

struct student_using_structure
{
    int roll;
    char name[30], branch[10];
    float cgpa;
}s[10];

//main

int main(){
    struct student_using_structure *p;
    int i;
    for(i=0;i<10;i++){
        p=&s[i];
        printf("Enter Roll no., name, branch and CGPA of student:",i+1);
        scanf("%d%s%s%f",&p->roll,&p->name,&p->branch,&p->cgpa);
    }
    p=&s[0];

    //for displaying entered data.

    for ( i = 0; i < 10; i++)
    {
        p=&s[i];
        printf("Roll No.:%d; Name:%s; Branch:%s; CGPA:%.2f\n",p->roll,p->name,p->branch,p->cgpa);
    }
    
    return 0;
}