package main.tempcon.com.clickbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(getBaseContext(), "Click", Toast.LENGTH_LONG).show();
            }
        });
    }

    //OnClick method is public and void always
    public void getMe(View view){



        Toast.makeText(getBaseContext(), "You click on first button",Toast.LENGTH_LONG).show();

    }


}
