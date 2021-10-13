#include <bits/stdc++.h >
using namespace std;
void subarray(int arr[], int n)
{
	unordered_map<int,int> left;   
	unordered_map<int,int> count;   
	int max=0;    
	int min, index;
	for( int i=0; i<n; i++)
	{
		int x=arr[i];
		if(count[x]==0)
		{
			left[x]=i;
			count[x]=1;
		}
		else
			count[x]++;
		if(count[x]>max)
		{
			max=count[x];
			min=i-left[x]+1;
			index=left[x];
		}
		else if(count[x]==max&&i-left[x]+1<min)
		{
			min=i-left[x]+1;
			index=left[x];
		}
	}
	cout<<”The Smallest Subarray for the maximum repeated element is : \n”;
	for(int i=index; i<index+min; i++)
		cou<<arr[i]<<” ”;
}
int main()
{
	int arr[]={ 4,1,3,2,2,2,5};   //hardcoded array
	int n=sizeof(arr)/sizeof(arr[0]);
	subarray(arr,n);
	return 0;
}
