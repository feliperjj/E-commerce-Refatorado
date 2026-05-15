package Ecommerce.backend.dto;
import jakarta.validation.constraints.*;

public record UsuarioRequestDto(@NotBlank String nome,@Email String email,String senha) {
}
