/* Program of queue using linked list*/
# include<stdio.h>
# include<stdlib.h>

struct node
{
	int data;
	struct node *next;
}*front=NULL,*rear=NULL;


int isEmpty()
{
	if(front == NULL)
		return 1;
	else
		return 0;	
}
int isFull()
{
	struct Node *t=(struct Node *)malloc(sizeof(struct node));
	if(t==NULL)
		return 1;
	else 
		return 0;
}
void enqueue(int x)
{	struct node *t;
	t = (struct node *)malloc(sizeof(struct node));
	if(t==NULL)
		printf("Queue Overflow\n");
	t->data = x;
	t->next=NULL;
	if(front==NULL)		 /*If Queue is empty*/
		front=t;
	else
		rear->next=t;
	rear=t;
}/*End of insert()*/

int dequeue()
{
	struct node *t;
    int x=-1;
	if(front == NULL)
		printf("Queue Underflow\n");
	else
	{
		t=front;
		front=front->next;
        x=t->data;
		free(t);
	}
    return x;
}/*End of del()*/

void display()
{
	struct node *ptr;
	ptr = front;
	if(front == NULL)
		printf("Queue is empty\n");
	else
	{
		printf("Queue elements :\n");
		while(ptr != NULL)
		{
			printf("%d ",ptr->data);
			ptr = ptr->next;
		}
		printf("\n");
	}/*End of else*/
}/*End of display()*/
int main()
{
	int choice,x;
    printf("1.Insert\n");
	printf("2.Delete\n");
	printf("3.Display\n");
	printf("4.IsFull\n");
	printf("5.IsEmpty\n");
	printf("6.Quit\n");
	while(1)
	{ 
		printf("Enter your choice : ");
		scanf("%d", &choice);

		switch(choice)
		{
		case 1:
			printf("Enter the element to be inserted :");
			scanf("%d",&x);
			enqueue(x);
			break;
		case 2:
            printf("Deleted element is  %d\n",dequeue());
			break;
		case 3:
			display();
			break;
		case 4:
			if(isFull())
				printf("Queue is Full\n");
			else
			   printf("Queue is not Full\n");
			break;
		case 5:
			if(isEmpty())
				printf("Queue is Empty\n");
			else
				printf("Queue is not empty\n");
			break;
		case 6:
			exit(1);
		default :
			printf("Wrong choice\n");
		}/*End of switch*/
	}/*End of while*/
}/*End of main()*/
