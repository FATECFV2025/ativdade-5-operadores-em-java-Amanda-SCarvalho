public class Calculadora {
    public static void main(String[] args) {
        Operadores op = new Operadores();

        //Operadores Aritméticos 
        System.out.println("Resultado Operações Aritméticos - 10 e 5");
        System.out.println("Adição: " + op.adicao(10, 5));
        System.out.println("Subtração: " + op.subtracao(10, 5));
        System.out.println("Multiplicação: " + op.multiplicacao(10, 5));
        System.out.println("Divisão: " + op.divisao(10, 5));
        System.out.println("Modulo: " + op.modulo(10, 5));
        System.out.println("");

        //Operadores de Atribuição
        System.out.println("Resultado Operadores de Atribuição - 10 e 5");
        System.out.println("Atribuição de Adição: " + op.at_adicao(10, 5));
        System.out.println("Atribuição de Subtração: " + op.at_subtracao(10, 5));
        System.out.println("Atribuição de Multiplicação: " + op.at_multiplicacao(10, 5));
        System.out.println("Atribuição de Divisão: " + op.at_divisao(10, 5));
        System.out.println("Atribuição Simples: " + op.at_simples(10, 5));
        System.out.println("");

        // Operadores de comparação
        System.out.println("Resultado Operadores de Comparação");
        System.out.println("10 igual a 5: " + op.igual(10, 5));
        System.out.println("10 diferente de 5: " + op.diferente(10, 5));
        System.out.println("10 menor que 5: " + op.menor(10, 5));
        System.out.println("10 maior que 5: " + op.maior(10, 5));
        System.out.println("10 menor ou igual a 5: " + op.menor_igual(10, 5));
        System.out.println("10 Maior ou igual a 5: " + op.maior_igual(10, 5));
        System.out.println("");

        // Operadores Lógicos
        System.out.println("Resultado Operadores Lógicos - True e False");
        System.out.println("E (logical AND): " + op.l_and(true, false));
        System.out.println("E (boolean logical AND): " + op.bl_and(true,false));
        System.out.println("OU (logical OR): " + op.l_or(true, false));
        System.out.println("OU (boolean logical inclusive OR): " + op.bli_or(true, false));
        System.out.println("OU EXCLUSIVO (boolean logical exclusive OR)" + op.ble_or(true, false));
        System.out.println("NÃO (logical NOT): " + op.NOT(true, false));


    }

}
