package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btndot,btnadd,btnsub,btndiv,btnmulti,btnequal,btnsqrt,btnmod,btnc,btndel;
    TextView ans,newans,next;
    double var1,var2;
    boolean add,mul,sub,div,mod,equal,extra;
    String lastChar;
    public void setNull()
    {
        add = false;mul=false;sub=false;mod=false;div=false;
    }
    public boolean isChar(String str)
    {
        if(str=="*" || str=="+" || str=="-" || str=="/" ||str=="%")
            return true;
        else return false;
    }
    public void checker(String numeric)
    {
        String tmp=newans.getText().toString();
        var1 = Double.parseDouble(tmp.substring(0,tmp.length()-1));
        newans.setText(var1+numeric);
        setNull();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btndot = (Button) findViewById(R.id.btndot);
        btnmod = (Button)findViewById(R.id.btnmod);
        btnsqrt = (Button)findViewById(R.id.btnsqrt);
        btndel = (Button)findViewById(R.id.btnDEL);

        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnmulti = (Button) findViewById(R.id.btnmulti);
        btnequal = (Button) findViewById(R.id.btnequal);
        btndel = (Button)findViewById(R.id.btnDEL);
        btnc = (Button)findViewById(R.id.btnC);

        ans = (TextView) findViewById(R.id.Answer);
        newans = (TextView) findViewById(R.id.Previous);
        next = (TextView) findViewById(R.id.next);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal==true)
                {
                    ans.setText(null);
                    equal=false;
                }
                ans.setText(ans.getText()+"0");
                lastChar = "";
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal==true)
                {
                    ans.setText(null);
                    equal=false;
                }
                ans.setText(ans.getText()+"1");
                lastChar = "";
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal==true)
                {
                    ans.setText(null);
                    equal=false;
                }
                ans.setText(ans.getText() + "2");
                lastChar = "";
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal==true)
                {
                    ans.setText(null);
                    equal=false;
                }
                ans.setText(ans.getText() + "3");
                lastChar = "";
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal==true)
                {
                    ans.setText(null);
                    equal=false;
                }
                lastChar = "";
                ans.setText(ans.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal==true)
                {
                    ans.setText(null);
                    equal=false;
                }
                lastChar = "";
                ans.setText(ans.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal==true)
                {
                    ans.setText(null);
                    equal=false;
                }
                lastChar = "";
                ans.setText(ans.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal==true)
                {
                    ans.setText(null);
                    equal=false;
                }
                lastChar = "";
                ans.setText(ans.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal==true)
                {
                    ans.setText(null);
                    equal=false;
                }
                lastChar = "";
                ans.setText(ans.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal==true)
                {
                    ans.setText(null);
                    equal=false;
                }
                lastChar = "";
                ans.setText(ans.getText() + "9");
            }
        });
        btnsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sqt;
                sqt = Math.sqrt(Double.parseDouble(ans.getText().toString()));
                newans.setText(ans.getText());
                next.setText("sqrt("+ans.getText()+")");
                ans.setText(sqt+"");
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans.getText().toString().length() >0)
                {
                    String tmp = ans.getText().toString();
                    ans.setText(tmp.substring(0,tmp.length()-1));
                }
                else ans.setText(null);
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal==true)
                {
                    ans.setText(null);
                    equal=false;
                }
                if(ans.getText().toString().contains("."))
                {
                    ans.setText("0");
                }
                ans.setText(ans.getText()+".");
            }
        });
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText()+"");
                newans.setText(var1+"%"+"");
                mod =true;
                ans.setText(null);
                next.setText(null);
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isChar(lastChar))
                {
                    checker("-");
                    sub =true;
                }else
                {
                    var1 = Double.parseDouble(ans.getText() + "");
                    newans.setText(var1+"-"+"");
                    sub = true;
                    next.setText(null);
                    ans.setText(null);
                }
                lastChar = "-";
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isChar(lastChar))
                {
                    checker("+");
                    add =true;
                }else
                {
                    var1 = Double.parseDouble(ans.getText() + "");
                    newans.setText(var1+"+"+"");
                    add = true;
                    next.setText(null);
                    ans.setText(null);
                }
                lastChar = "+";
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isChar(lastChar))
                {
                    checker("*");
                    mul =true;
                }else
                {
                    var1 = Double.parseDouble(ans.getText() + "");
                    newans.setText(var1+"*"+"");
                    mul = true;
                    next.setText(null);
                    ans.setText(null);
                }
                lastChar = "*";
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isChar(lastChar))
                {
                    checker("/");
                    div =true;
                }else
                {
                    var1 = Double.parseDouble(ans.getText() + "");
                    newans.setText(var1+"/"+"");
                    div = true;
                    next.setText(null);
                    ans.setText(null);
                }
                lastChar = "/";
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newans.setText(null);
                ans.setText(null);
                next.setText(null);
                add=false;sub=false;div=false;
                mul=false; mod = false;
                lastChar = "";
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equal = true;
                lastChar = "";
                var2 = Double.parseDouble(ans.getText() + "");
                newans.setText(newans.getText());
                next.setText(var2+"");

                if (add == true) {
                    ans.setText(var1 + var2 + "");
                    add = false;
                } else if (sub == true) {
                    ans.setText(var1 - var2 + "");
                    sub = false;
                } else if (mul == true) {
                    ans.setText(var1 * var2 + "");
                    mul = false;
                } else if (div == true) {
                    if(var2!=0)
                    {
                        ans.setText(var1 / var2 + "");
                    }else{
                        ans.setText("Invalid");
                    }

                }
                else if(mod==true)
                {
                    ans.setText(var1%var2+"");
                    mod =false;
                }
                else
                {
                    ans.setText(null);
                }
            }
        });

    }
}
