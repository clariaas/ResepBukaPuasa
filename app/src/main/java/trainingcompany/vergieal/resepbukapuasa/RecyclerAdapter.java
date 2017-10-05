package trainingcompany.vergieal.resepbukapuasa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vergie al on 10/5/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private final Context context;

    String[] name = {"Daging Lada Hitam", "Semur Telur Puyuh Jamur", "Urap Sayur", "Salmon Panggang Daun Ketumbar", "Sup Ayam"};
    String[] deskripsi = {"Siapkan daging cincang untuk bahan utama, lalu bahan untuk cara pembuatan dan resep komplitnya bisa Anda bisa simak Resep Bola Daging Lada Hitam disini. Kelezatan resep yang satu tidak diragukan lagi, sajikan saat buka puasa pastinya sangat cocok",
            "Jika semur ayam dan tahu sudah sering Anda sajikan, bagaimana jika mencoba memasak semur yang berda untuk menu buka Anda. Seperti Resep Semur Telur Puyuh Jamur yang enak satu ini",
            "Urap-urap adalah hidangan salad yang berupa sayuran yang direbus yang dicampur dengan kelapa parut yang sudah dibumbui sebagai pemberi citarasa. Masakan khas dari Jawa Timur ini sangat pas untuk anda yang menyukai masakan sayuran, berikut resep lengkapnya",
            "Salmon yang sangat baik untuk tubuh cocok untuk Anda yang sudah menjadi puasa seharian. Memasaknya gampang Anda hanya mempraktekkan resep berikut ini",
            "Sup sayur sudah biasa Anda pun bisa mencoba hidangan istimewa sup ayam ini untuk berbuka nanti. Simak resepnya"};
    Integer[] gambar = {R.drawable.daging, R.drawable.semur, R.drawable.urap, R.drawable.salmonpanggang, R.drawable.supayam};
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name
    LayoutInflater inflater;
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();

            Bundle b = new Bundle();


            b.putInt("gambar", gambar[position]);
            b.putString("label", "Resep " + name[position]);


            Intent intent = new Intent(context, TamilanDetil.class);
            intent.putExtras(b);
            context.startActivity(intent);


        }
    };

    public RecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.itemlist, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.tv2.setText(deskripsi[position]);
        holder.tv2.setOnClickListener(clickListener);


        holder.tv1.setTag(holder);
        holder.tv2.setTag(holder);


    }

    @Override
    public int getItemCount() {
        return name.length;
    }
}
