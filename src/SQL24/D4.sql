USE Academy;

# 9. Вывести названия групп, которые относятся к факультету “Computer Science”
select `groups`.Name, faculties.Name from `groups`, `faculties`, `departments`
where departments.id_Faculties=faculties.id_Faculties and `groups`.id_Departments=departments.id_Departments
and faculties.Name='Computer Science';
# Вариант 2 (join)
select `groups`.Name, f.Name from `groups`
join departments d on `groups`.id_Departments = d.id_Departments
join faculties f on d.id_Faculties = f.id_Faculties
where f.Name='Computer Science';

# 10. Вывести названия групп 5-го курса, а также название факультетов, к которым они относятся.
select `groups`.Name, faculties.Name from `groups`, `faculties`, `departments`
where departments.id_Faculties=faculties.id_Faculties and `groups`.id_Departments=departments.id_Departments
and `groups`.Year='5';
# Вариант 2 (join)
select `groups`.Name, f.Name from `groups`
join departments d on `groups`.id_Departments = d.id_Departments
join faculties f on d.id_Faculties = f.id_Faculties
where `groups`.Year='5';