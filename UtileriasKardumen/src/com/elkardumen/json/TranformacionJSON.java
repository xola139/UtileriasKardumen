package com.elkardumen.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class TranformacionJSON {
	
	
	public static void main(String ... arg){
		
		Object[] myObjectArray = new Object[2];
		
		List<Object> obj=new ArrayList<Object>();
		
		myObjectArray[0]=0;
		myObjectArray[1]="rgb(255, 255, 0)";
		
		obj.add(myObjectArray);
		obj.add(myObjectArray);
		
		System.out.println(new Gson().toJson(obj));
	}

}
