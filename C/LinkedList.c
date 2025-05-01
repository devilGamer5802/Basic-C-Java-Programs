#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*next;
};

struct node*start=NULL;
void push();
void pop();
void duplicate();
void display();

void push(){
    struct node*temp;
    temp=(struct node*)malloc(sizeof(struct node*));
    printf("Enter the values:");
    scanf("%d",&temp->data);
    temp->next=start;
    start=temp;
    printf("Value added\n");
}

void pop(){
    struct node*temp;
    temp=start;
    if(temp==NULL){
        printf("Underflow!");
    }
    else{
        temp=start;
        start=start->next;
        free(temp);
        printf("item popped.");
    }
}

void duplicate(){
    struct node*temp=start;
    struct node*emp=start->next;
    while(emp!=NULL){
        if(temp->data!=temp->data){
            temp=emp;
            emp=emp->next;
        }
        else{
            temp->next=emp->next;
            free(emp);
            emp=emp->next;
        }
    }
}

void display(){
    struct node*temp;
    temp=start;
    if(temp==NULL)
    printf("Empty!");
    else{
        while(temp!=NULL){
            printf("%d\n",temp->data);
            temp=temp->next;
        }
    }
}

//main

int main(){
    int choice=0;
    while (choice!=5){
        printf("\nStack using Linked List Menu\n1.PUSH\n2.POP\n3.Duplicate deletion\n4.Display\n5.Exit\nEnter your choice:");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                push();
                break;

            case 2:
                pop();
                break;
            case 3:
                duplicate();
                break;
            case 4:
                display();
            case 5:
                exit(0);
                break;

            default:
                printf("Enter valid choice");
        }
    }
}
