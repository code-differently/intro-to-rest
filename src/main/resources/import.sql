-- Poll 1
insert into poll (poll_id, question) values (1, 'What is your favorite color?');
insert into option (option_id, option_value, poll_id) values (1, 'Red', 1);
insert into option (option_id, option_value, poll_id) values (2, 'Blue', 1);
insert into option (option_id, option_value, poll_id) values (3, 'Green', 1);
insert into option (option_id, option_value, poll_id) values (4, 'None of the Above', 1);

-- Poll 2
insert into poll (poll_id, question) values (2, 'When do you go to bed?');
insert into option (option_id, option_value, poll_id) values (1, '11pm', 2);
insert into option (option_id, option_value, poll_id) values (2, '10pm', 2);
insert into option (option_id, option_value, poll_id) values (3, '12pm', 2);
insert into option (option_id, option_value, poll_id) values (4, 'None of the Above', 2);

-- Poll 3
insert into poll (poll_id, question) values (3, 'Do you like to eat...?');
insert into option (option_id, option_value, poll_id) values (1, 'Fruits', 3);
insert into option (option_id, option_value, poll_id) values (2, 'Vegetables', 3);
insert into option (option_id, option_value, poll_id) values (3, 'Meats', 3);
insert into option (option_id, option_value, poll_id) values (4, 'All of the Above', 3);


-- Poll 4
insert into poll (poll_id, question) values (4, 'Can you dance?');
insert into option (option_id, option_value, poll_id) values (1, 'Does it look like I can?', 4);
insert into option (option_id, option_value, poll_id) values (2, 'yes', 4);
insert into option (option_id, option_value, poll_id) values (3, 'no', 4);
insert into option (option_id, option_value, poll_id) values (4, 'maybe', 4);


-- Poll 5
insert into poll (poll_id, question) values (5, 'What is your favorite cheese');
insert into option (option_id, option_value, poll_id) values (1, 'Cheddar', 5);
insert into option (option_id, option_value, poll_id) values (2, 'BlueCheese', 5);
insert into option (option_id, option_value, poll_id) values (3, 'Havarti', 5);
insert into option (option_id, option_value, poll_id) values (4, 'None of the Above', 5);


