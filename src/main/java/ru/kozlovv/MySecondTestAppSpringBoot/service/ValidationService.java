package ru.kozlovv.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.kozlovv.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.kozlovv.MySecondTestAppSpringBoot.exception.ValidationFailedException;


@Service
public interface ValidationService {

    void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException;
}
