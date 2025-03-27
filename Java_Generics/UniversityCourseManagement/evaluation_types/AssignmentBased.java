package Java_Generics.UniversityCourseManagement.evaluation_types;

public class AssignmentBased implements EvaluationType {  // implementing interface
    private int totalAssignments;

    public AssignmentBased(int totalAssignments) {
        this.totalAssignments = totalAssignments;
    }

    public int getTotalAssignments() {
        return totalAssignments;
    }

    public void setTotalAssignments(int totalAssignments) {
        this.totalAssignments = totalAssignments;
    }

    public String toString() {
        return "AssignmentBased{totalAssignments=" + totalAssignments + "}";
    }
}