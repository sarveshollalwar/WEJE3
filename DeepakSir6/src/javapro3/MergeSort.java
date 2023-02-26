class MergeSort
{
public static void main(String[] args)
{
int[] inputArray= {48,36,13,52,19,94,21};
MergeSort ms = new MergeSort();
ms.sort(inputArray);

for(int i: inputArray)
 {
  System.out.print(i+" ");
 }
}
int[] array;
int length;
int[] tempMergerArr;
public void divideArray(int li, int hi)
{
 if(li<hi)
 {
  int middle= li+(hi-li)/2;
  divideArray(li,middle);
  divideArray(middle+1,hi);
  mergeArray(li,middle,hi);
 }
}
public void mergeArray(int li,int middle,int hi)
{
  for(int i=li; i<=middle; i++)
  {
    tempMergerArr[i]=array[i];
  }
 int i=li;
 int j= middle+1;
 int k= li;
while(i<=middle && i<=hi)
{
  if(tempMergerArr[i]<tempMergerArr[j])
  {
    array[k]= tempMergerArr[i];
    i++;
  }
  else
  {
    array[k]= tempMergerArr[j];
    j++;
  }
 k++;
}
while(i<=middle)
 {
  array[k]= tempMergerArr[i];
  k++;
  i++;
 }

}
public void sort(int inputArray[])
{
 this.array=inputArray;
 this.length=inputArray.length;
 this.tempMergerArr= new int[length];
 divideArray(0,length-1);
}
}



  
   