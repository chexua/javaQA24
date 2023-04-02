USE Academy;

# 6. Вывести названия кафедр и названия групп, которые к ним относятся.
select departments.Name, `groups`.Name from departments, `groups`
where `groups`.id_Departments=departments.id_Departments;
# Вариант 2 (join)
 select departments.Name, g.Name from departments
 join `groups` g on departments.id_Departments=g.id_Departments;

# 7. Вывести названия дисциплин, которые читает преподаватель “Samantha Adams”.
select subjects.Name, teachers.Name, teachers.Surname from subjects, `teachers`, `lectures`
where teachers.id_Teachers=lectures.Id_Teachers and subjects.Id_Subjects=lectures.Id_Subjects
and teachers.Name='Samantha' and teachers.Surname='Adams';
# Вариант 2 (join)
select s.Name, teachers.Name, teachers.Surname from `teachers`
join lectures l on teachers.id_Teachers = l.Id_Teachers
join subjects s on l.Id_Subjects = s.Id_Subjects
where teachers.Name='Samantha' and teachers.Surname='Adams';


