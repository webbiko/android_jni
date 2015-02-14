package com.web.android.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.web.android.R;
import com.web.android.jni.Arithmetic;

public class MainActivity extends Activity {

    private EditText mFirst;
    private EditText mSecond;
    private Button mAdd;
    private TextView mResultText;

    private Arithmetic arithmetic = new Arithmetic();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mFirst = (EditText) findViewById(R.id.firstValue);
        mSecond = (EditText) findViewById(R.id.secondValue);
        mResultText = (TextView) findViewById(R.id.resultText);
        mAdd = (Button) findViewById(R.id.add);
        
        setListeners();
    }

    private void setListeners() {
        this.mAdd.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                final int x = Integer.valueOf(mFirst.getText().toString());
                final int y = Integer.valueOf(mSecond.getText().toString());
                
                switch(v.getId()) {
                    case R.id.add: {
                        final double result = arithmetic.add(x, y);
                        mResultText.setText(String.valueOf(result));
                    } break;
                }
            }
        });
    }
}
