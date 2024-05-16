package br.com.alchacos.demo.mongo.adapter.controller;

import br.com.alchacos.demo.mongo.adapter.dto.RegistrarFooRequest;
import br.com.alchacos.demo.mongo.adapter.usecase.Foo;
import br.com.alchacos.demo.mongo.adapter.usecase.FooReactiveService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/foos/reactive")
public class FooReactiveController {

    private final FooReactiveService fooReactiveService;

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public Mono<Foo> registrar(@RequestBody RegistrarFooRequest request) {
        return this.fooReactiveService.registrar(request);
    }

    @GetMapping
    public Flux<Foo> listar() {
        return this.fooReactiveService.listar();
    }
}