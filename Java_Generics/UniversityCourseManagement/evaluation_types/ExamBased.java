package Java_Generics.UniversityCourseManagement.evaluation_types;

public class ExamBased implements EvaluationType { // implementing interface
    private int maxMarks;

    public ExamBased(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }
    public String toString() {
        return "ExamBased{maxMarks=" + maxMarks + "}";
    }
}