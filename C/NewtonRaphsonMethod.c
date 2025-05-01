#include<stdio.h>
#include<math.h>
#define f(x)(cos(x)-5*x+5)
#define fd(x)(-sin(x)-5)
int main(){
    int i=0;
    float x[1000],x0;
    printf("Enter the initial solution:");
    scanf("%f",&x0);
    x[0]=x0;
    for(i=0;i<200;i++){
        x[i+1]=x[i]-(f(x[i]))/(fd(x[i]));
        if(fabs((x[i+1]-x[i]))<pow(10,-6))
        goto out;
    }
    out:
    printf("No. of iterations: %d\t",i+1);
    printf("Root is %f\n",x[i+1]);
    return 0;
}