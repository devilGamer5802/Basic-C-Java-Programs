#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main(){
    int i,j,n,choice;
    int array[100];
    printf("Array Operations");
    printf("\n1.Creating an array\n2.Displaying an array\n3.Inserting element\n4.Deleting element\n5.Exit");
    printf("\nEnter a choice:");
    scanf("%d",&choice);
    if (choice==1){
        printf("Enter number of elements:");
        scanf("%d",&n);
        printf("Enter %d elements:",n);
        for(i=0;i<n;i++){
            scanf("%d",&array[i]);
        }
    }
    if (choice==2){
        printf("Elements are:");
        for(i=0;i<n;i++){
            printf("%d",array[i]);
        }
    }
    return 0;
}