//How to add text area program in java

import java.awt.*;

    public class text76
{
        text76(){
        Frame f= new Frame();
        TextArea area=new TextArea("Welcome to Technolamror"); 
        area.setBounds(10,30, 300,300);
        f.add(area); 
        f.setSize(400,400); 
        f.setLayout(null); f.setVisible(true);
}
        public static void main(String args[])
{
        new text76();
}
}