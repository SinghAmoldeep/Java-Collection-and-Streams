
package Java_Generics.UniversityCourseManagement;


public class Course<T>{
    private String name;
    private T courseType;

    public Course(String name, T courseType) { // constructor
        this.name = name;
        this.courseType = courseType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getCourseType() {
        return courseType;
    }

    public void setCourseType(T courseType) {
        this.courseType = courseType;
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', courseType=" + courseType.toString() + "}";
    }
}
