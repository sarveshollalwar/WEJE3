import java.util.ArrayList;
class EvenOddNumbers
{
public static void main(String[] args)
{
int[] a={1,2,3,4,5,6,7,8,9};
ArrayList<Integer> al1 = new ArrayList<>();
ArrayList<Integer> al2 = new ArrayList<>();
 for(int i=0; i<a.length; i++)
 {
   if(a[i]%2==0)
   {
     al1.add(a[i]);
   }
   else
   {
     al2.add(a[i]);
   }
 }
 int total1=0;
 int total2=0;
 System.out.print("List of even no is: ");
 for(int no:al1)
 {
   total1=total1+no;
   System.out.print(no+" ");
 }
 System.out.println("\nNO of even nos in list: "+al1.size());
 System.out.println("Sum of even nos is: "+total1);
 System.out.println("..................................");
 System.out.print("List of odd nos is: ");
 for(int no:al2)
 {
   total2=total2+no;
   System.out.print(no+" ");
 }
 System.out.println("\nNo of odd nos are: "+al2.size());
 System.out.println("Sum of odd nos is: "+total2);
}
}

 