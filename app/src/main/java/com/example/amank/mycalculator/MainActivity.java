package com.example.amank.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button Addition;
    private Button Subtraction;
    private Button Division;
    private Button Multiplication;
    private TextView Result;
    private Button Clear;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        Addition = (Button) findViewById(R.id.Addition);
        Subtraction = (Button) findViewById(R.id.Subtraction);
        Division = (Button) findViewById(R.id.Division);
        Multiplication = (Button) findViewById(R.id.Multiplication);
        Clear = (Button) findViewById(R.id.Clear);

        Result = (TextView) findViewById(R.id.Result);

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0))
                {
                    Double op1 = Double.parseDouble(operand1.getText().toString());
                    Double op2 = Double.parseDouble(operand2.getText().toString());
                    Double result = op1 + op2;
                    Result.setText(Double.toString(result));
                }else{
                    Toast.makeText(MainActivity.this,"Please enter the operand fields",Toast.LENGTH_LONG).show();
                }

            }
        });

        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                    Double op1 = Double.parseDouble(operand1.getText().toString());
                    Double op2 = Double.parseDouble(operand2.getText().toString());
                    Double result = op1 - op2;
                    Result.setText(Double.toString(result));
                }else {
                    Toast.makeText(MainActivity.this, "Please enter the operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                    Double op1 = Double.parseDouble(operand1.getText().toString());
                    Double op2 = Double.parseDouble(operand2.getText().toString());
                    Double result = op1 / op2;
                    Result.setText(Double.toString(result));
                }else {
                    Toast.makeText(MainActivity.this, "Please enter the operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                    Double op1 = Double.parseDouble(operand1.getText().toString());
                    Double op2 = Double.parseDouble(operand2.getText().toString());
                    Double result = op1 * op2;
                    Result.setText(Double.toString(result));

                }else {
                    Toast.makeText(MainActivity.this, "Please enter the operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand1.setText("");
                operand2.setText("");
                Result.setText("0.00");
                operand1.requestFocus();
            }
        });



//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
