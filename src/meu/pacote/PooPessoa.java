package meu.pacote;

class PooPessoa1 {
    private String nome;  // Agora é privado
    private int idade;    // Agora é privado

    // Construtor
    public PooPessoa1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos Getters (para ler os valores)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Métodos Setters (para modificar os valores)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {  // Regra para evitar idade negativa
            this.idade = idade;
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

// Classe principal
public class PooPessoa {
    public static void main(String[] args) {
        PooPessoa1 p1 = new PooPessoa1("Gabriel", 38);

        // Exibindo os dados
        p1.exibirDados();

        // Alterando os valores usando os setters
        p1.setNome("Simone");
        p1.setIdade(30);

        // Exibindo novamente os dados
        p1.exibirDados();
    }
}
