package com.imooc.passbook.dao;

import com.imooc.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h1>Merchants Dao API</h1>
 * */

public interface MerchantsDao extends JpaRepository<Merchants, Integer> {
    /**
     * <h2>get merchant object by id</h2>
     * @param id merchant id
     * @return {@link Merchants}
     */

    Merchants findById(Integer id);

    /**
     * <h2>get merchant object by name</h2>
     * @param name the name of the merchant
     * @return {@link Merchants}
     */
    Merchants findByName(String name);
}
