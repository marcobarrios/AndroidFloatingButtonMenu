package com.example.marcobarrios.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FloatingActionsMenu menu = (FloatingActionsMenu) findViewById(R.id.multiple_actions);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        final FloatingActionButton actionA = (FloatingActionButton) findViewById(R.id.action_a);
        actionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(menu.isExpanded()){
                    menu.collapse();
                } else {
                    menu.expand();
                }
                Toast.makeText(getApplicationContext(), "Primera Accion", Toast.LENGTH_SHORT).show();
            }
        });
        final FloatingActionButton actionB = (FloatingActionButton) findViewById(R.id.action_b);
        actionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(menu.isExpanded()){
                    menu.collapse();
                } else {
                    menu.expand();
                }
                Toast.makeText(getApplicationContext(), "Segunda Accion", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
