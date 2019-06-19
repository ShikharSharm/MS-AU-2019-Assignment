Delimiter //

create procedure getBookingDetail(in user_id int)

BEGIN

select u.user_name, m.movie_name, s.start_time, s.end_time, t.seat_id , th.theatre_name, t.booking_date
from user u join ticket t on u.user_id=t.user_id
join movie m on t.movie_id=m.movie_id
join theatre th on t.theatre_id=th.theatre_id
join shows s on t.show_id=s.show_id
where u.user_id=user_id;

end//