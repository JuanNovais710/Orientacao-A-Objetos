package com.company.orientacao_a_objetos_2.modificador_de_acesso_default;

public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("vitor");
        DonoCachorro dono = new DonoCachorro();
        dono.ensinarCachorroSentar(cachorro);
    }
}
