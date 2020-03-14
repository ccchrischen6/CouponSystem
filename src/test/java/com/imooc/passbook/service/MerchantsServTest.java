package com.imooc.passbook.service;

import com.alibaba.fastjson.JSON;
import com.imooc.passbook.vo.CreateMerchantsRequest;
import com.imooc.passbook.vo.PassTemplate;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {

    @Autowired
    private IMerchantsServ merchantsServ;
    //{"data":{"id":17},"errorCode":0,"errorMsg":""}

    @Test
//    @Transactional
    // if has @Test annotation, adding @Transactional will avoid modification in database
    public void testCreateMerchantServ(){
        CreateMerchantsRequest request = new CreateMerchantsRequest();
        request.setName("CU");
        request.setLogoUrl("https://www.columbia.edu/");
        request.setBusinessLicenseUrl("https://www.columbia.edu/");
        request.setPhone("9170001234");
        request.setAddress("NYC");

        System.out.println(JSON.toJSONString(merchantsServ.createMerchants(request)));
    }

    @Test
    public void testBuildMerchantsInfoById(){
        System.out.println(JSON.toJSONString(merchantsServ.buildMerchantsInfoById(18)));
    }

    /**
     * DropPassTemplates: {"background":1,"desc":"Desc: CU","end":1584897451400,
     * "hasToken":true,"id":17,"limit":10000,"start":1583173051399,"summary":"Summary: CU",
     * "title":"Title: CU"}
     *
     * DropPassTemplates: {"background":1,"desc":"Desc: MIT","end":1584897659803,
     * "hasToken":false,"id":18,"limit":10000,"start":1583173259802,"summary":"Summary: MIT",
     * "title":"Title: MIT"}
     */
    @Test
    public void testDropPassTemplate(){
        PassTemplate passTemplate = new PassTemplate();
        passTemplate.setId(18);
        passTemplate.setTitle("MIT");
        passTemplate.setSummary("MIT");
        passTemplate.setDesc("MIT");
        passTemplate.setLimit(10000L);
        passTemplate.setHasToken(false);
        passTemplate.setBackground(1);
        passTemplate.setStart(DateUtils.addDays(new Date(), -10));
        passTemplate.setEnd(DateUtils.addDays(new Date(), 10));
        System.out.println(JSON.toJSONString(
                merchantsServ.dropPassTemplate(passTemplate)
        ));
    }
}
