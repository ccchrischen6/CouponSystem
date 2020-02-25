package com.imooc.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>crete the response object for merchants</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsResponse {
    /** the id of the merchant, if not successful, return -1 */
    private Integer id;
}
