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
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001F6','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001F7','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001F8','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001F9','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001A5','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001A1','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001D6','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001X5','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001X6','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001Z5','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001R5','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001G5','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001C5','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001D5','Rouge',4);
insert into Voiture (marque, ref, couleur, nb_porte) values ('BMW','BM0001V5','Rouge',4);
