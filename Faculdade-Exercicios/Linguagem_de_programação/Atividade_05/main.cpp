#include <iostream>
#include <stdlib.h>
#include <locale.h>
#include <cstdlib>
#include <math.h>
#include <iomanip>

using namespace std;

void menu() {
    cout << endl;
    cout << "1 - Digitar valores: "<<endl;
    cout << "2 - Calcular média: "<<endl;
    cout << "3 - Exibir resultado: "<<endl;
    cout << "4 - Sair." << endl;
}

void sair() {
    cout << "Encerrando o programa...";
    exit(0);
}

double guardarA() {
    double a;
    cout << "Digite o primeiro número: "<<endl<<endl;
    cin >> a;
    return a;
}

double guardarB() {
	double b;
    cout << "Digite o segundo número: "<<endl<<endl;
    cin >> b;
    return b;
}

double guardarC() {
	double c;
    cout << "Digite o terceiro número: "<<endl<<endl;
    cin >> c;
    return c;
}

double calcular(double a, double b, double c) {
    return cbrt(a * b * c);
}

void exibir(double a, double b, double c, double resultado) {
    cout << fixed << setprecision(2);
    cout << setfill(' ');
    cout << "A média geométrica dos valores " << setw(10) << a << "," << setw(10) << b << "," << setw(10) << c << " é igual a: " << setw(10) << resultado<<endl<<endl;
}

int main() {
	 setlocale(LC_ALL,"Portuguese");
	 
    double a, b, c, resultado;
    int escolha;

    INICIO:  
    menu();

    cout << "Escolha a opção:" << endl;
    cin >> escolha;

switch(escolha) {
    case 1:
        a = guardarA();
        b = guardarB();
        c = guardarC();
        cout << "Valores digitados!";
        cout<<endl;
        system("pause");
        system("cls");
        goto INICIO;
        break;
    case 2:
        resultado = calcular(a, b, c);
        cout << "Cálculo executado!"<<endl<<endl;
        system("pause");
        system("cls");
        goto INICIO;
        break;
    case 3:
        exibir(a, b, c, resultado);
        system("pause");
        system("cls");
        goto INICIO;
        break;
    case 4:
        cout << "Saindo do programa" << endl;
        goto SAIR;
        break;
    }

    SAIR:
    sair();

    return 0;
}
