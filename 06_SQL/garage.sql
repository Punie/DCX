drop table Voiture;

create table Voiture
(
  id serial primary key,
  marque varchar (255) not null,
  ref varchar (255) not null,
  couleur varchar (255) not null,
  nb_porte int not null
);

alter table Voiture add constraint ref_unique unique (ref);

--

insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001F5','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('Mercedes','ME0001F6','Rouge',3);
insert into Voiture (marque, ref, couleur, nb_porte) values ('Opel','OP0001F7','Bleu',5);
insert into Voiture (marque, ref, couleur, nb_porte) values ('Renault','RE0001F8','Blanc',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('Peugeot','PE0001F9','Jaune',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('Toyota','TO0001A5','Noir',5);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001A1','Vert',2);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001D6','Noir',2);
insert into Voiture (marque, ref, couleur, nb_porte) values ('Mercedes','ME0001X5','Rouge',3);
insert into Voiture (marque, ref, couleur, nb_porte) values ('Alpha Romeo','AR0001X6','Bleu',5);
insert into Voiture (marque, ref, couleur, nb_porte) values ('Chevrolet','CH0001Z5','Rouge',5);
insert into Voiture (marque, ref, couleur, nb_porte) values ('Rover','RO0001R5','Blanc',5);
insert into Voiture (marque, ref, couleur, nb_porte) values ('Mini','MI0001G5','Rouge',3);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001C5','Jaune',5);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001D5','Bleu',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('Nissan','NI0001V5','Blanc',4);

select distinct marque from Voiture;
select count (distinct marque) from Voiture;
select marque, count (*) from Voiture group by marque;
select marque, couleur, nb_porte from Voiture where ref='AR0001X6';

create table Marque
(
  id serial primary key,
  libelle varchar(255) not null,
  pays varchar(255) not null,
  constraint marque_unique UNIQUE (libelle)
);

insert into Marque (libelle, pays) values ('Alpha Romeo','Italie');
insert into Marque (libelle, pays) values ('BMW','Allemagne');
insert into Marque (libelle, pays) values ('Chevrolet','USA');
insert into Marque (libelle, pays) values ('Mercedes','Allemagne');
insert into Marque (libelle, pays) values ('Mini','Royaume-Uni');
insert into Marque (libelle, pays) values ('Nissan','Japon');
insert into Marque (libelle, pays) values ('Opel','Allemagne');
insert into Marque (libelle, pays) values ('Peugeot','France');
insert into Marque (libelle, pays) values ('Renault','France');
insert into Marque (libelle, pays) values ('Rover','Royaume-Uni');
insert into Marque (libelle, pays) values ('Toyota','Japon');

alter table Voiture drop column marque;

alter table Voiture add id_marque int;

update Voiture set id_marque = (select id from Marque where libelle = 'Alpha Romeo') where ref like 'AR%';
update Voiture set id_marque = (select id from Marque where libelle = 'BMW') where ref like 'BM%';
update Voiture set id_marque = (select id from Marque where libelle = 'Chevrolet') where ref like 'CH%';
update Voiture set id_marque = (select id from Marque where libelle = 'Mercedes') where ref like 'ME%';
update Voiture set id_marque = (select id from Marque where libelle = 'Mini') where ref like 'MI%';
update Voiture set id_marque = (select id from Marque where libelle = 'Nissan') where ref like 'NI%';
update Voiture set id_marque = (select id from Marque where libelle = 'Opel') where ref like 'OP%';
update Voiture set id_marque = (select id from Marque where libelle = 'Peugeot') where ref like 'PE%';
update Voiture set id_marque = (select id from Marque where libelle = 'Renault') where ref like 'RE%';
update Voiture set id_marque = (select id from Marque where libelle = 'Rover') where ref like 'RO%';
update Voiture set id_marque = (select id from Marque where libelle = 'Toyota') where ref like 'TO%';

select libelle, couleur, ref, nb_porte
from Voiture inner join Marque
on Voiture.id_marque = Marque.id;

alter table Voiture add constraint fk_id_marque foreign key (id_marque) references Marque(id);

alter table Voiture add column prix int default 20000 not null;
alter table Voiture rename prix to prix2;
alter table Voiture add column prix money default 0 not null;
update Voiture set prix = prix2;
alter table Voiture drop column prix2;
-- alternatively : alter table Voiture alter column prix type money;
