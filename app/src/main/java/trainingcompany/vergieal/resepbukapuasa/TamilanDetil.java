package trainingcompany.vergieal.resepbukapuasa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class TamilanDetil extends AppCompatActivity {

    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamilan_detil);
        Bundle b = getIntent().getExtras();
        gambar = (ImageView) findViewById(R.id.gambar);
        gambar.setImageResource(b.getInt("gambar"));
        setTitle(b.getString("label"));
    }
}
