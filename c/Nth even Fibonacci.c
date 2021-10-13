#include<iostream>
using namespace std;
long int evenfibonacci(int n)
{
	if (n < 1)
	return n;
	if (n == 1)
	return 2;
	return ((4 * evenfibonacci(n-1)) +
			evenfibonacci(n-2));
}
int main ()
{
	int n = 5;
	cout <<” The nth Even Fibonacci number is :\n”<< evenfibonacci(n);
	return 0;
}
