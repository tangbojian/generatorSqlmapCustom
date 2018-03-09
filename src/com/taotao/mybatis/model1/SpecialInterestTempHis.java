package com.taotao.mybatis.model1;

import java.math.BigDecimal;
import java.util.Date;

public class SpecialInterestTempHis {
    /**
     * 贷款编号
     */
    private String loanInfoId;

    /**
     * 经销商公司ID
     */
    private String disCompanyId;

    /**
     * 厂家公司ID
     */
    private String factoryCompanyId;

    /**
     * 经销商出
     */
    private BigDecimal disOut;

    /**
     * 厂家入
     */
    private BigDecimal factoryIn;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 贷款编号
     * @return loan_info_id 贷款编号
     */
    public String getLoanInfoId() {
        return loanInfoId;
    }

    /**
     * 贷款编号
     * @param loanInfoId 贷款编号
     */
    public void setLoanInfoId(String loanInfoId) {
        this.loanInfoId = loanInfoId == null ? null : loanInfoId.trim();
    }

    /**
     * 经销商公司ID
     * @return dis_company_id 经销商公司ID
     */
    public String getDisCompanyId() {
        return disCompanyId;
    }

    /**
     * 经销商公司ID
     * @param disCompanyId 经销商公司ID
     */
    public void setDisCompanyId(String disCompanyId) {
        this.disCompanyId = disCompanyId == null ? null : disCompanyId.trim();
    }

    /**
     * 厂家公司ID
     * @return factory_company_id 厂家公司ID
     */
    public String getFactoryCompanyId() {
        return factoryCompanyId;
    }

    /**
     * 厂家公司ID
     * @param factoryCompanyId 厂家公司ID
     */
    public void setFactoryCompanyId(String factoryCompanyId) {
        this.factoryCompanyId = factoryCompanyId == null ? null : factoryCompanyId.trim();
    }

    /**
     * 经销商出
     * @return dis_out 经销商出
     */
    public BigDecimal getDisOut() {
        return disOut;
    }

    /**
     * 经销商出
     * @param disOut 经销商出
     */
    public void setDisOut(BigDecimal disOut) {
        this.disOut = disOut;
    }

    /**
     * 厂家入
     * @return factory_in 厂家入
     */
    public BigDecimal getFactoryIn() {
        return factoryIn;
    }

    /**
     * 厂家入
     * @param factoryIn 厂家入
     */
    public void setFactoryIn(BigDecimal factoryIn) {
        this.factoryIn = factoryIn;
    }

    /**
     * 创建时间
     * @return gmt_create 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 创建时间
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}