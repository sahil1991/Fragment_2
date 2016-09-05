package com.example.lenovo.fragment_2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
EditText e1;
    TextView t1;
    Button b1;
    String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.enter);

                b1=(Button)findViewById(R.id.pass);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Fragment1 fr;


                        fr = new Fragment1();
                        FragmentManager fm = getFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        s1=e1.getText().toString();
                        Bundle bundle=new Bundle();
                        bundle.putString("key",s1);
                        fr.setArguments(bundle);
                        ft.replace(R.id.frag_container, fr);

                        ft.commit();








                    }
                });



    }







    }

