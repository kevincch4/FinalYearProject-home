package fyp.kevin.comp.finalyearproject;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Kevin on 9/11/2017.
 */

public class choose_way extends Activity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_way);
        String Name = getIntent().getStringExtra("Name");
        TextView name =  findViewById(R.id.name);
        name.setText("Hello: "+Name);
    }



}


