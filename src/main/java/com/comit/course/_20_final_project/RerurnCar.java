package com.comit.course._20_final_project;

import java.sql.Date;

class returncar {

	
	int carid;
	int clntid;
	String clname;
	Date rentdate;
	Date returndate;
	
	returncar(){
	}  		
		 
	returncar(int carid, int clntid,  String clname, Date rentdate, Date returndate){			
		
				this.carid = carid;
				this.clntid = clntid;
				this.clname = clname;
				this.rentdate = rentdate;
				this.returndate = returndate;
	}
}
