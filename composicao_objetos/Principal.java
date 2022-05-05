package acessando_atributos_de_objetos.composicao_objetos;

public class Principal {
    public static void main(String[] args) {
    Carro meuCarro = new Carro();
    meuCarro.cor = "Verde";
    meuCarro.anoDeFabricacao = 2015;
    meuCarro.fabricante = "Hyundai";

    meuCarro.dono = new Proprietario();
    meuCarro.dono.nome = "Juan";
    meuCarro.dono.cpf = "123456789";
    meuCarro.dono.bairro = "Legal";
    }
}
