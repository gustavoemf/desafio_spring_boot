package com.desafio.DesafioSpringBoot.config;

import java.util.Collections;
import java.util.List;

public class Calcular {
    public static double media(List<Double> valores){
        double total = 0;

        for (Double valor: valores) {
            total += valor;
        }

        return total / valores.size();
    }
    public static double desvioPadrao(List<Double> valores){
        double valorDesvioPadrao = 0;

        return valorDesvioPadrao;
    }
    public static double mediana(List<Double> valores){
        Collections.sort(valores);

        int tamanho = valores.size();

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
