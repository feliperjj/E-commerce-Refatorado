package Ecommerce.backend.dto;
import Ecommerce.backend.domain.*;
import Ecommerce.backend.dto.*;
import Ecommerce.backend.repository.*;
import java.math.BigDecimal;
public record ProdutoRequestDto( String nomeProduto ,Long id,  BigDecimal preco, int quantidadeEstoque,  String ImagemUrl, String categoria){



}