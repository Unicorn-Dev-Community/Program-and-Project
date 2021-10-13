/*Double Ended Queue using Array using switch*/
#include<stdio.h>
#include<stdlib.h>

struct Queue
{
    int size;
    int front;
    int rear;
    int *Q;
};

void display(struct Queue q)
{
    if(q.front==q.rear)
        printf("Empty Queue\n");
    do
    {
        q.front=(q.front+1)%q.size;
        printf("%d\n",q.Q[q.front]);

    }while(q.front!=q.rear);
    
}
void EnqueueRear(struct Queue *q,int x)
{
    if((q->rear+1)%q->size==q->front)
        printf("Queue is full\n");
    else
    {
        q->rear=(q->rear+1)%q->size;
        q->Q[q->rear]=x;
    }
    
}
void EnqueueFront(struct Queue *q,int x)
{
    if((q->rear+1)%q->size==q->front)
        printf("Queue is full\n");
    else
    {
        q->Q[q->front]=x;
        q->front=(q->front+q->size-1)%q->size;
     
    }
    
}
int DequeueRear(struct Queue *q)
{
    int x=-1;
    if(q->front == q->rear)
        printf("Queue is empty\n");
    else
    {
        x=q->Q[q->rear];
       q->rear=(q->rear+q->size-1)%q->size;
       
    }
   return x; 
}
int DequeueFront(struct Queue *q)
{
    int x=-1;
    if(q->front == q->rear)
        printf("Queue is empty\n");
    else
    {
        q->front=(q->front+1)%q->size;
        x=q->Q[q->front];
    }
   return x; 
}
int main()
{
    struct Queue q;
    int c,x;
    q.front=q.rear=0;
    printf("Enter size of queue");
    scanf("%d",&q.size);
    q.size+=1;
    q.Q=(int*)malloc(q.size*sizeof(int));
  
    printf("Choose\n1 for EnqueueFront\n2 for EnqueueRear\n3 for DequeueFront\n4 for DequeueRear\n5 for display\n6 for exit\n");
    printf("Enter your choice");
    scanf("%d",&c);
    while(c!=6)
    {
        switch(c)
        {
            case 1:
                printf("Enter the number to be inserted\n");
                scanf("%d",&x);
                EnqueueFront(&q,x);
                break;
            case 2:
                printf("Enter the number to be inserted\n");
                scanf("%d",&x);
                EnqueueRear(&q,x);
                break;
            case 3:
                printf("Element deleted is %d",DequeueFront(&q));
                break;
            case 4:
                printf("Element deleted is %d",DequeueRear(&q));
                break;
            case 5:
                display(q);
                break;
            default:
                printf("Wrong Choice\n");
                break;
        }
        printf(" Enter your choice");
        scanf("%d",&c);
    }
    
    free(q.Q);
}
  
