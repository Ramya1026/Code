

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CalculateCyclePrice {

	 public static void main(String[] args) throws Exception {

	        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);// use blockingqaeue interface here and implement Arrayblockingqueue

	        CalculateComponent calculatecomponent = new CalculateComponent(queue);
	        ShowComponentParts showcomponentparts = new ShowComponentParts(queue);

	        new Thread(calculatecomponent).start();//start thread here
	        new Thread(showcomponentparts).start();

	        Thread.sleep(4000);
	    }
}


class CalculateComponent implements Runnable{

    protected BlockingQueue<String> queue = null;

    public CalculateComponent(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override  //here override run method//
    public void run() {
        try {
        	System.out.println("***************************************************");
        	System.out.println(" Calculate Cycle Price             ");
        	System.out.println("***************************************************");
        	System.out.println("                                                   ");
                Scanner input = new Scanner(System.in);
                System.out.print("Enter month of buying: ");
                String month = input.nextLine();
         	System.out.println("                                                   ");
                System.out.println("Month::  "+month+"     ");
         	System.out.println("                                                   ");
        	System.out.println("********This month Cycle Component names and prices********");
        	System.out.println("                                                   ");
        	System.out.println("********INFO:::why we get month because Jan to  Nov one kind of Price and After Nov month Cycle price is chaning  ********");
        	System.out.println("                                                   ");
            
        	if(month.equals("december") || month.equals("dec") || month.equals("Dec") || month.equals("December")) {
        		
            queue.put("frame               -- 500");   
            Thread.sleep(1000);
            queue.put("handle bar th brakes-- 400");
            Thread.sleep(1000);
            queue.put("Seating             -- 300 ");
            Thread.sleep(1000);
            queue.put("Wheels              -- 400");
            Thread.sleep(1000);
            queue.put("Chain Assembly      -- 400");
            Thread.sleep(1000);                       //here used thread sleep method
            queue.put("wheel has spokes    -- 200" );  // here used blackingqueue put method
            Thread.sleep(1000);
            queue.put("Rim                 -- 200");
            Thread.sleep(1000);
            queue.put("tube                -- 300");
            Thread.sleep(1000);
            queue.put("tyre                -- 300");
            Thread.sleep(1000);
            
            int[] arr = new int[9]; 
            arr[0] = 500; arr[1] = 400; arr[2] = 300; arr[3] = 400; arr[4] = 400; arr[5] = 200; arr[6] = 200; arr[7] = 300; arr[8] = 300;
            int add = arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+arr[7]+arr[8];
            int thoudand = add*1000;
            
         	System.out.println("                                                   ");
         	System.out.println("********************************** ");
                System.out.println(" 1 Cycle Price This Month :: Rs "+add+"   ");
         	System.out.println("                                                   ");
                System.out.println( "1000 Cycle Price This Month :: Rs "+thoudand);            
         	System.out.println("                                                   ");

         	System.out.println("********************************** ");

        	}
        	else {
                queue.put("frame               -- 500");   
                Thread.sleep(1000);
                queue.put("handle bar th brakes-- 500");
                Thread.sleep(1000);
                queue.put("Seating             -- 500 ");
                Thread.sleep(1000);
                queue.put("Wheels              -- 500");
                Thread.sleep(1000);
                queue.put("Chain Assembly      -- 400");
                Thread.sleep(1000);
                queue.put("wheel has spokes    -- 400" );
                Thread.sleep(1000);
                queue.put("Rim                 -- 300");
                Thread.sleep(1000);
                queue.put("tube                -- 400");
                Thread.sleep(1000);
                queue.put("tyre                -- 500");
                Thread.sleep(1000);
                
                int[] arr = new int[9]; 
                arr[0] = 500; arr[1] = 500; arr[2] = 500; arr[3] = 500; arr[4] = 400; arr[5] = 400; arr[6] = 300; arr[7] = 400; arr[8] = 500;
                int add = arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+arr[7]+arr[8];
                int thoudand = add*1000;

             	System.out.println("                                                   ");
             	System.out.println("********************************** ");
             	 System.out.println(" 1 Cycle Price This Month :: Rs "+add+"   ");
              	System.out.println("                                                   ");
                 System.out.println( "1000 Cycle Price This Month :: Rs "+thoudand);         
                 System.out.println("                                                   ");

             	System.out.println("********************************** ");
        	}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



 class ShowComponentParts implements Runnable{

    protected BlockingQueue<String> queue = null;

    public ShowComponentParts(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
 
 
 
