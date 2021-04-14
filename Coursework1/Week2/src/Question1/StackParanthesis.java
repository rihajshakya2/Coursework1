package Question1;

public class StackParanthesis {
	public static void main(String[] args) {
		String data = "{()}[}";
		StackParanthesis a=new StackParanthesis();
		System.out.print(a.isBalanced(data));
	}

	boolean isBalanced(String data) {

		String openpara="[{(";
		String closepara="]})";
		int size= data.length();

		stack stack=new stack(size);

		for(int i=0; i<size;i++) { 
			char paranthesis = data.charAt(i);
			if(openpara.indexOf(paranthesis)!=-1) 
			{
				stack.push(paranthesis);
				System.out.println(data);
			}
			else
			{
				int index=closepara.indexOf(paranthesis);
				char opening=openpara.charAt(index);
				if(stack.pop()!=opening) {
					return false;
				}
			}
		}
 
		if(stack.peak()==-1) {
			return true;
		}
		else{return false;}


	}

}