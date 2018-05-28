package com.github.misterchangray.dao.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="com.github.misterchangray.dao.entity.LoginLog")
public class LoginLog {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="userId成功登入有此数据")
    private Integer userId;

    @ApiModelProperty(value="signInIp")
    private String signInIp;

    @ApiModelProperty(value="deviceInfo")
    private String deviceInfo;

    @ApiModelProperty(value="signInTime")
    private Date signInTime;

    @ApiModelProperty(value="signOutTime成功登入有此数据")
    private Date signOutTime;

    @ApiModelProperty(value="success")
    private Integer success;

    @ApiModelProperty(value="detailsOfFail")
    private String detailsOfFail;

    @ApiModelProperty(value="signInParam")
    private String signInParam;

    @ApiModelProperty(value="session")
    private String session;

    public Integer getId() {
        return id;
    }

    public LoginLog setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public LoginLog setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getSignInIp() {
        return signInIp;
    }

    public LoginLog setSignInIp(String signInIp) {
        this.signInIp = signInIp == null ? null : signInIp.trim();
        return this;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public LoginLog setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo == null ? null : deviceInfo.trim();
        return this;
    }

    public Date getSignInTime() {
        return signInTime;
    }

    public LoginLog setSignInTime(Date signInTime) {
        this.signInTime = signInTime;
        return this;
    }

    public Date getSignOutTime() {
        return signOutTime;
    }

    public LoginLog setSignOutTime(Date signOutTime) {
        this.signOutTime = signOutTime;
        return this;
    }

    public Integer getSuccess() {
        return success;
    }

    public LoginLog setSuccess(Integer success) {
        this.success = success;
        return this;
    }

    public String getDetailsOfFail() {
        return detailsOfFail;
    }

    public LoginLog setDetailsOfFail(String detailsOfFail) {
        this.detailsOfFail = detailsOfFail == null ? null : detailsOfFail.trim();
        return this;
    }

    public String getSignInParam() {
        return signInParam;
    }

    public LoginLog setSignInParam(String signInParam) {
        this.signInParam = signInParam == null ? null : signInParam.trim();
        return this;
    }

    public String getSession() {
        return session;
    }

    public LoginLog setSession(String session) {
        this.session = session == null ? null : session.trim();
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", signInIp=").append(signInIp);
        sb.append(", deviceInfo=").append(deviceInfo);
        sb.append(", signInTime=").append(signInTime);
        sb.append(", signOutTime=").append(signOutTime);
        sb.append(", success=").append(success);
        sb.append(", detailsOfFail=").append(detailsOfFail);
        sb.append(", signInParam=").append(signInParam);
        sb.append(", session=").append(session);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table login_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        userId("user_id"),
        signInIp("sign_in_ip"),
        deviceInfo("device_info"),
        signInTime("sign_in_time"),
        signOutTime("sign_out_time"),
        success("success"),
        detailsOfFail("details_of_fail"),
        signInParam("sign_in_param"),
        session("session");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table login_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table login_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table login_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table login_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table login_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table login_log
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}