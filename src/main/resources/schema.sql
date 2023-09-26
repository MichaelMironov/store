-- create database "store" with owner postgres;

create table if not exists product
(
    id serial unique not null,
    cost numeric(5,2) not null,
    description varchar(255),
    name varchar(100)
);

alter table users owner to postgres;


--create table if not exists users
--(
--    id serial unique not null,
--    username varchar(50) unique not null,
--
--    primary key (id)
--);


--create table if not exists product
--(
--    id serial unique not null,
--    cost numeric(5,2) not null,
--    description varchar(255),
--    name varchar(100),
--
--    primary key (id)
--);
--
--
--create table if not exists orders
--(
--    user_id serial not null,
--    product_id serial not null,
--    primary key (user_id, product_id),
--
--    constraint fk_user_id foreign (user_id) references users (id),
--    constraint fk_product_id foreign (product_id) references product (id)
--
--);
--
--alter table users owner to postgres;