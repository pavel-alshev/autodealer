-- begin DEALER_COUNTRY
create table DEALER_COUNTRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(3) not null,
    IS_DEFAULT boolean,
    --
    primary key (ID)
)^
-- end DEALER_COUNTRY
-- begin SEC_USER
alter table SEC_USER add column COUNTRY_ID varchar(36) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'dealer_ExtUser' where DTYPE is null ^
-- end SEC_USER
-- begin DEALER_MANUFACTURER
create table DEALER_MANUFACTURER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COUNTRY_ID varchar(36) not null,
    CODE varchar(255) not null,
    --
    primary key (ID)
)^
-- end DEALER_MANUFACTURER
-- begin DEALER_COLOR
create table DEALER_COLOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255) not null,
    --
    primary key (ID)
)^
-- end DEALER_COLOR
-- begin DEALER_VEHICLE_MODEL
create table DEALER_VEHICLE_MODEL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    MANUFACTURER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end DEALER_VEHICLE_MODEL
-- begin DEALER_VEHICLE_EQUIPMENT
create table DEALER_VEHICLE_EQUIPMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TYPE_ integer not null,
    NOTE varchar(255),
    PRICE decimal(19, 2) not null,
    VEHICLE_MODEL_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end DEALER_VEHICLE_EQUIPMENT
-- begin DEALER_VEHICLE
create table DEALER_VEHICLE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MANUFACTURER_ID varchar(36) not null,
    MODEL_ID varchar(36) not null,
    EQUIPMENT_ID varchar(36) not null,
    YEAROFISSUE timestamp not null,
    PRICE decimal(19, 2) not null,
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end DEALER_VEHICLE

-- begin DEALER_CLIENT
create table DEALER_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    CLIENT_ID varchar(255) not null,
    ADRESS varchar(255),
    REQUESTS_NUM bigint,
    PHONE varchar(7),
    --
    primary key (ID)
)^
-- end DEALER_CLIENT
-- begin DEALER_PURCHASE_REQUEST
create table DEALER_PURCHASE_REQUEST (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VEHICLE_ID varchar(36) not null,
    CLIENT_ID varchar(36) not null,
    IS_PAID boolean not null,
    PRICE decimal(19, 2) not null,
    MANAGER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end DEALER_PURCHASE_REQUEST
-- begin DEALER_PERSON
create table DEALER_PERSON (
    ID varchar(36) not null,
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end DEALER_PERSON
-- begin DEALER_LEGAL
create table DEALER_LEGAL (
    ID varchar(36) not null,
    --
    INN varchar(255) not null,
    --
    primary key (ID)
)^
-- end DEALER_LEGAL
