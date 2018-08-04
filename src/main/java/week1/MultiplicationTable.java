package week1;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int b[] = {2};
		int j=0,s=0;
		for(int i=1;i<=10;i++)
			{
			int c= a[s]*b[j];
			System.out.println(i+ " *" + b[0] + "=" +c);
			s=s+1;
		}

	}

}
