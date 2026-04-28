package Ecommerce.backend;
import org.springframework.stereotype.Service;
import Ecommerce.backend.Produto;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/produtos")


public class ProdutoController{

private final ProdutoRepositorio repositorio;

public ProdutoController(ProdutoRepositorio repositorio){

    this.repositorio = repositorio;
}

@GetMapping

public List<Produto> listar(){

    return repositorio.findAll();
}

@PostMapping 

public Produto criar(@RequestBody Produto produto){


    return repositorio.save(produto);

}






@GetMapping("/buscar")

public Optional<Produto> buscar (@RequestParam long id){
return repositorio.findById(id);

}
}

