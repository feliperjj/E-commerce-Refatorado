package Ecommerce.backend;
import Ecommerce.backend.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProdutoRepositorio extends JpaRepository<Produto,Long>{




}