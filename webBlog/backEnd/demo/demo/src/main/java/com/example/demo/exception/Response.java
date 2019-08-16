package com.example.demo.exception;

public class Response {



    private String statusMessage;

    public Response(String id) {
        this.statusMessage = "Subject Created Successfully" ;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

}
