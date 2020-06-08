/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitinglinesimulation;
import java.util.Scanner;

/**
 *
 * @author SalmaHany
 */
public class WaitingLineSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GuiOfModel x = new GuiOfModel();
        x.setVisible(true);
         System.out.println(" Welcome to WAITING LINE MODEL \n\n");
         float arrivalNumbers , servedNumber ;
         int i = 0 ; 
         Scanner scanf = new Scanner(System.in);
         float [][]Customers = new float[i][2];
         System.out.println("Please enter the number of arrival per hour :\n");
         arrivalNumbers= scanf.nextInt();
        System.out.println("Please enter the number of customers or unit served per hour :\n");
        servedNumber = scanf.nextInt();
        System.out.println("\nPlease Enter Case To Solve By :\n") ;
       
       
    Rules L = new Rules();
    L.avr_customers_of_system(arrivalNumbers, servedNumber);
     
    System.out.println("\n\nThe average number of customers or units in the system : \n%f\n\n"+L) ;
     Rules W = new Rules();
     W.spending_avr_time(arrivalNumbers,servedNumber);
    System.out.println("The average time a customer spends in the system : \nHours : %f  "+W) ;
    

    Rules Lq = new Rules();
    Lq.avr_customers_in_queue(arrivalNumbers,servedNumber);
    System.out.println("The average number of customers in the queue : \n%f\n\n" + Lq) ;
    Rules Wq = new Rules(); 
    Wq.spending_avr_time_queue(arrivalNumbers,servedNumber);
    System.out.println("hours" + Wq);
  
     Rules U_F = new Rules(); // it is called utilization factor or rho (p)
    U_F.utilization_factor(arrivalNumbers,servedNumber);
    System.out.println("Utilization factor : \n%f\n\n"+U_F) ;
     Rules P0 = new Rules(); 
    P0.idle_time(arrivalNumbers,servedNumber);
    System.out.println("The percent idle time, P0, or the probability no one is in the system : \n%f\n\n"+P0) ;
   System.out.println("How many probabilities that you want to test ? :\n") ;
    int num ;
    num = scanf.nextInt() ;
    float [][]customers = new float[num][2];
    Rules compare = new Rules();
    
    System.out.println("\n\nk          Pn>k= (arrivals_no/Served_no)^k+1") ;
    
    
    }   
}