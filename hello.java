import  java.applet.Applet ;
import java.awt.Graphics ;



public class hello extends Applet

     {
              String message


     public void init()

     
      {
       message = new String(" hello browser ") ;
       }



       public void  paint(Graphics myScreen)
       {
       myScreen.drawString(message,25,25) ;
       }
       

       public void  setMessage(String  newMessage) ;
       {

       message = new Message ;
       repaint() ;
       }
      


      }


