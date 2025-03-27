package Java_Generics.UniversityCourseManagement.course_types;

import Java_Generics.UniversityCourseManagement.evaluation_types.EvaluationType;

public abstract class CourseType<T extends EvaluationType> { // CourseType inheriting different classes implementing EvaluationType
    protected T evaluationType;

    public CourseType(T evaluationType) {
        this.evaluationType = evaluationType;
    }

    public T getEvaluationType() {
        return evaluationType;
    }

    @Override
    public String toString() {
        return "CourseType: " + getClass().getSimpleName() + ", Evaluation: " + evaluationType.toString();
    }
}