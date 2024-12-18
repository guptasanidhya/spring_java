package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

    // NullPointerException handler
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NullPointerException.class)
    public String exceptionHandlerNullPointer(NullPointerException e, Model m) {
        // Add the error message
        m.addAttribute("msg", "Null pointer exception has occurred");
        // Add the stack trace of the exception
        m.addAttribute("stackTrace", getStackTraceString(e));
        return "null_page";
    }

    // NumberFormatException handler
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NumberFormatException.class)
    public String exceptionHandlerNumberFormat(NumberFormatException e, Model m) {
        // Add the error message
        m.addAttribute("msg", "Number format exception has occurred");
        // Add the stack trace of the exception
        m.addAttribute("stackTrace", getStackTraceString(e));
        return "null_page";
    }

    // Generic Exception handler
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandlerGeneric(Exception e, Model m) {
        // Add the error message
        m.addAttribute("msg", "An exception has occurred");
        // Add the stack trace of the exception
        m.addAttribute("stackTrace", getStackTraceString(e));
        return "null_page";
    }

    // Utility method to convert the stack trace to a string
    private String getStackTraceString(Exception e) {
        StringBuilder stackTrace = new StringBuilder();
        for (StackTraceElement element : e.getStackTrace()) {
            stackTrace.append(element.toString()).append("\n");
        }
        return stackTrace.toString();
    }
}
