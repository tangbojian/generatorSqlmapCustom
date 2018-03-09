package com.taotao.mybatis.model;

public class BatchStepExecutionContext {
    /**
     * 
     */
    private Long stepExecutionId;

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
     * @return STEP_EXECUTION_ID 
     */
    public Long getStepExecutionId() {
        return stepExecutionId;
    }

    /**
     * 
     * @param stepExecutionId 
     */
    public void setStepExecutionId(Long stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
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