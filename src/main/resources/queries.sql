show databases;

use submission_schema;

create table submission (
firstname varchar(20),
lastname varchar(20),
email varchar(40),
phone varchar(20)
);

drop table submission;

create table submission(
id int primary key,
submission_id int,
consultant_id varchar(20),
submission_date date,
vendor_company varchar(20),
vendor_name varchar(20),
vendor_email_address varchar(20),
vendor_phone_number varchar(20),
implementation_partner varchar(20),
clientt_name varchar(20),
pay_rate int,
submuission_status boolean,
submission_type varchar(20),
city varchar(20),
statee varchar(20),
zip varchar(20)
);

create table lead_details(
id int primary key,
first_name varchar(20),
last_name varchar(20),
email_address varchar(20),
phone_number varchar(20)

);


create table consultant_details(
first_name varchar(20),
last_name varchar(20),
email_address varchar(20),
phone_number varchar(20)
);

alter table consultant_details add coloumn int primary key;

drop table consultant_detail, lead_detail;


create table lead_details(
id int primary key,
first_name varchar(20),
last_name varchar(20),
email_address varchar(20),
phone_number varchar(20)

);


create table consultant_details(
first_name varchar(20),
last_name varchar(20),
email_address varchar(20),
phone_number varchar(20)
);

alter table consultant_details add column id varchar(20) primary key;
drop table lead_details;
create table lead_details(
id int primary key,
first_name varchar(20),
last_name varchar(20),
email_address varchar(20),
phone_number varchar(20)

);

create table submission_update(
id int primary key,
submission_id int,
update_text varchar(20),
created_date date,
foreign key(submission_id) references submission(id)
);

alter table submission add column submission_id varchar(20);

create table submission_update(
id int primary key,
submission_id int,
update_text varchar(20),
created_date date,
foreign key(submission_id) references submission(id)
);


alter table submission drop column submission_id;

alter table submission add column submission_id int;

create table submission_update(
id int primary key,
submission_id int,
update_text varchar(20),
created_date date,
foreign key(submission_id) references submission(id)
);


alter table submission add column submission_id int;

drop table submission;


create table submission(
id int primary key,
submission_id int;
consultant_id varchar(20),
submission_date date,
vendor_company varchar(20),
vendor_name varchar(20),
vendor_email_address varchar(20),
vendor_phone_number varchar(20),
implementation_partner varchar(20),
clientt_name varchar(20),
pay_rate int,
submuission_status boolean,
submission_type varchar(20),
city varchar(20),
statee varchar(20),
zip varchar(20)
);


create table submission_update(
id int primary key,
submission_id int,
update_text varchar(20),
created_date date,
foreign key(submission_id) references submission(id)
);

drop table consultant_details;

create table consultant_details(
id int primary key,
lead_id int,
first_name varchar(20),
last_name varchar(20),
email_address varchar(20),
phone_number varchar(20)	
);


drop table submission_update;

create table submission_update(
id int primary key,
submission_id int,
update_text varchar(20),
created_date date
);


create table Employee(
firstname varchar(20),
lastname varchar(20),
job_start_date date,
salary varchar(20)
); 


alter table Employee add column department varchar(20);

insert into Employee 
values('Rachana','Sanda','2023-07-17','73,000','IT');

select * from Employee;


insert into Employee 
values('Rachana','Sanda','2023-07-17','73,000','IT');

alter table Employee drop column salary;
select * from Employee;

alter table Employee add column salary int; 

insert into Employee 
values('Archana','Sanda','2023-07-17','IT',120000);




insert into Employee 
values('Pallavi','Sagar','2023-07-17','CSE',140000);

insert into Employee 
values('Ramana','Sagar','2023-08-01','CSE',130000);


insert into Employee 
values('Chandu','Sagar','2023-09-02','ECE',160000);


SET SQL_SAFE_UPDATES = 0;
update  employee set salary = 110000  where firstname = 'Rachana';

select max(salary) from Employee;

select count(firstname) from Employee;

select count(firstname), department from employee group by department;


select firstname, job_start_date from Employee where job_start_date >= DATE_SUB(CURDATE(), INTERVAL 6 MONTH);

insert into consultant_details
values (101,201,'Rach','San','rach.d@gmail.com','8179142734');

insert into consultant_details
values (102,202,'Sri','Meka','sri@2198@gmail.com','817914726');

SET SQL_SAFE_UPDATES = 0;

select * from consultant_details;

SET SQL_SAFE_UPDATES = 0;
update consultant_details set email_address = 'sri2198@gmail.com' where id = 101 ; 


insert into submission (id, submission_id, consultant_id, submission_date, pay_rate)
values (1,301,101,'2023-06-18',72);


insert into submission (id, submission_id, consultant_id, submission_date, pay_rate)
values (2,302,102,'2023-06-15',68);

insert into submission (id, submission_id, consultant_id, submission_date, pay_rate)
values (3,303,103,'2023-07-01',69);

insert into submission (id, submission_id, consultant_id, submission_date, pay_rate)
values (4,304,103,'2023-07-01',74);
insert into submission (id, submission_id, consultant_id, submission_date, pay_rate)
values (5,305,102,'2023-07-01',76);

select * from submission;

select count(submission_id),consultant_id from submission group by consultant_id;

select count(submission_id),submission_date from submission group by submission_date;

insert into submission (id, submission_id, consultant_id, submission_date)
values (7,307,101,'2023-06-18');




select id, submission_id, consultant_id, submission_date, pay_rate from submission;

delete from submission where pay_rate is null; 

insert into lead_details
values(201,'Manohar','reddy','mxr@gmail.com','1267239234');

select * from lead_details;

select submission_date, count(submission_id) , lead_id , first_name from submission inner join lead_details
on submission.lead_id = lead_details.id group by first_name, submission_date,submission_id,lead_id;

alter table submission add column lead_id int;
select * from submission;


SELECT submission_date, submission_id, lead_id, first_name
FROM submission
INNER JOIN lead_details ON submission.lead_id = lead_details.id
GROUP BY lead_id, first_name,submission_date,submission_id;

select lead_id from submission;


update submission set lead_id = 204 where id = 4;
select id from lead_details;
insert into lead_details
values(203,'Jagdishwar','Reddy','jxr@gmail.com','1267239234');

SELECT submission_date, count(submission_id), lead_id, first_name
FROM submission
INNER JOIN lead_details ON submission.lead_id = lead_details.id
GROUP BY lead_id, first_name,submission_date,submission_id;

alter table submission drop lead_id;
select * from submission;
select * from lead_details;
select * from consultant_details;

SELECT s.*
FROM submission s
JOIN consultant_details c ON s.consultant_id = c.id
JOIN lead_details l ON l.id = c.lead_id
WHERE l.first_name = 'Manohar'
  AND s.submission_date = '2023-06-18';

SELECT count(submission_id), l.first_name,l.id
FROM submission s
JOIN consultant_details c ON s.consultant_id = c.id
JOIN lead_details l ON l.id = c.lead_id group by lead_id;



































