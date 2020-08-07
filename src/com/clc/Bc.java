package com.clc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bc {
	@Autowired
	private List<Question> q;
	
	public void returnArray() {
		for(int i = 0; i<q.size(); i ++) {
			System.out.println(q.get(i).getqId() + q.get(i).getQuestionAnswer().keySet() );
			for(int k=0; k< q.get(i).getB().size();k++) {
				//getQuestionAnswer().containsValue(answerString)
				boolean correctness = q.get(i).getQuestionAnswer().containsValue(q.get(i).getB().get(k).getAnswerString());
//				String correctness = 
				System.out.println( 
						"\tAnswer: " +
						q.get(i).getB().get(k).getAnswerString() + 
						" (submitted by: "  +
						q.get(i).getB().get(k).getSubmittedBy() +
						") - " + correctness );
			}
			
		}

	}

}
