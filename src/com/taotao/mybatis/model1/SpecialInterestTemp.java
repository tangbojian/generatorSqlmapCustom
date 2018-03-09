package com.taotao.mybatis.model1;

import java.math.BigDecimal;
import java.util.Date;

public class SpecialInterestTemp {
    /**
     * 贷款编号
     */
    private String loanInfoId;

    /**
     * 经销商ID
     */
    private String disCompanyId;

    /**
     * 厂家ID
     */
    private String factoryCompanyId;

    /**
     * 起息日
     */
    private Date valueDate;

    /**
     * 垫资金额
     */
    private BigDecimal principal;

    /**
     * 经销商付息比例
     */
    private Integer disPayInterestRatio;

    /**
     * 厂家付息比例
     */
    private Integer factoryInterestRatio;

    /**
     * 累计产生利息
     */
    private BigDecimal interestAccumulated;

    /**
     * 累计实收利息
     */
    private BigDecimal interestReceivedAccumulated;

    /**
     * 累积到期应收利息
     */
    private BigDecimal interestReceivableAccumulatedDue;

    /**
     * 经销商累计产生利息
     */
    private BigDecimal disInterestAccumulated;

    /**
     * 厂家累计产生利息
     */
    private BigDecimal factoryInterestAccumulated;

    /**
     * 经销商累计实收利息
     */
    private BigDecimal disInterestReceivedAccumulated;

    /**
     * 厂家累计实收利息
     */
    private BigDecimal factoryInterestReceivedAccumulated;

    /**
     * 经销商到期应收利息
     */
    private BigDecimal disInterestReceivableAccumulatedDue;

    /**
     * 厂家到期应收利息
     */
    private BigDecimal factoryInterestReceivableAccumulatedDue;

    /**
     * 贷款状态 
WAIT_MAKE:待放款 
INTERESTING:计息中 
INTERESTDELAY:逾期 
PRINCIPALDELAY:本金逾期 
DONE:完成 
SETTLED:已结清
     */
    private String status;

    /**
     * 调账时间
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
     * 经销商ID
     * @return dis_company_id 经销商ID
     */
    public String getDisCompanyId() {
        return disCompanyId;
    }

    /**
     * 经销商ID
     * @param disCompanyId 经销商ID
     */
    public void setDisCompanyId(String disCompanyId) {
        this.disCompanyId = disCompanyId == null ? null : disCompanyId.trim();
    }

    /**
     * 厂家ID
     * @return factory_company_id 厂家ID
     */
    public String getFactoryCompanyId() {
        return factoryCompanyId;
    }

    /**
     * 厂家ID
     * @param factoryCompanyId 厂家ID
     */
    public void setFactoryCompanyId(String factoryCompanyId) {
        this.factoryCompanyId = factoryCompanyId == null ? null : factoryCompanyId.trim();
    }

    /**
     * 起息日
     * @return value_date 起息日
     */
    public Date getValueDate() {
        return valueDate;
    }

    /**
     * 起息日
     * @param valueDate 起息日
     */
    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    /**
     * 垫资金额
     * @return principal 垫资金额
     */
    public BigDecimal getPrincipal() {
        return principal;
    }

    /**
     * 垫资金额
     * @param principal 垫资金额
     */
    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    /**
     * 经销商付息比例
     * @return dis_pay_interest_ratio 经销商付息比例
     */
    public Integer getDisPayInterestRatio() {
        return disPayInterestRatio;
    }

    /**
     * 经销商付息比例
     * @param disPayInterestRatio 经销商付息比例
     */
    public void setDisPayInterestRatio(Integer disPayInterestRatio) {
        this.disPayInterestRatio = disPayInterestRatio;
    }

    /**
     * 厂家付息比例
     * @return factory_interest_ratio 厂家付息比例
     */
    public Integer getFactoryInterestRatio() {
        return factoryInterestRatio;
    }

    /**
     * 厂家付息比例
     * @param factoryInterestRatio 厂家付息比例
     */
    public void setFactoryInterestRatio(Integer factoryInterestRatio) {
        this.factoryInterestRatio = factoryInterestRatio;
    }

    /**
     * 累计产生利息
     * @return interest_accumulated 累计产生利息
     */
    public BigDecimal getInterestAccumulated() {
        return interestAccumulated;
    }

    /**
     * 累计产生利息
     * @param interestAccumulated 累计产生利息
     */
    public void setInterestAccumulated(BigDecimal interestAccumulated) {
        this.interestAccumulated = interestAccumulated;
    }

    /**
     * 累计实收利息
     * @return interest_received_accumulated 累计实收利息
     */
    public BigDecimal getInterestReceivedAccumulated() {
        return interestReceivedAccumulated;
    }

    /**
     * 累计实收利息
     * @param interestReceivedAccumulated 累计实收利息
     */
    public void setInterestReceivedAccumulated(BigDecimal interestReceivedAccumulated) {
        this.interestReceivedAccumulated = interestReceivedAccumulated;
    }

    /**
     * 累积到期应收利息
     * @return interest_receivable_accumulated_due 累积到期应收利息
     */
    public BigDecimal getInterestReceivableAccumulatedDue() {
        return interestReceivableAccumulatedDue;
    }

    /**
     * 累积到期应收利息
     * @param interestReceivableAccumulatedDue 累积到期应收利息
     */
    public void setInterestReceivableAccumulatedDue(BigDecimal interestReceivableAccumulatedDue) {
        this.interestReceivableAccumulatedDue = interestReceivableAccumulatedDue;
    }

    /**
     * 经销商累计产生利息
     * @return dis_interest_accumulated 经销商累计产生利息
     */
    public BigDecimal getDisInterestAccumulated() {
        return disInterestAccumulated;
    }

    /**
     * 经销商累计产生利息
     * @param disInterestAccumulated 经销商累计产生利息
     */
    public void setDisInterestAccumulated(BigDecimal disInterestAccumulated) {
        this.disInterestAccumulated = disInterestAccumulated;
    }

    /**
     * 厂家累计产生利息
     * @return factory_interest_accumulated 厂家累计产生利息
     */
    public BigDecimal getFactoryInterestAccumulated() {
        return factoryInterestAccumulated;
    }

    /**
     * 厂家累计产生利息
     * @param factoryInterestAccumulated 厂家累计产生利息
     */
    public void setFactoryInterestAccumulated(BigDecimal factoryInterestAccumulated) {
        this.factoryInterestAccumulated = factoryInterestAccumulated;
    }

    /**
     * 经销商累计实收利息
     * @return dis_interest_received_accumulated 经销商累计实收利息
     */
    public BigDecimal getDisInterestReceivedAccumulated() {
        return disInterestReceivedAccumulated;
    }

    /**
     * 经销商累计实收利息
     * @param disInterestReceivedAccumulated 经销商累计实收利息
     */
    public void setDisInterestReceivedAccumulated(BigDecimal disInterestReceivedAccumulated) {
        this.disInterestReceivedAccumulated = disInterestReceivedAccumulated;
    }

    /**
     * 厂家累计实收利息
     * @return factory_interest_received_accumulated 厂家累计实收利息
     */
    public BigDecimal getFactoryInterestReceivedAccumulated() {
        return factoryInterestReceivedAccumulated;
    }

    /**
     * 厂家累计实收利息
     * @param factoryInterestReceivedAccumulated 厂家累计实收利息
     */
    public void setFactoryInterestReceivedAccumulated(BigDecimal factoryInterestReceivedAccumulated) {
        this.factoryInterestReceivedAccumulated = factoryInterestReceivedAccumulated;
    }

    /**
     * 经销商到期应收利息
     * @return dis_interest_receivable_accumulated_due 经销商到期应收利息
     */
    public BigDecimal getDisInterestReceivableAccumulatedDue() {
        return disInterestReceivableAccumulatedDue;
    }

    /**
     * 经销商到期应收利息
     * @param disInterestReceivableAccumulatedDue 经销商到期应收利息
     */
    public void setDisInterestReceivableAccumulatedDue(BigDecimal disInterestReceivableAccumulatedDue) {
        this.disInterestReceivableAccumulatedDue = disInterestReceivableAccumulatedDue;
    }

    /**
     * 厂家到期应收利息
     * @return factory_interest_receivable_accumulated_due 厂家到期应收利息
     */
    public BigDecimal getFactoryInterestReceivableAccumulatedDue() {
        return factoryInterestReceivableAccumulatedDue;
    }

    /**
     * 厂家到期应收利息
     * @param factoryInterestReceivableAccumulatedDue 厂家到期应收利息
     */
    public void setFactoryInterestReceivableAccumulatedDue(BigDecimal factoryInterestReceivableAccumulatedDue) {
        this.factoryInterestReceivableAccumulatedDue = factoryInterestReceivableAccumulatedDue;
    }

    /**
     * 贷款状态 
WAIT_MAKE:待放款 
INTERESTING:计息中 
INTERESTDELAY:逾期 
PRINCIPALDELAY:本金逾期 
DONE:完成 
SETTLED:已结清
     * @return status 贷款状态 
WAIT_MAKE:待放款 
INTERESTING:计息中 
INTERESTDELAY:逾期 
PRINCIPALDELAY:本金逾期 
DONE:完成 
SETTLED:已结清
     */
    public String getStatus() {
        return status;
    }

    /**
     * 贷款状态 
WAIT_MAKE:待放款 
INTERESTING:计息中 
INTERESTDELAY:逾期 
PRINCIPALDELAY:本金逾期 
DONE:完成 
SETTLED:已结清
     * @param status 贷款状态 
WAIT_MAKE:待放款 
INTERESTING:计息中 
INTERESTDELAY:逾期 
PRINCIPALDELAY:本金逾期 
DONE:完成 
SETTLED:已结清
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 调账时间
     * @return gmt_create 调账时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 调账时间
     * @param gmtCreate 调账时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}