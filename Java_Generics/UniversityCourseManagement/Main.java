package Java_Generics.UniversityCourseManagement;

import Java_Generics.UniversityCourseManagement.course_types.*;
import Java_Generics.UniversityCourseManagement.evaluation_types.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {  //main function
        ExamBased examEval = new ExamBased(120);
        ExamCourse examCourseType = new ExamCourse(examEval);
        Course<ExamCourse> calculus = new Course<>("MATH101", examCourseType);

        AssignmentBased assignmentEval = new AssignmentBased(50);
        AssignmentCourse assignmentCourseType = new AssignmentCourse(assignmentEval);
        Course<AssignmentCourse> programming = new Course<>("CS101", assignmentCourseType);

        ArrayList<Course<?>> courses = new ArrayList<>();
        courses.add(calculus);
        courses.add(programming);

        for (Course<?> course : courses) {
            System.out.println(course);
        }
    }
}