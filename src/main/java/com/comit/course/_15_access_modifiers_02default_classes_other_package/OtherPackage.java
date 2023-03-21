package com.comit.course._15_access_modifiers_02default_classes_other_package;

import com.comit.course._15_access_modifiers_02default_classes_same_package.MyClass;

public class OtherPackage extends MyClass{

	public OtherPackage() {
		MyClass obj = new MyClass();
		
		obj.num = 4;
		obj.doSomething();
	}

}
