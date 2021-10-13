#include<bits/stdc++.h>
#define ASCII_SIZE 256
using namespace std;
char maxcountChar (char* str)
{
	int count[ASCII_SIZE] = {0};
	int length = strlen(str);
	int max = 0; 
	char result; 
	for (int i = 0; i < length; i++) 
{
		count[str[i]]++;
		if (max < count[str[i]])
{
			max = count[str[i]];
			result = str[i];
		}
	}
	return result;
}
int main()
{
	char str[] = "wizitsolutions";
	cout << "Maximum occurring character is \n"
		<< MaxcountChar(str);
	return 0;
}
