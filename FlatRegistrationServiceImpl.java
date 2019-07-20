package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		return flat;
		
	}
	public int getAllOwnerIds(){
		 double OwnerId=0;
		 OwnerId=Math.random()*1000;
		 int id=(int) OwnerId;
		 return id;
	}

}
