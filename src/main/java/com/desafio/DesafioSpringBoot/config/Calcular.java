package com.desafio.DesafioSpringBoot.config;

import java.util.Collections;
import java.util.List;

public class Calcular {
    public static double media(List<Double> valores){
        double total = 0;

        //Para cada valor dentro de valores, soma-o ao total
        for (Double valor: valores) {
            total += valor;
        }

        return total / valores.size();
    }
    public static double desvioPadrao(List<Double> valores){
        //Faz o cálculo da média
        double media = media(valores);

        double somaDosQuadradosDasDiferencas = 0.0;
        for (double valor : valores) {
            double diferenca = valor - media;
            somaDosQuadradosDasDiferencas += diferenca * diferenca;
        }

        double variancia = somaDosQuadradosDasDiferencas / (valores.size() - 1);
        return Math.sqrt(variancia);
    }
    public static double mediana(List<Double> valores){
        //Ordenar valores em ordem
        Collections.sort(valores);

        int tamanho = valores.size();

        //Verifica se o valor da mediana é ímpar/único, se não faz o cálculo de divisão
        if (tamanho % 2 != 0) {
            int indiceMediana = tamanho / 2;
            return valores.get(indiceMediana);
        } else {
            int indiceMediana1 = (tamanho - 1) / 2;
            int indiceMediana2 = tamanho / 2;
            double mediana1 = valores.get(indiceMediana1);
            double mediana2 = valores.get(indiceMediana2);
            return (mediana1 + mediana2) / 2;
        }
    }
}
