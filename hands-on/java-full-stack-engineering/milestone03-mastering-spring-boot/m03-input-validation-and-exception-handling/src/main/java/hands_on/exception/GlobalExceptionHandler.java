package hands_on.exception;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Order(1)
public class GlobalExceptionHandler {

  /*  @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleAllExceptions(Exception e, WebRequest wr) {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), e.getMessage(), wr.getDescription(false));
        return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
*/

  /*  @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleUserNotFoundExceptionExceptions(Exception e, WebRequest wr) {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), e.getMessage(), wr.getDescription(false));
        return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
    }*/

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).headers(new HttpHeaders()).body(errors);
//        return new ResponseEntity<>(errors, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }
/*


    @ExceptionHandler(HandlerMethodValidationException.class)
    public ResponseEntity<Map<String, String>> handleHandlerMethodValidationException(
            HandlerMethodValidationException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getParameterValidationResults().forEach(result -> {
            String parameterName = result.getMethodParameter().getParameterName();
            result.getResolvableErrors().forEach(error -> {
                errors.put(parameterName, error.getDefaultMessage());
            });
        });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }*/
}