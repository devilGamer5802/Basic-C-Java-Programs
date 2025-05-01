#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node*next;
};

struct node*start=NULL;
//pre-defining
void create();
void display();


//code for creating a list

void create(){
    struct node*temp;
    temp=(struct node*)malloc(sizeof(struct node*));
    printf("Enter value:");
    scanf("%d",&temp->data);
    temp->next=start;
    start=temp;
    printf("Node inserted\n");
}

//code for displaying list

void display(){
    struct node*temp;
    temp=start;
    if(temp==NULL)
    printf("List is empty.");
    else{
        while(temp!=NULL){
            printf("%d\n",temp->data);
            temp=temp->next;
        }
        printf("\nEnd of list.");
    }
}

//main 

int main(){
    int choice=0;
    while (choice!=3){
        printf("\nLinked List Menu\n1.Creating a linked list\n2.Displaying the list\n3.Exit\nEnter your choice:");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                create();
                break;

            case 2:
                display();
                break;
            
            case 3:
                exit(0);
                break;

            default:
                printf("\nEnter valid choice");
        }
    }
}
