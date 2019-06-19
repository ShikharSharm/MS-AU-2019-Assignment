create table theatre(theatre_id int auto_increment,
theatre_name varchar(100) not null,
address varchar(100),
theatre_type varchar(50),
num_seats int not null,
primary key(theatre_id)
);

create table movie(movie_id int auto_increment,
Actors varchar(100),
movie_name varchar(100) not null unique, 
production_house varchar(100),
release_date date, 
primary key (movie_id)
);

create table shows(show_id int auto_increment,
start_time time,
end_time time,
theatre_id int ,
movie_id int,
foreign key(theatre_id) references theatre(theatre_id),
foreign key(movie_id) references movie(movie_id),
primary key(show_id,theatre_id)
);
 
create table seats(seat_id int not null,
show_id int not null,
theatre_id int not null,
booked varchar(40) not null,
foreign key(theatre_id) references theatre(theatre_id ),
foreign key(show_id) references shows(show_id),
primary key(seat_id,theatre_id,show_id)
);

create table user(user_id int  auto_increment,
user_name varchar(50),
email_id varchar(50),
phone varchar(13),
primary key(user_id)
);

create table ticket(ticket_id int auto_increment,
user_id int not null,
booking_date date,
price int,
theatre_id int not null,
seat_id int not null,
show_id int not null,
primary key(ticket_id),
foreign key(theatre_id) references theatre(theatre_id),
foreign key(seat_id) references seats(seat_id),
foreign key(show_id) references shows(show_id),
foreign key(user_id) references user(user_id)
);