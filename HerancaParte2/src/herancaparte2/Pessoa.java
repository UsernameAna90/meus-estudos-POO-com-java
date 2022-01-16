package herancaparte2;

public abstract class Pessoa {
    
    //ATRIBUTOS
    protected String nome;
    protected int idade;
    protected String sexo;
    
    //METODOS AUXILIARES
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //MÉTODOS
    public final void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
        System.out.println("Párabéns pelo seu aniversário!");
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}
