CREATE TABLE PRICES
(
    price_list INT PRIMARY KEY,
    brand_id   INT           NOT NULL,
    start_date VARCHAR(19)   NOT NULL,
    end_date   VARCHAR(19)   NOT NULL,
    product_id INT           NOT NULL,
    priority   INT           NOT NULL,
    price      NUMERIC(9, 2) NOT NULL,
    curr       VARCHAR(3)    NOT NULL
);

INSERT INTO PRICES (price_list, brand_id, start_date, end_date, product_id, priority, price, curr)
VALUES (1, 1, '2020-06-14T00:00:00', '2020-12-31T23:59:59', 35455, 0, 35.50, 'EUR'),
       (2, 1, '2020-06-14T15:00:00', '2020-06-14T18:30:00', 35455, 1, 25.45, 'EUR'),
       (3, 1, '2020-06-15T00:00:00', '2020-06-15T11:00:00', 35455, 1, 30.50, 'EUR'),
       (4, 1, '2020-06-15T16:00:00', '2020-12-31T23:59:59', 35455, 1, 38.95, 'EUR');