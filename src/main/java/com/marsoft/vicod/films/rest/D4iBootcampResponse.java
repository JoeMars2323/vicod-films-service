package com.marsoft.vicod.films.rest;

import java.io.Serializable;

public class D4iBootcampResponse<T> implements Serializable {

    private static final long serialVersionUID = 4003447031486109521L;

    private String status;
    private String code;
    private String message;
    private T data;

    public D4iBootcampResponse() {
        super();
    }

    public D4iBootcampResponse(String status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public D4iBootcampResponse(String status, String code, String message, T data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
