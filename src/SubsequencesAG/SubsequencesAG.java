package SubsequencesAG;

import java.util.*;

public class SubsequencesAG {
	
	public static int sequence(int[] string,int size)
	{
		int result =0;
		int a_count = 0;
		for(int i=0;i<size;i++)
		{
			if(string[i] == 'a')
			{
				a_count++;
			}
			else if(string[i] == 'g')
			{
				result += a_count;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] string = {'a','b','e','g','a','g'};
		int size = string.length;
		int result = sequence(string,size);
		System.out.println(result);

	}

}
