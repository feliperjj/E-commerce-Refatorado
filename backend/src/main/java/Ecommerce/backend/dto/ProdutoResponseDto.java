package Ecommerce.backend.dto;
import Ecommerce.backend.domain.Produto;
import Ecommerce.backend.dto.ProdutoRequestDto;
import Ecommerce.backend.repository.ProdutoRepositorio;
import java.math.BigDecimal;

public record ProdutoResponseDto(String nomeProduto,BigDecimal preco,int quantidadeEstoque,String Categoria){

public ProdutoResponseDto salvar(ProdutoResponseDto dto){

String nomeProduto;
BigDecimal preco;
int quantidadedeEstoque;
String categoria;
Produto salvo = repositorio.save(produto);

}




}