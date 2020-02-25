package com.imooc.passbook.constant;

import javax.persistence.criteria.CriteriaBuilder;

/**
 *  <h2>Define error</h2>
 * */
public enum ErrorCode {
    SUCCESS(0, ""),
    DUPLICATE_NAME(1, "duplicateName"),
    EMPTY_LOGO(2, "emptyLogo"),
    EMPTY_BUSINESS_LICENSE(3, "emptyCertificate"),
    ERROR_PHONE(4, "errorContact"),
    EMPTY_ADDRESS(5, "emptyAddress"),
    MERCHANTS_NOT_EXIST(6, "noMerchants");

    /** error code */
    private Integer code;

    /** error description*/
    private String desc;

    ErrorCode(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }

    Integer getCode(){return this.code;}
    String getDesc(){return this.desc;}
}
