# Java-Practise

public class PermutationStrings {

	public static void StringPermutations(char[] inputs, int currentFocus)
	{
		if(currentFocus == inputs.length-1)
		{
			System.out.println(new String(inputs));
			return;
		}
		
		StringPermutations(inputs, currentFocus+1);
		
		//SWAP
		for(int i = currentFocus+1; i<inputs.length; i++)
		{
			char temp = inputs[currentFocus];
			inputs[currentFocus] = inputs[i];
			inputs[i] = temp;
			
			StringPermutations(inputs, currentFocus+1);
		}
	}
	public static void main(String args[])
	{
		String a = "abc";
		char c[] = new char[a.length()];
		for(int i=0; i<a.length();i++)
			c[i] = a.charAt(i);

		StringPermutations(c, 0);
	}
}
