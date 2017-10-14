package br.com.phelipe.mobile.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


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



