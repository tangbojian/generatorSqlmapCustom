package com.taotao.mybatis.model;

public class BatchJobInstance {
    /**
     * 
     */
    private Long jobInstanceId;

    /**
     * 
     */
    private Long version;

    /**
     * 
     */
    private String jobName;

    /**
     * 
     */
    private String jobKey;

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
     * @return JOB_NAME 
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 
     * @param jobName 
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * 
     * @return JOB_KEY 
     */
    public String getJobKey() {
        return jobKey;
    }

    /**
     * 
     * @param jobKey 
     */
    public void setJobKey(String jobKey) {
        this.jobKey = jobKey == null ? null : jobKey.trim();
    }
}