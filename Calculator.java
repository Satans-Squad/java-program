import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Calculator implements ActionListener{
    JTextField f1,f2,f3;
    JButton add,sub,mul,div;
    public Calculator(){
        JFrame f=new JFrame("Calculator");
        f.setSize(800,800);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f1=new JTextField(20);
        f1.setBounds(20,20,200,30);
        f.add(f1);
        f2=new JTextField(20);
        f2.setBounds(260,20,200,30);
        f.add(f2);
        f3=new JTextField(20);
        f3.setBounds(500,20,200,30);
        f.add(f3);
        add=new JButton("+");
        add.setBounds(50,120,50,30);
        add.addActionListener(this);
        f.add(add);
        sub=new JButton("-");
        sub.setBounds(90,120,50,30);
        sub.addActionListener(this);
        f.add(sub);
        mul=new JButton("*");
        mul.setBounds(130,120,50,30);
        mul.addActionListener(this);
        f.add(mul);
        div=new JButton("/");
        div.setBounds(170,120,50,30);
        div.addActionListener(this);
        f.add(div);
        
        
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        int s1=Integer.parseInt(f1.getText());
        int s2=Integer.parseInt(f2.getText());
        String operator=e.getActionCommand();
        int result;
        switch (operator) {
            case "+":
                result=s1+s2;
                break;
            case "-":
                result=s1-s2;
                break;
            case "*":
                result=s1*s2;
                break;
            case "/":
                result=s1/s2;
                break;
        
           default:
                result=0;
                break;
        }   
        f3.setText(String.valueOf(result));
        }

    public static void main(String[] args){
        new Calculator();
        
    }
}