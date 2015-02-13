package com.getinch.retrogram.model;

public class LikeResponse {

    private Meta meta;

    public boolean isSuccessfull() {
        return meta.code.equals(200);
    }

    public boolean isMaxReached(){return meta.code.equals(429);}

    public String getErrorType(){ return meta.error_type;}

    public String getErrorMessage(){ return meta.error_message;}

    private static class Meta {

        private Integer code;
        private String error_type;
        private String error_message;

    }

}
