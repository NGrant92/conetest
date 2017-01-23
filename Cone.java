import javax.swing.*;
import java.awt.*;
import java.lang.Math;

public class Cone extends JFrame
{
     private int ax; 
     private int ay;
     private int bx;
     private int by;
     private int cx;
     private int cy;
     private int d;
     private int e;
     private int f;
     private int h;
     private boolean isVisible;
     
    public static void main(String[] args)
    {
        new Canvas();
    }
    
    public void paint(Graphics g)
    {
        ax = 125;
        ay = 250;
        bx = 200;
        by = 100;
        cx = 275;
        cy = 250;
        d = ax;
        f = cx - ax;
        h = by/2;
        e = ay-h/2;
      
        g.setColor(Color.blue);
        //a:left b:top  c:right
        int[] x = {ax,bx,cx};
        int[] y = {ay,by,cy};
        g.fillPolygon(x,y,3);
        
        g.setColor(Color.green);
        //d:left x, e: top y, f: width, h: height  
        g.fillOval(d,e,f,h);
    }
    
    //public void makeVisible()
    //{
    //    isVisible = true;
    //    drawCone();
    //}
}
     






















   