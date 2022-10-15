package house.management;

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*; 

public class main extends JFrame implements ActionListener {
   Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
main(){  
    super("House Management");  
    b1=new Button("1");
    b1.setBackground(Color.CYAN);
    b2=new Button("2");
    b2.setBackground(Color.CYAN);
    b3=new Button("3");
    b3.setBackground(Color.CYAN);
    b4=new Button("");
    b4.setBackground(Color.CYAN);
    b5=new Button("5");
    b5.setBackground(Color.CYAN);
    b6=new Button("6");
    b6.setBackground(Color.CYAN);
    b7=new Button("7");
    b7.setBackground(Color.CYAN);
    b8=new Button("8");
    b8.setBackground(Color.CYAN);
    b9=new Button("4");
    b9.setBackground(Color.CYAN);
 
    b1.setBounds(10,30,100,100);
    b2.setBounds(120,30,100,100);  
    b3.setBounds(230,30,100,100);  
    b4.setBounds(10,140,100,100);  
    b5.setBounds(120,140,100,100);  
    b6.setBounds(230,140,100,100);  
    b7.setBounds(10,250,100,100);  
    b8.setBounds(120,250,100,100);  
    b9.setBounds(230,250,100,100);
    
    add(b1);add(b2);add(b3);
    add(b4);add(b5);add(b6);
    add(b7);add(b8);add(b9);
      
    b1.addActionListener(this);  
    b2.addActionListener(this);  
    b3.addActionListener(this);  
    b4.addActionListener(this);  
    b5.addActionListener(this);  
    b6.addActionListener(this);  
    b7.addActionListener(this);  
    b8.addActionListener(this);  
    b9.addActionListener(this);  

    
    setSize(360,430);  
    setLayout(null);  
    setVisible(true);
    setLocation(667, 387); 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}  

public void actionPerformed(ActionEvent e){  
    if(e.getSource()==b1){  
        String label=b1.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b1.setLabel("");  
        }  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b1.setLabel("");  
        }  
    }  
    if(e.getSource()==b2){  
        String label=b2.getLabel();  
        if(b1.getLabel().equals("")){  
            b1.setLabel(label);  
            b2.setLabel("");  
        }  
        if(b3.getLabel().equals("")){  
            b3.setLabel(label);  
            b2.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b2.setLabel("");  
        }  
    }  
    if(e.getSource()==b3){  
        String label=b3.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b3.setLabel("");  
        }  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b3.setLabel("");  
        }  
    }  
    if(e.getSource()==b4){  
        String label=b4.getLabel();  
        if(b1.getLabel().equals("")){  
            b1.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b7.getLabel().equals("")){  
            b7.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b4.setLabel("");  
        }  
    }  
    if(e.getSource()==b5){  
        String label=b5.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b5.setLabel("");  
        }  
    }  
    if(e.getSource()==b6){  
        String label=b6.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b3.getLabel().equals("")){  
            b3.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b6.setLabel("");  
        }  
    }  
    if(e.getSource()==b7){  
        String label=b7.getLabel();  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b7.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b7.setLabel("");  
        }  
    }  
    if(e.getSource()==b8){  
        String label=b8.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b7.getLabel().equals("")){  
            b7.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b8.setLabel("");  
        }  
    }  
    if(e.getSource()==b9){  
        String label=b9.getLabel();  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b9.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b9.setLabel("");  
        }  
    }  
      
    //congrats code  
    if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()    
            .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")    
            &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()    
            .equals("8")&&b9.getLabel().equals("")){     
            
        login ln = new login();
        ln.setVisible(true);
        this.dispose();
            
    }    
}  
public static void main(String[] args) {  
    new main();  
}  
}  
    

