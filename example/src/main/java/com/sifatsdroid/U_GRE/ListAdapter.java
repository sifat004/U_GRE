package com.sifatsdroid.U_GRE;

/**
 * Created by Sifat on 5/31/2016.
 */
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter{
    String [] word;
    Context context;
    String [] word_mean;



    private static LayoutInflater inflater=null;
    public ListAdapter(ListActivity listActivity, String[] prgmNameList, String[] prgmNameList2) {
        // TODO Auto-generated constructor stub
        word=prgmNameList;
        context=listActivity;
        word_mean=prgmNameList2;


        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return word.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        TextView tv1;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.list_item, null);
        holder.tv=(TextView) rowView.findViewById(R.id.textView1);
        holder.tv1=(TextView) rowView.findViewById(R.id.textView2);

        Typeface tf1 = Typeface.createFromAsset(holder.tv.getContext().getAssets(), "fonts/S.ttf");

        Typeface tf2 = Typeface.createFromAsset(holder.tv1.getContext().getAssets(), "fonts/S.ttf");

//       if (position%2==0) position=position;
//       else position=position+1;
        holder.tv.setText(word[position ]);
        holder.tv1.setText(word_mean[position]);
        holder.tv.setTypeface(tf1);
        holder.tv1.setTypeface(tf2);

//        rowView.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                Toast.makeText(context, "You Clicked ", Toast.LENGTH_LONG).show();
//            }
//        });
        return rowView;
    }

}