package com.comit.course._20_final_project;

class Payment {

	int amount;
	int tax;
	int total;
	String name;
	Long crdno; 
	int exdate;
	int ccode;
	
				
	Payment(){
		}  		
			 
	Payment(int amount, int tax, int total, String name, Long crdno, int exdate, int ccode){			
			
					this.amount = amount;
					this.tax = tax;
					this.total = total;
					this.name = name;
					this.crdno = crdno;
					this.exdate = exdate;
					this.ccode = ccode;
}
}

