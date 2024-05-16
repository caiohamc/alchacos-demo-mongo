package br.com.alchacos.demo.mongo.adapter.usecase;

import br.com.alchacos.demo.mongo.adapter.dto.RegistrarFooRequest;
import br.com.alchacos.demo.mongo.adapter.repository.FooRepository;
import br.com.alchacos.demo.mongo.domain.port.IFooService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class FooService implements IFooService {

    private final FooRepository repository;

    @Override
    public String registrar(RegistrarFooRequest request) {
        Foo foo = Foo.builder()
            .data(LocalDateTime.now())
            .nome("Foo1")
            .codigo(1)
            .build();

        Foo savedFoo = this.repository.save(foo);
        return savedFoo.getId();
    }

    @Override
    public List<Foo> listar() {
        return this.repository.findAll();
    }
}
