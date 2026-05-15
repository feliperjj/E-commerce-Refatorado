package Ecommerce.backend.controller;

import org.springframework.stereotype.Service;
import Ecommerce.backend.domain.Produto;
import Ecommerce.backend.service.ProdutoService;
import org.springframework.web.bind.annotation.*;
import Ecommerce.backend.dto.ProdutoRequestDto;
import Ecommerce.backend.dto.ProdutoResponseDto;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/produtos")


public class ProdutoController{

private final ProdutoService service;

public ProdutoController(ProdutoService service){

    this.service = service;
}

@GetMapping

public List<ProdutoResponseDto> listar(){

    return service.listarProdutos();
}

@PostMapping 

public ProdutoResponseDto criar(@Valid @RequestBody ProdutoRequestDto dto){


    return service.salvar(dto);

}

@DeleteMapping("/{id}")
public ResponseEntity<Void> deletar(@PathVariable Long id){

service.deletar(id);
return ResponseEntity.noContent().build();

}



// @GetMapping("/buscar")

// public ResponseEntity<ProdutoResponseDto>buscar (@RequestParam long id,@RequestBody RequestDto dto){
// return service.busca(id);

// }

@PutMapping("/{id}")

public ResponseEntity<ProdutoResponseDto> alterarProduto(@PathVariable Long id,@Valid @RequestBody ProdutoRequestDto dto){


ProdutoResponseDto atualizado = service.alterarDTO(id,dto);
return ResponseEntity.ok(atualizado);



}
}










