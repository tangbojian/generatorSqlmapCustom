package com.taotao.mybatis.model1;

import java.math.BigDecimal;
import java.util.Date;

public class AccountBankInfoSnapshot {
    /**
     * 
     */
    private Integer id;

    /**
     * 银行id
     */
    private Integer bankId;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 支行id
     */
    private Integer bankBranchId;

    /**
     * 支行名称
     */
    private String bankBranchName;

    /**
     * 银行卡号
     */
    private String bankCard;

    /**
     * 银行账户类型名称
     */
    private String bankTypeName;

    /**
     * 昨日余额
     */
    private BigDecimal yesBalance;

    /**
     * 今日收额
     */
    private BigDecimal fromTodayBalance;

    /**
     * 今日付额
     */
    private BigDecimal todayPayBalance;

    /**
     * 今日余额
     */
    private BigDecimal todayBalance;

    /**
     * 创建时间
     */
    private Date gmtCreated;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 0：数据有效；1 ： 数据无效
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
     * 银行id
     * @return bank_id 银行id
     */
    public Integer getBankId() {
        return bankId;
    }

    /**
     * 银行id
     * @param bankId 银行id
     */
    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    /**
     * 银行名称
     * @return bank_name 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 银行名称
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 支行id
     * @return bank_branch_id 支行id
     */
    public Integer getBankBranchId() {
        return bankBranchId;
    }

    /**
     * 支行id
     * @param bankBranchId 支行id
     */
    public void setBankBranchId(Integer bankBranchId) {
        this.bankBranchId = bankBranchId;
    }

    /**
     * 支行名称
     * @return bank_branch_name 支行名称
     */
    public String getBankBranchName() {
        return bankBranchName;
    }

    /**
     * 支行名称
     * @param bankBranchName 支行名称
     */
    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName == null ? null : bankBranchName.trim();
    }

    /**
     * 银行卡号
     * @return bank_card 银行卡号
     */
    public String getBankCard() {
        return bankCard;
    }

    /**
     * 银行卡号
     * @param bankCard 银行卡号
     */
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    /**
     * 银行账户类型名称
     * @return bank_type_name 银行账户类型名称
     */
    public String getBankTypeName() {
        return bankTypeName;
    }

    /**
     * 银行账户类型名称
     * @param bankTypeName 银行账户类型名称
     */
    public void setBankTypeName(String bankTypeName) {
        this.bankTypeName = bankTypeName == null ? null : bankTypeName.trim();
    }

    /**
     * 昨日余额
     * @return yes_balance 昨日余额
     */
    public BigDecimal getYesBalance() {
        return yesBalance;
    }

    /**
     * 昨日余额
     * @param yesBalance 昨日余额
     */
    public void setYesBalance(BigDecimal yesBalance) {
        this.yesBalance = yesBalance;
    }

    /**
     * 今日收额
     * @return from_today_balance 今日收额
     */
    public BigDecimal getFromTodayBalance() {
        return fromTodayBalance;
    }

    /**
     * 今日收额
     * @param fromTodayBalance 今日收额
     */
    public void setFromTodayBalance(BigDecimal fromTodayBalance) {
        this.fromTodayBalance = fromTodayBalance;
    }

    /**
     * 今日付额
     * @return today_pay_balance 今日付额
     */
    public BigDecimal getTodayPayBalance() {
        return todayPayBalance;
    }

    /**
     * 今日付额
     * @param todayPayBalance 今日付额
     */
    public void setTodayPayBalance(BigDecimal todayPayBalance) {
        this.todayPayBalance = todayPayBalance;
    }

    /**
     * 今日余额
     * @return today_balance 今日余额
     */
    public BigDecimal getTodayBalance() {
        return todayBalance;
    }

    /**
     * 今日余额
     * @param todayBalance 今日余额
     */
    public void setTodayBalance(BigDecimal todayBalance) {
        this.todayBalance = todayBalance;
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
     * 0：数据有效；1 ： 数据无效
     * @return is_deleted 0：数据有效；1 ： 数据无效
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * 0：数据有效；1 ： 数据无效
     * @param isDeleted 0：数据有效；1 ： 数据无效
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }
}