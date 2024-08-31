package com.juan.RIWI_COURSES.errorHandler;

import com.juan.RIWI_COURSES.dtos.errors.BaseErrorResponse;
import com.juan.RIWI_COURSES.dtos.errors.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
@ResponseStatus(code = HttpStatus.NOT_FOUND) //No encontrado
public class NotFoundController {


    @ExceptionHandler(NoHandlerFoundException.class)
    public BaseErrorResponse handleInternalServerError(Exception exception) {
        return ErrorResponse.builder()
                .message("Check your url. " + exception.getMessage())
                .status(HttpStatus.NOT_FOUND.name())
                .code(HttpStatus.NOT_FOUND.value())
                .build();
    }
}
