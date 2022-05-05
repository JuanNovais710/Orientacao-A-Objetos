package acessando_atributos_de_objetos.exercicio_02;

public class Passeio {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Caminhada caminhar = new Caminhada();
        System.out.println(caminhar.andar(pessoa));

    }
}
