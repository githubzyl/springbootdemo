package com.example.demo.model;

import java.util.List;

public class FundValuationExtend extends FundValuation {

	private static final long serialVersionUID = -338764969668948983L;

	private List<FundValuationSubject> subjects;

	public List<FundValuationSubject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<FundValuationSubject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		String result = super.toString();
		return result + "\r\n" + "FundValuationExtend [subjects=" + subjects + "]";
	}
}
