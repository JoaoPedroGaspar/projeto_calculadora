package calculadora;

/**
 * <p>
 * Projeto Calculadora
 * </p>
 *
 * <p>
 * Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, inclui também um método principal que seleciona a
 * operação
 * desejada com base em um operador informado.
 * </p>
 *
 * @author Joao Pedro Gaspar
 * @version 1.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeira variavel
     * @param b segunda variavel
     * @return o resultado da soma das variaveis "a" e "b"
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número inteiro do primeiro.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da subtração das variaveis "a" e "b"
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da multiplicação das variaveis "a" e "b"
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número inteiro pelo segundo.
     * Se o divisor for zero, exibe uma mensagem de erro e retorna 0.
     *
     * @param a dividendo
     * @param b divisor
     * @return o resultado da divisão das variaveis "a" e "b", caso o usuario
     *         indique ZERO(0) como a variavel "b", o resultado zero "0" indicando
     *         erro.
     */
    public int divisao(int a, int b) {
        if (b == 0) {
            System.out.println("Não é permitido a divisão por ZERO(0)");
            System.out.println("Erro:");
            return 0;
        } else {
            return a / b;
        }

    }

    /**
     * Realiza a operação solicitada com base no operador.
     *
     * <p>
     * Operadores validos:
     * </p>
     * <ul>
     * <li>"+" : Soma</li>
     * <li>"-" : Subtração</li>
     * <li>"*" : Multiplicação</li>
     * <li>"/" : Divisão</li>
     * </ul>
     *
     * <p>
     * Para qualquer outro operador, exibe uma mensagem e retorna "0" que indica
     * erro
     * </p>
     *
     * @param a        primeiro operando
     * @param b        segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação, ou 0 se o operador for inválido.
     */
    public int calculo(int a, int b, String operador) {
        // Escolhe a operação de acordo com o operador recebido

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
