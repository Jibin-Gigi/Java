import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TrafficLight extends JPanel implements ActionListener{
    private JRadioButton r1;
    private JRadioButton r2;
    private JRadioButton r3;

    private Color redColor;
    private Color greenColor;
    private Color yellowColor;

    TrafficLight(){
        setBounds(0,0,640,480);
     
        r1=new JRadioButton("Red");
        r2=new JRadioButton("Yellow");
        r3=new JRadioButton("Green");

        r1.setSelected(true);
        redColor=Color.red;
        yellowColor=getBackground();
        greenColor=getBackground();

        ButtonGroup gp=new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        gp.add(r3);

        add( r1);
        add(r2);
        add(r3);

        
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(150, 100, 50, 50);
        g.drawOval(150, 150, 50, 50);
        g.drawOval(150, 200, 50, 50);
        g.setColor(redColor);
        g.fillOval(150, 100, 50, 50);
        g.setColor(yellowColor);
        g.fillOval(150, 150, 50, 50);
        g.setColor(greenColor);
        g.fillOval(150, 200, 50, 50);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(r1.isSelected()==true){
            redColor=Color.red;
            yellowColor=getBackground();
            greenColor=getBackground();

        }
        else if(r2.isSelected()==true){
            redColor=getBackground();
            yellowColor=Color.yellow;
            greenColor=getBackground();
        }
        else if(r3.isSelected()){
            redColor=getBackground();
            yellowColor=getBackground();
            greenColor=Color.green;
        }
        repaint();
    }
}
class trafficLightDemo{
    public static void main (String[] args){
        JFrame f=new JFrame("Traffic Light");
        f.setVisible(true);
        f.setSize(640,480);
        f.setLayout(null);
        
        TrafficLight t=new TrafficLight();
        f.add(t);

    }
}
 
