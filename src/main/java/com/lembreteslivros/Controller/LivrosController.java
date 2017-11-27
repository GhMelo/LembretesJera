package com.lembreteslivros.Controller;


import com.lembreteslivros.Model.ListaLivros;
import com.lembreteslivros.Repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/livroscontroller")
@RestController

//Aqui defino as urls das requisiçoes, qual metodo sera utilizado e qual verbo web sera utilizado, como post, put, get ou delete
//os testes que eu estou fazendo estao sendo no postman, com url direto, pois primeiro crio a api-rest, para depois fazer o frontend
//os metodos de busca sao anteriormente definidos no LivrosRepository, e alguns sao utilizados nativos do Springboot

public class LivrosController {
    @Autowired
    private LivrosRepository livrosRepository;

    @PostMapping
    public ListaLivros adicionar(@RequestBody ListaLivros listaLivros) {
        return livrosRepository.save(listaLivros);
    }
    @GetMapping("/mostrartodos")
    List<ListaLivros> mostrarTodos(){
        return livrosRepository.buscarTodos();
    }

}
