use mydb;

insert into lkup_language (language_code,description) values
('J','Java'),
('R','Ruby'),
('P','Python'); 

insert into lkup_subtopic (subtopic_code,description) values
('Gen','General Knowledge'),
('Int','Intermediate Topics'),
('Adv','Advanced Topics');


insert into xref_language_subtopic(language_code,subtopic_code) values
('J','Gen'),
('J','Int'),
('J','Adv'),
('R','Gen'),
('P','Int');


insert into questions(question,language_code,subtopic_code) values
('What is java','J','Gen'),
('What is the meaning of the return data type void', 'J', 'Gen'),
('Which of the following statements about the Java language is true','J', 'Gen'),
('A class can have many methods with the same name as long as the number of parameters or type of parameters is different. This OOP concept is known as', 'J', 'Gen'),
('Which of the following is not a return type','J', 'Gen'),
('What is an example of recursion','P','Int'),
('What is ruby','R','Gen');

insert into answers_key(description,status,questions_id) values
('A type of coffee','0',1),
('A stimulant','0',1),
('A programming language','1',1),
('None of the above','0',1),
('An empty memory space is returned so that the developers can utilize itA type of coffee','0',2),
('void returns no data type','1',2),
('programming language','0',2),
('None of the above', '0', 2),
('Both procedural and OOP are supported in Java', '0', 3),
('Java supports only procedural approach towards programming', '0', 3),
('Java supports only OOP approach', '1', 3),
('None of the above', '0', 3),
('Method Invocating','0', 4),
('Method Overriding','0',4),
('Method Labeling','0',4),
('Method Overloading','1',4),
('boolean','0', 5),
('void','0', 5),
('public','0', 5),
('Button','1', 5);
