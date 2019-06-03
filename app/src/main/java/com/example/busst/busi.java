package com.example.busst;

public class busi {
    String bNo;
    String bFrom;
    String bTo;
    String bTime;

    public busi() {
    }

    public busi(String bNo, String bFrom, String bTo, String bTime) {
        this.bNo = bNo;
        this.bFrom = bFrom;
        this.bTo = bTo;
        this.bTime = bTime;
    }

    public String getbNo() {
        return bNo;
    }

    public void setbNo(String bNo) {
        this.bNo = bNo;
    }

    public String getbFrom() {
        return bFrom;
    }

    public void setbFrom(String bFrom) {
        this.bFrom = bFrom;
    }

    public String getbTo() {
        return bTo;
    }

    public void setbTo(String bTo) {
        this.bTo = bTo;
    }

    public String getbTime() {
        return bTime;
    }

    public void setbTime(String bTime) {
        this.bTime = bTime;
    }
}
