#include<stdio.h>
#include<stdlib.h>

int main(){
    int i,count;
    int*arr, sum=0;
    printf("Enter the total number of elements:");
    scanf("%d",&count);
    arr=(int*)calloc(count,sizeof(int));
    for(i=0;i<count;i++){
        printf("Enter element %d:",i+1);
        scanf("%d",arr+i);
        sum+=*(arr+i);
    }
printf("Sum is %d",sum);
free(arr);

return 0;
}