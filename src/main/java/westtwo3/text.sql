/*建库文件*/
create table city(
    id int primary key not null auto_increment,
    name varchar(10) not null,
    city_id varchar(20) not null ,
    wei varchar(10) not null,
    jin varchar(10) not null
);
create table today(
    name varchar(10) primary key not null,
    fxDate varchar(10) not null ,
    tempMax varchar(10) not null,
    tempMin varchar(10) not null ,
    textDay varchar(10) not null
);
create table tomorrow(
    name varchar(10) primary key not null,
    fxDate varchar(10) not null ,
    tempMax varchar(10) not null,
    tempMin varchar(10) not null ,
    textDay varchar(10) not null
);
create table tdat(
    name varchar(10) primary key not null,
    fxDate varchar(10) not null ,
    tempMax varchar(10) not null,
    tempMin varchar(10) not null ,
     textDay varchar(10) not null
);