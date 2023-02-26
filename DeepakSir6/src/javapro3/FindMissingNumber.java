class FindMissingNumber
{
public static void main(String[] args)
{
int[] a = {1,2,3,4,5,6,7,8,10};
int expected_length = a.length+1;
int total_sum = expected_length*(expected_length+1)/2;
System.out.println(total_sum);
int sum=0; 
 for(int i=0; i<a.length; i++)
 {
   sum=sum+a[i];
 }
System.out.println("Missing number is: "+(total_sum - sum));
}
}
