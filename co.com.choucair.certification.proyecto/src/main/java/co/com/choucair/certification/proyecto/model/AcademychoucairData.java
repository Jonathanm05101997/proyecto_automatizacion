package co.com.choucair.certification.proyecto.model;

public class AcademychoucairData {
    public AcademychoucairData(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    private String strUser;
    private String strPassword;
    private  String strCourse;

    public String getStrUser() {
        return strUser;
    }

    public void setStrUser(String strUser) {
        this.strUser = strUser;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrCourse() {
        return strCourse;
    }

    public void setStrCourse(String strCourse) {
        this.strCourse = strCourse;
    }
}
