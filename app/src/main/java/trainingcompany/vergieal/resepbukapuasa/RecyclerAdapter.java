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
    String[] rsep = {"1.\t300 gr daging giling\n" +
            "2.\t250 ml air\n" +
            "3.\t1 batang daun bawang, diiris miring\n" +
            "4.\t1 buah bawang bombay, diiris panjang tebal\n" +
            "5.\t2 buah cabai hijau, dipotong bulat 1cm\n" +
            "6.\t2 sdm saus tiram\n" +
            "7.\t1 sdm saus tomat\n" +
            "8.\t1/2 sdm kecap manis\n" +
            "9.\t2 sdm margarin untuk menumis\n" +
            "10.\t2 sdt lada hitam\n" +
            "11.\t1/2 sdt gula pasir\n" +
            "12.\t1 sdt tepung sagu  ditambahkan 1 sdt air\n" +
            "13.\t1/4 sdt garam\n", "1.\t25 butir telur puyuh matang\n" +
            "2.\t100 gr jamur merang\n" +
            "3.\t100 gr jamur kuping\n" +
            "4.\t100 ml air\n" +
            "5.\t2 sdm saus tiram\n" +
            "6.\t3 sdm kecap manis\n" +
            "7.\t2 cm jahe, iris tipis\n" +
            "8.\t3 buah cabai merah, iris tipis\n" +
            "9.\t2 siung bawang putih, cincang\n" +
            "10.\t2 lembar daun jeruk, buang punggung daunnya\n" +
            "11.\t2 cm lengkuas, memarkan\n12.\t1 lembar daun salam\n" +
            "13.\t2 batang daun bawang\n" +
            "14.\t1 buah bawang bombay, cincang\n" +
            "15.\tMinyak secukupnya\n" +
            "16.\tGaram secukupnya\n" +
            "17.\tGula secukupnya\n" +
            "18.\tMerica bubuk secukupnya\n", "1.\t50 gr kenikir, rebus matang\n" +
            "2.\t50 gr daun singkong, rebus matang\n" +
            "3.\t50 gr daun papaya, rebus matang\n" +
            "4.\t50 gr kacang panjang, potong 3 cm, rebus matang\n" +
            "5.\t100 gr taoge, siangi seduh air panas\n" +
            "6.\t500 gr daun kemangi\n" +
            "7.\t200 gr kelapa setengah tua, kupas, parut kasar\n" +
            "8.\t2 sdm air asam\n" +
            "9.\t4 lembar daun jeruk\n" +
            "10.\tGula, garam secukupnya\n", "•\t175 gr salmon fillet, bagi menjadi 4 iri\n" +
            "•\t50 gr daun ketumbar segar, ambil daunnya saja\n" +
            "•\t125 ml minyak zaitun\n" +
            "•\t2 siung bawang putih\n" +
            "•\t1/2 lemon, peras airnya\n" +
            "•\tGaram secukupnya\n" +
            "•\tMerica bubuk secukupnya\n", "1.\t200 gram dada ayam, direbus, potong kotak / suwir\n" +
            "2.\t1,5 Liter kaldu ayam (Baca: Cara membuat kaldu ayam)\n" +
            "3.\t1 batang wortel, potong kotak\n" +
            "4.\t1 tangkai seledri, diikat\n" +
            "5.\t1 batang daun bawang, dipotong 1 cm\n" +
            "6.\t100 gram jagung manis pipil\n" +
            "7.\t100 gram kapri, siangi\n" +
            "8.\t2 sdt garam\n" +
            "9.\t1/4 sendok teh merica bubuk\n" +
            "10.\t1/4 sendok teh pala bubuk\n" +
            "11.\t1 buah tomat, potong-potong\n"};
    String[] detl = {"1.\tMasukkan daging giling dan garam  ke dalam wadah kemudian aduk rata. Bentuk bola-bola sesuai selera. Sisihkan.\n" +
            "2.\tPanaskan margarin diatas wajan dengan api sedang lalu masukkan bola daging tadi tumis hingga berubah warna.\n3.\tMasukkan cabai hijau dan bawang bombay tumis hingga harum.\n" +
            "4.\tTambahkan saus tomas, lada hitam, saus tiram, gula dan garam. Aduk rata\n" +
            "5.\tTuang air kedalam bola daging. Masak diatas api sedang higga bumbu meresap semua.\n" +
            "6.\tSetelah bumbu meresap masukkan larutan tepung sagu. Masak hingga mengental.\n" +
            "7.\tTerakhir masukkan daun bawang, aduk rata. Angkat dan bola daging lada hitam siap disajikan.\n", "1.\tPertama tumis bawang merah dan bawang putih hingga harum, lalu masukkan daun salam, lengkuas, daun jeruk, daun bawang dan jahe kemudian tumis hingga harum.\n" +
            "2.\tKedua masukkan jamur tiram  dan jamur kuping. Tambahkan air, suas triam, garam, dan merica. Aduk rata dan masak hingga jamur agak layu.\n" +
            "3.\tTerakhir masukkan telur puyuh dan masak hingga kuah menyusut dan bumbu meresap.\n", "1.\tPanaskan minyak ke dalam wajan. Tumis bumbu halus hingga harum. Masukkan kelapa parut dan jeruk, aduk rata. Masak hingga matang, Angkat.\n" +
            "2.\tAduk rata sayuran dengan kelapa berbumbu, sajikan.\n", "1.\tPanaskan oven dengan suhu kurang lebih 200 derajat celcius.\n" +
            "2.\tLetakkan irisan salmon diatas piring, lalu beri taburan garam dan merica secukupnya.\n" +
            "3.\tMasukkan daun ketumbar, bawang putih, minyak zaitun, merica dan garam kedalam blender. Haluskan.\n" +
            "4.\tLalu gunakan setengah dari bumbu yang diblender untuk melapisi irisan salmon.\n" +
            "5.\tMasukkan irisan salmon kedalam oven masak hingga matang atau selama 15-20 menit.\n" +
            "6.\tSajikan salmon diatas piring saji. Lalu tuangkan sisa bahan yang diblender sebagai toping.\n" +
            "7.\tSalmon panggang siap dinikmati\n", "1.\tRebus kaldu ayam, wortel, kapri, jagung manis, seledri, dan daun bawang sampai mendidih dan harum.\n" +
            "2.\tMasukkan garam, merica bubuk, dan pala bubuk. Masak sampai mendidih.\n" +
            "3.\tMasukkan tomat. Masak sampai layu.\n" +
            "4.\tSajikan panas-panas dengan nasi hangat ditambah Dadar Jagung (yummy!).\n" +
            "\n"};
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
            b.putString("resep", rsep[position]);
            b.putString("label", detl[position]);
            b.putString("name", "Resep " + name[position]);

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
