# include <iostream>
using namespace std;

int main() {
    int op;
    float num1, num2;

    cout << "Enter your choice:1.add  2.substract  3.multiply 4.divide \n";
    cin >> op;

    cout << "Enter two operands: ";
    cin >> num1 >> num2;

    switch(op) {
        case 1:
            cout << num1 << " + " << num2 << " = " << num1 + num2;
            break;

        case 2:
            cout << num1 << " - " << num2 << " = " << num1 - num2;
            break;

        case 3:
            cout << num1 << " * " << num2 << " = " << num1 * num2;
            break;

        case 4:
            cout << num1 << " / " << num2 << " = " << num1 / num2;
            break;

        default:
            cout << "Error! operator is not correct";
            break;
    }

    return 0;
}
