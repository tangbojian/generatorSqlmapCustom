package com.taotao.mybatis.model2;

import java.util.Date;

public class BatchJobExecutionParams {
    /**
     * 
     */
    private Long jobExecutionId;

    /**
     * 
     */
    private String typeCd;

    /**
     * 
     */
    private String keyName;

    /**
     * 
     */
    private String stringVal;

    /**
     * 
     */
    private Date dateVal;

    /**
     * 
     */
    private Long longVal;

    /**
     * 
     */
    private Double doubleVal;

    /**
     * 
     */
    private String identifying;

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
     * @return TYPE_CD 
     */
    public String getTypeCd() {
        return typeCd;
    }

    /**
     * 
     * @param typeCd 
     */
    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd == null ? null : typeCd.trim();
    }

    /**
     * 
     * @return KEY_NAME 
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * 
     * @param keyName 
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    /**
     * 
     * @return STRING_VAL 
     */
    public String getStringVal() {
        return stringVal;
    }

    /**
     * 
     * @param stringVal 
     */
    public void setStringVal(String stringVal) {
        this.stringVal = stringVal == null ? null : stringVal.trim();
    }

    /**
     * 
     * @return DATE_VAL 
     */
    public Date getDateVal() {
        return dateVal;
    }

    /**
     * 
     * @param dateVal 
     */
    public void setDateVal(Date dateVal) {
        this.dateVal = dateVal;
    }

    /**
     * 
     * @return LONG_VAL 
     */
    public Long getLongVal() {
        return longVal;
    }

    /**
     * 
     * @param longVal 
     */
    public void setLongVal(Long longVal) {
        this.longVal = longVal;
    }

    /**
     * 
     * @return DOUBLE_VAL 
     */
    public Double getDoubleVal() {
        return doubleVal;
    }

    /**
     * 
     * @param doubleVal 
     */
    public void setDoubleVal(Double doubleVal) {
        this.doubleVal = doubleVal;
    }

    /**
     * 
     * @return IDENTIFYING 
     */
    public String getIdentifying() {
        return identifying;
    }

    /**
     * 
     * @param identifying 
     */
    public void setIdentifying(String identifying) {
        this.identifying = identifying == null ? null : identifying.trim();
    }
}