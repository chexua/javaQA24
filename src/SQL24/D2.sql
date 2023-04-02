USE Academy;

-- 1. Вывести таблицу кафедр, но расположить ее поля в обратном порядке.
SELECT Name, Financing, id_Departments from departments;
-- 6. Вывести названия кафедр, фонд финансирования которых меньше 11000 или больше 25000.
SELECT * from departments where Financing <11000 or Financing >25000;
-- 7. Вывести названия факультетов кроме факультета “Computer Science”.
SELECT * from faculties where Name <> 'Computer Science';
-- 8. Вывести фамилии и должности преподавателей, которые не являются профессорами.
SELECT Surname, Position from teachers where IsProfessor = 0;
-- 9. Вывести фамилии, должности, ставки и надбавки ассистентов, у которых надбавка в диапазоне от 160 до 550.
SELECT Surname, Position, Salary, Premium from teachers where IsAssistant and Premium between 160 and 550;
-- 10.Вывести фамилии и ставки ассистентов.
SELECT Surname, Salary from teachers where IsAssistant = 1;
-- 11. Вывести фамилии и должности преподавателей, которые были приняты на работу до 01.01.2000.
SELECT Surname, Position from teachers where EmploymentDate < '2000-01-01';
-- 13.Вывести фамилии ассистентов, имеющих ставки и надбавки) не более 1200.
SELECT Surname from teachers where IsAssistant = 1 and Salary + Premium < 1200;
-- 14.Вывести названия групп 5-го курса, имеющих рейтинг в диапазоне от 2 до 4.
SELECT Name from `groups` where Year =5 and Rating >=2 and Rating <= 4;
-- 15.Вывести фамилии ассистентов со ставкой меньше 550 или надбавкой меньше 200.
SELECT Surname, IsAssistant, Salary, Premium from teachers where (IsAssistant = 1 and Salary <550 or Premium <200)