package com.hand.hmall.fnd.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "HMALL_FND_GLOBALVARIANT")
public class FndGlobalvariant extends BaseDTO {
     @Id
     @GeneratedValue(generator = GENERATOR_TYPE)
     @Column
      private Long globalvariantId;

     @Column
      private String code;

     @Column
      private String value;

     @Column
      private String description;


     public void setGlobalvariantId(Long globalvariantId){
         this.globalvariantId = globalvariantId;
     }

     public Long getGlobalvariantId(){
         return globalvariantId;
     }

     public void setCode(String code){
         this.code = code;
     }

     public String getCode(){
         return code;
     }

     public void setValue(String value){
         this.value = value;
     }

     public String getValue(){
         return value;
     }

     public void setDescription(String description){
         this.description = description;
     }

     public String getDescription(){
         return description;
     }

     }
