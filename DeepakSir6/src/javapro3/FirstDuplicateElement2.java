import java.util.HashSet;
class FirstDuplicateElement2
{
public static void main(String[] args)
{
int temp=-1;
int[] a= {10,20,30,40,10,20};
HashSet<Integer> hs = new HashSet<>();
for(int i=a.length-1; i>=0; i--)
{
  if(hs.contains(a[i]))
  {
    temp=i;
  }
  else
  {
    hs.add(a[i]);
  }
}
 if(temp!=-1)
 {
   System.out.print("First duplicate element is: "+a[temp]);
 }
 else
 {
   System.out.println("No duplicate element is found");
 }

}
}
 
