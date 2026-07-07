package Ecommerce.backend.infra;

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
