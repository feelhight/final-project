insert into deal_type (id,name,active) values (1,'Продажа',true);
insert into deal_type (id,name,active) values (2,'Аренда',true);

insert into possibility_of_exchange (id,name,active) values (1,'Рассмотрю варианты',true);
insert into possibility_of_exchange (id,name,active) values (2,'С доплатой покупателя',true);
insert into possibility_of_exchange (id,name,active) values (3,'Ключ на ключ',true);
insert into possibility_of_exchange (id,name,active) values (4,'С доплатой продавца',true);

insert into mortgage (id,name,active) values (1,'Есть',true);
insert into mortgage (id,name,active) values (2,'Нет',true);

insert into install_plan (id,name,active) values (1,'Есть',true);
insert into install_plan (id,name,active) values (2,'Нет',true);

insert into residential_complex(id,name,active) values (1,'жилой комплекс "Динамо"',true);
insert into residential_complex(id,name,active) values (2,'жилой комплекс "RIO"',true);
insert into residential_complex(id,name,active) values (3,'жилой комплекс "Gagarin"',true);
insert into residential_complex(id,name,active) values (4,'жилой комплекс "Алтын-Булак"',true);
insert into residential_complex(id,name,active) values (5,'жилой комплекс "Vesta-tower"',true);
insert into residential_complex(id,name,active) values (6,'жилой комплекс "Мадина"',true);
insert into residential_complex(id,name,active) values (7,'жилой комплекс "Рахат"',true);


insert into region (id,name,active) values (1,'Чуйская область',true);
insert into region (id,name,active) values (2,'Ошская область',true);
insert into region (id,name,active) values (3,'Иссык-Кульская область',true);
insert into region (id,name,active) values (4,'Нарынская область',true);
insert into region (id,name,active) values (5,'Баткенская область',true);
insert into region (id,name,active) values (6,'Таласская область',true);
insert into region (id,name,active) values (7,'Джалал-Абадская область',true);

insert into region (id,city,city_id,region_id,active) values (8,'бишкек',1,1,true);
insert into region (id,city,city_id,region_id,active) values (9,'кегети',2,1,true);
insert into region (id,city,city_id,region_id,active) values (10,'кант',3,1,true);
insert into region (id,city,city_id,region_id,active) values (11,'чункурчак',4,1,true);
insert into region (id,city,city_id,region_id,active) values (12,'беловодское',5,1,true);;

insert into region (id,city,city_id,region_id,active) values (13,'ош',6,2,true);
insert into region (id,city,city_id,region_id,active) values (14,'узген',7,2,true);
insert into region (id,city,city_id,region_id,active) values (15,'ноокат',8,2,true);

insert into region (id,city,city_id,region_id,active) values (16,'каракол',9,3,true);
insert into region (id,city,city_id,region_id,active) values (17,'балыкчы',10,3,true);
insert into region (id,city,city_id,region_id,active) values (18,'чолпон-ата',11,3,true);

insert into region (id,city,city_id,region_id,active) values (19,'нарын',12,4,true);
insert into region (id,city,city_id,region_id,active) values (20,'баетово',13,4,true);
insert into region (id,city,city_id,region_id,active) values (21,'чаек',14,4,true);
insert into region (id,city,city_id,region_id,active) values (22,'кочкорта',15,4,true);

insert into region (id,city,city_id,region_id,active) values (23,'баткен',16,5,true);
insert into region (id,city,city_id,region_id,active) values (24,'фйдаркен',17,5,true);
insert into region (id,city,city_id,region_id,active) values (25,'пульгон',18,5,true);
insert into region (id,city,city_id,region_id,active) values (26,'сулюкта',19,5,true);

insert into region (id,city,city_id,region_id,active) values (27,'талас',20,6,true);
insert into region (id,city,city_id,region_id,active) values (28,'покровка',21,6,true);
insert into region (id,city,city_id,region_id,active) values (29,'бакай-ата',22,6,true);
insert into region (id,city,city_id,region_id,active) values (30,'кызыл-адыр',23,6,true);

insert into region (id,city,city_id,region_id,active) values (31,'джалал-абад',24,7,true);
insert into region (id,city,city_id,region_id,active) values (32,'кербен',25,7,true);
insert into region (id,city,city_id,region_id,active) values (33,'токтогул',26,7,true);
insert into region (id,city,city_id,region_id,active) values (34,'арал',27,7,true);

insert into state (id,name,active) values (1,'Евроремонт',true);
insert into state (id,name,active) values (2,'Хорошее',true);
insert into state (id,name,active) values (3,'Среднее',true);

insert into heating (id,name,active) values (1,'Центральное',true);
insert into heating (id,name,active) values (2,'На газе',true);
insert into heating (id,name,active) values (3,'Электрическое',true);

insert into building_type (id,name,active) values (1,'Кирпич',true);
insert into building_type (id,name,active) values (2,'Монолит',true);
insert into building_type (id,name,active) values (3,'Панельный',true);

insert into series (id,name,active) values (1,'102',true);
insert into series (id,name,active) values (2,'104',true);
insert into series (id,name,active) values (3,'105',true);
insert into series (id,name,active) values (4,'106',true);
insert into series (id,name,active) values (5,'сталинка',true);
insert into series (id,name,active) values (6,'хрущевка',true);

insert into rooms (id,rooms_count,active) values (1,'1',true);
insert into rooms (id,rooms_count,active) values (2,'2',true);
insert into rooms (id,rooms_count,active) values (3,'3',true);
insert into rooms (id,rooms_count,active) values (4,'4',true);
insert into rooms (id,rooms_count,active) values (5,'5',true);
insert into rooms (id,rooms_count,active) values (6,'6 и более',true);

insert into estate_type (id,name,active) values (1,'Квартира',true);
insert into estate_type (id,name,active) values (2,'Дом',true);
insert into estate_type (id,name,active) values (3,'Комната',true);