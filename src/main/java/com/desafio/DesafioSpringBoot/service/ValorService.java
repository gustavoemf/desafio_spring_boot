package com.desafio.DesafioSpringBoot.service;

import com.desafio.DesafioSpringBoot.config.Calcular;

import com.desafio.DesafioSpringBoot.dto.Valor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValorService {

    public String calcular(List<Double> valores){
        return "Quantidade de dados recebidos: " + valores.size() + "\nMédia: " + Calcular.media(valores) + "\nDesvio padrão: " + Calcular.desvioPadrao(valores) + "\nMediana: " + Calcular.mediana(valores);
    }

    public Valor coletarDados(List<Double> valores) {
        return new Valor(valores);
    }
}
