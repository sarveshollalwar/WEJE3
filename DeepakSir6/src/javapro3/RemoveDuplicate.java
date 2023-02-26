class RemoveDuplicate
{
 public static void main(String[] args)
 {
   int[] a= {10,10,20,30,30,40,50};
   
   int[] temp = new int[a.length];
   int j=0;
   
   for(int i=0; i<a.length-1; i++)
   {
      if(a[i]!=a[i+1])
      {
         temp[j]=a[i];
         j++;
      }
   }
  
   temp[j]=a[a.length-1];

 for(int no:temp)
 {
   System.out.print(no+", ");
 }
}
}

   