package Ecommerce.backend.service;
import Ecommerce.backend.domain.Usuario;
import Ecommerce.backend.domain.*;
import Ecommerce.backend.dto.*;
import Ecommerce.backend.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UsuarioService {
private final UsuarioRepositorio repositorio;

public UsuarioService(UsuarioRepositorio repositorio){


    this.repositorio = repositorio;
    
}

public UsuarioResponseDto salvar (UsuarioRequestDto dto){

Usuario usuario = new Usuario();
usuario.setnomeUsuario(dto.nome());
usuario.setEmail(dto.email());
usuario.setSenha(dto.senha());

Usuario salvo = repositorio.save(usuario);
return new UsuarioResponseDto (salvo.getnomeUsuario(),salvo.getEmail(),salvo.getId());
}


public List<UsuarioResponseDto> listarUsuarios(){

    return repositorio.findAll().stream().map(usuario -> new UsuarioResponseDto(usuario.getnomeUsuario(),usuario.getEmail(),usuario.getId())).toList();


}

public void deletar(Long id){

    repositorio.deleteById(id);


}


public UsuarioResponseDto alterarDTO(Long id,UsuarioRequestDto dto){
     Usuario usuario = repositorio.findById(id).orElseThrow(()-> new RuntimeException("Usuario não encontrado"));
    usuario.setnomeUsuario(dto.nome());
    usuario.setEmail(dto.email());
    usuario.setSenha(dto.senha());

    Usuario salvo = repositorio.save(usuario);
    return new UsuarioResponseDto (salvo.getnomeUsuario(),salvo.getEmail(),salvo.getId());
}


}


