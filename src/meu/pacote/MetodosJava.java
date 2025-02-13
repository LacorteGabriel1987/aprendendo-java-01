package meu.pacote;

public class MetodosJava {
    public static void main(String[] args) {
        // Chamando o método saudação
        mensagem();

        // Chamando o método multiplicação e mostrando o resultado
        int resultado = multiplicar(4, 5);
        System.out.println("Resultado da multiplicação: " + resultado);
    }

    // Método saudação
    public static void mensagem() {
        System.out.println("Olá, seja bem-vindo ao aprendizado de Java!");
    }

    // Método multiplicação
    public static int multiplicar(int a, int b) {
        return a * b;
    }
}
