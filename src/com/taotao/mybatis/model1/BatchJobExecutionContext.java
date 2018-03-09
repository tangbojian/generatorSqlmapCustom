package com.taotao.mybatis.model1;

public class BatchJobExecutionContext {
    /**
     * 
     */
    private Long jobExecutionId;

    /**
     * 
     */
    private String shortContext;

    /**
     * 
     */
    private String serializedContext;

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
     * @return SHORT_CONTEXT 
     */
    public String getShortContext() {
        return shortContext;
    }

    /**
     * 
     * @param shortContext 
     */
    public void setShortContext(String shortContext) {
        this.shortContext = shortContext == null ? null : shortContext.trim();
    }

    /**
     * 
     * @return SERIALIZED_CONTEXT 
     */
    public String getSerializedContext() {
        return serializedContext;
    }

    /**
     * 
     * @param serializedContext 
     */
    public void setSerializedContext(String serializedContext) {
        this.serializedContext = serializedContext == null ? null : serializedContext.trim();
    }
}