package Ecommerce.backend;
import org.springframework.stereotype.Service;
import Ecommerce.backend.Produto;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/usuarios")

public class UsuarioController{

private final UsuarioRepositorio repositorio;

public UsuarioController (UsuarioRepositorio repositorio){

this.repositorio = repositorio;


}

@GetMapping

public List<Usuario> listar ( ){


return repositorio.findAll();

}

@PostMapping
public Usuario criar(@RequestBody Usuario usuario){

return repositorio.save(usuario);

}
@DeleteMapping("/{id}")
public ResponseEntity<Void> deletar (@PathVariable Long id){
return repositorio.deleteById(id);
return ResponseEntity.noContent().build();

}


@PutMapping("/{id}")

public ResponseEntity<Usuario> alterarUsuario(@PathVariable Long id,@RequestBody Usuario usuario){
 return repositorio.findById(id)
 .map(usuarioExistente ->{

    usuarioExistente.setnomeUsuario(usuario.getnomeUsuario());
    usuarioExistente.setEmail(usuario.getEmail())

    Usuario alterarUsuario = UsuarioRepositorio.save(usuarioExistente);
    return ResponseEntity.ok(alterarUsuario);
 })
.orElse(ResponseEntity.notFound().build());
}

}







