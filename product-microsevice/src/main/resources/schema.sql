CREATE TABLE product
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    title         VARCHAR(255)          NULL,
    `description` VARCHAR(255)          NULL,
    price         DOUBLE                NOT NULL,
    manufacturer  VARCHAR(255)          NULL,
    image_url     VARCHAR(255)          NULL,
    CONSTRAINT pk_product PRIMARY KEY (id)
);
