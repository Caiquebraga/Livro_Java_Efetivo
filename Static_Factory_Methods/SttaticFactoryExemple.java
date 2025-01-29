package Static_Factory_Methods;

public class SttaticFactoryExemple {

    private String nome;
    private int idade;

    private SttaticFactoryExemple(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // ✅ Static Factory Method para criar instâncias

    public static SttaticFactoryExemple criarComNomeEIdade(String nome, int idade){
        return new SttaticFactoryExemple(nome, idade );
    }

    // ✅ Método para exibir os valores
    public void Exibir(){
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    // ✅ Testando a classe

    public static void main(String[] args){
        SttaticFactoryExemple Pessoa = SttaticFactoryExemple.criarComNomeEIdade("Caique", 29);
    }
}


