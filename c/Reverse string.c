#include <bits/stdc++.h>
using namespace std;
void reverseword(char str[], int start, int end)
{
	char temp;
	while(start<=end)
	{
		temp=str[start];
		str[start]=str[end];
		str[end]=temp;
		start++;
		end--;
	}
}
void reverseletter( char str[], int start, int end)
{
	int wordstart, wordend;
	for(wordstart=wordend=start; wordend<end; wordend++)
	{
		if( str[wordend]==” “)
			continue;
		while(str[wordend]!=” “&&wordend<=end)
			wordend++;
		wordend--;
		reverse(str, wordstart, wordend);
	}
}
int main()
{
	Char str[1000]= “ Wiz It Solutions Is An It Company Based At Indore”
	reverseletter(str,0,strlen(str)-1);
	cout<<”The new string after reversing according to the words\n”<<str;
	return 0;
}
