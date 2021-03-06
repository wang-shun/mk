package com.hand.hmall.mst.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;

import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Auto Generated By Hap Code Generator
 **/

/**
 * @author xiaoli.yu
 * @version 0.1
 * @name:
 * @Description: 推送至商城的套件映射对象dto
 * @date 2017/7/10 14:37
 */
@ExtensionAttribute(disable = true)
@Table(name = "HMALL_MST_SUITLINE_MAPPING")
public class SuitlineMappingDto {

    private Long mappingId;

    private String componentCode;

    private BigDecimal quantity;

    private String code;

    private String syncflag;

    public Long getMappingId() {
        return mappingId;
    }

    public void setMappingId(Long mappingId) {
        this.mappingId = mappingId;
    }

    public String getComponentCode() {
        return componentCode;
    }

    public void setComponentCode(String componentCode) {
        this.componentCode = componentCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }


    public void setSyncflag(String syncflag) {
        this.syncflag = syncflag;
    }

    public String getSyncflag() {
        return syncflag;
    }

}
