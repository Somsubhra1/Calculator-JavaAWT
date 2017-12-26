import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main implements ActionListener {

    Frame frm;
    Button btn1,btn2,btn3,btn4;
    TextField tf1,tf2;
    Label l;

    Main() {
        frm=new Frame();
        frm.setSize(400,300);
        frm.setLayout(null);
        frm.setVisible(true);
        frm.setTitle("Calculator t");

        l=new Label("Calculator");
        l.setBounds(165, 40, 150, 20);
        frm.add(l);

        tf1=new TextField();
        tf2=new TextField();
        tf1.setBounds(50, 70, 120, 20);
        tf2.setBounds(220, 70, 120, 20);
        frm.add(tf1);
        frm.add(tf2);


        btn1=new Button("+");
        btn2=new Button("-");
        btn3=new Button("*");
        btn4=new Button("/");
        btn1.setBounds(50, 150, 50, 50);
        btn2.setBounds(130, 150, 50, 50);
        btn3.setBounds(210, 150, 50, 50);
        btn4.setBounds(290, 150, 50, 50);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);
        frm.add(btn4);

        frm.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                frm.dispose();
            }
        });


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a=Integer.parseInt(tf1.getText());
        int b=Integer.parseInt(tf2.getText());
        int result=0;

        if(e.getSource()==btn1) {
            result=a+b;
        }
        else if(e.getSource()==btn2) {
            result=a-b;
        }
        else if(e.getSource()==btn3) {
            result=a*b;
        }
        else {
            result=a/b;
        }
        String r=Integer.toString(result);
        Label ans=new Label("Answer: "+r);
        ans.setBounds(50, 250, 200, 20);
        frm.add(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
