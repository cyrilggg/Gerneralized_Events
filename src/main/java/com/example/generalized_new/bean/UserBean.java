package com.example.generalized_new.bean;

public class UserBean {
    private int id;
    private String name;
    private String loginName;
    private String password;
    private String checkPass;

    public UserBean() {}

    public UserBean(String name, String loginName, String password, String checkPass) {
        this.name = name;
        this.password = password;
        this.checkPass = checkPass;
        this.loginName = loginName;
    }

    public String getloginName() {
        return loginName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCheckpass(){return checkPass;}
}
