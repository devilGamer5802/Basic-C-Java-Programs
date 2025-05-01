#include<stdio.h>
int main(){
    int i;
    char a[20];
    printf("enter a string:");
    gets(a);
    for(i=0;a[i]!='\0';i++){
    }
    for(int j=i-1;j>=0;j--){
        printf("%c",a[j]);
    }
}