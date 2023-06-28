package domain;

public class User {
    private String userName;
    private String pwd;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserName() {
        return userName;
    }

    public String getPwd() {
        return pwd;
    }
}
