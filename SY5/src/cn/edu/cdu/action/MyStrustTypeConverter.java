package cn.edu.cdu.action;

import java.util.Map;

import cn.edu.cdu.model.ISBN;

import org.apache.struts2.util.StrutsTypeConverter;

import cn.edu.cdu.model.ISBN;

public class MyStrustTypeConverter extends StrutsTypeConverter {


	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		ISBN isbn=new ISBN();
		String[] str=arg1[0].split("-");
		isbn.setCountry(str[0]+"-"+str[1]);
		isbn.setPress(str[2]);
		isbn.setId(str[3]);
		isbn.setCode(str[4]);
		return isbn;
	}
	

	public String convertToString(Map arg0, Object arg1) {
		ISBN isbn=(ISBN)arg1;
		return isbn.getCountry()+"-"+isbn.getPress()+"-"+isbn.getId()+"-"+isbn.getCode();
	}

}
