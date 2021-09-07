package Rj.Dj.Thread1;

import java.lang.*;

public class LambadaThroughThread
{
  public static void mian(String[] Args)
  {

   new Thread(new Runnable(){

     @Override
      public void run()
      {
              System.out.println("Hi Ranjan");
      }
    }).start();
  }
}