package orientacao.objetos.produto.RecebendoInformacoes;

public class Pessoa {
    String nome;
    String sobrenome;
    Byte idade;
    Long numeroTelefone;
    String genero;
    Byte estadoCivil;

    String formarNomeCompleto() {
        return nome + " " + sobrenome;
    }

    Boolean validarIdade() {
        return idade >= 0 && idade < 120;
    }

    String obterDDD() {
        String DDD = numeroTelefone.toString(0, 2);
        return DDD;
    }

    Boolean validarGenero() {
        boolean generoValido = (genero.equals("F") || genero.equals("M") || genero.equals("T") ||
                genero.equals("Z") || genero.equals("f") || genero.equals("m") ||
                genero.equals("t") || genero.equals("z"));
        if(generoValido) {
            System.out.println(genero);
        }else {
            System.err.println("Gênero inválido! ");
        }
        return generoValido;
    }
}
