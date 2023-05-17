package onBoard.dataClasses;

import java.io.Serializable;

public class Class implements Serializable {
    public int classId;
    public String className;
    public String joinCode;
    public int proctorID;
    public String courseName;

    public Class(int classId, String className, String joinCode, int proctorID, String courseName) {
        this.classId = classId;
        this.className = className;
        this.joinCode = joinCode;
        this.proctorID = proctorID;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", joinCode='" + joinCode + '\'' +
                ", proctorID=" + proctorID +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
