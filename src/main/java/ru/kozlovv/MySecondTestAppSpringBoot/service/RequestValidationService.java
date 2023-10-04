package ru.kozlovv.MySecondTestAppSpringBoot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.kozlovv.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.kozlovv.MySecondTestAppSpringBoot.exception.ValidationFailedException;

import java.util.Objects;

@Slf4j
@Service
public class RequestValidationService implements ValidationService {

    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException {
        if (bindingResult.hasErrors()) {
            throw new
                    ValidationFailedException(Objects.requireNonNull(bindingResult.getFieldError()).toString());
        }
        if (Objects.equals(bindingResult.getFieldValue("uid"), "123")) {
            throw new UnsupportedCodeException("UnsupportedCodeException");
        }
    }
}
