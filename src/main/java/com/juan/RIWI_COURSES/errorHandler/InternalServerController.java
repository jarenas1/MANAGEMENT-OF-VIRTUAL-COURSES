package com.juan.RIWI_COURSES.errorHandler;

import com.juan.RIWI_COURSES.dtos.errors.BaseErrorResponse;
import com.juan.RIWI_COURSES.dtos.errors.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) //ERROR DEL SERVIDOR
public class InternalServerController {


    @ExceptionHandler(Exception.class)
    public BaseErrorResponse handleGlobalException(Exception ex) {
        return ErrorResponse.builder()
                .message("An unexpected error occurred: " + ex.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR.name())
                .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();
    }
}
