/*************************************************************************************************************
 * 
 * purpose:LeapYear
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 16-05-17
 * 
 * **************************************************************************************************/
package com.bridgelabz.functionalpgms;
import com.bridgelabz.util.*;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter num");
	int num=sc.nextInt();
	boolean res=Utility.leap(num);
		System.out.println(res?"leap year":"not leap year");
    }
    }
