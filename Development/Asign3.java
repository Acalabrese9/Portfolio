import java.util.*;
class Asign3 {
	public static void main(String [] args){
		int []run = new int[20];

		fill(run, 6);
		print(run);
	}
	public static void fill(int []a, int range)
	{
		Random r = new Random();

		for (int i = 0; i<a.length; i++)
			a[i]=r.nextInt(range) + 1;
	}
	public static void print(int []a)
	{
		for(int i = 0; i<a.length; i++)
		{
			if (isBeginning(a, i))
			System.out.print("(" + a[i] + " ");
			else if(isEnd(a, i))
			System.out.print(a[i] + ") ");
			else
			System.out.print(a[i] + " ");
		}		

			System.out.println();
	}
	public static boolean isBeginning(int []a, int pos)
	{
		if (pos == a.length -1 || a[pos] != a[pos+1])
			return false;
		if(pos == 0 || a[pos-1] != a[pos])
			return true;
		return false;
	}
	public static boolean isEnd(int []a, int pos)
	{
		if(pos == 0 || a[pos] != a[pos-1])
			return false;
		if(pos == a.length -1 || a[pos+1] != a[pos])
			return true;
		return false;
	}
}