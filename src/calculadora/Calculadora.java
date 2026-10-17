package calculadora;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        if (b == 0) {
            System.out.println("Não é permitido a divisão por ZERO(0)");
            System.out.println("Erro:");
            return 0;
        } else {
            return a / b;
        }

    }

    public int calculo(int a, int b, String operador) {
        switch (operador) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return divisao(a, b);
            default:
                System.out.println("Operador Invalido");
                return 0;
        }
    }

}
