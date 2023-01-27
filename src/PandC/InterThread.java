/*Write a java program that correctly implements the producer consumer program. */
package PandC;

class Q{
    int num;
    boolean valueSet=false;
    
       public synchronized void put(int num){
       while(valueSet){
        try{ wait();}catch(Exception e){}
       }
       System.out.println("put: "+num);
       this.num=num;
       valueSet=true;
       notify();

       }
       
       
       
       
      public synchronized  void get(){
      while(!valueSet){
      try{  wait();}catch(Exception e){}
       }
      System.out.println("get: "+num);
       valueSet=false;
       notify();
    }
}



class producer implements Runnable
{
  Q q;
  public producer(Q q)
  {
  this.q=q;
  Thread t=new Thread(this,"producer");
  t.start();
  
  }
  public void run()
  {
     int i=0;
     while(true)
     {
     q.put(i++);
     try{
     Thread.sleep(1000);
     }
     catch(Exception e){
     System.out.println(" ");
     }
    }
  }
}

class consumer implements Runnable{
  Q q;
  public consumer(Q q)
  {
  this.q=q;
  Thread t=new Thread(this,"consumer");
  t.start();

  }
  public void run()
  {
 
     while(true)
     {
     q.get();
     try{
     Thread.sleep(1000);
     }
     catch(Exception e){
     System.out.println(" ");
     }
    }
  }
}

public class InterThread{
    public static void main(String args[])
    {
        Q q=new Q();
        new producer(q);
        new consumer(q);
    }
}
