package com.toanhtran.crispycalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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

    private EditText operand1;//first input field
    private EditText operand2;//second input field
    private Button btnAdd;// Addition button that adds numbers
    private Button btnSub;// Subtraction button that subtracts numbers
    private Button btnDiv;// Division button that divides numbers
    private Button btnMulti;//Multiplication button that multiplies numbers
    private TextView txtResults;//Shows result of calculated numbers
    private Button btnClr;//Clear txt result field

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        txtResults = (TextView) findViewById(R.id.txtResult);
        btnClr = (Button) findViewById(R.id.btnClr);

        /**
         * When you click on the + btn this will add the numbers enter from operand1 and operand2
         * @returns value
         */
        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());//coverts number from field 1 to a string
                    double oper2 = Double.parseDouble(operand2.getText().toString());//converts number from field 2 to a string32

                    double theResult = oper1 + oper2;//add the # from oper1 to # from oper2
                    txtResults.setText(Double.toString(theResult));//Shows the results and converts value to a string
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }

            }

        });
        /**
         * When you click on the - btn this will subtract the numbers enter from operand1 and operand2
         * @returns value
         */
        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {

                    double oper1 = Double.parseDouble(operand1.getText().toString());//coverts number from field 1 to a string
                    double oper2 = Double.parseDouble(operand2.getText().toString());//converts number from field 2 to a string32

                    double theResult = oper1 - oper2;//Subtract the # from oper1 to # from oper2
                    txtResults.setText(Double.toString(theResult));//Shows the results and converts value to a string
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();

                }

            }

        });
        /**
         * When you click on the / btn this will divide the numbers enter from operand1 and operand2
         * @returns value
         */
        btnMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {

                        double oper1 = Double.parseDouble(operand1.getText().toString());//coverts number from field 1 to a string
                        double oper2 = Double.parseDouble(operand2.getText().toString());//converts number from field 2 to a string32

                        double theResult = oper1 * oper2;//mulitply the # from oper1 to # from oper2
                        txtResults.setText(Double.toString(theResult));//Shows the results and converts value to a string
                    } else {
                        Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                    }


            }

        });
        /**
         * When you click on the / btn this will divide the numbers enter from operand1 and operand2
         * @returns value
         */
        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                        double oper1 = Double.parseDouble(operand1.getText().toString());//coverts number from field 1 to a string
                        double oper2 = Double.parseDouble(operand2.getText().toString());//converts number from field 2 to a string32

                        double theResult = oper1 / oper2;//Divides the # from oper1 to # from oper2
                        txtResults.setText(Double.toString(theResult));//Shows the results and converts value to a string
                    } else {
                        Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                    }

            }

        });
        /**
         * Clear button reset both text fields to empty
         * brings cursor to first operant1 field
         */
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");//Sets operand field 1 to empty
                operand2.setText("");//Set s operand field 2 to empty
                txtResults.setText("0.00");//Reset txtResults field to 0.00
                operand1.requestFocus();//bring cursor focus to operand1
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
