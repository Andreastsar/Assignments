package models;

public class Human {
    private String fName;
    private String lName;
    private String dob;
    private String mail;
    private String tel;

    public Human() {
    }

    public Human(String fName, String lName, String dob, String mail, String tel) {
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.mail = mail;
        this.tel = tel;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Human{");
        sb.append("fName='").append(fName).append('\'');
        sb.append(", lName='").append(lName).append('\'');
        sb.append(", dob='").append(dob).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", tel='").append(tel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
