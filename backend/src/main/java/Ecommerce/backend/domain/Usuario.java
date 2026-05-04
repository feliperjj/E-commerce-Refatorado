package Ecommerce.backend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.math.BigDecimal;
@Entity
public class Usuario{

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)

private Long id;
private String nomeUsuario;
private String email;
private boolean isAdmin;
private String senha;



public Usuario(){

}
public Long getId(){

return id;

}

public void setId(Long id){


this.id = id;

}

public String getSenha(){
return senha;

}

public void setSenha(String senha){

    this.senha = senha;
}

public String getnomeUsuario(){

return nomeUsuario;

}

public void setnomeUsuario(String nomeUsuario){

    this.nomeUsuario = nomeUsuario;
}

public String getEmail(){

    return email;

}
public void setEmail(String email){
    this.email = email;
}

public boolean setisAdmin(boolean isAdmin){
return isAdmin;

}
public void getisAdmin(boolean isAdmin){
this.isAdmin = isAdmin;

}

}
