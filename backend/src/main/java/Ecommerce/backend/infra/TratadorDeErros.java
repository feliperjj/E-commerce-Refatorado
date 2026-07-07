package Ecommerce.backend.infra;
import java.util.List;
import java.util.ArrayList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.validation.FieldError;
import Ecommerce.backend.dto.ErroDeValidacaoDto;

@RestControllerAdvice

public class TratadorDeErros {

      @ExceptionHandler(MethodArgumentNotValidException.class)
      public ResponseEntity<List<ErroDeValidacaoDto>> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        
        List<ErroDeValidacaoDto> errors = new ArrayList<>();
        
        // Extract field names and specific error messages
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.add(new ErroDeValidacaoDto(fieldName, errorMessage));
        });
        
        return ResponseEntity.badRequest().body(errors);
    }
    
}
