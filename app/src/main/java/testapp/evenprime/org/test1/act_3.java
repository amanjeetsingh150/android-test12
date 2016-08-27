package testapp.evenprime.org.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class act_3 extends AppCompatActivity {

    private static Button re;
    private static EditText et;
    private static Button sub;
    String fn;
    String ln;
    String ph;
    String pd;
    String eid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_3);
        OnClickButtonListener();
    }

    public void OnClickButtonListener()
    {
        re=(Button)findViewById(R.id.b1);
        re.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        et=(EditText)findViewById(R.id.et1);
                        et.setText("");
                        et=(EditText)findViewById(R.id.et2);
                        et.setText("");
                        et=(EditText)findViewById(R.id.et3);
                        et.setText("");
                        et=(EditText)findViewById(R.id.et4);
                        et.setText("");
                        et=(EditText)findViewById(R.id.et5);
                        et.setText("");
                    }
                }
        );
        sub=(Button)findViewById(R.id.b2);
        sub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        et=(EditText)findViewById(R.id.et1);
                        fn=et.getText().toString();
                        et=(EditText)findViewById(R.id.et2);
                        ln=et.getText().toString();
                        et=(EditText)findViewById(R.id.et3);
                        ph=et.getText().toString();
                        et=(EditText)findViewById(R.id.et4);
                        eid=et.getText().toString();
                        et=(EditText)findViewById(R.id.et5);
                        pd=et.getText().toString();
                    }
                }
        );
    }
}
