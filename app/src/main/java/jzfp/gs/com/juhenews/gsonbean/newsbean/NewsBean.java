package jzfp.gs.com.juhenews.gsonbean.newsbean;

/**
 * Copyright 2016 aTool.org
 */

public class NewsBean {

    private String reason;
    private NewsResult result;
    private int errorCode;

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setResult(NewsResult result) {
        this.result = result;
    }

    public NewsResult getResult() {
        return result;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

}