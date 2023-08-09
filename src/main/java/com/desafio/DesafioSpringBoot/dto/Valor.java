package com.desafio.DesafioSpringBoot.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Valor {
    @Getter @Setter
    private List<Double> valor = new ArrayList<>();

    public Valor(List<Double> valor) {
        this.valor = valor;
    }
}
