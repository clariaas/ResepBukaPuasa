package trainingcompany.vergieal.resepbukapuasa;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vergie al on 10/5/2017.
 */

class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView tv1, tv2; //deklarasi textview
    ImageView imageView;  //deklarasi imageview

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv1 = itemView.findViewById(R.id.daftar_judul);

        tv2 = itemView.findViewById(R.id.daftar_deskripsi);

    }
}
