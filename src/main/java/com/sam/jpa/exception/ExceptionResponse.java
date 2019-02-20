package com.sam.jpa.exception;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

public class ExceptionResponse extends ResponseEntityExceptionHandler {

    private Date timestamp;
    private String msg;
    private String details;

    public ExceptionResponse(Date timestamp, String msg, String details) {
        super();
        this.timestamp = timestamp;
        this.msg = msg;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMsg() {
        return msg;
    }

    public String getDetails() {
        return details;
    }
}
