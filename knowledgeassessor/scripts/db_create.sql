#
#
DROP DATABASE IF EXISTS knowledgeassessor;
#
CREATE DATABASE knowledgeassessor;
#
USE knowledgeassessor;

DROP TABLE IF EXISTS exam;
DROP TABLE IF EXISTS questions;


CREATE TABLE exam(
exam_id INT(100) NOT NULL PRIMARY KEY,
exam_status CHAR(20) DEFAULT 'NOT_STARTED',
numberof_questions INT(100) NOT NULL DEFAULT '0',
correctly_answered INT(100) DEFAULT '0'
);

CREATE TABLE questions(
question_id INT(100) NOT NULL PRIMARY KEY,
exam_id INT(100) NOT NULL,
question VARCHAR(256) NOT NULL,
choice_one VARCHAR(100) NOT NULL,
choice_two VARCHAR(100) NOT NULL,
choice_three VARCHAR(100) NOT NULL,
choice_four VARCHAR(100) NOT NULL,
correct_choice INT(1)
);
