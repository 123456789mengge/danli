package 第八周实践作业;

public class Accumulator extends Thread {
      private int startNum;
      public static int sum;
      public Accumulator(int startNum){
    	  this.startNum = startNum;
      }
      public static synchronized void add(int num){
    	  sum +=num;
      }
      public void run(){
    	  int sum=0;
    	  for(int i=0;i<10;i++){
    		  sum += startNum+i;
    	  }
    	  add(sum);
      }
      public static void main(String[] args)throws Exception{
    	  Thread[] threadList =new Thread[10];
    	  for(int i=0;i<10;i++){
    		  threadList[i]=new Accumulator(10 * i+1);
    		  threadList[i].start();
    	  }
    	  for(int i=0;i<10;i++){
    		  threadList[i].join();
    	  }
    	  System.out.println("Sum is "+sum);
      }
}
