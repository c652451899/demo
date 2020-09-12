package com.example.demo.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MyResponseContent<T> {

    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private String message = "";

    private int code;

    public MyResponseContent() {

    }

    public MyResponseContent(boolean success, T data, String message){
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public MyResponseContent(boolean success, T data, String message, int code){
        this.success = success;
        this.data = data;
        this.message = message;
        this.code = code;
    }
}
