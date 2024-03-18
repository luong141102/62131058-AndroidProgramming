package tiil.edu.LVNangCao.models.Countrys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import tiil.edu.LVNangCao.R;
import tiil.edu.LVNangCao.models.Country;

public class CountryAdapter extends BaseAdapter {
    ArrayList<Country> listQG;
    Context mContext;
    LayoutInflater mInflater;

    public CountryAdapter(Context mContext, ArrayList<Country> listQG) {
        this.listQG = listQG;
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return listQG.size();
    }
    @Override
    public Object getItem(int position) {
        return listQG.get(position);
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CountryViewHolder viewItem;
        if (convertView==null){
            convertView = mInflater.inflate(R.layout.country_item,null);
            viewItem = new CountryViewHolder();
            viewItem.textViewNationName = convertView.findViewById(R.id.tvTenQG);
            viewItem.textViewPopulation = convertView.findViewById(R.id.tvSoLuongDan);
            viewItem.imageViewFlag = convertView.findViewById(R.id.imLaCo);
            convertView.setTag(viewItem);
        }else {
            viewItem = (CountryViewHolder)convertView.getTag();
        }
        Country quocGiaHienThi = listQG.get(position);
        String tenQG = quocGiaHienThi.getTenQG();
        int soDan = quocGiaHienThi.getSoluongDan();
        String tenLaCo = quocGiaHienThi.getTenFileAnhLaCo();
        viewItem.textViewNationName.setText(tenQG);
        viewItem.textViewPopulation.setText("Dân số: "+ String.valueOf(soDan));
        int idAnhLaCo = TimIDAnhTheoTenFile(tenLaCo);

        viewItem.imageViewFlag.setImageResource(idAnhLaCo);
        return convertView;
    }
    int TimIDAnhTheoTenFile(String tenFileAnh){
        String tenPak = mContext.getPackageName();
        int id = mContext.getResources().getIdentifier(
                tenFileAnh, "mipmap", tenPak);
        return id;
    }
    class CountryViewHolder{
        ImageView imageViewFlag;
        TextView textViewPopulation;
        TextView textViewNationName;
    }
}
