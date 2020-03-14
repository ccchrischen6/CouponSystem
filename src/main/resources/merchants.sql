CREATE TABLE `merchants`
(
    `id`                   int(10) unsigned              NOT NULL AUTO_INCREMENT,
    `name`                 varchar(64) COLLATE utf8_bin  NOT NULL COMMENT 'merchantsName',
    `logo_url`             varchar(256) COLLATE utf8_bin NOT NULL COMMENT 'merchantsLogo',
    `business_license_url` varchar(256) COLLATE utf8_bin NOT NULL COMMENT 'merchantsCertificate',
    `phone`                varchar(64) COLLATE utf8_bin  NOT NULL COMMENT 'merchantsContact',
    `address`              varchar(64) COLLATE utf8_bin  NOT NULL COMMENT 'merchantsAddress',
    `is_audit`             BOOLEAN                       NOT NULL COMMENT 'isAudit',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 17
  DEFAULT CHARSET = utf8;