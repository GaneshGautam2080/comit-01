package com.comit.course._20_final_project;

import java.sql.Date;

class rent {

	int carid;
	int clntid;
	String clname;
	Date rentdate;
	Date returndate;
	int fee;

	rent(){
	}  		
		 
 rent(int carid, int clntid,  String clname, Date rentdate, Date returndate,	int fee){			
		
				this.carid = carid;
				this.clntid = clntid;
				this.clname = clname;
				this.rentdate = rentdate;
				this.returndate = returndate;
				this.fee = fee;
				}
}

