package com.taotao.mybatis.model;

public class BatchStepExecutionSeq {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String uniqueKey;

    /**
     * 
     * @return ID 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return UNIQUE_KEY 
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * 
     * @param uniqueKey 
     */
    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey == null ? null : uniqueKey.trim();
    }
}