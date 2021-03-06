package com.hand.hmall.as.dto;


import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@ExtensionAttribute(disable = true)
@Table(name = "HMALL_AS_RECEIPT")
public class Receipt extends BaseDTO {
    @Id
    @GeneratedValue(generator = GENERATOR_TYPE)
    @Column
    private Long receiptOrderId;

    @Column
    private String code;

    @Column
    private String receiptType;

    @Column
    private String status;

    @Column
    private String svCategory1;

    @Column
    private String svCategory2;

    @Column
    private String salesCode;

    @Column
    private String shippingType;

    @Column
    private String complaint;

    @Column
    private String note;

    @Column
    private String userId;

    @Column
    private String mobile;

    @Column
    private String address;

    @Column
    private String cs;

    @Column
    private Date finishTime;

    @Column
    private String syncflag;

    @Column
    private Date appointmentDate;

    @Column
    private Date executionDate;

    @Column
    private String technicianName;

    @Column
    private String isCharge;

    @Column
    private String linksCode;

    @Column
    private String payStatus;

    @Column
    private Long transFee;

    @Column
    private Long restoreFee;

    @Column
    private Long repairFee;

    @Column
    private Long shouldPay;

    @Column
    private Long realPay;

    @Column
    private String name;

    @Column
    private String refundStatus;

    @Column
    private String refundReason;

    @Column
    private Long refundSum;

    @Column
    private String returnReason;

    @Column
    private String returnType;

    @Column
    private String receivePosition;

    @Column
    private String logisticsNumber;

    @Column
    private Long returnFee;

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public Long getRefundSum() {
        return refundSum;
    }

    public void setRefundSum(Long refundSum) {
        this.refundSum = refundSum;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getReceivePosition() {
        return receivePosition;
    }

    public void setReceivePosition(String receivePosition) {
        this.receivePosition = receivePosition;
    }

    public String getLogisticsNumber() {
        return logisticsNumber;
    }

    public void setLogisticsNumber(String logisticsNumber) {
        this.logisticsNumber = logisticsNumber;
    }

    public Long getReturnFee() {
        return returnFee;
    }

    public void setReturnFee(Long returnFee) {
        this.returnFee = returnFee;
    }

    private Date creationDate;

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setReceiptOrderId(Long receiptOrderId) {
        this.receiptOrderId = receiptOrderId;
    }

    public Long getReceiptOrderId() {
        return receiptOrderId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setSvCategory1(String svCategory1) {
        this.svCategory1 = svCategory1;
    }

    public String getSvCategory1() {
        return svCategory1;
    }

    public void setSvCategory2(String svCategory2) {
        this.svCategory2 = svCategory2;
    }

    public String getSvCategory2() {
        return svCategory2;
    }

    public void setSalesCode(String salesCode) {
        this.salesCode = salesCode;
    }

    public String getSalesCode() {
        return salesCode;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public String getCs() {
        return cs;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setSyncflag(String syncflag) {
        this.syncflag = syncflag;
    }

    public String getSyncflag() {
        return syncflag;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setIsCharge(String isCharge) {
        this.isCharge = isCharge;
    }

    public String getIsCharge() {
        return isCharge;
    }

    public void setLinksCode(String linksCode) {
        this.linksCode = linksCode;
    }

    public String getLinksCode() {
        return linksCode;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setTransFee(Long transFee) {
        this.transFee = transFee;
    }

    public Long getTransFee() {
        return transFee;
    }

    public void setRestoreFee(Long restoreFee) {
        this.restoreFee = restoreFee;
    }

    public Long getRestoreFee() {
        return restoreFee;
    }

    public void setRepairFee(Long repairFee) {
        this.repairFee = repairFee;
    }

    public Long getRepairFee() {
        return repairFee;
    }

    public void setShouldPay(Long shouldPay) {
        this.shouldPay = shouldPay;
    }

    public Long getShouldPay() {
        return shouldPay;
    }

    public void setRealPay(Long realPay) {
        this.realPay = realPay;
    }

    public Long getRealPay() {
        return realPay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
