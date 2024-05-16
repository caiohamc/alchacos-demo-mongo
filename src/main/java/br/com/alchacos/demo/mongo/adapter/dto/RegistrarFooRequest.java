package br.com.alchacos.demo.mongo.adapter.dto;

import lombok.Builder;

@Builder
public class RegistrarFooRequest {

    private String nome;
    private String codigo;
}
