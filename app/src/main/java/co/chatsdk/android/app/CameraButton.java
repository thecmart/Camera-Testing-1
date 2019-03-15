package co.chatsdk.android.app;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CameraButton extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camerabutton);

        Button btnCamera = findViewById(R.id.btnCamera);
        ImageView imageView = findViewById(R.id.imageView);

        btnCamera.setOnClickListener(view -> {
            Intent i = new Intent(CameraButton.this, CameraActivity.class);
            startActivity(i);
        });
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
        imageView.setImageBitmap(bitmap);
    }

}
