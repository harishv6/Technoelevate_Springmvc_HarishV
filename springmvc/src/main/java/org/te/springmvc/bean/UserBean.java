package org.te.springmvc.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserBean implements Serializable {
	
private String user;
	
	private int pwd;
	

}
