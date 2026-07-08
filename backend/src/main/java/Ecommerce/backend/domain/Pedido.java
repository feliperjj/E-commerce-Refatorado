package Ecommerce.backend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name = "pedidos")
public class Pedido{
@Id 


@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nomeCliente;
private String enderecoEntrega;
private BigDecimal valorTotal;
@OneToMany(mappedBy = "pedido")
private List<ItemPedido> produtos;

public void calcularValorTotal(){
    BigDecimal total = BigDecimal.ZERO;
    for (ItemPedido item : produtos) {
        total = total.add(item.getPrecoUnitario().multiply(BigDecimal.valueOf(item.getQuantidade())));
    }
    this.valorTotal = total;





}
}