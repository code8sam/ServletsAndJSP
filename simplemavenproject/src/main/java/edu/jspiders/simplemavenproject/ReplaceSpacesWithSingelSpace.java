package edu.jspiders.simplemavenproject;

public class ReplaceSpacesWithSingelSpace
{
	public static void main(String[] args) 
	{
		String input = "  This       is    a      Class  ";
		
		
		String output = "";
		
//		output = input.replaceAll("\\s+"," ").trim();
		for (int i = 0; i < input.length(); i++) 
		{
			/*if(input.charAt(i) == ' ' && input.charAt(i+1) == ' ')
			{
				
			}
			else
			{
				output += input.charAt(i);
			}*/
			
			if(i < input.length()-1 && !(input.charAt(i) == ' ' && input.charAt(i+1) == ' '))
			{
				output += input.charAt(i);
			}
			
		}
		
		System.out.println(output);
	}
}
