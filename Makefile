User.class :  Parent.class Kid.class Task.class Allowance.class Message.class
	javac -g User.java
Parent.class: Parent.java Allowance.class
	javac -g Parent.java
Kid.class: Kid.java Allowance.class
	javac -g Kid.java
Task.class: Task.java 
	javac -g Task.java
Allowance.class: Allowance.java
	javac -g Allowance.java
Message.class: Message.java 
	javac -g Message.java

clean: 
	rm *.class

run: User.class
	java User
