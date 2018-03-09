package com.taotao.mybatis.model;

import java.util.Date;

public class BatchStepExecution {
    /**
     * 
     */
    private Long stepExecutionId;

    /**
     * 
     */
    private Long version;

    /**
     * 
     */
    private String stepName;

    /**
     * 
     */
    private Long jobExecutionId;

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
    private Long commitCount;

    /**
     * 
     */
    private Long readCount;

    /**
     * 
     */
    private Long filterCount;

    /**
     * 
     */
    private Long writeCount;

    /**
     * 
     */
    private Long readSkipCount;

    /**
     * 
     */
    private Long writeSkipCount;

    /**
     * 
     */
    private Long processSkipCount;

    /**
     * 
     */
    private Long rollbackCount;

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
     * @return STEP_NAME 
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * 
     * @param stepName 
     */
    public void setStepName(String stepName) {
        this.stepName = stepName == null ? null : stepName.trim();
    }

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
     * @return COMMIT_COUNT 
     */
    public Long getCommitCount() {
        return commitCount;
    }

    /**
     * 
     * @param commitCount 
     */
    public void setCommitCount(Long commitCount) {
        this.commitCount = commitCount;
    }

    /**
     * 
     * @return READ_COUNT 
     */
    public Long getReadCount() {
        return readCount;
    }

    /**
     * 
     * @param readCount 
     */
    public void setReadCount(Long readCount) {
        this.readCount = readCount;
    }

    /**
     * 
     * @return FILTER_COUNT 
     */
    public Long getFilterCount() {
        return filterCount;
    }

    /**
     * 
     * @param filterCount 
     */
    public void setFilterCount(Long filterCount) {
        this.filterCount = filterCount;
    }

    /**
     * 
     * @return WRITE_COUNT 
     */
    public Long getWriteCount() {
        return writeCount;
    }

    /**
     * 
     * @param writeCount 
     */
    public void setWriteCount(Long writeCount) {
        this.writeCount = writeCount;
    }

    /**
     * 
     * @return READ_SKIP_COUNT 
     */
    public Long getReadSkipCount() {
        return readSkipCount;
    }

    /**
     * 
     * @param readSkipCount 
     */
    public void setReadSkipCount(Long readSkipCount) {
        this.readSkipCount = readSkipCount;
    }

    /**
     * 
     * @return WRITE_SKIP_COUNT 
     */
    public Long getWriteSkipCount() {
        return writeSkipCount;
    }

    /**
     * 
     * @param writeSkipCount 
     */
    public void setWriteSkipCount(Long writeSkipCount) {
        this.writeSkipCount = writeSkipCount;
    }

    /**
     * 
     * @return PROCESS_SKIP_COUNT 
     */
    public Long getProcessSkipCount() {
        return processSkipCount;
    }

    /**
     * 
     * @param processSkipCount 
     */
    public void setProcessSkipCount(Long processSkipCount) {
        this.processSkipCount = processSkipCount;
    }

    /**
     * 
     * @return ROLLBACK_COUNT 
     */
    public Long getRollbackCount() {
        return rollbackCount;
    }

    /**
     * 
     * @param rollbackCount 
     */
    public void setRollbackCount(Long rollbackCount) {
        this.rollbackCount = rollbackCount;
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
}