package ru.jenningc.chamomile.controllers;

import ru.jenningc.chamomile.dto.EntityErrorResponse;
import ru.jenningc.chamomile.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {
    @ExceptionHandler({ProductNotFoundException.class})
    private ResponseEntity<HttpStatus> handleException() {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404
    }

    @ExceptionHandler(ProductNotCreatedException.class)
    private ResponseEntity<EntityErrorResponse> handleUnsupportedDataException(ProductNotCreatedException e) {
        EntityErrorResponse entity = new EntityErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.value(), e.getMessage());
        return new ResponseEntity<>(entity, HttpStatus.UNPROCESSABLE_ENTITY); // 422
    }


}
