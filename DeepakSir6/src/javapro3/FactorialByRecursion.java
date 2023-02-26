class FactorialByRecursion
{
static int fact=1;
public static void main(String[] args)
{
   int no=5;
   FactorialByRecursion ob = new FactorialByRecursion();
   ob.calFact(no);
   System.out.println("factorial of"+no+"is"+fact);
}
int calcFact(int no)
{
      if(no>1)
      {
         return(1);
       }
       else
       {  fact=fact*no;
           calcFact(no-1);
      }
}

}