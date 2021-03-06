
package com.bridgelabz.ObjectOrientedPrograms.AddressBookApplication;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.util.Utility;

public class AddressBookMain {

	/**
	 * @param args
	 * @throws java.text.ParseException 
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws ParseException, java.text.ParseException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		AddressBookController ac = new AddressBookController();

		System.out.println("ADDRESSBOOK");
		boolean quit=false;
		while(quit==false)
		{
		 System.out.println("Opening File Menu:");
		 System.out.println("1.NEW \n2.OPEN \n3.QUIT");
		 System.out.println("Enter your choice:");
		 int choice=Utility.Int();
		 switch(choice)
		 {
		 case 1:ac.doNew();
		       boolean close=false;
		       while(close==false)
		     {
		       System.out.println("1.Add person \n2.Save & exit \n3.Close");
		       int ch=Utility.Int();
		       switch(ch)
		       {
		       case 1:ac.doAdd();;
	           break;
		              
		       case 2:ac.doSave(); 
		              close=true;
		              System.out.println("Saved and exit from address book");
		       break;
		       case 3:ac.doExit();
		              System.out.println("Address book closed");
		    	      close=true;
		       break;
		       default:close=true;
		       break;
		       }
		     }
		 break;
		 case 2:ac.doOpen();
		 boolean closed=false;
		 while(closed==false)
		 {
			 System.out.println("1.Add person \n2.Edit person \n3.Delete person \n4.Sort by name \n5.Sort by ZIP \n6.Save \n7.Close");
		     int ch=Utility.Int(); 
		     switch(ch)
		     {
		     case 1:ac.doAddagain();
		     break;
		     case 2:ac.doEdit();
		     System.out.println("Address book closed");
   	         closed=true;
		     break;
		     case 3:ac.doDelete();
		     System.out.println("Address book closed");
   	         closed=true;
		     break;
		     case 4:ac.doSortByName();
		     System.out.println("Address book closed");
   	         closed=true;
		     break;
		     case 5:ac.doSortByZip();
		     System.out.println("Address book closed");
   	         closed=true;
		     break;
		     case 6:ac.doSave();
		     System.out.println("Address book closed");
   	         closed=true;
		     break;
		     case 7:ac.doExit();
		     System.out.println("Address book closed");
   	         closed=true;
		     }
		 }
		 break;
		 case 3:quit=true;
		 break;
		 default:quit=true;
		         System.out.println("Invalid choice.......\n Program terminated");
	     break;       
		 }
		}
	}
		
		

	}


