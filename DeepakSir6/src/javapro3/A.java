package javapro3;

 class A
{
	
  void showa()
   {
    System.out.println("1st line of command");
   }
}

class B extends A
{
   void showb()
    {
     System.out.println("second line of command");
    }
}
 class main{

     
	 public static void main(String[] args)
     {
        A ob1 = new A();
         ob1.showa();

        B ob2 = new B();
        ob2.showb();
        ob2.showa();
     }
}


