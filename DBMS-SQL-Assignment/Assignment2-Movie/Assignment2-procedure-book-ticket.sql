delimiter //
create procedure bookTicket(in movie_id int, in user_id int, in theatre_id int, in show_id int,
out result bool)

BEGIN

declare seats_avail integer;
declare seat_alloted integer;

select count(seat_id) into seats_avail from seats where seats.booked='no' 
group by theatre_id,seat_id;

if seats_avail != 0 then
set result = true;
else
set result = false;
end if;

if result = true then
select seat_id  into seat_alloted from seats where booked ='no' limit 1;
insert into ticket(user_id,theatre_id,show_id,movie_id,seat_id,booking_date)
values(user_id,theatre_id, show_id, movie_id, seat_id, now());
end if;
end//
