INSERT INTO teatimeexpress.users VALUES (1, 'hong@mail.com','1 W Washington Ave, Wisconsin Dells, WI 53965','hoho','(123)456-7890','hong');
alter sequence teatimeexpress.users_user_id_seq restart with 2;
INSERT INTO teatimeexpress.products VALUES (1, '123','https://drive.google.com/file/d/1uk1FoYpvQxRxRnYJvMjXJQWEifpheLZJ/view?usp=sharing','johnny',1,998.99,1,10);
alter sequence teatimeexpress.products_product_id_seq restart with 2;
INSERT INTO teatimeexpress.orders VALUES (1, 1,'123','9:42 10/4/2021',1,1);
alter sequence teatimeexpress.orders_order_number_seq restart with 2;