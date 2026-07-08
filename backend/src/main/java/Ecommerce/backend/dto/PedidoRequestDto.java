package Ecommerce.backend.dto;
import Ecommerce.backend.domain.*;
import Ecommerce.backend.dto.*;
import Ecommerce.backend.repository.*;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import java.util.List;
public record PedidoRequestDto( @NotBlank String nomeCliente, @NotBlank String enderecoEntrega,List<ItemPedidoRequestDto> itens){


}



