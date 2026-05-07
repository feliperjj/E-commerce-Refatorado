package Ecommerce.backend.dto;
import Ecommerce.backend.domain.*;
import Ecommerce.backend.dto.*;
import Ecommerce.backend.repository.*;
public record UsuarioResponseDto(String nome, String email, Long id) {




public UsuarioResponseDto salvar(UsuarioResponseDto dto){

Long id;
String nome;
String email;
Usuario salvo = repositorio.save(usuario);
}
}

