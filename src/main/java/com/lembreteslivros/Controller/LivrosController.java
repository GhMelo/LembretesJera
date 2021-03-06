package com.lembreteslivros.Controller;


import com.lembreteslivros.Model.ListaLivros;
import com.lembreteslivros.Repository.LivrosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/livroscontroller")
@RestController
@CrossOrigin (origins = {"*"})

//Aqui defino as urls das requisiçoes, qual metodo sera utilizado e qual verbo web sera utilizado, como post, put, get ou delete
//os testes que eu estou fazendo estao sendo no postman, com url direto, pois primeiro crio a api-rest, para depois fazer o frontend
//os metodos de busca sao anteriormente definidos no LivrosRepository, e alguns sao utilizados nativos do Springboot

public class LivrosController {
    @Autowired
    private LivrosRepository livrosRepository;

    @PostMapping
    @CrossOrigin (origins = {"*"})
    public ListaLivros adicionar(@RequestBody ListaLivros listaLivros) {
        return livrosRepository.save(listaLivros);
    }
    @PutMapping
    @CrossOrigin (origins = {"*"})
    public ListaLivros alterar(@RequestBody ListaLivros listaLivros) {
        return livrosRepository.save(listaLivros);
    }
    @GetMapping
    @CrossOrigin (origins = {"*"})
    List<ListaLivros> mostrarTodos(){
        return livrosRepository.buscarTodos();
    }
    @DeleteMapping("/{id}")
    public void deletar (@PathVariable("id") Integer id){
        livrosRepository.delete(id);
    }

}
