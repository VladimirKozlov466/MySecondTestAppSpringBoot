package ru.kozlovv.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.kozlovv.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
