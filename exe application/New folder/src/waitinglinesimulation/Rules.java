/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitinglinesimulation;

import static java.lang.Math.pow;
import java.util.Scanner;
/**
/**
 *
 * @author user
 */

public class Rules {
    float servedNumber ; 
    float arrivalsNumber ; 
    int k ;
    int [][]Customers = new int[k][2];
    float L ; 
    float hours ;
    float W , Lq , Wq, P, P0, Pn;
    public Rules() {
    }
    public Rules(float servedNumber, float arrivalsNumber, int i, int L, float hours, float W, float Lq, float Wq, float P, float P0, float Pn) {
        this.servedNumber = servedNumber;
        this.arrivalsNumber = arrivalsNumber;
        this.k = i;
        this.Lq = Lq;
        this.hours = hours;
        this.W = W;
        this.Lq = Lq;
        this.Wq = Wq;
        this.P = P;
        this.P0 = P0;
        this.Pn = Pn;
        
        
      
       
    }
     float avr_customers_of_system (float arrivalsNumber , float servedNumber )
{
     L = arrivalsNumber/(servedNumber-arrivalsNumber) ;
    return L ;
}
float spending_avr_time (float arrivalsNumber , float servedNumber )
{
     W = 1/(servedNumber-arrivalsNumber) ;
    return W ;
}
float avr_customers_in_queue (float arrivalsNumber , float servedNumber )
{
    float serv_arriv = servedNumber - arrivalsNumber ;
    Lq = (arrivalsNumber*arrivalsNumber)/(servedNumber*serv_arriv) ;
    return Lq ;
}
float spending_avr_time_queue (float arrivalsNumber , float servedNumber )
{
     Wq = arrivalsNumber/(servedNumber*(servedNumber-arrivalsNumber)) ;
    return Wq ;
}

float utilization_factor (float arrivalsNumber , float servedNumber )
{
    P = arrivalsNumber/servedNumber ;
    return P ;
}
float idle_time (float arrivalsNumber , float servedNumber )
{
     P0 = 1-(arrivalsNumber/servedNumber) ;
    return P0 ;
}
float Customers_greaterthan_N (  float  L , float arrivalsNumber , float servedNumber , int Customers[][])
{
    for (k=0;k<L;k++)
    {
        System.out.println("Please Enter (%d) Customers Number "+k+1) ;
        Scanner input = new Scanner(System.in);
        k = input.nextInt() ; 
        Customers[k][1] = (int) pow((arrivalsNumber/servedNumber),(Customers[k][0]+1)) ;
    }
        return Pn;
}
  


}

