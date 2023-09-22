package com.example.laba2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {
    TextView myTextView;
    Button myButton;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button);
        imageButton = findViewById(R.id.imageButton);
        myButton.setOnClickListener(_MyButton);

    }
    View.OnClickListener _MyButton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            myTextView.setText("لن يتذكر الكثير");
            imageButton.setVisibility(View.VISIBLE);
        }
    };
}