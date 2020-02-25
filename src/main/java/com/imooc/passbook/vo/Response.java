package com.imooc.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>define a general response</h1>
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    /** ErrorCode, if no error found, return 0 */
    private Integer errorCode = 0;

    /** ErrorMessage, if no error found, return "" */
    private String errorMsg = "";

    /** return object */
    private Object data;

    public Response(Object data){
        this.data = data;
    }
}
