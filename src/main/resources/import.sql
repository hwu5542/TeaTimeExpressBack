INSERT INTO teatimeexpress.users VALUES (1, 'hong@mail.com','hong','https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg','wu','cada8826c79dd54f51541600ab533c96:53ea9314838a488fc032b7273e668c63bf706e9cdc63d1ad5e6bd05b80709aa0b57d41aba5b60bef0fe1b4cea3189701731835e33b51978056b8e85f765f96ca','(123)456-7890','hong');
INSERT INTO teatimeexpress.users VALUES (2, 'kong@mail.com','kong','https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg','wu','cada8826c79dd54f51541600ab533c96:53ea9314838a488fc032b7273e668c63bf706e9cdc63d1ad5e6bd05b80709aa0b57d41aba5b60bef0fe1b4cea3189701731835e33b51978056b8e85f765f96ca','(123)456-7890','kong');
INSERT INTO teatimeexpress.users VALUES (3, 'bong@mail.com','bong','https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg','wu','cada8826c79dd54f51541600ab533c96:53ea9314838a488fc032b7273e668c63bf706e9cdc63d1ad5e6bd05b80709aa0b57d41aba5b60bef0fe1b4cea3189701731835e33b51978056b8e85f765f96ca','(123)456-7890','bong');
INSERT INTO teatimeexpress.users VALUES (4, 'wong@mail.com','wong','https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg','wu','cada8826c79dd54f51541600ab533c96:53ea9314838a488fc032b7273e668c63bf706e9cdc63d1ad5e6bd05b80709aa0b57d41aba5b60bef0fe1b4cea3189701731835e33b51978056b8e85f765f96ca','(123)456-7890','wong');

INSERT INTO teatimeexpress.addresses VALUES (1,'apt. 100','Wisconsin Dells','U.S.','1st West',' Washington Ave','53965','WI');
INSERT INTO teatimeexpress.addresses VALUES (2,'apt. 101','Wisconsin Dells','U.S.','1st West',' Washington Ave','53965','WI',1);
INSERT INTO teatimeexpress.addresses VALUES (3,'apt. 111','Wisconsin Dells','U.S.','1st West',' Washington Ave','53965','WI',1);
INSERT INTO teatimeexpress.addresses VALUES (4,'apt. 000','Wisconsin Dells','U.S.','1st West',' Washington Ave','53965','WI',1);
INSERT INTO teatimeexpress.addresses VALUES (5,'apt. 200','Wisconsin Dells','U.S.','1st West',' Washington Ave','53965','WI');
INSERT INTO teatimeexpress.addresses VALUES (6,'apt. 300','Wisconsin Dells','U.S.','1st West',' Washington Ave','53965','WI');
INSERT INTO teatimeexpress.addresses VALUES (7,'apt. 400','Wisconsin Dells','U.S.','1st West',' Washington Ave','53965','WI');

UPDATE teatimeexpress.users SET address_id = 1 WHERE user_id = 1; 
UPDATE teatimeexpress.users SET address_id = 5 WHERE user_id = 2; 
UPDATE teatimeexpress.users SET address_id = 6 WHERE user_id = 3; 
UPDATE teatimeexpress.users SET address_id = 7 WHERE user_id = 4; 

INSERT INTO teatimeexpress.products VALUES (1, '123','IMG_0536;IMG_0537;IMG_0538;IMG_0539','IMG_0535','johnny',1,998.99,1,10);
INSERT INTO teatimeexpress.products VALUES (2, '123','IMG_0536;IMG_0537;IMG_0538;IMG_0539','IMG_0535','johnny',1,998.99,1,10);
INSERT INTO teatimeexpress.products VALUES (3, '123','IMG_0536;IMG_0537;IMG_0538;IMG_0539','IMG_0535','johnny',1,998.99,1,10);
INSERT INTO teatimeexpress.products VALUES (4, '123','IMG_0536;IMG_0537;IMG_0538;IMG_0539','IMG_0535','johnny',1,998.99,1,10);
INSERT INTO teatimeexpress.products VALUES (5, '123','IMG_0536;IMG_0537;IMG_0538;IMG_0539','IMG_0535','johnny',1,998.99,1,10);
INSERT INTO teatimeexpress.products VALUES (6, '123','IMG_0536;IMG_0537;IMG_0538;IMG_0539','IMG_0535','johnny',1,998.99,1,10);
INSERT INTO teatimeexpress.products VALUES (7, '123','IMG_0536;IMG_0537;IMG_0538;IMG_0539','IMG_0535','johnny',1,998.99,1,10);
INSERT INTO teatimeexpress.products VALUES (8, '123','IMG_0536;IMG_0537;IMG_0538;IMG_0539','IMG_0535','johnny',1,998.99,1,10);
INSERT INTO teatimeexpress.products VALUES (9, '123','IMG_0536;IMG_0537;IMG_0538;IMG_0539','IMG_0535','johnny',1,998.99,1,10);

INSERT INTO teatimeexpress.orders VALUES (1, 1,'123','9:42 10/4/2021',1,1);
INSERT INTO teatimeexpress.orders VALUES (2, 1,'123','9:42 10/4/2021',1,1);
INSERT INTO teatimeexpress.orders VALUES (3, 1,'123','9:42 10/4/2021',1,1);
INSERT INTO teatimeexpress.orders VALUES (4, 1,'123','9:42 10/4/2021',1,1);
INSERT INTO teatimeexpress.orders VALUES (5, 1,'123','9:42 10/4/2021',1,1);
INSERT INTO teatimeexpress.orders VALUES (6, 1,'123','9:42 10/4/2021',1,1);
INSERT INTO teatimeexpress.orders VALUES (7, 2,'123','9:42 10/4/2021',2,1);
INSERT INTO teatimeexpress.orders VALUES (8, 3,'123','9:42 10/4/2021',3,1);
INSERT INTO teatimeexpress.orders VALUES (9, 4,'123','9:42 10/4/2021',4,1);

alter sequence teatimeexpress.products_product_id_seq restart with 10;
alter sequence teatimeexpress.orders_order_number_seq restart with 10;
alter sequence teatimeexpress.users_user_id_seq restart with 5;
alter sequence teatimeexpress.addresses_address_id_seq restart with 8;