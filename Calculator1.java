import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator1 extends JFrame implements ActionListener
{
    JFrame f1;
    JTextField tf1;
    JPanel p1;
    Component comp[];
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
    double a,b,result,x;
    int n,f=1;
    static int operator=0,checker=0;
    
    public Calculator1()
    {
        f1 = new JFrame();
        f1.setTitle("Calculator");
        
        tf1 = new JTextField();
        tf1.setPreferredSize(new Dimension(20,35));
        tf1.setFont(tf1.getFont().deriveFont(20.0f));
        
     
        b1= new JButton("AC");
        b1.addActionListener(this);
        b1.setFont(b1.getFont().deriveFont(20.0f));
        b1.setBackground(Color.PINK);
        
        b2= new JButton("CE");
        b2.addActionListener(this);
        b2.setFont(b2.getFont().deriveFont(20.0f));
        b2.setBackground(Color.PINK);
        
        b3= new JButton("7");
        b3.addActionListener(this);
        
        b4= new JButton("8");
        b4.addActionListener(this);
        
        b5= new JButton("9");
        b5.addActionListener(this);
        
        b6= new JButton("/");
        b6.addActionListener(this);
        b6.setFont(b6.getFont().deriveFont(30.0f));
        
        b7= new JButton("4");
        b7.addActionListener(this);
        
        b8= new JButton("5");
        b8.addActionListener(this);
        
        b9= new JButton("6");
        b9.addActionListener(this);
        
        b10= new JButton("*");
        b10.addActionListener(this);
        b10.setFont(b10.getFont().deriveFont(30.0f));
        
        b11= new JButton("1");
        b11.addActionListener(this);
        
        b12= new JButton("2");
        b12.addActionListener(this);
        
        b13= new JButton("3");
        b13.addActionListener(this);
        
        b14= new JButton("-");
        b14.addActionListener(this);
        b14.setFont(b14.getFont().deriveFont(30.0f));
        
        b15= new JButton("0");
        b15.addActionListener(this);
        
        b16= new JButton(".");
        b16.addActionListener(this);
        b16.setFont(b16.getFont().deriveFont(20.0f));
        
        b17= new JButton("=");
        b17.addActionListener(this);
        b17.setFont(b17.getFont().deriveFont(30.0f));
        
        b18= new JButton("+");
        b18.addActionListener(this);
        b18.setFont(b18.getFont().deriveFont(30.0f));
        
        b19= new JButton("Sq");
        b19.addActionListener(this);
        b19.setFont(b19.getFont().deriveFont(15.0f));
        
        b20= new JButton("Cb");
        b20.addActionListener(this);
        b20.setFont(b20.getFont().deriveFont(15.0f));
        
        b21= new JButton("%");
        b21.addActionListener(this);
        b21.setFont(b21.getFont().deriveFont(20.0f));
        
        b22= new JButton("Fr");
        b22.addActionListener(this);
        b22.setFont(b22.getFont().deriveFont(15.0f));
        
        b23= new JButton("Delete");
        b23.addActionListener(this);
        b23.setFont(b23.getFont().deriveFont(12.0f));
        
        b24= new JButton("MR+");
        b24.addActionListener(this);
        b24.setFont(b24.getFont().deriveFont(15.0f));
        
        b25= new JButton("MR-");
        b25.addActionListener(this);
        b25.setFont(b25.getFont().deriveFont(15.0f));
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(5,5));
        p1.add(b2);
        p1.add(b1);
        p1.add(b23);
        p1.add(b24);
        p1.add(b25);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b18);
        p1.add(b21);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b10);
        p1.add(b19);
        p1.add(b11);
        p1.add(b12);
        p1.add(b13);
        p1.add(b14);
        p1.add(b20);
        p1.add(b15);
        p1.add(b16);
        p1.add(b17);
        p1.add(b6);
        p1.add(b22);
        
        comp = p1.getComponents();
        
        f1.setSize(400,500);
        f1.setLayout(new BorderLayout());
        f1.add(tf1,BorderLayout.NORTH);
        f1.add(p1,BorderLayout.CENTER);
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setLocation(450, 60);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args)
    {
       Calculator1 C = new Calculator1();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
         if(e.getSource()==b2 || e.getSource()==b1 )
         {
             for(int i=2;i<comp.length;i++)
             {
               comp[i].setEnabled(true);
             }
            f1.setTitle("Calculator");
            tf1.setText("");
            operator=0;
            a=0.0;
            b=0.0;
            result=0.0;
         }
         else if(e.getSource()==b3)
         {
            if(checker == 1)
            {
              tf1.setText("7");   
            }
            else
            {
              tf1.setText(tf1.getText()+"7");  
            }
            checker = 0;
         }
        
        else if(e.getSource()==b4)
        {
            if(checker == 1)
            {
              tf1.setText("8");   
            }
            else
            {
              tf1.setText(tf1.getText()+"8");  
            }
            checker = 0;
        }
        
        else if(e.getSource()==b5)
        {
            if(checker == 1)
            {
              tf1.setText("9");   
            }
            else
            {
              tf1.setText(tf1.getText()+"9");  
            }
            checker = 0;
        }
        
        else if(e.getSource()==b6)
        {
            if(tf1.getText().equals(""))
            {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                }    
            }
            else
            {
              a=Double.parseDouble(tf1.getText());
              operator=4;
              tf1.setText("");   
            }
        }
        
        else if(e.getSource()==b7)
        {
            if(checker == 1)
            {
              tf1.setText("4");   
            }
            else
            {
              tf1.setText(tf1.getText()+"4");  
            }
            checker = 0;
        }
        
        else if(e.getSource()==b8)
        {
            if(checker == 1)
            {
              tf1.setText("5");   
            }
            else
            {
              tf1.setText(tf1.getText()+"5");  
            }
            checker = 0;
        }
        
        else if(e.getSource()==b9)
        {
            if(checker == 1)
            {
              tf1.setText("6");   
            }
            else
            {
              tf1.setText(tf1.getText()+"6");  
            }
            checker = 0;
        }
        
        else if(e.getSource()==b10)
        {
            if(tf1.getText().equals(""))
            {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                }    
            }
            else
            {
              a=Double.parseDouble(tf1.getText());
              operator = 3;
              tf1.setText("");  
            }
        }
        
        else if(e.getSource()==b11)
        {
            if(checker == 1)
            {
              tf1.setText("1");   
            }
            else
            {
              tf1.setText(tf1.getText()+"1");  
            }
            checker = 0;
        }
        
        else if(e.getSource()==b12)
        {
            if(checker == 1)
            {
              tf1.setText("2");   
            }
            else
            {
              tf1.setText(tf1.getText()+"2");  
            }
            checker = 0;
        
        }
         
        else if(e.getSource()==b13)
        {
            if(checker == 1)
            {
              tf1.setText("3");   
            }
            else
            {
              tf1.setText(tf1.getText()+"3");  
            }
            checker = 0;
        
        }
         
        else if(e.getSource()==b14)
        {
            if(tf1.getText().equals(""))
            {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                }    
            }
            else
            {
               a=Double.parseDouble(tf1.getText());
               operator = 2;
               tf1.setText("");   
            }
        }
         
        else if(e.getSource()==b15)
        {
            if(checker == 1)
            {
              tf1.setText("0");   
            }
            else
            {
              tf1.setText(tf1.getText()+"0");  
            }
            checker = 0;
        
        }
         
        else if(e.getSource()==b16)
        {
            if(checker == 1)
            {
              tf1.setText(".");   
            }
            else
            {
              tf1.setText(tf1.getText()+".");  
            }
            checker = 0;
        
        }
        
        else if(e.getSource()==b18)
        {
           if(tf1.getText().equals(""))
           {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                }    
           }
           else
           {
             a=Double.parseDouble(tf1.getText());
             operator = 1;
             tf1.setText("");  
           }
        }
        
        else if(e.getSource()==b19)
        {
           if(tf1.getText().equals(""))
           {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                }    
           }
           else
           {
             a=Double.parseDouble(tf1.getText());
             operator = 6;   
           }
           
        }
        
        else if(e.getSource()==b20)
        {
           if(tf1.getText().equals(""))
           {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                }    
           }
           else
           {
             a=Double.parseDouble(tf1.getText());
             operator = 7;  
           }
           
        }
        
         else if(e.getSource()==b21)
         {
           if(tf1.getText().equals(""))
           {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                } 
                
           }
           else
           {
              a=Double.parseDouble(tf1.getText());
              operator = 5;
              tf1.setText("");  
           }
          
          }
         
         else if(e.getSource()==b22)
         {
           if(tf1.getText().equals(""))
           {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                }    
           }
           else
           {
             x=Double.parseDouble(tf1.getText());
            if(x>=17)
            {
             tf1.setText("Math Error...      Press CE/AC");
             f1.setTitle("Creation Design & Developed By - Rohit");
             for(int i=2;i<comp.length;i++)
             {
               comp[i].setEnabled(false);
             }
            }
            f=1;
            operator = 8;  
           }
           
        }
         
         else if(e.getSource()==b23)
         {
             if(checker == 1)
             {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                }     
             }
             else
             {
               String str = tf1.getText();
               tf1.setText("");
               for(int i=0;i<str.length()-1;i++)
               {
                 tf1.setText(tf1.getText()+str.charAt(i));
               }  
             }
             checker = 0;
         }
         
        else if(e.getSource()==b24)
         {
            if(!tf1.getText().equals(""))
            {
              if(checker == 1)
              {
                tf1.setText("+");   
              }
              else
              {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                }      
              }
             
            }
            else
            {
              tf1.setText("+");  
            }
            
            checker = 0;  
            
         }
        
         else if(e.getSource()==b25)
         {
            if(!tf1.getText().equals(""))
            {
              if(checker == 1)
              {
                tf1.setText("-");   
              }
              else
              {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                }      
              }
             
            }
            else
            {
              tf1.setText("-");  
            }
            
            checker = 0;  
          }
        
        else if(e.getSource()==b17)
        {
              if(tf1.getText().equals(""))
              {
                tf1.setText("Syntax Error...      Press CE/AC");
                f1.setTitle("Creation Design & Developed By - Rohit");
                for(int i=2;i<comp.length;i++)
                {
                  comp[i].setEnabled(false);
                }  
              }
              else
              {
                b=Double.parseDouble(tf1.getText());
                if(operator==0)
                {
                  tf1.setText(""+b);     
               }
               else
               {
                switch(operator)
                {
                
                 case 1: result=a+b;
                         break;
                    
                 case 2: result=a-b;
                         break;
                    
                 case 3: result=a*b;
                         break;
                    
                 case 4: result=a/b;
                         break;
                    
                 case 5: result=a*(b/100);
                         break;
                     
                 case 6: result=a*a;
                         break;
                     
                 case 7: result=a*a*a;
                         break;
                 case 8: for(n=1;n<=x;n++)
                         {
                           f=f*n;
                         }
                         result = f;
                         break;  
               }
               tf1.setText(String.valueOf(result)); 
               checker = 1;
                 
              }  
             }
        }
    }
}
