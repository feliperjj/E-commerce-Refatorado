package Ecommerce.backend.service;
import Ecommerce.backend.domain.Usuario;
import Ecommerce.backend.dto.UsuarioRequestDto;
import Ecommerce.backend.dto.UsuarioResponseDto;
import Ecommerce.backend.repository.UsuarioRepositorio;
import Ecommerce.backend.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
private final UsuarioRepositorio repositorio;

public UsuarioService(UsuarioRepositorio repositorio){


    this.repositorio = repositorio;
    
}

public UsuarioDTO salvar (UsuarioDTO dto){

Usuario usuario = new Usuario();
usuario.setNome(dto.nome());
usuario.setEmail(dto.email());
usuario.setSenha(dto.senha());

Usuario salvo = repositorio.save(usuario);

}


}