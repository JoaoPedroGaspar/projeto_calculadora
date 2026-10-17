package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        //Para as operacoes, deve lembra as seguintes regras: 
        //Para SOMA, utilizar o operador "+"
        //Para Subtrair, utilizar o operador "-"
        //Para Multiplicar, utilizar o operador "*"
        //Para divisão, utilizar o operador "/"
       // A saisa 0 indica que houve um erro na operacao
        System.out.println("Soma: " + calcular.calculo(2, 3, "+")); //Esperado: Soma: 5
        
        System.out.println("Subtração: " + calcular.calculo(10, 4, "-")); //Esperado: Substracao: 6
       
        System.out.println("Multiplicação: " + calcular.calculo(3, 5, "*")); //Esperado: Multiplicacao: 15
       
        System.out.println("Divisão: " + calcular.calculo(8, 2, "/")); //Esperado: Divisao: 4

        //Teste do erro divisao
        System.out.println(calcular.calculo(10, 0, "/"));//Esperado: Não é permitido a divisão por ZERO(0)


        //Teste do erro operador invalido
        System.out.println(calcular.calculo(10, 2, "x"));//Esperado: Operador Invalido
    }
}
