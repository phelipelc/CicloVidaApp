package br.com.phelipe.mobile.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btnfechar = (Button) findViewById(R.id.buttonFechar);

        btnfechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            finish();
            }
        });

        System.out.println( "Método onCreate() executado." );



    }

    @Override
     protected void onDestroy() {
                 // TODO Auto-generated method stub
                 super.onDestroy();

                 System.out.println( "Método onDestroy() executado." );
    }



    @Override
    protected void onPause() {
                 // TODO Auto-generated method stub
                 super.onPause();

                 System.out.println( "Método onPause() executado." );
    }
     @Override
     protected void onRestart() {
                // TODO Auto-generated method stub
                super.onRestart();

                System.out.println( "Método onRestart() executado." );
     }



    @Override
    protected void onResume() {
                // TODO Auto-generated method stub
                super.onResume();

               System.out.println( "Método onResume() executado." );
    }



    @Override
    protected void onStart() {
                // TODO Auto-generated method stub
                super.onStart();
                        System.out.println( "Método onStart() executado." );
    }

             @Override
     protected void onStop() {
                // TODO Auto-generated method stub
                super.onStop();

                System.out.println( "Método onStop() executado." );
          }

            }



