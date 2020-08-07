-- Poll 1
insert into poll (poll_id, question) values (1, 'What is your favorite color?');
insert into option (option_id, option_value, poll_id) values (1, 'Red', 1);
insert into option (option_id, option_value, poll_id) values (2, 'Blue', 1);
insert into option (option_id, option_value, poll_id) values (3, 'Green', 1);
insert into option (option_id, option_value, poll_id) values (4, 'None of the Above', 1);

-- Poll 2
insert into poll (poll_id, question) values (2, 'When do you go to bed?');
insert into option (option_id, option_value, poll_id) values (5, '11pm', 2);
insert into option (option_id, option_value, poll_id) values (6, '10pm', 2);
insert into option (option_id, option_value, poll_id) values (7, '12pm', 2);
insert into option (option_id, option_value, poll_id) values (8, 'None of the Above', 2);

-- Poll 3
insert into poll (poll_id, question) values (3, 'Do you like to eat...?');
insert into option (option_id, option_value, poll_id) values (9, 'Fruits', 3);
insert into option (option_id, option_value, poll_id) values (10, 'Vegetables', 3);
insert into option (option_id, option_value, poll_id) values (11, 'Meats', 3);
insert into option (option_id, option_value, poll_id) values (12, 'All of the Above', 3);


-- Poll 4
insert into poll (poll_id, question) values (4, 'Can you dance?');
insert into option (option_id, option_value, poll_id) values (13, 'Does it look like I can?', 4);
insert into option (option_id, option_value, poll_id) values (14, 'yes', 4);
insert into option (option_id, option_value, poll_id) values (15, 'no', 4);
insert into option (option_id, option_value, poll_id) values (16, 'maybe', 4);


-- Poll 5
insert into poll (poll_id, question) values (5, 'What is your favorite cheese');
insert into option (option_id, option_value, poll_id) values (17, 'Cheddar', 5);
insert into option (option_id, option_value, poll_id) values (18, 'BlueCheese', 5);
insert into option (option_id, option_value, poll_id) values (19, 'Havarti', 5);
insert into option (option_id, option_value, poll_id) values (20, 'None of the Above', 5);


