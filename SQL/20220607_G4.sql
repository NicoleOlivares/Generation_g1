CREATE TABLE dept_emp(
    emp_id int(11),
    dept_id varchar(4),
    from_date DATE,
    to_date DATE
);

-- FOREING KEY
ALTER TABLE salaries
ADD CONSTRAINT FK_emp_id -- asignar nombre a la relacion
FOREIGN KEY (emp_id) REFERENCES employees(id)
;

