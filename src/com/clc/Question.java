package com.clc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question {
	private String qId;
	HashMap<String, String> questionAnswer = new HashMap<>();
	
	private List<Ab> b;
	
	public List<Ab> getB() {
		return b;
	}
	public void setB(List<Ab> b) {
		this.b = b;
	}
	public String getqId() {
		return qId;
	}
	public void setqId(String qId) {
		this.qId = qId;
	}
	public Map<String, String> getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(HashMap<String, String> questionAnswer) {
		
		this.questionAnswer = questionAnswer;
	}
}
