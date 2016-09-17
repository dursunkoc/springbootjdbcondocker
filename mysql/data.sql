use testdb;

CREATE TABLE person (
  id int(11) NOT NULL AUTO_INCREMENT,
  first varchar(100) NOT NULL,
  last varchar(100) NOT NULL,
  dateofbirth DATE DEFAULT null,
  placeofbirth varchar(100) not null,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into person (first,last,dateofbirth,placeofbirth) values('Dursun','KOC', STR_TO_DATE('02/10/1982', '%m/%d/%Y'),'Erzincan');
