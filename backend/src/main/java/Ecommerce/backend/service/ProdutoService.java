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

public ProdutoRequestDto salvar(ProdutoRequestDto dto){

Produto produto = new Produto();
produto.setNome(dto.nome());
produto.setpreco(dto.preco());
produto.setquantidadeEstoque(dto.quantidadedeEstoque());
produto.setCategoria(dto.categoria());

}


}