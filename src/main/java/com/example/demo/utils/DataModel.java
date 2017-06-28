package com.example.demo.utils;

import java.util.List;

public class DataModel<T> {

	private int total;
	private List<T> result;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	
}
