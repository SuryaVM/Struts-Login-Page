package com.surya.webapps;

public class webApp {
	private String username;
    private String password;

    public String execute() {
        if ("admin".equals(username) && "password".equals(password)) {
            return "success";
        } else {
            return "error";
        }
    }

//    public String getUsername() {
//        return username;
//    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public String getPassword() {
//        return password;
//    }

    public void setPassword(String password) {
        this.password = password;
    }
}
