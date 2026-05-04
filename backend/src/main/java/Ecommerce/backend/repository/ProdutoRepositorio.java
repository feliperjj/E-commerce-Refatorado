package Ecommerce.backend.repository;
import Ecommerce.backend.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProdutoRepositorio extends JpaRepository<Produto,Long>{




}