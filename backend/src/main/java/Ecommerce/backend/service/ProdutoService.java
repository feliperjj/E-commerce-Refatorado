package Ecommerce.backend.service;
import Ecommerce.backend.domain.*;
import Ecommerce.backend.dto.*;
import Ecommerce.backend.repository.*;
import org.springframework.stereotype.Service;

@Service

public class ProdutoService{


private final ProdutoRepositorio repositorio;

public ProdutoService(ProdutoRepositorio repositorio){

    this.repositorio = repositorio;
}

public ProdutoResponseDto salvar(ProdutoRequestDto dto){

Produto produto = new Produto();
produto.setNome(dto.nomeProduto());
produto.setPreco(dto.preco());
produto.setquantidadeEstoque(dto.quantidadeEstoque());
produto.setCategoria(dto.categoria());
Produto salvo = repositorio.save(produto);
return new ProdutoResponseDto (salvo.getNome(),salvo.getPreco(),salvo.getquantidadeEstoque(),salvo.getCategoria());
}


}