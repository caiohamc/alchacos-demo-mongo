package br.com.alchacos.demo.mongo.domain.port;

import br.com.alchacos.demo.mongo.adapter.dto.RegistrarFooRequest;

public interface IFooService<T> {
    public T registrar(RegistrarFooRequest request);
    public T listar();
}