#include <bits/stdc++.h>
using namespace std;
struct Node
{
	int data;
	struct Node *next;
};
struct Node *newNode(int data)
{
Node *temp = new Node;
temp -> data = data;
temp -> next = NULL;
return temp;
}
void printnode(struct Node *node)
{
	while (node != NULL)
	{
		printf("%d ", node -> data);
		node = node -> next;
	}
}
void duplicateRemoval(struct Node* &start)
{
	Node* dummy = new Node;
	dummy -> next = start;
	Node* prev = dummy;
	Node* current = start;
	while(current != NULL)
	{
		while(current -> next != NULL &&
			prev -> next -> data == current -> next -> data)
			current = current -> next;
		if (prev -> next == current)
			prev = prev -> next;
		else
			prev -> next = current -> next;
		current = current -> next;
	}
	start = dummy -> next;
}

int main()
{
	struct Node* start = newNode(13);
	start -> next = newNode(25);
	start -> next -> next = newNode(25);
	start -> next ->
	next -> next = newNode(31);
	start -> next ->
	next -> next -> next = newNode(57);
	start -> next ->
	next -> next ->
	next -> next = newNode(57);
	start -> next ->
	next -> next ->
	next -> next -> next = newNode(74);
	start -> next ->
	next -> next ->
	next -> next ->
	next -> next = newNode(74);
	cout << "List before removal of duplicates\n";	
	printnode(start);
	duplicateRemoval(start);
	cout << "\nList after removal of duplicates\n";
	printnode(start);
	return 0;
