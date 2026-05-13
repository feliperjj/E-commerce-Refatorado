package Ecommerce.backend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.math.BigDecimal;
@Entity

public class Produto{
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
 private String nomeProduto;
private  BigDecimal preco;
private int quantidadeEstoque;
private  String ImagemUrl;
private String categoria;

 


public Produto(){
}

public String getNome(){

return nomeProduto;

}
public void setNome(String nomeProduto){

this.nomeProduto = nomeProduto;
}


public Long getId(){

    return id;
}
public void setId(Long id){
this.id = id;

}

public BigDecimal getPreco(){
    return preco;
}

public void  setPreco(BigDecimal preco){

    this.preco=preco;
}

public int getquantidadeEstoque(){

    return quantidadeEstoque;
}
public void setquantidadeEstoque(int quantidadeEstoque){

   this.quantidadeEstoque = quantidadeEstoque;
}

public String getImagemUrl(){
    return ImagemUrl;
}
public void setImagemUrl(String ImagemUrl){

    this.ImagemUrl = ImagemUrl;
}

public String getCategoria(){
return categoria;

}

public void setCategoria(String categoria){
    this.categoria = categoria;
}
}
