package com.company.conversao_dolar;

public class ConversorDeMoeda {
    public static final Double VALOR_IOF = 6.0;
    Double valorDolar;
    Double dolaresComprados;
    Double valorEmReais;

    public void setValorDolar(Double valorDolar) {
        this.valorDolar = valorDolar;
    }
    public void setDolaresComprados (Double dolaresComprados) {
        this.dolaresComprados = dolaresComprados;
    }
    public static double conversao(double valorDolar, double dolaresComprados) {
        double valorEmReais = dolaresComprados * valorDolar;
        return valorEmReais += valorEmReais * VALOR_IOF / 100;
    }

}
