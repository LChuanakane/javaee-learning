package com.javaee.ex02.po;

public class Publisher {
    private int pubId;
    private String pubName;
    private String contactor;
    private String mobile;

    public int getPubId() {
        return pubId;
    }

    public void setPubId(int pubId) {
        this.pubId = pubId;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getContactor() {
        return contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "pubId=" + pubId +
                ", pubName='" + pubName + '\'' +
                ", contacter='" + contactor + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
