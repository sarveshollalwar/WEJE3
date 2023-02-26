class FirstDuplicateElement
{
public static void main(String[] args)
{
int[] a= {10,20,30,40,50,40,60,20,10};
int temp=0;
for(int i=0; i<a.length-1; i++)
{
 for(int j=i+1; j<a.length; j++)
 {
   if(a[i]==a[j])
   {
     System.out.print("First duplicate element is: "+a[i]);
     temp=temp+1;
     break;
   }
 }
if(temp>0)
{
  break;
}
}

}
}


    