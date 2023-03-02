import java.util.Scanner;

public class TestMainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=s.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[2];
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
        int k=s.nextInt();
        System.out.println("op------------->"+k);
        System.out.println("sum is---->");
        for(int i=0;i<arr.length;i++)
        {
        	sum=sum+arr[i];
        }
        System.out.println("sum is--->"+sum);
        if((sum/n)>3)
        {
        	for(int i=0;i<n;i++)
        	{
        		arr[i]=sum;
        	}
        	for(int i=0;i<n;i++)
        	{
        		System.out.print("elements------>"+arr[i]);
        	}
        }
        else
        {
        	for(int i=0;i<n;i++)
        	{
        		for(int j=i+1;j<n;j++)
        		{
        			if(((arr[i]+arr[j])/2)>3)
        			{
        				int l=0;
        				arr1[l]=arr[i];
        				arr1[l+1]=arr[j];
        				
        			}
        				
        		}
        	}
        }
        System.out.println("arr1 elements");
        for(int i=0;i<2;i++)
        {
        		System.out.println("arr1---->"+arr1[i]);
        }
        
	}

}
