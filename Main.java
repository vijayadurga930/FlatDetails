package com.cg.frs.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.frs.dto.FlatOwner;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;

public class Main {
  
	public static void main(String[] args) {
		int choiceFlag=1;
		Scanner scanner=new Scanner(System.in);
		IFlatRegistrationService service= new FlatRegistrationServiceImpl();
         Map<Integer,FlatOwner> map= new HashMap<>();
         List<FlatRegistrationDTO> list=new ArrayList<>();
         FlatOwner owner= null;
         boolean choiceFlag1=false;
         FlatOwner ownerobj=new FlatOwner();
         do { 
        	 System.out.println("***welcome to the Flat Registration Details***");
        	 System.out.println("1.For registration\n 2.Flat details\n 3.display owner details ");
        	 int choice=scanner.nextInt();
        	 switch(choice) {
        	 case 1:{
        		 System.out.println("enter id ");
        		 OwnerId=scanner.nextInt();
        		 ownerobj.getOwnerId();
        	     System.out.println("enter name ");
        		 Ownername=scanner.nextLine();
        		 ownerobj.getOwnername();
        		 System.out.println("enter mobile number");
        		 Mobilenum=scanner.nextLine();
        		 ownerobj.getMobilenum();
        		 
        	 }
        	 
        	 
         }
	}

}
