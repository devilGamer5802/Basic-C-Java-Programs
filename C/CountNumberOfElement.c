#include<stdio.h>

int main(){
    int count=0;
    int array[]={1,2,3,4,5};
    for(int i=0;array[i]!='\0';i++){
        count++;
    }
    printf("The number of elements in an array is: %d",count);
    return 0;
}