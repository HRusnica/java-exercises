BEGIN TRANSACTION;

CREATE TABLE job_titles (
        job_id serial,
        title varchar(255) NOT NULL,
        CONSTRAINT pk_job_id PRIMARY KEY (job_id)
);

CREATE TABLE project (
        project_id serial,
        name varchar(255) NOT NULL,
        startdate date NOT NULL,
        CONSTRAINT pk_project_id PRIMARY KEY (project_id)
);

CREATE TABLE department (
        dept_id serial,
        name varchar(255) NOT NULL,
        CONSTRAINT pk_dept_id PRIMARY KEY (dept_id)
);

CREATE TABLE employees (
        employee_id serial,
        job_id int,
        dept_id int,
        last_name varchar(255) NOT NULL,
        first_name varchar(255) NOT NULL,
        gender char(1),
        birthday date,
        hireday date NOT NULL DEFAULT NOW(),
        CONSTRAINT pk_employee_id PRIMARY KEY (employee_id),
        CONSTRAINT fk_job_titles_job_id FOREIGN KEY (job_id) REFERENCES job_titles(job_id),
        CONSTRAINT fk_department_dept_id FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);
        
CREATE TABLE employee_project ( 
        employee_id int,
        project_id int,
        CONSTRAINT fk_employees_employee_id FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
        CONSTRAINT fk_project_project_id FOREIGN KEY (project_id) REFERENCES project(project_id)
);
        
              
        
INSERT INTO job_titles (title) VALUES ('pilot');
INSERT INTO job_titles (title) VALUES ('delivery boy');
INSERT INTO job_titles (title) VALUES ('accountant');
INSERT INTO job_titles (title) VALUES ('doctor');
INSERT INTO job_titles (title) VALUES ('scientist');
INSERT INTO job_titles (title) VALUES ('assistant');
INSERT INTO job_titles (title) VALUES ('janitor');
INSERT INTO project (name, startdate) VALUES ('candy hearts', '2002-02-14');
INSERT INTO project (name, startdate) VALUES ('smelloscope', '2004-11-05');
INSERT INTO project (name, startdate) VALUES ('X-mas gifts', '2006-12-25');
INSERT INTO project (name, startdate) VALUES ('pizza', '2005-01-01');
INSERT INTO department (name) VALUES ('Accounting');
INSERT INTO department (name) VALUES ('Management');
INSERT INTO department (name) VALUES ('Fulfillment');
INSERT INTO department (name) VALUES ('Medical');
INSERT INTO department (name) VALUES ('Maintenance');

INSERT INTO employees (job_id, dept_id, last_name, first_name, gender, birthday, hireday) 
VALUES (2, 3, 'Fry', 'Phillip', 'M', '1980-06-15', '3000-01-01');
INSERT INTO employees (job_id, dept_id, last_name, first_name, gender, birthday, hireday) 
VALUES (2, 3, 'Rodriguez', 'Bender', 'M', '2700-06-21', '2955-06-01');
INSERT INTO employees (job_id, dept_id, last_name, first_name, gender, birthday, hireday) 
VALUES (6, 2, 'Wong', 'Amy', 'W', '2990-08-02', '2999-01-08');
INSERT INTO employees (job_id, dept_id, last_name, first_name, gender, birthday, hireday) 
VALUES (1, 3, 'Leila', 'Turanga', 'W', '3980-05-15', '2998-08-01');
INSERT INTO employees (job_id, dept_id, last_name, first_name, gender, birthday, hireday) 
VALUES (7, 5, 'Scruffy', 'Scruffy', 'M', '2933-04-15', '2995-07-08');
INSERT INTO employees (job_id, dept_id, last_name, first_name, gender, birthday, hireday) 
VALUES (4, 4, 'Zoidberg', 'Doctor', 'M', '2960-03-15', '2972-04-02');
INSERT INTO employees (job_id, dept_id, last_name, first_name, gender, birthday, hireday) 
VALUES (5, 2, 'Farnsworth', 'Professor', 'M', '2900-02-15', '2972-01-01');
INSERT INTO employees (job_id, dept_id, last_name, first_name, gender, birthday, hireday) 
VALUES (3, 1, 'Conrad', 'Hermes', 'M', '2965-09-19', '2980-06-09');
INSERT INTO employees (job_id, dept_id, last_name, first_name, gender, birthday, hireday) 
VALUES (3, 1, 'Brannigan', 'Zap', 'M', '2980-03-15', '3004-04-02');
INSERT INTO employees (job_id, dept_id, last_name, first_name, gender, birthday, hireday) 
VALUES (7, 5, 'Kroker', 'Kif', 'M', '2955-02-15', '3004-01-01');
INSERT INTO employees (job_id, dept_id, last_name, first_name, gender, birthday, hireday) 
VALUES (4, 4, 'Nibbler', 'Captain', 'M', '1965-09-19', '3010-06-09');   
INSERT INTO employee_project (employee_id, project_id) VALUES (1, 1);
INSERT INTO employee_project (employee_id, project_id) VALUES (1, 4); 
INSERT INTO employee_project (employee_id, project_id) VALUES (1, 3); 
INSERT INTO employee_project (employee_id, project_id) VALUES (2, 1); 
INSERT INTO employee_project (employee_id, project_id) VALUES (2, 3); 
INSERT INTO employee_project (employee_id, project_id) VALUES (3, 1); 
INSERT INTO employee_project (employee_id, project_id) VALUES (3, 3); 
INSERT INTO employee_project (employee_id, project_id) VALUES (7, 2); 
INSERT INTO employee_project (employee_id, project_id) VALUES (7, 3); 
INSERT INTO employee_project (employee_id, project_id) VALUES (3, 2); 

COMMIT;
