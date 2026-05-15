package Ecommerce.backend.dto;
import Ecommerce.backend.domain.*;
import Ecommerce.backend.dto.*;
import Ecommerce.backend.repository.*;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
public record ProdutoRequestDto( @NotBlank String nomeProduto , @PositiveOrZero BigDecimal preco, @PositiveOrZero int quantidadeEstoque,  @NotBlank String ImagemUrl, @NotBlank String categoria){



}