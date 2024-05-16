package br.com.alchacos.demo.mongo.adapter.usecase;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@Builder
@Document(collection = "foos")
public class Foo {

    @Getter
    @MongoId
    private String id;
    private LocalDateTime data;
    private String nome;
    private Integer codigo;

}