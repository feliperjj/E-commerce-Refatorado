package Ecommerce.backend.repository;
import Ecommerce.backend.domain.Pedido;
import Ecommerce.backend.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PedidoRepositorio extends JpaRepository<Pedido,Long>{




}