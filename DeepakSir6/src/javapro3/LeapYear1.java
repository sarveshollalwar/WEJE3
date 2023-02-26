class LeapYear1
{
public static void main(String[] args)
{
int year = 2016 ;

if(year%4==0)
{
   if(year%100==0)
     {
        if (year%400==0)
         { 
           System.out.println("it is a leap year");
         }
        else
         {
           System.out.println("it is not a leap year");
         }

      }
      else
      {
        System.out.println("it is a leap year");
      }
}
else
{
System.out.println("it is not a leap year");
}

}
}




