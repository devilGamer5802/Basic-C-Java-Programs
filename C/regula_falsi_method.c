#include<stdio.h>
#include<math.h>
#define f(x)(cos(x)-x*pow(exp(x),x))
int main(){
    float x0,x1,x2,f0,f1,f2;
    printf("Enter the initial two values where root lies:");
    scanf("%f%f",&x0,&x1);
    f0=f(x0);
    f1=f(x1);
    do{
        x2=(x0*f(x1)-x1*f(x0))/(f(x1)-f(x0));
        f2=f(x2);
        if(f0*f2<0){
            x1=x2;
        }
        else{
            x0=x2;
        }
    }while(fabs(f2)>pow(10,-6));
    printf("Root is %f\n",x2);
    return 0;
}