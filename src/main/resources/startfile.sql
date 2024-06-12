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

insert into region (id,city,active) values (8,'бишкек',true);
insert into region (id,city,active) values (9,'кегети',true);
insert into region (id,city,active) values (10,'кант',true);
insert into region (id,city,active) values (11,'чункурчак',true);
insert into region (id,city,active) values (12,'беловодское',true);;

insert into region (id,city,active) values (13,'ош',true);
insert into region (id,city,active) values (14,'узген',true);
insert into region (id,city,active) values (15,'ноокат',true);

insert into region (id,city,active) values (13,'каракол',true);
insert into region (id,city,active) values (13,'балыкчы',true);
insert into region (id,city,active) values (13,'чолпон-ата',true);

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

insert into rooms (id,rooms_count,active) values (1,'1',true);
insert into rooms (id,rooms_count,active) values (2,'2',true);
insert into rooms (id,rooms_count,active) values (3,'3',true);
insert into rooms (id,rooms_count,active) values (4,'4',true);
insert into rooms (id,rooms_count,active) values (5,'5',true);
insert into rooms (id,rooms_count,active) values (6,'6 и более',true);

insert into estate_type (id,name,active) values (1,'Квартира',true);
insert into estate_type (id,name,active) values (2,'Дом',true);
insert into estate_type (id,name,active) values (3,'Комната',true);