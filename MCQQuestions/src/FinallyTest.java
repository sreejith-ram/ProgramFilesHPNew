public class FinallyTest
{
   public static void main(String args[])
   {
      try
      {
          if (args.length == 0) return;
          else throw new Exception("Some Exception");
      }
      catch(Exception e)
      {
          System.out.println("Exception in Main");
      }
      finally
      {
          System.out.println("The end");
      }
     // System.out.println(args[0]);
   }
}







//A.	If run with no arguments, the program will only print 'The end'
//C.	If run with one argument, the program will print 'Exception in Main' and 'The end'.