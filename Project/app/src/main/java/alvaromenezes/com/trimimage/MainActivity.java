package alvaromenezes.com.trimimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Álvaro Menezes on 9/9/16.
 */
public class MainActivity extends AppCompatActivity {

    private boolean touch = false;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.img);
        imageView.setImageBitmap(getImageraw());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (touch) {
                    imageView.setImageBitmap(getImageraw());

                } else {

                    CropTransparent ct = new CropTransparent();
                    imageView.setImageBitmap(ct.crop(getImageraw()));
                }

                touch = !touch;
            }
        });
    }

    private Bitmap getImageraw() {
        return BitmapFactory.decodeResource(this.getResources(), R.drawable.pokeball);
    }

}
