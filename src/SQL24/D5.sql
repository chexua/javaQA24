USE Academy;

# 1. Вывести количество преподавателей кафедры “Software Development”.
select count(*) as `teachers count` from teachers
join lectures l on teachers.id_Teachers = l.Id_Teachers
join groupslectures g on l.Id_Lectures = g.Id_Lectures
join `groups` g2 on g.id_Groups = g2.id_Groups
join departments d on g2.id_Departments = d.id_Departments
where d.Name='Software Development';

# 2. Вывести количество лекций, которые читает преподаватель “Dave McQueen”.
select count(*) as `lectures count` from lectures
join teachers t on lectures.Id_Teachers = t.id_Teachers
where t.Name='Dave' and t.Surname='McQueen';

# 3. Вывести количество занятий, проводимых в аудитории “D201”.
select count(*) as `subjects count` from subjects
join lectures l on subjects.Id_Subjects = l.Id_Subjects
where l.LectureRoom='D201';

