class SelectionSortString2
{
public static void main(String[] args)
{
  String[] a= {"deepak","shanti","alisha","shreya","veronic"};
  int min;
  String temp;
  for(int i=0; i<a.length; i++)
  { 
    min=i;
    for(int j=i+1; j<a.length; j++)
    {
      if(a[j].compareTo(a[min])<0)
      {
        min=j;
      }
    }
    temp=a[i];
    a[i]=a[min];
    a[min]=temp;
  }

 for(int i=0; i<a.length; i++)
 {
   System.out.print(a[i]+" ");
 }

}
}
