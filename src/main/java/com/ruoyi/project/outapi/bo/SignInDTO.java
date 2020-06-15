package com.ruoyi.project.outapi.bo;

import com.ruoyi.project.outapi.BaseConvertTo;
import com.ruoyi.project.work.signIn.domain.SignIn;

import java.util.Date;

public class SignInDTO implements BaseConvertTo<SignIn> {
    /**
     * 用户
     */
    private Long userId;

    /**
     * 签到时间
     */
    private Date signTime;

    /**
     * 签到课程
     */
    private Long courseId;

    /**
     * 1 正常签到  -1 补签
     */
    private Long status;

    @Override
    public SignIn convertTo() {
        SignIn signIn = new SignIn();
        signIn.setCourseId(this.courseId);
        signIn.setUserId(this.userId);
        signIn.setStatus(1L);
        signIn.setSignTime(this.signTime);
        return signIn;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
