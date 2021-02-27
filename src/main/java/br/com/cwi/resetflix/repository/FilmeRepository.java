package br.com.cwi.resetflix.repository;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;

@Repository
public class FilmeRepository {

    static List<FilmeEntity> filmes = Collections.singletonList(
        new FilmeEntity(1l,"Interestelar", Genero.FICCAO_CIENTIFICA,
            1l, asList(1l))
    );

    public List<FilmeEntity> getFilmes(){
        return filmes;
    }

    public List<FilmeEntity> acharFilmesAtor(final Long id) {
        //TODO Filtrar na repository por id de ator
        return filmes;
    }
}
