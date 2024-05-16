package br.com.alchacos.demo.mongo.adapter.usecase;

import br.com.alchacos.demo.mongo.adapter.dto.RegistrarFooRequest;
import br.com.alchacos.demo.mongo.adapter.repository.FooReactiveRepository;
import br.com.alchacos.demo.mongo.domain.port.IFooService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
@Transactional
public class FooReactiveService implements IFooService {

    private final FooReactiveRepository fooReactiveRepository;

    @Override
    public Mono<Foo> registrar(RegistrarFooRequest request) {
        Foo foo = Foo.builder()
                .data(LocalDateTime.now())
                .nome("Foo1")
                .codigo(1)
                .build();
        return this.fooReactiveRepository.save(foo);
    }

    @Override
    public Flux<Foo> listar() {
        return this.fooReactiveRepository.findAll();
    }
}