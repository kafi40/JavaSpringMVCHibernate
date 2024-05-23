-- Create employees table
CREATE TABLE employees (
  id SERIAL PRIMARY KEY,
  name VARCHAR(15),
  surname VARCHAR(25),
  department VARCHAR(20),
  salary INT
);

-- Insert data into employees table
INSERT INTO employees (name, surname, department, salary)
VALUES
    ('Zaur', 'Tregulov', 'IT', 500),
    ('Oleg', 'Ivanov', 'Sales', 700),
    ('Nina', 'Sidorova', 'HR', 850);