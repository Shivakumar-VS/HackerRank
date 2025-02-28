--student analysis

select roll_number, name 
from student_information where roll_number in(select roll_number FROM examination_marks where subject_one+subject_two+subject_three < 100)


