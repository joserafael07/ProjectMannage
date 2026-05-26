package com.projectmanager.ProjectMannage.infrasctructure.exception;

import lombok.Getter;

@Getter

public class RequestException  extends RuntimeException {
    private final String erroCode;

    public RequestException(String message, String erroCode) {
        super(message);
        this.erroCode = erroCode;
    }
}
