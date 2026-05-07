package Ecommerce.backend.controller;
import org.springframework.stereotype.Service;
import Ecommerce.backend.domain.Produto;
import Ecommerce.backend.repository.ProdutoRepositorio;
import java.math.BigDecimal;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;

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

@DeleteMapping("/{id}")
public ResponseEntity<Void> deletar(@PathVariable Long id){

repositorio.deleteById(id);
return ResponseEntity.noContent().build();

}



@GetMapping("/buscar")

public Optional<Produto> buscar (@RequestParam long id){
return repositorio.findById(id);

}

@PutMapping("/{id}")

public ResponseEntity<Produto> alterarProduto(@PathVariable Long id,@RequestBody Produto produto){

return repositorio.findById(id)
.map(produtoExistente -> {

produtoExistente.setNome(produto.getNome());
produtoExistente.setquantidadeEstoque(produto.getquantidadeEstoque());
produtoExistente.setCategoria(produto.getCategoria());
produtoExistente.setPreco(produto.getPreco());

Produto alterarProduto = repositorio.save(produtoExistente);
return ResponseEntity.ok(alterarProduto);

})
.orElse(ResponseEntity.notFound().build());



}
}










