package practice1;

import java.util.*;

public class Caesarcipher2 {

	public static String print(String input,int key)
	{
		StringBuilder encrypt=new StringBuilder(input);
		String code= "abcdefghijklmnopqrstuvwxyz";
		String decode=code.substring(key)+code.substring(0,key);
		for(int i=0;i<encrypt.length();i++)
		{
			char currchar=encrypt.charAt(i);
			int idx=code.indexOf(currchar);
			if(idx!=-1)
			{
				char newchar=decode.charAt(idx);
				encrypt.setCharAt(i, newchar);
			}
		}
		return encrypt.toString();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc2.nextInt();
		String g=print(s,n);
		System.out.println(g);
	}
}
