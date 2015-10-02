/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon_4_challenge0;
public class Simon_4_Challenge0 {

   public static void main(String[] args) {
       for(int i = 0; i < 501; i++) {
           if(isDivisiblebyfive(i) & isDivisiblebyeleven(i)) {
               System.out.println(i + " = Animate this!");
               
           } else if(isDivisiblebythree(i) & isDivisiblebyeleven(i)) {
               System.out.println(i + " = Herr Direktor");
           }
           else if(isDivisiblebytwo(i) & isDivisiblebyeleven(i)) {
               System.out.println(i + " = Ninja");
           }
           else if(isDivisiblebytwo(i) & isDivisiblebythree(i) & isDivisiblebyfive(i)) {
               System.out.println(i + " = Team Building");
           }
           else if(isDivisiblebythree(i) & isDivisiblebyfive(i)) {
               System.out.println(i + " = Old School");
           }
           else if(isDivisiblebytwo(i) & isDivisiblebythree(i)) {
               System.out.println(i + " = Chismé"); 
           }
           else if(isDivisiblebyfive(i)) {
               System.out.println(i + " = Claughton");
           }
           else if(isDivisiblebythree(i)) {
               System.out.println(i + " = Vidal");
           }
           else if(isDivisiblebytwo(i)) {
               System.out.println(i + " = Davis");
           }
           else{
               System.out.println(i + " = is not divisble");
           }
                  
       }
        }
        static boolean isDivisiblebytwo(int somenumber) {
            return (somenumber % 2 == 0);
        }
        
        static boolean isDivisiblebythree(int somenumber) {
            return (somenumber % 3 == 0);
        }
        
        static boolean isDivisiblebyfive(int somenumber) {
            return (somenumber % 5 == 0);
        }
     
        static boolean isDivisiblebyeleven(int somenumber) {
            return (somenumber % 11 == 0);
            
        }
    
}
