def somaDigitos(numero):
    soma = 0
    while numero > 0:
        soma += numero % 10
        numero /= 10
    return soma

if __name__ == '__main__':
    S = int(input("Insira o valor de S: "))
    if S < 1 or S > 36:
        print("Erro. S deve ser maior ou igual a 1 e menor ou igual a 36")
    A = int(input("Insira o valor de A: "))
    if A < 1 or A > 10000:
        print("Erro. A deve ser maior ou igual a 1 e menor ou igual a 10000")
    B = int(input("Insira o valor de B: "))
    if B < 1 or B > 10000:
        print("Erro. B deve ser maior ou igual a 1 e menor ou igual a 10000")
    qtd = 0
    for i in range(A, B+1):
        if somaDigitos(i) == S:
            print(i)
            qtd += 1
    print(qtd)