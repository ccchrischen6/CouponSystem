package com.imooc.passbook.vo;

import com.imooc.passbook.constant.ErrorCode;
import com.imooc.passbook.dao.MerchantsDao;
import com.imooc.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>create the request object for merchants</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsRequest {
    /** the name for merchants*/
    private String name;

    /** the logo for merchants*/
    private String logoUrl;
    private String businessLicenseUrl;
    /** the contact of merchants*/
    private String phone;
    private String address;

    /**
     *
     * @param merchantsDao {@link MerchantsDao}
     * @return {@link ErrorCode}
     */
    public ErrorCode validate(MerchantsDao merchantsDao) {

        if (merchantsDao.findByName(this.name) != null){
            return ErrorCode.DUPLICATE_NAME;
        }

        if (this.logoUrl == null){
            return ErrorCode.EMPTY_LOGO;
        }

        if (this.businessLicenseUrl == null) {
            return ErrorCode.EMPTY_BUSINESS_LICENSE;
        }

        if (this.address == null) {
            return ErrorCode.EMPTY_ADDRESS;
        }

        if (this.phone == null) {
            return ErrorCode.ERROR_PHONE;
        }

        return ErrorCode.SUCCESS;
    }
    /**
     * <h2>convert request object to merchants object</h2>
     * @return {@link Merchants}
     */
    public Merchants toMerchants() {
        Merchants merchants = new Merchants();
        merchants.setName(name);
        merchants.setLogoUrl(logoUrl);
        merchants.setBusinessLicenseUrl(businessLicenseUrl);
        merchants.setPhone(phone);
        merchants.setAddress(address);
        return merchants;
    }

}
