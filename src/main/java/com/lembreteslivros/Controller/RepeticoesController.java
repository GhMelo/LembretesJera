package com.lembreteslivros.Controller;


import com.lembreteslivros.Model.ListaLivros;
import com.lembreteslivros.Model.Repeticoes;
import com.lembreteslivros.Repository.RepeticoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"} )
@RestController
@RequestMapping("/repeticoescontroller")
public class RepeticoesController {

    @Autowired
    RepeticoesRepository repeticoesRepository;

    @CrossOrigin(origins = {"*"} )
    @PostMapping
    public Repeticoes cadastrar(@RequestBody Repeticoes repeticoes){
        return repeticoesRepository.save(repeticoes);
    }
    @GetMapping
    @CrossOrigin(origins = {"*"} )
    List<Repeticoes> mostrarTodos(){
        return repeticoesRepository.buscarTodos();
    }


}
