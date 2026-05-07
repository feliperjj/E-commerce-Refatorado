package Ecommerce.backend.controller;
import org.springframework.stereotype.Service;
import Ecommerce.backend.domain.Produto;
import Ecommerce.backend.domain.Usuario;
import Ecommerce.backend.service.UsuarioService;
import org.springframework.web.bind.annotation.*;
import Ecommerce.backend.dto.*;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api/v1/usuarios")

public class UsuarioController{

private final UsuarioService service;

public UsuarioController (UsuarioService service){

this.service = service;


}

// @GetMapping

// public List<Usuario> listar ( ){


// return service.findAll();

// }

@PostMapping
public UsuarioResponseDto criar(@RequestBody UsuarioRequestDto dto ){

return service.salvar(dto);

}
// @DeleteMapping("/{id}")
// public ResponseEntity<Void> deletar (@PathVariable Long id){
//  service.deleteById(id);
//  return ResponseEntity.noContent().build();

// }


// @PutMapping("/{id}")

// public ResponseEntity<Usuario> alterarUsuario(@PathVariable Long id,@RequestBody UsuarioRequestDto dto){
//  return service.findById(id)
//  .map(usuarioExistente ->{

//     usuarioExistente.setnomeUsuario(dto.getnomeUsuario());
//     usuarioExistente.setEmail(dto.getEmail());

//     Usuario alterarUsuario = service.save(usuarioExistente);
//     return ResponseEntity.ok(alterarUsuarioResponseDto);
//  })
// .orElse(ResponseEntity.notFound().build());
// }

 }







