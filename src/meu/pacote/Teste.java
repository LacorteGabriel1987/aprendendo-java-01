package meu.pacote;



class Pessoa {  // Não é pública, é uma classe simples.
    String nome;
    int idade;
    
    // 3. Construtor - Inicializa os objetos dessa classe (opcional)

    Pessoa(String nome, int idade){
    	this.nome = nome;
    	this.idade = idade;
    }

    // Método para exibir informações
    void exibirDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

public class Teste {  // A classe pública precisa ter o mesmo nome do arquivo

    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa p1 = new Pessoa( "Gabriel", 38);
       

        p1.exibirDados(); // Saída: Nome: Gabriel, Idade: 38
    }
}
