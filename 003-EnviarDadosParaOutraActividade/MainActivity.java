package com.example.stuart.tutorial3;
 
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
 
import java.util.List;
 
public class MainActivity extends Activity implements View.OnClickListener {
 
    private double resultado;
    private String operacao;
 
    private TextView t1;
    private TextView t2;
    private Button soma_btn;
    private Button dividir_btn;
    private Button multi_btn;
    private Button sub_btn;
    private Button send_btn;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        resultado =0;
        operacao="";
 
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);
        soma_btn = (Button) findViewById(R.id.soma_btn);
        dividir_btn = (Button) findViewById(R.id.dividir_btn);
        multi_btn = (Button) findViewById(R.id.multi_btn);
        sub_btn =(Button) findViewById(R.id.sub_btn);
        send_btn = (Button) findViewById(R.id.send_btn);
 
        soma_btn.setOnClickListener(this);
        dividir_btn.setOnClickListener(this);
        multi_btn.setOnClickListener(this);
        sub_btn.setOnClickListener(this);
        send_btn.setOnClickListener(this);
    }
 
    public void onClick(View v){
        switch (v.getId()){
            case R.id.soma_btn:
                operacao="somar";
                break;
            case R.id.dividir_btn:
                operacao="dividir";
                break;
            case R.id.multi_btn:
                operacao="multiplicar";
                break;
            case R.id.sub_btn:
                operacao="subtrair";
                break;
            case R.id.send_btn:
                if(!operacao.equals("")){
                    resultado =verifica_str(operacao, t1,t2);
 
                    Intent i = new Intent(this,ResultActivity.class);
 
                    Bundle bundle = new Bundle();
                    bundle.putString("resultado", String.valueOf(resultado));
                    i.putExtras(bundle);
                    startActivity(i);
                    finish();
                }
                break;
        }
    }
 
  public double verifica_str(String aux, TextView t1, TextView t2){
    if(aux.equals("somar")){
        return Double.parseDouble(t1.getText().toString())+Double.parseDouble(t2.getText().toString());
    }else if(aux.equals("dividir")){
        return Double.parseDouble(t1.getText().toString())/Double.parseDouble(t2.getText().toString());
    }else if(aux.equals("multiplicar")){
        return Double.parseDouble(t1.getText().toString())*Double.parseDouble(t2.getText().toString());
    }else if(aux.equals("subtrair")){
        return Double.parseDouble(t1.getText().toString())-Double.parseDouble(t2.getText().toString());
    }
    return 0;
  }
  
}
