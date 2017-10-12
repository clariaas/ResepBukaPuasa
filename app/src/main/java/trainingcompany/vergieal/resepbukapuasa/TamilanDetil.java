package trainingcompany.vergieal.resepbukapuasa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class TamilanDetil extends AppCompatActivity {
    TextView tv3, tv4;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamilan_detil);
        Bundle b = getIntent().getExtras();
        tv3 = (TextView) findViewById(R.id.resep);
        tv4 = (TextView) findViewById(R.id.proced);
        tv3.setText(b.getString("resep"));
        tv4.setText(b.getString("label"));
        gambar = (ImageView) findViewById(R.id.gambar);
        gambar.setImageResource(b.getInt("gambar"));
        setTitle(b.getString("name"));
    }
}
