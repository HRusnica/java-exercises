

create table class(
	class_id serial,
	class_name VARCHAR(255) NOT NULL,
	skill1 VARCHAR(255) NOT NULL,
	skill1_introduced Boolean DEFAULT FALSE,
	skill1_description VARCHAR(255),
	skill2 VARCHAR(255) NOT NULL,
	skill2_introduced Boolean DEFAULT FALSE,
	skill2_description VARCHAR(255),
	skill3 VARCHAR(255) NOT NULL,
	skill3_introduced Boolean DEFAULT FALSE,
	skill3_description VARCHAR(255),
	skill4 VARCHAR(255) NOT NULL,
	skill4_introduced Boolean DEFAULT FALSE,
	skill4_description VARCHAR(255),
	skill5 VARCHAR(255),
	skill5_introduced Boolean DEFAULT FALSE,
	skill5_description VARCHAR(255),
	skill6 VARCHAR(255),
	skill6_introduced Boolean DEFAULT FALSE,
	skill6_description VARCHAR(255),
	skill7 VARCHAR(255),
	skill7_introduced Boolean DEFAULT FALSE,
	skill7_description VARCHAR(255),
	skill8 VARCHAR(255),
	skill8_introduced Boolean DEFAULT FALSE,
	skill8_description VARCHAR(255),
	skill9 VARCHAR(255),
	skill9_introduced Boolean DEFAULT FALSE,
	skill9_description VARCHAR(255),
	CONSTRAINT pk_class_id PRIMARY KEY (class_id)
);

create table student(
	student_id serial,
	class_id Int,
	first_name VARCHAR(255),
	last_name VARCHAR(255),
	skill1_accomplished Boolean DEFAULT FALSE,
	skill2_accomplished Boolean DEFAULT FALSE,
	skill3_accomplished Boolean DEFAULT FALSE,
	skill4_accomplished Boolean DEFAULT FALSE,
	skill5_accomplished Boolean DEFAULT FALSE,
	skill6_accomplished Boolean DEFAULT FALSE,
	skill7_accomplished Boolean DEFAULT FALSE,
	skill8_accomplished Boolean DEFAULT FALSE,
	skill9_accomplished Boolean DEFAULT FALSE,
	CONSTRAINT pk_student_id PRIMARY KEY (student_id),
	CONSTRAINT fk_class_class_id FOREIGN KEY (class_id) REFERENCES class(class_id)
);

INSERT INTO class (class_name, skill1, skill1_description, skill2, skill2_description, skill3, skill3_description, skill4, skill4_description, skill5,
skill5_description, skill6, skill6_description, skill7, skill7_description, skill8, skill8_description, skill9, skill9_description) VALUES
('Water Acclimation', 'Submerge', 'bob independently', 'Front glide', 'assisted, to wall, 5ft', 'Water exit', 'independently', 'Jump, push, turn, grab', 'assisted', 
'Back float', 'assited, 10 secs, recover independently', 'Roll', 'assisted', 'Front float', 'assisted, 10 secs, recover independently',
'Back glide', 'assisted at wall, 5 ft', 'Swim, float, swim', 'assited, 10 ft');

INSERT INTO student (class_id, first_name, last_name) VALUES (1, 'Suzy', 'Q');

INSERT INTO student (class_id, first_name, last_name) VALUES (1, 'Freddie', 'Reddie');

INSERT INTO student (class_id, first_name, last_name) VALUES (1, 'Jeff', 'Ray');

INSERT INTO student (class_id, first_name, last_name) VALUES (1, 'Ben', 'Dover');

INSERT INTO student (class_id, first_name, last_name) VALUES (1, 'Summer', 'Sanders');

