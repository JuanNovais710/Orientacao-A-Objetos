package acessando_atributos_de_objetos.exercicio_02;

public class Cachorro {
    String nome;
    String raca;
    char sexo;
    Integer idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
