package toong.vn.androidstringbuilder;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    StringBuilder a = new StringBuilder();
    StringBuilder a1 = new StringBuilder();
    StringBuilder a2 = new StringBuilder();
    StringBuilder a3 = new StringBuilder();
    StringBuilder a4 = new StringBuilder();
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AsyncTask<Void, Void, Void>(){

            @Override
            protected Void doInBackground(Void... voids) {
                for (i = 0; i < 100000; i++) {
                    String log = "TAG + dasdsadlkasl;dksa;ldkl;sak\n";
                    a.append(log);
                    a1.append(log);
                    a2.append(log);
                    a3.append(log);
                    a4.append(log);
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                textView = findViewById(R.id.text_content);
                textView.setText(a);
            }
        }.execute();



    }
}
