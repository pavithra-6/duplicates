package sumave1;
import java.util.Scanner;
import java.io.*;
public class RemoveDuplicate {

	public static void main(String[] args)throws IOException { 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any word");
		String s=br.readLine();
		int l=s.length();
		char ch;
		String result="";
		for(int i=0;i<l;i++){
			ch=s.charAt(i);
			if(ch!=' ')
				result+=ch;
		s=s.replace(ch,' ');
	}
		System.out.println(result);
	}

}
