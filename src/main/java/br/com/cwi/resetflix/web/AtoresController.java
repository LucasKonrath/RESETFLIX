package br.com.cwi.resetflix.web;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cwi.resetflix.request.CriarAtorRequest;
import br.com.cwi.resetflix.response.AtoresResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesAtorResponse;

@RestController
@RequestMapping("/atores")
public class AtoresController implements AtoresContract {

    //TODO IMPLEMENTAR SERVICE DE ATORES

    @Override
    @GetMapping
    public List<AtoresResponse> getAtores() {
        //TODO IMPLEMENTAR CHAMADA DE SERVICE
        return Collections.emptyList();
    }

    @Override
    @GetMapping("/{id}")
    public ConsultarDetalhesAtorResponse getAtorById(@PathVariable("id") final Long id) {
        //TODO IMPLEMENTAR CHAMADA DE SERVICE
        return null;
    }

    @Override
    @PostMapping
    public Long criarAtor(@RequestBody final CriarAtorRequest request) {
        //TODO IMPLEMENTAR CHAMADA DE SERVICE
        return null;
    }
}
