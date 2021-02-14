package utilities;

import org.apache.log4j.Appender; 

import org.apache.log4j.FileAppender; 

import org.apache.log4j.Layout; 

import org.apache.log4j.Logger; 

import org.apache.log4j.SimpleLayout; 

 

public class Client { 

 

static Logger l = Logger.getLogger(Client.class.getName()); 

public static void main(String[] args) { 

Layout l1 = new SimpleLayout(); 

  Appender a; 

  try 

  { 

  a = new FileAppender(l1,"my.txt", false); 

  l.addAppender(a); 

  } 

  catch(Exception e) {}	   

 
  l.info("login with valid details");
  l.fatal("If resource limit is reached"); 
  l.error("log in with invalid details and system diplays get error message ");
  
  l.info("create account with valid details");
  l.fatal("If resource limit is reached"); 
  
  l.info("adding product to cart");
  l.fatal("If resource limit is reached"); 
  
  l.info("checking out the product");
  l.fatal("If resource limit is reached"); 
  
  l.info("logging out of the website");
  l.fatal("If resource limit is reached"); 
  
  System.out.println("Your logic executed successfully...."); 

 

} 

 

} 