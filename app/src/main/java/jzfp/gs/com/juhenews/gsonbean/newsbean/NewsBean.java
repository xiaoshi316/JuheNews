package jzfp.gs.com.juhenews.gsonbean.newsbean;

/**
 * Copyright 2016 aTool.org
 */

public class NewsBean {

    private String reason;
    private NewsResult result;
    private int errorCode;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public NewsResult getResult() {
        return result;
    }

    public void setResult(NewsResult result) {
        this.result = result;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

}