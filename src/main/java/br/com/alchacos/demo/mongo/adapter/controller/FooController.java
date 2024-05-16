package br.com.alchacos.demo.mongo.adapter.controller;

import br.com.alchacos.demo.mongo.adapter.dto.RegistrarFooRequest;
import br.com.alchacos.demo.mongo.adapter.usecase.Foo;
import br.com.alchacos.demo.mongo.adapter.usecase.FooService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/foos/traditional")
public class FooController {

    private final FooService fooService;

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> registrar(@RequestBody RegistrarFooRequest request) {
        return ResponseEntity.ok().body(this.fooService.registrar(request));
    }

    @GetMapping
    public ResponseEntity<List<Foo>> listar() {
        return ResponseEntity.ok().body(this.fooService.listar());
    }
}