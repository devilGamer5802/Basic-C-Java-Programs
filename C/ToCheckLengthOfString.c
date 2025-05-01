#include<stdio.h>
int main(){
    int i;
    //int length=0;
    char a[20];
    printf("enter a string:");
    gets(a);
    for(i=0;a[i]!='\0';i++){
        // or you can use length++;
    }
    printf("Length of the string =%d",i); //instead of i we can use length but here using i is much suitable.
    return 0;
}