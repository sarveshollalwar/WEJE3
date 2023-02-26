import java.util.Set;
import java.util.HashSet;
class SetInterface
{
public static void main (String[] args)
{
int[] a ={3,5,4,3,2,2,1};
Set<Integer> s = new HashSet<>();
 for(int no:a)
 {
   if(s.add(no)== false)
   {
     System.out.print(no+" ");
   }
 }

}
}

 