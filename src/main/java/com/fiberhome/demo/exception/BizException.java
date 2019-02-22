package com.fiberhome.demo.exception;

public class BizException extends RuntimeException {

    public BizException(String message) {
        super(message);
    }

    public BizException(int code, String desc) {
        super(code+" - "+desc);
    }
}
