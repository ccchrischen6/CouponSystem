package com.imooc.passbook.service;

import com.imooc.passbook.vo.CreateMerchantsRequest;
import com.imooc.passbook.vo.PassTemplate;
import com.imooc.passbook.vo.Response;

/**
 * <h1>define the api for the service of merchants</h1>
 */
public interface IMerchantsServ {
    /**
     * <h2>create the service</h2>
     * @param request {@link CreateMerchantsRequest}
     * @return {@link Response}
     */
    Response createMerchants(CreateMerchantsRequest request);

    /**
     * <h2>create merchant's information according to its id</h2>
     * @param id
     * @return {@link Response}
     */

    Response buildMerchantsInfoById(Integer id);

    /**
     * <h2>deliver coupon</h2>
     * @param template {@link PassTemplate} coupon object
     * @return {@link Response}
     */
    Response dropPassTemplate(PassTemplate template);

}
