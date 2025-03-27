package Java_Generics.UniversityCourseManagement.course_types;

import Java_Generics.UniversityCourseManagement.evaluation_types.ExamBased;

public class ExamCourse extends CourseType<ExamBased> {// ExamCourse inheriting CourseType
    public ExamCourse(ExamBased evaluationType) {
        super(evaluationType);
    }
}