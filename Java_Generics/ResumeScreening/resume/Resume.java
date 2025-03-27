package Java_Generics.ResumeScreening.resume;

import Java_Generics.ResumeScreening.job_roles.JobRole;

public class Resume <T extends JobRole>{
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }
    public void setJobRole(T jobRole) {
        this.jobRole = jobRole;
    }

    public void screen(){
        System.out.println(jobRole);
    }
}