package com.desafio.DesafioSpringBoot.service;

import com.desafio.DesafioSpringBoot.config.Calcular;

import com.desafio.DesafioSpringBoot.dto.Valor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValorService {

    public void calcular(List<Double> valores){
        Calcular.media(valores);
        Calcular.desvioPadrao(valores);
        Calcular.mediana(valores);
    }

    public Valor coletarDados(List<Double> valores) {
        return new Valor(valores);
    }
}
