package com.ruoyi.project.work.signIn.domain;

public class SignInVo extends SignIn {
    private String userName;
    private String courseName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
