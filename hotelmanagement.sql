create database hotelmanagementsystem;

show databases;

use hotelmanagementsystem;

create table login(username varchar(25), password varchar(25));

insert into login values("admin", "admin");

select * from login;

create table employee(name varchar(25), age varchar(25), gender varchar(25), job varchar(30), salary varchar(15), phone varchar(15), email varchar(40), aadhar varchar(15));  

describe employee;

select * from employee;

create table room(roomnumber varchar(10), availability varchar(20), cleaning_status varchar(20), price varchar(20), bed_type varchar(20));

describe room;

select * from room;


Delete from room where price=100;

create table driver(name varchar(25), age varchar(10), gender varchar(15), company varchar(20), brand varchar(20), available varchar(20), location varchar(40)); 

describe driver;

select * from driver;

create table department(department varchar(30), budget varchar(30));

insert into department values('Front Office', '50000');
insert into department values('House Keeping', '5000');
insert into department values('Food and Beverages', '8000');
insert into department values('Kitchen or Food Products', '7000');
insert into department values('Security', '3000');

select * from department;


create table customer(document varchar(20), number varchar(30), name varchar(30), gender varchar (10), country varchar(20), room varchar(10), checkintime varchar(80), deposit varchar(20));

describe customer; 

select * from customer;



