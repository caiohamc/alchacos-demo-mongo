package br.com.alchacos.demo.mongo.adapter.repository;

import br.com.alchacos.demo.mongo.adapter.usecase.Foo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface FooReactiveRepository extends ReactiveMongoRepository<Foo, String> { }