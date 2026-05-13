package Ecommerce.backend.service;
import Ecommerce.backend.domain.Produto;
import Ecommerce.backend.dto.*;
import Ecommerce.backend.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;
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
produto.setImagemUrl(dto.ImagemUrl());
produto.setCategoria(dto.categoria());
Produto salvo = repositorio.save(produto);
return new ProdutoResponseDto (salvo.getNome(),salvo.getPreco(),salvo.getquantidadeEstoque(),salvo.getImagemUrl(),salvo.getCategoria());
}

public List <ProdutoResponseDto> listarProdutos(){


return repositorio.findAll().stream().map(produto -> new ProdutoResponseDto(produto.getnomeProduto(),produto.getId(),produto.getpreco(),produto.getquantidadeEstoque(),produto.getCategoria())).toList();

}

public void deletar(Long id){

    repositorio.deleteById(id);
}
public ProdutoResponseDto busca (Long id){

    repositorio.findById(id);
}

public ProdutoResponseDto alterarDTO(Long id,ProdutoRequestDto dto){

Produto produto = repositorio.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
produto.setNome(dto.nomeProduto());
produto.setPreco(dto.preco());
produto.setquantidadeEstoque(dto.quantidadeEstoque());
produto.setImagemUrl(dto.ImagemUrl());
produto.setCategoria(dto.categoria());
Produto salvo = repositorio.save(produto);

return new ProdutoResponseDto (salvo.getNome(),salvo.getPreco(),salvo.getquantidadeEstoque(),salvo.getImagemUrl(),salvo.getCategoria());
}


}