#include<stdio.h>
#include<math.h>
#define f(x)(pow(x,3)-2*x-5)
int main(){
    int i=0;
    double x0,x1,x2,f0,f1,f2;
    printf("Enter the initial two values where root lies:");
    scanf("%lf%lf",&x0,&x1);
    f0=f(x0);
    f1=f(x1);
    do{
        x2=(x0+x1)/2;
        f2=f(x2);
        if(f0*f2<0){
            x1=x2;
            f1=f(x1);
        }
        else{
            x0=x2;
            f0=f(x0);
        }
        i++;
    }while(fabs(f2)>pow(10,-6));
    printf("Root is %lf\n",x2);
    return 0;
}