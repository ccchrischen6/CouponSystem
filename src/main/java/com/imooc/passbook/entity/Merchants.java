package com.imooc.passbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * <h1>Merchants object model</h1>
 * */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "merchants")
public class Merchants {
    /** the id of merchants, PK */
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;

    /** The name of the merchants, it should be the only one for the project*/

    @Basic
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    /** the logo of the merchants*/
    @Basic
    @Column(name = "logo_url", nullable = false)
    private String logoUrl;

    /** the certificate of merchants*/
    @Basic
    @Column(name = "business_license_url", nullable = false)
    private String businessLicenseUrl;

    /** contact info*/
    @Basic
    @Column(name = "phone", nullable = false)
    private String phone;

    /** address info */
    @Basic
    @Column(name = "address", nullable = false)
    private String address;

    /** if the merchant is audited */
    @Basic
    @Column(name = "is_audit", nullable = false)
    private Boolean isAudit = false;



}
