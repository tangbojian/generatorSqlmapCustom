package com.taotao.mybatis.model1;

import java.math.BigDecimal;
import java.util.Date;

public class FreezeThawAmountDetail {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 账户id
     */
    private String accountId;

    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 放款id
     */
    private String makeLoanId;

    /**
     * 贷款id
     */
    private String loanInfoId;

    /**
     * 项目id
     */
    private String projectCode;

    /**
     * 厂家id
     */
    private String supplierId;

    /**
     * 流程号
     */
    private String processinstanceId;

    /**
     * ADD:入账
SUBTRACT：出账
     */
    private String mode;

    /**
     * 订单定额
     */
    private BigDecimal orderAmount;

    /**
     * 放款金额
     */
    private BigDecimal makeLoansAmount;

    /**
     * 冻结金额
     */
    private BigDecimal freezeAmount;

    /**
     * 冻结时间
     */
    private Date freezeTime;

    /**
     * 解冻金额
     */
    private BigDecimal thawAmount;

    /**
     * 解冻时间
     */
    private Date thawTime;

    /**
     * REPAYMENT：还款
REVERSE_ABATE： 红字冲销
DISCOUNT_CHARGES:贴息
REBATE:返利
SERVICE_CHARGE:服务费
REFUND:退款
CHECK_THE_BALANCE:调账
MAKE_LOANS:放款
ORDER:订单
     */
    private String type;

    /**
     * 创建时间
     */
    private Date gmtCreated;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 是否逻辑删除：

0：有效数据 

1：无效数据
     */
    private String isDeleted;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 账户id
     * @return account_id 账户id
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 账户id
     * @param accountId 账户id
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * 订单编号
     * @return order_code 订单编号
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 订单编号
     * @param orderCode 订单编号
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * 放款id
     * @return make_loan_id 放款id
     */
    public String getMakeLoanId() {
        return makeLoanId;
    }

    /**
     * 放款id
     * @param makeLoanId 放款id
     */
    public void setMakeLoanId(String makeLoanId) {
        this.makeLoanId = makeLoanId == null ? null : makeLoanId.trim();
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
     * 项目id
     * @return project_code 项目id
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 项目id
     * @param projectCode 项目id
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    /**
     * 厂家id
     * @return supplier_id 厂家id
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * 厂家id
     * @param supplierId 厂家id
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    /**
     * 流程号
     * @return processInstance_id 流程号
     */
    public String getProcessinstanceId() {
        return processinstanceId;
    }

    /**
     * 流程号
     * @param processinstanceId 流程号
     */
    public void setProcessinstanceId(String processinstanceId) {
        this.processinstanceId = processinstanceId == null ? null : processinstanceId.trim();
    }

    /**
     * ADD:入账
SUBTRACT：出账
     * @return mode ADD:入账
SUBTRACT：出账
     */
    public String getMode() {
        return mode;
    }

    /**
     * ADD:入账
SUBTRACT：出账
     * @param mode ADD:入账
SUBTRACT：出账
     */
    public void setMode(String mode) {
        this.mode = mode == null ? null : mode.trim();
    }

    /**
     * 订单定额
     * @return order_amount 订单定额
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 订单定额
     * @param orderAmount 订单定额
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 放款金额
     * @return make_loans_amount 放款金额
     */
    public BigDecimal getMakeLoansAmount() {
        return makeLoansAmount;
    }

    /**
     * 放款金额
     * @param makeLoansAmount 放款金额
     */
    public void setMakeLoansAmount(BigDecimal makeLoansAmount) {
        this.makeLoansAmount = makeLoansAmount;
    }

    /**
     * 冻结金额
     * @return freeze_amount 冻结金额
     */
    public BigDecimal getFreezeAmount() {
        return freezeAmount;
    }

    /**
     * 冻结金额
     * @param freezeAmount 冻结金额
     */
    public void setFreezeAmount(BigDecimal freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    /**
     * 冻结时间
     * @return freeze_time 冻结时间
     */
    public Date getFreezeTime() {
        return freezeTime;
    }

    /**
     * 冻结时间
     * @param freezeTime 冻结时间
     */
    public void setFreezeTime(Date freezeTime) {
        this.freezeTime = freezeTime;
    }

    /**
     * 解冻金额
     * @return thaw_amount 解冻金额
     */
    public BigDecimal getThawAmount() {
        return thawAmount;
    }

    /**
     * 解冻金额
     * @param thawAmount 解冻金额
     */
    public void setThawAmount(BigDecimal thawAmount) {
        this.thawAmount = thawAmount;
    }

    /**
     * 解冻时间
     * @return thaw_time 解冻时间
     */
    public Date getThawTime() {
        return thawTime;
    }

    /**
     * 解冻时间
     * @param thawTime 解冻时间
     */
    public void setThawTime(Date thawTime) {
        this.thawTime = thawTime;
    }

    /**
     * REPAYMENT：还款
REVERSE_ABATE： 红字冲销
DISCOUNT_CHARGES:贴息
REBATE:返利
SERVICE_CHARGE:服务费
REFUND:退款
CHECK_THE_BALANCE:调账
MAKE_LOANS:放款
ORDER:订单
     * @return type REPAYMENT：还款
REVERSE_ABATE： 红字冲销
DISCOUNT_CHARGES:贴息
REBATE:返利
SERVICE_CHARGE:服务费
REFUND:退款
CHECK_THE_BALANCE:调账
MAKE_LOANS:放款
ORDER:订单
     */
    public String getType() {
        return type;
    }

    /**
     * REPAYMENT：还款
REVERSE_ABATE： 红字冲销
DISCOUNT_CHARGES:贴息
REBATE:返利
SERVICE_CHARGE:服务费
REFUND:退款
CHECK_THE_BALANCE:调账
MAKE_LOANS:放款
ORDER:订单
     * @param type REPAYMENT：还款
REVERSE_ABATE： 红字冲销
DISCOUNT_CHARGES:贴息
REBATE:返利
SERVICE_CHARGE:服务费
REFUND:退款
CHECK_THE_BALANCE:调账
MAKE_LOANS:放款
ORDER:订单
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
     * 是否逻辑删除：

0：有效数据 

1：无效数据
     * @return is_deleted 是否逻辑删除：

0：有效数据 

1：无效数据
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * 是否逻辑删除：

0：有效数据 

1：无效数据
     * @param isDeleted 是否逻辑删除：

0：有效数据 

1：无效数据
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }
}