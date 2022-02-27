import java.awt.*;
import java.awt.Graphics; //imports graphics packae
import java.awt.Color; //imports color package
import javax.swing.JFrame; //imports Java Frame package
public class Hangman {
  public void Main(int sum) { //Constrictor
   JFrame frame = new JFrame("GUI");
   frame.setTitle("GUI");
   frame.setSize(960, 960); //first is w, second is length
   frame.setVisible(true);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint (Graphics g, int sum) {
      if (sum>=10) { //Dissapointed Frown
         g.setColor(Color.LIGHT_GRAY);
         g.drawArc(120, 220, 380, 20, 0, 45);
         g.setColor(Color.BLUE);
         g.drawString("You FAILED!!! Snowman Is Dissapointed", 40, 370);
      }
      if (sum>=9){ //Nose
        g.setColor(Color.ORANGE);
        int x[]={488,475,400}; //X-coordinates of Triangle
        int y[]={175,200,200}; //Y-coordinates of Triangle
        g.drawPolygon(x,y,3);
      }
      if (sum>=8) { //Eyes
        g.setColor(Color.BLACK); //main
         g.drawOval(500, 150, 30, 30);
         g.setColor(Color.BLACK); //main
         g.drawOval(450, 150, 30, 30);
      }
      if (sum>=7) { //Hat
         g.setColor(Color.PINK); //Top Hat
         g.drawRect(455, 53, 75, 40);
        g.setColor(Color.PINK); //Bottom Hat
         g.drawRect(405, 93, 165, 30);
       }
       if (sum>=6) { //Arm2
         g.setColor(Color.RED);
          g.drawLine(800, 380, 850, 350);
       g.setColor(Color.RED);
        g.drawLine(800, 380, 575, 350);
       g.setColor(Color.RED);
        g.drawLine(800, 380, 875, 375);
       g.setColor(Color.RED);
        g.drawLine(800, 380, 825, 450);
       }
       if(sum>=5) { //Arm1
         g.setColor(Color.RED);
         g.drawLine(125, 250, 50, 220);
       g.setColor(Color.RED);
          g.drawLine(125, 250, 400, 350);
       g.setColor(Color.RED);
       g.drawLine(125, 250, 125, 195);
       g.setColor(Color.RED);
        g.drawLine(125, 250, 100, 305);
       }
       if(sum>=4) { //Buttons
         g.setColor(Color.GREEN);
      g.drawLine(495, 380, 495, 400);
      
       g.setColor(Color.GREEN);
       g.drawLine(495, 350, 495, 370);
      
       g.setColor(Color.GREEN);
       g.drawLine(495, 320, 495, 340);
       }  if(sum>=1) { //Top Circle
        
         g.setColor(Color.CYAN);
       g.drawOval(425, 125, 125, 125);
       }
       if(sum>=2) { //Middle Circle
         g.setColor(Color.BLUE);
        g.drawOval(400, 250, 175, 175);
       }
       if(sum>=3) { //Bottom Circle
         g.setColor(Color.MAGENTA);
        g.drawOval(375, 425, 225, 225); //(1 and 2 are for position) 1st is for x value, 2nd is for height, (3 and 4 are for length and width of object)3rd is for width, 4th is for length (y-axis goes from up to bottom) 
       }
    }
  }

  