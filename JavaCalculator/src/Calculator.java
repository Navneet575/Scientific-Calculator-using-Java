/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Navneet
 */
import java.awt.*;  
import java.awt.event.*;  
class Calculator extends Frame{  
TextField a;
TextField b;
        boolean first = false;
        boolean second = false;
        String op = "";
        double op1;
        double op2;
        int opint;
        boolean  s= false;
        boolean deg = true;
        boolean inv = false;
Calculator(){
        Label la=new Label("Scientific Calculator Using Java AWT and Event Handling");  
        la.setBounds(30,40,450,20);  
        a=new TextField();
        a.setText("");  
        a.setBounds(90,70,220,20);
        
        Label lb=new Label("By :Navneet Kaur");  
        lb.setBounds(280,350,140,20);
        Label lc=new Label("Roll no: 18106045");  
        lc.setBounds(280,370,140,20);
        b=new TextField();
        b.setText("");  
        b.setBounds(90,90,220,20);  
        
        Button clear=new Button("clear");  
        clear.setBounds(80,300,70,30);  
        clear.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
            a.setText("");
            b.setText("");
            op = "";
            first = false;
            }
        });
        
        Button sign =new Button("+/-");  
        sign.setBounds(200,260,30,30);  
        sign.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(a.getText().equals("") || a.getText().equals("-") || a.getText().equals("+")){
                if(s == false){
                    a.setText("-");
                    s = true;
                }else if(s == true){
                    a.setText("+");
                    s = false;
                }
                }
            }
        });
        
        
        Button bdot=new Button(".");  
        bdot.setBounds(160,260,30,30);  
        bdot.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == true){
                    String ans = a.getText() +".";
                    a.setText(ans);
                }else{
                    String ans = a.getText() +".";
                    a.setText(ans);
                    b.setText(ans);
                }
            }
        });
        
        Button b0=new Button("0");  
        b0.setBounds(120,260,30,30);  
        b0.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == true){
                    String ans = a.getText() +"0";
                    a.setText(ans);
                }else{
                    String ans = a.getText() +"0";
                    a.setText(ans);
                    b.setText(ans);
                }
            }
        });
        
        Button b1=new Button("1");  
        b1.setBounds(120,220,30,30);  
        b1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == true){
                    String ans = a.getText() +"1";
                    a.setText(ans);
                }else{
                    String ans = a.getText() +"1";
                    a.setText(ans);
                    b.setText(ans);
                }
            }
        });
        
        Button b2=new Button("2");  
        b2.setBounds(160,220,30,30);  
        b2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                 if(first == true){
                    String ans = a.getText() +"2";
                    a.setText(ans);
                }else{
                    String ans = a.getText() +"2";
                    a.setText(ans);
                    b.setText(ans);
                }
            }
        });
        
        Button b3=new Button("3");  
        b3.setBounds(200,220,30,30);  
        b3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == true){
                    String ans = a.getText() +"3";
                    a.setText(ans);
                }else{
                    String ans = a.getText() +"3";
                    a.setText(ans);
                    b.setText(ans);
                }
            }
        });
        
        Button b4=new Button("4");  
        b4.setBounds(120,180,30,30);  
        b4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == true){
                    String ans = a.getText() +"4";
                    a.setText(ans);
                }else{
                    String ans = a.getText() +"4";
                    a.setText(ans);
                    b.setText(ans);
                }
            }
        });
        
        Button b5=new Button("5");  
        b5.setBounds(160,180,30,30);  
        b5.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == true){
                        String ans = a.getText() +"5";
                        a.setText(ans);
                }else{
                    String ans = a.getText() +"5";
                    a.setText(ans);
                    b.setText(ans);
                }
            }
        });
        
        Button b6=new Button("6");  
        b6.setBounds(200,180,30,30);  
        b6.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == true){
                        String ans = a.getText() +"6";
                        a.setText(ans);
                }else{
                    String ans = a.getText() +"6";
                    a.setText(ans);
                    b.setText(ans);
                }
            }
        });
        
        Button b7=new Button("7");  
        b7.setBounds(120,140,30,30);  
        b7.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               if(first == true){
                        String ans = a.getText() +"7";
                        a.setText(ans);
                }else{
                    String ans = a.getText() +"7";
                    a.setText(ans);
                    b.setText(ans);
                }
            }
        });
        
        Button b8=new Button("8");  
        b8.setBounds(160,140,30,30);  
        b8.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == true){
                        String ans = a.getText() +"8";
                        a.setText(ans);
                }else{
                    String ans = a.getText() +"8";
                    a.setText(ans);
                    b.setText(ans);
                }
            }
        });
        
        Button b9=new Button("9");  
        b9.setBounds(200,140,30,30);  
        b9.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                if(first == true){
                    String ans = a.getText() +"9";
                    a.setText(ans);
                }else{
                    String ans = a.getText() +"9";
                    a.setText(ans);
                    b.setText(ans);
                }         
            }
        });

        Button sum=new Button("+");  
        sum.setBounds(80,140,30,30);  
        sum.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    op1 = Double.parseDouble(a.getText());
                    b.setText(a.getText()+"+");
                    first = true;
                    op = "+";
                    a.setText("");
                }
            }
        });
        
        Button diff =new Button("-");  
        diff.setBounds(80,180,30,30);  
        diff.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    op1 = Double.parseDouble(a.getText());
                    b.setText(a.getText()+"-");
                    first = true;
                    op = "-";
                    a.setText("");
                }
            }
        });
        
        Button mul =new Button("*");  
        mul.setBounds(80,220,30,30);  
        mul.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    op1 = Double.parseDouble(a.getText());
                    b.setText(a.getText()+"*");
                    first = true;
                    op = "*";
                    a.setText("");
                }
            }
        });
        
        Button div =new Button("/");  
        div.setBounds(80,260,30,30);  
        div.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    op1 = Double.parseDouble(a.getText());
                    b.setText(a.getText()+"/");
                    first = true;
                    op = "/";
                    a.setText("");
                }
            }
        });

        
        //*************************************************************
        
        Button factorial=new Button("x!");  
        factorial.setBounds(240,140,30,30);  
        factorial.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    opint = Integer.parseInt(a.getText());
                    b.setText(a.getText()+"!");
                    first = true;
                    op = "x!";
                    a.setText("");
                }
            }
        });
        
        Button ln =new Button("ln");  
        ln.setBounds(240,180,30,30);  
        ln.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("ln(");
                    first = true;
                    op = "ln";
                    a.setText("");
                }
            }
        });
        
        Button log =new Button("log");  
        log.setBounds(240,220,30,30);  
        log.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("log(");
                    first = true;
                    op = "log";
                    a.setText("");
                }
            }
        });
        
        Button pow =new Button("x^y");  
        pow.setBounds(240,260,30,30);  
        pow.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    op1 = Double.parseDouble(a.getText());
                    b.setText(a.getText()+"^");
                    first = true;
                    op = "^";
                    a.setText("");
                }
            }
        });
        
        Button sqrt =new Button("sqrt");  
        sqrt.setBounds(240,300,30,30);  
        sqrt.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("sqrt(");
                    first = true;
                    op = "sqrt";
                    a.setText("");
                }
            }
        });
        
        Button lninv =new Button("e^x");  
        lninv.setBounds(240,180,30,30);  
        lninv.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("e^x(");
                    first = true;
                    op = "lninv";
                    a.setText("");
                }
            }
        });
        
        Button loginv =new Button("10^x");  
        loginv.setBounds(240,220,30,30);  
        loginv.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("10^(");
                    first = true;
                    op = "loginv";
                    a.setText("");
                }
            }
        });
        
        Button powinv =new Button("(x^y)I");  
        powinv.setBounds(240,260,30,30);  
        powinv.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    op1 = Double.parseDouble(a.getText());
                    b.setText(a.getText()+"root");
                    first = true;
                    op = "^inv";
                    a.setText("");
                }
            }
        });
        
        Button sqrtinv =new Button("sqr");  
        sqrtinv.setBounds(240,300,30,30);  
        sqrtinv.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("sqr(");
                    first = true;
                    op = "sqrtinv";
                    a.setText("");
                }
            }
        });
        
        
        //************************
        
        Button sin =new Button("sin");  
        sin.setBounds(280,140,30,30);  
        sin.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("sin(");
                    first = true;
                    op = "sin";
                    a.setText("");
                }
            }
        });
        
        Button cos =new Button("cos");  
        cos.setBounds(280,180,30,30);  
        cos.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("cos(");
                    first = true;
                    op = "cos";
                    a.setText("");
                }
            }
        });
        
        Button tan =new Button("tan");  
        tan.setBounds(280,220,30,30);  
        tan.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("tan(");
                    first = true;
                    op = "tan";
                    a.setText("");
                }
            }
        });
        
        Button sininv =new Button("sinI");  
        sininv.setBounds(280,140,30,30);  
        sininv.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("sinInv(");
                    first = true;
                    op = "sinI";
                    a.setText("");
                }
            }
        });
        
        Button cosinv =new Button("cosI");  
        cosinv.setBounds(280,180,30,30);  
        cosinv.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("cosInv(");
                    first = true;
                    op = "cosI";
                    a.setText("");
                }
            }
        });
        
        Button taninv =new Button("tanI");  
        taninv.setBounds(280,220,30,30);  
        taninv.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first == false){
                    b.setText("tanInv(");
                    first = true;
                    op = "tanI";
                    a.setText("");
                }
            }
        });
        //***************************************
        
        Button radian =new Button("rad");  
        radian.setBounds(280,260,30,30);
        
        Button degree =new Button("deg");  
        degree.setBounds(280,260,30,30);  
        degree.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                deg = true;
                radian.setVisible(true);
                degree.setVisible(false);
            }
        });
        
        radian.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                deg = false;
                degree.setVisible(true);
                radian.setVisible(false);
            }
        });
        
        Button inverse =new Button("inv");  
        inverse.setBounds(280,300,30,30);  
        inverse.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(inv == true){
                    sin.setVisible(true);
                    cos.setVisible(true);
                    tan.setVisible(true);
                    ln.setVisible(true);
                    log.setVisible(true);
                    pow.setVisible(true);
                    sqrt.setVisible(true);
                    inv = false;
                    sininv.setVisible(false);
                    cosinv.setVisible(false);
                    taninv.setVisible(false);
                    lninv.setVisible(false);
                    loginv.setVisible(false);
                    powinv.setVisible(false);
                    sqrtinv.setVisible(false);
                } 
                else if(inv == false){
                    sininv.setVisible(true);
                    cosinv.setVisible(true);
                    taninv.setVisible(true);
                    lninv.setVisible(true);
                    loginv.setVisible(true);
                    powinv.setVisible(true);
                    sqrtinv.setVisible(true);
                    inv = true;
                    sin.setVisible(false);
                    cos.setVisible(false);
                    tan.setVisible(false);
                    ln.setVisible(false);
                    log.setVisible(false);
                    pow.setVisible(false);
                    sqrt.setVisible(false);
                }
            }
        });
        
        Button equal=new Button("=");  
        equal.setBounds(160,300,70,30);  
        equal.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(first==true){
                    if(op=="+"){
                        op2 = Double.parseDouble(a.getText());
                        double ans = op1+op2;
                        b.setText(b.getText()+a.getText()+"="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op=="-"){
                        op2 = Double.parseDouble(a.getText());
                        double ans = op1-op2;
                        b.setText(b.getText()+a.getText()+"="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op=="*"){
                        op2 = Double.parseDouble(a.getText());
                        double ans = op1*op2;
                        b.setText(b.getText()+a.getText()+"="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op=="/"){
                        op2 = Double.parseDouble(a.getText());
                        double ans = op1/op2;
                        b.setText(b.getText()+a.getText()+"="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op=="x!"){
                        int ans = 1;
                        while(opint >= 1){
                            ans = ans * opint;
                            opint = opint-1;
                        }
                        b.setText(b.getText()+"="+Integer.toString(ans));
                        a.setText(Integer.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op == "ln"){
                        op1 = Double.parseDouble(a.getText());
                        double ans = Math.log(op1);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op == "log"){
                        op1 = Double.parseDouble(a.getText());
                        double ans = Math.log10(op1);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op=="^"){
                        op2 = Double.parseDouble(a.getText());
                        double ans = Math.pow(op1,op2);
                        b.setText(b.getText()+a.getText()+"="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op == "sqrt"){
                        op1 = Double.parseDouble(a.getText());
                        double ans = Math.sqrt(op1);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    //*********************
                    
                    if(op == "lninv"){
                        op1 = Double.parseDouble(a.getText());
                        double ans = Math.exp(op1);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op == "loginv"){
                        op1 = Double.parseDouble(a.getText());
                        double ans = Math.pow(10,op1);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op=="^inv"){
                        op2 = Double.parseDouble(a.getText());
                        double ans = Math.pow(op1,(1/op2));
                        b.setText(b.getText()+a.getText()+"="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op == "sqrtinv"){
                        op1 = Double.parseDouble(a.getText());
                        double ans = Math.pow(op1,2);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    //***************************************************
                    
                    if(op == "sin"){
                        op1 = Double.parseDouble(a.getText());
                        if(deg == false){
                           op1 = Math.toRadians(op1);
                        }
                        double ans = Math.sin(op1);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op == "cos"){
                        op1 = Double.parseDouble(a.getText());
                        if(deg == false){
                           op1 = Math.toRadians(op1);
                        }
                        double ans = Math.cos(op1);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op == "tan"){
                        op1 = Double.parseDouble(a.getText());
                        if(deg == false){
                           op1 = Math.toRadians(op1);
                        }
                        double ans = Math.tan(op1);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    
                    if(op == "sinI"){
                        op1 = Double.parseDouble(a.getText());
                        if(deg == false){
                           op1 = Math.toRadians(op1);
                        }
                        double ans = Math.asin(op1);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op == "cosI"){
                        op1 = Double.parseDouble(a.getText());
                        if(deg == false){
                           op1 = Math.toRadians(op1);
                        }
                        double ans = Math.acos(op1);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    if(op == "tanI"){
                        op1 = Double.parseDouble(a.getText());
                        if(deg == false){
                           op1 = Math.toRadians(op1);
                        }
                        double ans = Math.atan(op1);
                        b.setText(b.getText()+a.getText()+")="+ans);
                        a.setText(Double.toString(ans));
                        first = false;
                        op = "";
                    }
                    //********************************************8
                }
            }
        });

        add(la);
        add(lb);
        add(lc);
        add(b0); add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(bdot);add(equal);
        add(a);
        add(b);
        b.setEditable(false);
        add(sum);add(diff);add(mul);add(div);add(sign);
        add(factorial);add(pow);add(ln);add(log);add(pow);add(sqrt);
        add(lninv);add(loginv);add(powinv);add(sqrtinv);
        add(sin);add(cos);add(tan);add(degree);add(radian);add(inverse);
        add(sininv);add(cosinv);add(taninv);
        add(clear);
        setSize(400,400);  
        setLayout(null);  
        setVisible(true); 
        setTitle("Scientific Calculator");
        addWindowListener(new MyWindowAdapter());
}  
    public static void main(String args[]){  
        new Calculator();  
    }  
    class MyWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent we){
            System.exit(0); }
    }
}
