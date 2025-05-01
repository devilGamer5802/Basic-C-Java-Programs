#include<stdio.h>
int main(){
    int i, j,k,n;
    float A[20][20],c,x[10],sum=0;
    printf("\n Enter the order of matrix:");
    scanf("%d",&n);
    printf("\n Enter the element of arguemented matrix row-wise:\n\n");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            printf("A[%d][%d]:",i,j);
            scanf("%f",&A[i][j]);
        }
        printf("b[%d]=",i+1);
        scanf("%f",&A[i][j]);
    }
    for(k=0;k<=n-1;k++){
        for(i=k+1;i<n;i++){
            c=A[i][k]/A[k][k];
            for(j=k;j<=n;j++){
                A[i][j]=A[i][j]-(c*A[k][j]);
            }
        }
    }
    x[n-1]=A[n-1][n]/A[n-1][n-1];
    for(i=n-2;i>=0;i--){
        sum=0;
        for(j=i+1;j<=n;j++){
            sum+=(A[i][n]-sum)/A[i][i];
        }
        x[i]=(A[i][n]-sum)/A[i][i];
    }
    printf("The solution is :\n");
    for(i=0;i<n;i++){
        printf("\n x[%d]=%f\t",i+1,x[i]);
    }
    return 0;
}