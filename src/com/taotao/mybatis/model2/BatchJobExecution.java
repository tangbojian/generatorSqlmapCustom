package com.taotao.mybatis.model2;

import java.util.Date;

public class BatchJobExecution {
    /**
     * 
     */
    private Long jobExecutionId;

    /**
     * 
     */
    private Long version;

    /**
     * 
     */
    private Long jobInstanceId;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date startTime;

    /**
     * 
     */
    private Date endTime;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String exitCode;

    /**
     * 
     */
    private String exitMessage;

    /**
     * 
     */
    private Date lastUpdated;

    /**
     * 
     */
    private String jobConfigurationLocation;

    /**
     * 
     * @return JOB_EXECUTION_ID 
     */
    public Long getJobExecutionId() {
        return jobExecutionId;
    }

    /**
     * 
     * @param jobExecutionId 
     */
    public void setJobExecutionId(Long jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
    }

    /**
     * 
     * @return VERSION 
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 
     * @param version 
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 
     * @return JOB_INSTANCE_ID 
     */
    public Long getJobInstanceId() {
        return jobInstanceId;
    }

    /**
     * 
     * @param jobInstanceId 
     */
    public void setJobInstanceId(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
    }

    /**
     * 
     * @return CREATE_TIME 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return START_TIME 
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 
     * @param startTime 
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 
     * @return END_TIME 
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 
     * @param endTime 
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 
     * @return STATUS 
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 
     * @return EXIT_CODE 
     */
    public String getExitCode() {
        return exitCode;
    }

    /**
     * 
     * @param exitCode 
     */
    public void setExitCode(String exitCode) {
        this.exitCode = exitCode == null ? null : exitCode.trim();
    }

    /**
     * 
     * @return EXIT_MESSAGE 
     */
    public String getExitMessage() {
        return exitMessage;
    }

    /**
     * 
     * @param exitMessage 
     */
    public void setExitMessage(String exitMessage) {
        this.exitMessage = exitMessage == null ? null : exitMessage.trim();
    }

    /**
     * 
     * @return LAST_UPDATED 
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 
     * @param lastUpdated 
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * 
     * @return JOB_CONFIGURATION_LOCATION 
     */
    public String getJobConfigurationLocation() {
        return jobConfigurationLocation;
    }

    /**
     * 
     * @param jobConfigurationLocation 
     */
    public void setJobConfigurationLocation(String jobConfigurationLocation) {
        this.jobConfigurationLocation = jobConfigurationLocation == null ? null : jobConfigurationLocation.trim();
    }
}