#include <iostream>
using namespace std;
/*When we call functions the exceution of main function stops for a while and program waits for result.
This causes undesirable waste of time. One solution is to use tertiary operator wherever possible rather than using functions, which makes execution of program fast.
However writing more and more tertiary operators would make our code look overwelming at some point of time.
To avail both clean code and fast speed ,C++ has a powerful concept of inline functions(which are not true functions but part of main block itself).
At the tijme of compiling the compiler would itself place the inline code where the function has been called
in our main function. Hence we have achieved fast execution as well as clean code
Further Reading : https://www.geeksforgeeks.org/inline-functions-cpp/
*/
inline int max(int a,int b){
    return (a>b?a:b);
}
inline int min(int a,int b){
    return (a<b?a:b);
}
int main() {    
    int a,b;
    cout << "Enter the numbers: ";
    cin >> a >> b;
    int ans = max(a,b);
    cout << ans;
    return 0;
}
