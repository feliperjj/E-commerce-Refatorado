package Ecommerce.backend.service;
import Ecommerce.backend.domain.Usuario;
import Ecommerce.backend.domain.*;
import Ecommerce.backend.dto.*;
import Ecommerce.backend.repository.*;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
private final UsuarioRepositorio repositorio;

public UsuarioService(UsuarioRepositorio repositorio){


    this.repositorio = repositorio;
    
}

public UsuarioRequestDto salvar (UsuarioRequestDto dto){

Usuario usuario = new Usuario();
usuario.setNome(dto.nome());
usuario.setEmail(dto.email());
usuario.setSenha(dto.senha());

Usuario salvo = repositorio.save(usuario);

}


}