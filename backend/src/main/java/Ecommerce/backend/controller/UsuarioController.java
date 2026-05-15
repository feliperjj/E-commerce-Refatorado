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
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/usuarios")

public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {

        this.service = service;

    }

    @GetMapping

    public List<UsuarioResponseDto> listar() {

        return service.listarUsuarios();

    }

    @PostMapping
    public UsuarioResponseDto criar(@Valid @RequestBody UsuarioRequestDto dto) {

        return service.salvar(dto);

    }
     @DeleteMapping("/{id}")
     public ResponseEntity<Void> deletar (@PathVariable Long id){
    service.deletar(id);
     return ResponseEntity.noContent().build();

     }

     @PutMapping("/{id}")

     public ResponseEntity<UsuarioResponseDto> alterarUsuario(@PathVariable Long
     id,@Valid@RequestBody UsuarioRequestDto dto){
     
        UsuarioResponseDto atualizado = service.alterarDTO(id,dto);
        return ResponseEntity.ok(atualizado);
     }

}
