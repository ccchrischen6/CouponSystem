package com.imooc.passbook.service.impl;

import com.imooc.passbook.dao.MerchantsDao;
import com.imooc.passbook.service.IMerchantsServ;
import com.imooc.passbook.vo.CreateMerchantsRequest;
import com.imooc.passbook.vo.PassTemplate;
import com.imooc.passbook.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <h1>implement fo api of merchants service</h1>
 */

@Slf4j
@Service
public class MerchantsServImpl implements IMerchantsServ {

    /** the database api for merchants*/
    private final MerchantsDao merchantsDao;

    @Autowired
    private MerchantsServImpl(MerchantsDao merchantsDao){
        this.merchantsDao = merchantsDao;
    }

    @Override
    public Response createMerchants(CreateMerchantsRequest request) {
        return null;
    }

    @Override
    public Response buildMerchantsInfoById(Integer id) {
        return null;
    }

    @Override
    public Response dropPassTemplate(PassTemplate template) {
        return null;
    }
}
