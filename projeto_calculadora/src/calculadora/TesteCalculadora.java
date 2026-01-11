package calculadora;

/**
 * <p><strong>Classe de Teste da Calculadora</strong></p>
 *
 * <p>Este programa serve para testar a classe {@code calculadora} na prática.
 * Aqui a gente executa várias operações(como soma, subtração, divisão e multiplicação), mostra os resultados no console e também
 * testa alguns casos que geram erro, só para garantir que as exceções estão funcionando.</p>
 *
 * @author Jefferson Oliveira
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * <p>Método principal da aplicação de teste.</p>
     *
     * <p>Neste método:</p>
     * <ul>
     *     <li>Criamos um objeto da classe {@code calculadora}</li>
     *     <li>Testamos operações básicas: soma, subtração, multiplicação e divisão</li>
     *     <li>Testamos também situações que geram exceção, como divisão por zero e operador inválido</li>
     * </ul>
     *
     * <p>No final, mostramos o resultado no console.</p>
     */
    public static void main(String[] args) {
        calculadora calc = new calculadora();

        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        /**
         * <p>Teste para divisão por zero.</p>
         *
         * <p>Aqui tentamos executar uma operação inválida: dividir 8 por 0.
         * Como a classe calculadora não permite divisão por zero, uma exceção
         * é lançada. O try/catch serve para capturar essa exceção e mostrar a
         * mensagem sem interromper o programa de seguir.</p>
         */
        try {
            System.out.println(calc.calcular(8, 0, "/")); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        /**
         * <p>Teste para operador inválido.</p>
         *
         * <p>Neste teste, usamos o operador "x", que não faz parte dos operadores
         * que são aceitos pela calculadora. Isso faz com que uma exceção seja mostrada,
         * demonstrando que o método calcular valida a entrada que estamos inserindo.</p>
         */
        try {
            System.out.println(calc.calcular(5, 5, "x")); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
