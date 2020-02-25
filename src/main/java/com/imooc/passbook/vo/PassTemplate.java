package com.imooc.passbook.vo;

import com.imooc.passbook.constant.ErrorCode;
import com.imooc.passbook.dao.MerchantsDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Date;

/**
 * <h1>define the coupon object</h1>
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {
    /** the id for the coupon */
    private Integer id;

    /** the title for the coupon */
    private String title;

    private String summary;

    private String desc;

    /** the max number limit for the coupon */
    private Long limit;

    /** if the coupon has token, token is stored at Redis Set, if needed, fetch from Redis */
    private Boolean hasToken;

    /** the color of the background */
    private Integer background;

    /** the start date of the coupon*/
    private Date start;

    /** the end date of the coupon*/
    private Date end;

    /** checking the validation of the coupon
     * @param merchantsDao {@link MerchantsDao}
     * @retur {@link ErrorCode}
     * */
    public ErrorCode validate(MerchantsDao merchantsDao){
        if (null == merchantsDao.findById(id)) {
            return ErrorCode.MERCHANTS_NOT_EXIST;
        }

        return ErrorCode.SUCCESS;

    }


}
