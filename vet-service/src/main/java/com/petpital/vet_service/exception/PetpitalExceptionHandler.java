package com.petpital.vet_service.exception;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class PetpitalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<HashMap<String,String>> handleAllExceptions(Exception ex) {
        HashMap<String,String> errors = new HashMap<>();
        ((MethodArgumentNotValidException) ex).getBindingResult().getFieldErrors().forEach(error -> 
            errors.put(error.getField(), error.getDefaultMessage()));
        return ResponseEntity.badRequest().body(errors);
        
    }

    @ExceptionHandler(RecordAlreadyExistsException.class)
    public ResponseEntity<HashMap<String,String>> handleRecordAlreadyExistsException(RecordAlreadyExistsException ex) {
        log.info("RecordAlreadyExistsException: {}", ex.getMessage());
        HashMap<String,String> error = new HashMap<>();
        error.put("error", ex.getMessage());
        return ResponseEntity.badRequest().body(error);
    }
    @ExceptionHandler(PetNotFoundException.class)
    public ResponseEntity<HashMap<String,String>> handlePetNotFoundException(PetNotFoundException ex) {
        log.info("PetNotFoundException: {}", ex.getMessage());
        HashMap<String,String> error = new HashMap<>();
        error.put("error", ex.getMessage());
        return ResponseEntity.status(404).body(error);
    }
}
