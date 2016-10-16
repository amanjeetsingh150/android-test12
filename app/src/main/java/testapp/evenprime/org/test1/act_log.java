package testapp.evenprime.org.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class act_log extends AppCompatActivity {
    Button l_login;
    TextView t1,t2;
    String ett1,ett2,uid="test1",p="tester";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_log);
        OnClickButtonListener();
    }

    public  void OnClickButtonListener()
    {
        l_login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        l_login=(Button)findViewById(R.id.b1);
                        t1=(TextView)findViewById(R.id.et1);
                        t2=(TextView)findViewById(R.id.et2);
                        ett1=t1.getText().toString();
                        ett2=t2.getText().toString();
                        if(ett1.equals(uid)&&ett2.equals(p))
                        {
                            Intent intent= new Intent("testapp.evenprime.org.test1.in");
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(act_log.this,"wrong details",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
        );

    }
}
