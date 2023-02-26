class FindMissingNumber2
{
public static void main(String[] args)
{
 int[] a={1,2,3,4,6};

 int xor1=a[0];
 fot(int i=1; i<a.length; i++)
 {
  xor1=xor1^a[i];
 }
 int xor2=1;
 for(int j=2; j<=(a.length+1); j++)
 {
  xor2=xor2^j;
 }
 System.out.println("missing element is: "+xor1^xor2);
}
}
