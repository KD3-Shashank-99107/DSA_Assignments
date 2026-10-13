package Que2;

import java.util.Stack;

class PostFixEvaluation {
	
	public static int calculate(int op1, char opr, int op2) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		case '%': return op1 % op2;
		case '$': return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	
	public int postExpression(String s){
		int st[] = new int[10];
		int top = -1;
		
		for(int i = 0;i<s.length();i++) {
			char ele = s.charAt(i);
			
			if(Character.isDigit(ele)) {
				st[++top] = ele - '0';
			} else {
				int op2 = st[top--];
				int op1 = st[top--];
				
				st[++top] = calculate(op1 , ele , op2);
			}
		}
		return st[top];
	}
}

public class PostFixEvaluationMain {
	public static void main(String[] args) {
		String exp = "456*3/+9+7-";
		PostFixEvaluation pf = new PostFixEvaluation();
		System.out.println(pf.postExpression(exp));
	}
	
}


