import java.io.*;
import java.io.Serializable;
import java.util.*;

public class User {
	protected String username;
	protected String password;
	Parent parent; 
	Kid kid;
	

public  User(String username,String password) {
	this.username = username;
	this.password = password;
	this.parent = new Parent();
	this.kid = new Kid();
	}

}