#query2
select * from employees WHERE (employee_name like 'H%' or employee_name like 'K%' or employee_name like 'T%') and length(employee_name)<=15; 
#query3
select * , timestampdiff(year, customer_birthday, curdate()) as Age from customers
having (Age between 18 and 50) and (customer_address in ("Đà Nẵng", "Quảng Trị"));
#query4 
select  cu.customer_id, cu.customer_name, count(cu.customer_id) as booking_times, cu.customer_type_id 
from contracts as co
join customers as cu using (customer_id)
group by cu.customer_id
having cu.customer_type_id = 1
order by booking_times; 
#query 5
select customers.customer_id, customers.customer_name,
temp.contract_id, temp.service_name, temp.contract_start_date, temp.contract_end_date, temp.total_pay
from (
	select customers.customer_id, customers.customer_name, customertypes.customer_type_name,
	contracts.contract_id, services.service_name, contracts.contract_start_date, contracts.contract_end_date,
	(contracts.contract_price + sum(attachservices.attach_service_price * contractdetails.quantity) ) as total_pay
	from customertypes
	join customers using(customer_type_id)
	join contracts using(customer_id)
	join services using(service_id)
	join contractdetails using(contract_id)
	join attachservices using(attach_service_id)
	group by contract_id	
) as temp
right join customers using(customer_id)
join customertypes using(customer_type_id)
order by contract_id desc;
#query 6
SELECT service_id, service_name, service_area, rent_type_price, service_type_name
FROM services
JOIN renttypes USING (rent_type_id)
JOIN servicetypes USING (service_type_id)
WHERE service_id NOT IN
(	SELECT service_id
	FROM contracts
	WHERE contract_start_date >= '2019-01-01');
#query 7
SELECT service_id, service_name, service_area, service_max_people, rent_type_price, service_type_name
FROM services
JOIN renttypes USING (rent_type_id)
JOIN servicetypes USING (service_type_id)
WHERE (service_id NOT IN
(	SELECT service_id
	FROM contracts
	WHERE contract_start_date BETWEEN '2019-01-01' AND '2019-12-31')) AND(
    service_id IN
 (  SELECT service_id FROM contracts WHERE contract_start_date BETWEEN '2018-01-01' AND '2018-12-31'));
#query8
SELECT DISTINCT customer_name from customers;
SELECT customer_name from customers group by customer_name;
#query9
CREATE TABLE abc (
month int);
insert into abc(month) values (1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12);
select abc.month, temp.number_of_customers, temp.revenue from abc 
LEFT JOIN 
(
	select tmp.month, tmp.number_of_customers, sum(tmp.revenue) as revenue
    from 
    (
		SELECT MONTH(contracts.contract_start_date) as month, COUNT(*) as number_of_customers, 
		(contracts.contract_price + sum(attachservices.attach_service_price * contractdetails.quantity) ) as revenue
		FROM contracts
		JOIN contractdetails using(contract_id)
		JOIN attachservices using(attach_service_id)
		WHERE YEAR(contracts.contract_start_date) = 2019
		GROUP BY contracts.contract_id
	) as tmp
    group by tmp.month
) AS temp 
USING (month)
order by month;
drop table abc;
#query 10
SELECT c.contract_id, c.contract_start_date, c.contract_end_date, c.contract_deposit,
count(d.contract_detail_id) AS quantity_of_attached_services FROM
contracts AS c
JOIN contractdetails AS d using(contract_id)
GROUP BY d.contract_id;
#query 11
SELECT c.customer_id, c.customer_type_id, c.customer_address, 
attach_service_id, attach_service_name, 
attach_service_price
FROM customers AS c
join contracts using(customer_id)
join contractdetails using(contract_id)
JOIN attachservices AS a using (attach_service_id)
WHERE c.customer_address in ('Vinh','Quảng Ngãi') 
AND c.customer_type_id = 1;
#query 12
SELECT co.contract_id, co.employee_id, co.customer_id, cu.customer_phone,
s.service_name, count(de.quantity) AS quantity_of_attached_services, co.contract_deposit
FROM  contracts AS co
JOIN customers AS cu using (customer_id)
JOIN services AS s using (service_id)
JOIN contractdetails as de using(contract_id)
WHERE (service_id NOT IN
(	SELECT service_id
	FROM contracts
	WHERE contract_start_date BETWEEN '2019-01-01' AND '2019-06-30')) AND(
    service_id IN
 (  SELECT service_id FROM contracts WHERE contract_start_date BETWEEN '2019-09-01' AND '2019-12-31'))
GROUP BY contract_id ;
#query 13
CREATE VIEW temp_table As
	SELECT attach_service_id, attach_service_name, attach_service_price,
	count(contract_detail_id) AS use_frequency
	FROM contractdetails
	JOIN attachservices USING(attach_service_id) 
	GROUP BY attach_service_id;

SELECT * FROM temp_table HAVING use_frequency = 
(
	SELECT MAX(use_frequency) from temp_table
);
#query 14
SELECT contractdetails.contract_id, services.service_name,
attachservices.attach_service_name, COUNT(contract_detail_id) as times FROM contracts 
join contractdetails using(contract_id)
JOIN services using (service_id)
JOIN attachservices using(attach_service_id)
group by attach_service_id
having times=1;
#query15
select employee_id, employee_name, edu_degree, division_name, tmp.contract_id, tmp.contract_start_date , count(contract_id) 
from employees
left join (
	select contracts.contract_id, contracts.employee_id, contracts.contract_start_date
    from contracts
    where year(contracts.contract_start_date) between 2018 and 2020
) as tmp using (employee_id)
left join edubackgrounds using(edu_bg_id)
left join divisions using(division_id)
group by employee_id
having count(contract_id) <=3;
#query16
delete from employees where employee_id not in(
select employee_id
from contracts 
    where year(contracts.contract_start_date) between 2017 and 2020
) ;
#query17
update customers set customer_type_id=1 where customer_id in
(SELECT customer_id
    FROM
(select customer_id, customers.customer_type_id,
(contracts.contract_price + sum(attachservices.attach_service_price * contractdetails.quantity)) as total_pay
from customers
join contracts using (customer_id)
join contractdetails using(contract_id)
join attachservices using(attach_service_id)
where year(contracts.contract_start_date) = 2019 and customer_type_id=2
group by customer_id
having total_pay>5000) as tmp);  
#query18
delete from customers where customer_id not in(
select customer_id from contracts
where year(contract_start_date)>=2016);
#query19
update attachservices set attach_service_price =  attach_service_price*2 where attach_service_id in(
select tmp.attach_service_id from (
select attach_service_id, attach_service_name, attach_service_price, count(contract_detail_id) as times
from contractdetails
join attachservices using(attach_service_id)
group by attach_service_id
having times > 3) as tmp )
;
#query20
select employee_id as ID , employee_name as Name , employee_birthday as Birthday, employee_phone as Phone, employee_email as Email, employee_address as Address from employees
union all
select customer_id, customer_name, customer_birthday, customer_phone, customer_email, customer_address from customers

























