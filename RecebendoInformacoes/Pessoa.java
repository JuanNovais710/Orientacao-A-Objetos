package orientacao.objetos.produto.RecebendoInformacoes;

public class Pessoa {
    String nome;
    String sobrenome;
    Byte idade;
    String numeroTelefone;
    Byte genero;
    Byte estadoCivil;

    String formarNomeCompleto() {
        return nome + " " + sobrenome;
    }
    String obterDDD() {
        return numeroTelefone.substring(0, 2);
    }
    String telefoneSemDDD() {
        return numeroTelefone.substring(2, 11);
    }
    String generoToString (String generoAPassar) {
        boolean generoMasculino = genero == 0;
        boolean generoFeminino = genero == 1;
        boolean generoTrans = genero == 2;
        boolean naoInformado = genero == 3;
        if(generoMasculino) {
            generoAPassar = "Masculino";
            System.out.print(generoAPassar);
        }else if(generoFeminino) {
             generoAPassar = "Feminino";
            System.out.println(generoAPassar);
        }else if(generoTrans) {
             generoAPassar = "Transgênero";
            System.out.println(generoAPassar);
        }
        else if(naoInformado) {
             generoAPassar = "Gênero não informado";
            System.out.println(generoAPassar);
        }
        return generoAPassar;
    }
    String formatarEstadoCivil (String situacaoAPassar) {
        boolean solteiro = estadoCivil == 1;
        boolean casado = estadoCivil == 2;
        boolean divorciado = estadoCivil == 3;
        boolean viuvo = estadoCivil == 4;
        if(solteiro) {
            situacaoAPassar = "Solteiro";
            System.out.println(situacaoAPassar);
        }else if(casado) {
            situacaoAPassar = "Casado";
            System.out.println(situacaoAPassar);
        }else if(divorciado) {
            situacaoAPassar = "Divorciado";
            System.out.println(situacaoAPassar);
        }else if (viuvo) {
            situacaoAPassar = "Viúvo(a)";
            System.out.println(situacaoAPassar);
        }
        return situacaoAPassar;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
        this.idade = idade;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public Byte getGenero() {
        return genero;
    }

    public void setGenero(Byte genero) {
        this.genero = genero;
    }

    public Byte getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Byte estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
