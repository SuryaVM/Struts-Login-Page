package com.surya.webapps;

import org.apache.struts2.ActionSupport;
import org.apache.struts2.interceptor.parameter.StrutsParameter;

public class webApp extends ActionSupport{
	
	private String username;
    private String password;
    @Override
    public String execute() {
//        System.out.println("Struts action triggered!");
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);
//        HttpParameters param = ActionContext.getContext().getParameters();
        //System.out.println(param);
        if ("admin".equals(username) && "password".equals(password)) {
            
            return "success";
        } else {
            
            return "error";
        }
        
    }

    public String getUsername() {
        return username;
    }
    @StrutsParameter
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    @StrutsParameter
    public void setPassword(String password) {
        this.password = password;
    }
}
