CREATE SCHEMA `Academy`;
USE Academy;

CREATE TABLE `Groups`
(
  `id_Groups` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `Name` VARCHAR(10) NOT NULL CHECK (`Name` != '') UNIQUE,
  `Rating` INT NOT NULL CHECK (`Rating` >= 0 AND `Rating` <= 5),
  `Year` INT NOT NULL CHECK (`Year` >= 1 AND `Year` <= 5)
);

CREATE TABLE `Departments`
(
  `id_Departments` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `Financing` DECIMAL (10, 2) NOT NULL CHECK (`Financing` >= 0) DEFAULT 0,
  `Name` VARCHAR(100) NOT NULL CHECK (`Name` != '') UNIQUE
  );

CREATE TABLE `Faculties`
(
  `id_Faculties` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `Name` VARCHAR(100) NOT NULL CHECK (`Name` != '') UNIQUE
);

CREATE TABLE `Teachers`
(
  `id_Teachers` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `EmploymentDate` DATE NOT NULL CHECK (`EmploymentDate` > '1990-01-01'),
  `Name` VARCHAR(255) NOT NULL CHECK (`Name` != ''),
  `Premium` DECIMAL (10, 2) NOT NULL CHECK (`Premium` > 0) DEFAULT 0,
  `Salary` DECIMAL (10, 2) NOT NULL CHECK (`Salary` > 0),
  `Surname` VARCHAR(255) NOT NULL CHECK (`Surname` != '')
);

create table `Curators`
(
   `Id_Curators` int not null AUTO_INCREMENT primary key,
   `Name` varchar(255) not null check (`Name` <> N''),
   `Surname` varchar(255) not null check (`Surname` <> N'')
);

create table `GroupsCurators`
(
    `Id_GroupsCurators` int not null AUTO_INCREMENT primary key,
    `Id_Curators` int not null,
    `id_Groups` int not null
);

create table `GroupsLectures`
(
    `Id_GroupsLectures` int not null AUTO_INCREMENT primary key,
    `id_Groups` int not null,
    `Id_Lectures` int not null
);

create table `Lectures`
(
    `Id_Lectures` int not null AUTO_INCREMENT primary key,
    `LectureRoom` varchar(255) not null check (`LectureRoom` <> N''),
	`Id_Subjects` int not null,
	`Id_Teachers` int not null
);

create table `Subjects`
(
    `Id_Subjects` int not null AUTO_INCREMENT primary key,
    `Name` varchar(100) not null unique check (`Name` <> N'')
);

# вставка полей таблиц

alter table `Departments` add
    `id_Faculties` int not null;

alter table `Groups` add
    `id_Departments` int not null;

alter table `Faculties` add
    `Financing` DECIMAL (10, 2) not null check (`Financing` >= 0.0) default 0.0;



# key

alter table `Departments`
    add foreign key (`id_Faculties`) references `Faculties`(`id_Faculties`);

alter table `Groups`
    add foreign key (`id_Departments`) references `Departments`(`id_Departments`);

alter table `GroupsCurators`
    add foreign key (`Id_Curators`) references `Curators`(`Id_Curators`);

alter table `GroupsCurators`
    add foreign key (`id_Groups`) references `Groups`(`id_Groups`);

alter table `GroupsLectures`
    add foreign key (`id_Groups`) references `Groups`(`id_Groups`);

alter table `GroupsLectures`
    add foreign key (`Id_Lectures`) references `Lectures`(`Id_Lectures`);

alter table `Lectures`
    add foreign key (`Id_Subjects`) references `Subjects`(`Id_Subjects`);


alter table `Lectures`
    add foreign key (`id_Teachers`) references `Teachers`(`id_Teachers`);
