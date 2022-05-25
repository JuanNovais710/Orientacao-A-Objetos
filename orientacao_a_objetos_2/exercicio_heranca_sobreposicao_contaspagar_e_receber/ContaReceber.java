package com.company.orientacao_a_objetos_2.exercicio_heranca_sobreposicao_contaspagar_e_receber;

public class ContaReceber extends Conta {
    public ContaReceber() {
    }
    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataDeVencimento) {
        this();
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }
    public void setCliente(Cliente cliente) {
    }
    public void cancelar() {
        if (this.getValor() > 50000) {
            System.err.println("Não pode cancelar " + this.getDescricao() + " pois seu valor é maior que R$ 50.000.");
        } else {
            super.cancelar();
        }
    }
        public void receber() {
        if(SituacaoConta.PENDENTE.equals(this.getSituacaoConta())) {
            System.out.println("Conta " + this.getDescricao() + " paga com sucesso.");
            this.situacaoConta = SituacaoConta.PAGA;
        }

    }
}
