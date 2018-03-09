package com.taotao.mybatis.model1;

import java.util.Date;

public class FreezeThawAmountDetailFollow {
    /**
     * 
     */
    private Integer id;

    /**
     * 冻结解冻表ID
     */
    private Integer freezeId;

    /**
     * 贷款id
     */
    private String loanInfoId;

    /**
     * 创建时间
     */
    private Date gmtCreated;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 逻辑删除：
0：有效数据
1：无效数据
     */
    private String isDeleted;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 冻结解冻表ID
     * @return freeze_id 冻结解冻表ID
     */
    public Integer getFreezeId() {
        return freezeId;
    }

    /**
     * 冻结解冻表ID
     * @param freezeId 冻结解冻表ID
     */
    public void setFreezeId(Integer freezeId) {
        this.freezeId = freezeId;
    }

    /**
     * 贷款id
     * @return loan_info_id 贷款id
     */
    public String getLoanInfoId() {
        return loanInfoId;
    }

    /**
     * 贷款id
     * @param loanInfoId 贷款id
     */
    public void setLoanInfoId(String loanInfoId) {
        this.loanInfoId = loanInfoId == null ? null : loanInfoId.trim();
    }

    /**
     * 创建时间
     * @return gmt_created 创建时间
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * 创建时间
     * @param gmtCreated 创建时间
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * 修改时间
     * @return gmt_modified 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 修改时间
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 逻辑删除：
0：有效数据
1：无效数据
     * @return is_deleted 逻辑删除：
0：有效数据
1：无效数据
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * 逻辑删除：
0：有效数据
1：无效数据
     * @param isDeleted 逻辑删除：
0：有效数据
1：无效数据
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }
}