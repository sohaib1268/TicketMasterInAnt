CREATE TABLE `scd_db`.`Admin`
(
	`AdminID` INT NOT NULL,
    `Name` VARCHAR(60) NOT NULL,
    `Email` VARCHAR(60) NOT NULL,
    `Password` VARCHAR(60) NOT NULL,
    `Contact` VARCHAR(10) NOT NULL,
    
    PRIMARY KEY (`AdminID`)
    
);

CREATE TABLE `scd_db`.`Customer`
(
	`CustomerID` INT NOT NULL,
	`Name` VARCHAR(60) NOT NULL,
    `Email` VARCHAR(60) NOT NULL,
    `Password` VARCHAR(60) NOT NULL,
    `Contact` VARCHAR(10) NOT NULL,
    `BlockedStatus` TINYINT(1) NOT NULL,
    `CurrentPoints` VARCHAR(60),
    
    PRIMARY KEY (`CustomerID`)
);

CREATE TABLE `scd_db`.`Event`
(
	`EventID` INT NOT NULL,
    `Name` VARCHAR(60) NOT NULL,
    `MaxCapacity` INT NOT NULL,
    `CurrentBookings` INT,
    `Date` datetime NOT NULL,
    `TicketPrice` INT NOT NULL,
    
	 PRIMARY KEY (`EventID`)
);
ALTER TABLE `scd_db`.`Event`
add `Location` varchar(60);

CREATE TABLE `scd_db`.`BusService`
(
	`BusServiceID` INT NOT NULL,
    `Name` VARCHAR(60) NOT NULL,
    `MaxCapacity` INT NOT NULL,
    `CurrentBookings` INT,
    `Date` datetime NOT NULL,
    `TicketPrice` INT NOT NULL,
    `DepCity` varchar(60) NOT NULL,
    `ArrivalCity` varchar(60) NOT NULL,
    
	 PRIMARY KEY (`BusServiceID`)
);


CREATE TABLE `scd_db`.`EventReservation`
(
	`CustomerID` int not null,
    `EventID` int,
    `SpecialCode` varchar(60) not null,
    `ReserveDate` datetime not null,
    `EventQuantity` INT,
    
    constraint fk_EventReservation_CustomerID foreign key (`CustomerID`) references Customer(`CustomerID`) on delete cascade,
    constraint fk_Reservation_EventID foreign key (`EventID`) references Event(`EventID`),
    primary key (`CustomerID`, `EventID`)
    
);



CREATE TABLE `scd_db`.`BusServiceReservation`
(
	`CustomerID` int not null,
    `BusServiceID` int,
    `SpecialCode` varchar(60) not null,
    `ReserveDate` datetime not null,
    `BusServiceQuantity` INT,
    
     constraint fk_BusServiceReservation_CustomerID foreign key (`CustomerID`) references Customer(`CustomerID`) on delete cascade,
	 constraint fk_Reservation_BusServiceID foreign key (`BusServiceID`) references BusService(`BusServiceID`),
     primary key (`CustomerID`, `BusServiceID`)
)


CREATE TABLE `scd_db`.`EventCart`
(
	`CustomerID` int not null,
    `EventID` int,
    `EventQuantity` INT,

    
    constraint fk_EventCart_CustomerID foreign key (`CustomerID`) references Customer(`CustomerID`) on delete cascade,
    constraint fk_Cart_EventID foreign key (`EventID`) references Event(`EventID`) ,
    primary key (`CustomerID`, `EventID`)
);



CREATE TABLE `scd_db`.`BusServiceCart`
(
	`CustomerID` int not null,
	`BusServiceID` int,
	`BusServiceQuantity` INT,
        
	constraint fk_BusServiceCart_CustomerID foreign key (`CustomerID`) references Customer(`CustomerID`) on delete cascade,
    constraint fk_Cart_BusServiceID foreign key (`BusServiceID`) references BusService(`BusServiceID`),
	primary key (`CustomerID`, `BusServiceID`)

);







