package br.com.alchacos.demo.mongo.adapter.repository;

import br.com.alchacos.demo.mongo.adapter.usecase.Foo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FooRepository extends MongoRepository<Foo, Integer> { }