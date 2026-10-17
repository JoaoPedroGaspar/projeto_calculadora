package calculadora;

/**
 * Testes unitários da classe Calculadora.
 *
 * <p>
 * Esta classe realiza as operações de soma "+"", subtração"-", multiplicação"*"
 * e
 * divisão"/", ocorre tambem a visualização de erros caso o usuario digite algo
 * incorreto (divisão por zero e operador inválido),
 * onde mostra o resultado de cada operacao.
 * </p>
 *
 * @author Joao Pedro Gaspar
 * @version 1.0
 */
public class TesteCalculadora {
        /**
     * Método principal: executa os testes da calculadora.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        // Para as operacoes, deve lembrar as seguintes regras:
        // Para SOMA, utilizar o operador "+"
        // Para Subtrair, utilizar o operador "-"
        // Para Multiplicar, utilizar o operador "*"
        // Para divisão, utilizar o operador "/"
        // A saida 0 indica que houve um erro na operacao
        System.out.println("Soma: " + calcular.calculo(2, 3, "+")); // Esperado: Soma: 5

        System.out.println("Subtração: " + calcular.calculo(10, 4, "-")); // Esperado: Subtracao: 6

        System.out.println("Multiplicação: " + calcular.calculo(3, 5, "*")); // Esperado: Multiplicacao: 15

        System.out.println("Divisão: " + calcular.calculo(8, 2, "/")); // Esperado: Divisao: 4

        // Teste do erro divisao
        System.out.println(calcular.calculo(10, 0, "/"));// Esperado: Não é permitido a divisão por ZERO(0)

        // Teste do erro operador invalido
        System.out.println(calcular.calculo(10, 2, "x"));// Esperado: Operador Invalido
    }
}
