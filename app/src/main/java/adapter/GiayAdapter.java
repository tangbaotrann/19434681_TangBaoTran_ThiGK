package adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.tangbaotran_19434681_thigk.R;

import java.util.List;

import model.Giay;

public class GiayAdapter extends BaseAdapter {

    private Context context;
    private int idLayout;
    private List<Giay> listGiay;
    private int index = -1;

    public GiayAdapter(Context context, int idLayout, List<Giay> listGiay) {
        this.context = context;
        this.idLayout = idLayout;
        this.listGiay = listGiay;
    }

    @Override
    public int getCount() {
        if(listGiay.size() != 0 && !listGiay.isEmpty()) {
            return listGiay.size();
        }

        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout, viewGroup, false);
        }

        ImageView imgvLogo = view.findViewById(R.id.imgvLogo);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvPrice = view.findViewById(R.id.tvPrice);

        final ConstraintLayout constraintLayout = view.findViewById(R.id.idConstraintLayout);
        final Giay giay = listGiay.get(i);

        if(listGiay != null && !listGiay.isEmpty()) {
            // set tv + imgv
            imgvLogo.setImageResource(giay.getImg());
            tvName.setText(giay.getName());
            tvPrice.setText(giay.getPrice());
        }

        return view;
    }
}
