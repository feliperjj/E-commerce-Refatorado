package Ecommerce.backend.dto;
import Ecommerce.backend.domain.*;
import Ecommerce.backend.dto.*;
import Ecommerce.backend.repository.*;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
public record ItemPedidoRequestDto(  Long idProduto,  Integer quantidade){


}
