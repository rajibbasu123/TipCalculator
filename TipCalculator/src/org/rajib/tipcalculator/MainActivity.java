package org.rajib.tipcalculator;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
        public String totalAmt;
        //public EditText etTipAmt;
        public double lastSelectedPercent;
        public TextView tvTipAmt;
        public String tipAmt;
        Button calculateTen;
        
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // etTipAmt = (EditText) findViewById(R.id.etTipAmt);
        tvTipAmt = (TextView) findViewById(R.id.displayTipAmount);

        calculateTen=(Button) findViewById(R.id.calculateTen);
        calculateTen.setOnClickListener((OnClickListener) this);
    }
    
    public void calculateTen(View v){
            if(null != totalAmt && !"".equals(totalAmt.trim())){
                    //etTipAmt.setText(calculateTip(10));
                    tipAmt = calculateTip(10);
                    lastSelectedPercent = 10;
                    tvTipAmt.setText(tipAmt);
            }
            
    }
    


        public void calculateFifteen(View v){
            if(null != totalAmt && !"".equals(totalAmt.trim())){
                    tipAmt = calculateTip(15);
                    //etTipAmt.setText(calculateTip(15));
                    lastSelectedPercent = 15;
                    tvTipAmt.setText(tipAmt);
            }
            
    }
    
    public void calculateTwenty(View v){
            if(null != totalAmt && !"".equals(totalAmt.trim())){
                    tipAmt = calculateTip(20);
                    //etTipAmt.setText(calculateTip(20));
                    lastSelectedPercent = 20;
                    tvTipAmt.setText(tipAmt);
            }
            
    }
    

	private String calculateTip(double percent){
        Double totAmt = new Double(totalAmt);
        DecimalFormat twodps = new DecimalFormat("#.00");
            totAmt = Double.valueOf(twodps.format(totAmt * lastSelectedPercent/100));          
            return  totAmt.toString();
   }
    
}

