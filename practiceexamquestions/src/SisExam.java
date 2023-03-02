import java.util.Scanner;

public class SisExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=s.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("n----->"+n);
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        System.out.println("------------->array elementsare");
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]);
        }
        System.out.println("enter number of operations");
        int op=s.nextInt();
        System.out.println("op------------->"+op);
        for(int i=arr.length-1;i>=(op-1);i--)
        {
        	int a=arr[i]*2;
        	System.out.println("------------->"+a);
        	arr[i]=a;
        }
        System.out.println("array elements are\n");
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]);
        }
        System.out.println("sum is---->");
        for(int i=0;i<arr.length;i++)
        {
        	sum=sum+arr[i];
        }
        System.out.println("sum is--->"+sum);
	}

}
