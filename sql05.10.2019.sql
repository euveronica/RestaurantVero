create schema if not exists RestaurantVero;
USE RestaurantVero;

 
CREATE TABLE `produse` (
  `id_produs` int(11) NOT NULL AUTO_INCREMENT,
  `nume_categorie` varchar(128) NOT NULL,
  `nume_produs` varchar(128) NOT NULL,
  `descriere_produs` varchar(250) NOT NULL,
  `pret_unitar` float NOT NULL,
  `nivel_existent` int not null,
  `numar_portii` int not null,
  PRIMARY KEY (`id_produs`),
  UNIQUE KEY `id_produs_UNIQUE` (`id_produs`),
  UNIQUE KEY `produs_UNIQUE` (`nume_produs`)
) ENGINE=InnoDB;

create table  if not exists `comanda`
(
    `id_comanda` int not null AUTO_INCREMENT,
    `data_comanda` datetime not null,
    `id_produs` int null,
    `nr_produse` int not null,
    `pret_echivalent` decimal not null, # TODO se calculeaza, nu este o valoare fixa - poate fi scos din tabel
    `livrat` tinyint default 0 null,# TODO panou/fisier confirmare livrare
    `pret_total_comanda` decimal not null, # TODO se calculeaza, nu este o valoare fixa - poate fi scos din tabel
      PRIMARY KEY (`id_comanda`),
  UNIQUE KEY `id_comanda_UNIQUE` (`id_comanda`)
) ENGINE=InnoDB;

insert into RestaurantVero.produse (id_produs, nume_categorie, nume_produs, descriere_produs, pret_unitar, nivel_existent, numar_portii) values
(1, 'Gustari', 'Cașcaval pane cu cartofi prăjiți', '', 19.50, 30, 5),
(2, 'Gustari', 'Fasole bătută ca la Buzău (250g)', 'Cu ceapă călită şi usturoi - produs vegetarian', 9.50, 20, 3),
(3, 'Gustari', 'Gustarea bibliotecarului (520g)', 'Frigărui de pui cu bacon, chifteluțe cu susan, bulete de cașcaval, ciuperci umplute cu brânză de burduf, ardei gras', 30.50, 20, 5),
(4, 'Gustari', 'Gustarea francezului (300g)', 'Parfait din ficat de pui, fasole bătută cu ulei de trufe, castraveciori murați', 24.50, 15, 5),
(5, 'Gustari', 'Taifas (400g)', 'Hummus, sos Pesto, pastă de ardei copt, bastonete de legume, ardei iute murat', 27.50, 30, 5),
(6, 'Gustari', 'Gustarea ciobanului (500g)', 'Mămăligă cu brânză, smântână și ou', 23.50, 50, 5),
(7, 'Gustari', 'Gustarea grădinarului (390g)', 'Salată de vinete proaspete, zacuscă tradiţională, fasole bătută, roșii, ceapă, măsline Kalamata, pâine prăjită', 9.50, 30, 5),
(8, 'Gustari', 'Salată de vinete oltenească (280g)', 'Vinete proaspete coapte pe tablă și tocate la mână - produs vegetarian', 9.50, 30, 5),
(9, 'Ciorbe',  'Borș de cocoș cu tăiței de casă (420g)', 'Servit cu ardei iute', 14.00, 30, 5),
(10, 'Ciorbe', 'Ciorbă de burtă (430 g)', 'Servită cu ardei iute', 14.50, 30, 5),
(11,'Ciorbe', 'Ciorbă de fasole cu afumătură (440 g)', 'Servită cu ceapă', 13.50, 30, 5),
(12, 'Ciorbe','Ciorbă de văcuță (350g)', 'Servită cu ardei iute', 14.50, 30, 5),
(13,'Ciorbe', 'Cremă de legume cu crutoane (400g)', '', 12.50, 30, 5),
(14,'Ciorbe', 'Cremă de roșii cu crutoane', '', 12.50, 30, 5),
(15, 'Salate speciale', 'Salată Atena (490g)', 'Castraveţi, roșii, brânză tip Feta, ulei de măsline, ceapă roșie, ardei gras, măsline Kalamata', 27.00, 30, 5),
(16,'Salate speciale', 'Salată Genova (240g)', 'Mix de salată, mușchi de vițel pregătit la grătar, mango, roșii cherry, parmezan, muguri de pin, dressing vinaigrette', 38.00, 30, 5),
(17, 'Salate speciale','Salată Lyon (350g)', 'Salată Romaine, piept de pui, ardei gras roșu, ardei gras galben, morcovi, brânză gorgonzola, mere roșii, dressing bluecheese, semințe susan negru', 29.50, 30, 5),
(18, 'Salate speciale','Salată Nisa (345g)', 'Ton, anchois, ou fiert, cartofi nature, fasole verde, mix de salată, dressing vinaigrette', 33.50, 30, 5),
(19,'Salate speciale', 'Salată Normandia (220g)', 'Mix de salată, piept de rață afumat, sfeclă roșie, pere, brânză capră, muguri de pin, rodie, dressing vinaigrette, semințe susan negru, ulei măsline extra virgin, baghetă', 30.00, 30, 5),
(20, 'Salate speciale','Salată vegetariană (290g)', 'Avocado, porumb, țelină Apio, năut fiert,roșii cherry, nucă, rodie, morcov, dressing Vinaigrette, mix de salată, semințe de susan negru', 23.50, 30, 5);



