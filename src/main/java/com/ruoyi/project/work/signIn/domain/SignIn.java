package com.ruoyi.project.work.signIn.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 签到对象 sign_in
 *
 * @author ruoyi
 * @date 2020-06-14
 */
public class SignIn extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户
     */
    @Excel(name = "用户")
    private Long userId;

    /**
     * 签到时间
     */
    @Excel(name = "签到时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date signTime;

    /**
     * 签到课程
     */
    @Excel(name = "签到课程")
    private Long courseId;

    /**
     * 1 正常签到  -1 补签
     */
    @Excel(name = "1 正常签到  -1 补签")
    private Long status;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("userId", getUserId())
                .append("signTime", getSignTime())
                .append("courseId", getCourseId())
                .append("status", getStatus())
                .toString();
    }
}
