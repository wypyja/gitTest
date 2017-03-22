package cn.edu.cdu.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cdu.model.ISBN;

public class ConverterAction extends ActionSupport {
	private ISBN isbn;
	private ISBN isbn2;
	private ISBN isbn3;
	public ISBN getIsbn2() {
		return isbn2;
	}
	public void setIsbn2(ISBN isbn2) {
		this.isbn2 = isbn2;
		System.out.println("isbn2::"+isbn2.getCountry());
	}
	public ISBN getIsbn3() {
		return isbn3;
	}

	public void setIsbn3(ISBN isbn3) {
		this.isbn3 = isbn3;
	}

	public ISBN getIsbn() {
		return isbn;
	}

	public void setIsbn(ISBN isbn) {
		this.isbn = isbn;
	}
	
	public String execute(){
		
		return SUCCESS;
	}
	
}
