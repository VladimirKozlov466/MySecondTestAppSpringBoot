package ru.kozlovv.MySecondTestAppSpringBoot.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Response {

    private String uid;
    private String operationUid;
    private String systemTime;
    private Codes code;
    private ErrorCodes errorCode;
    private ErrorMessages errorMessage;

}
