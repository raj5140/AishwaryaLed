package com.aisw.app.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;

import com.aisw.app.activity.Full_info_page;
import com.aisw.app.R;

import java.util.ArrayList;

public class CustomHomeAdapter extends ArrayAdapter<AshTable> {


    ArrayList<AshTable> prod;
    Context context;
    int resource;

    public CustomHomeAdapter(Context context, int resource, ArrayList<AshTable> prod) {
        super(context, resource, prod);

        this.context=context;
        this.resource=resource;
        this.prod=prod;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if(convertView==null){

            LayoutInflater layoutInflater=(LayoutInflater)getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            convertView=layoutInflater.inflate(R.layout.home_list_view,null,true);
        }

        AshTable pro=getItem(position);

//        final String st1=pro.getTest1();
//        final String st2=pro.getTest2();
//        final String st3=pro.getTest3();
//        final String st4=pro.getTest4();
//        final String st5=pro.getTest5();
//        final String st6=pro.getTest6();
//        final String st7=pro.getTest7();
//        final String st8=pro.getTest8();
//        final String st9=pro.getTest9();
//        final String st10=pro.getTest10();
//        final String st11=pro.getTest11();
//        final String st12=pro.getTest12();
//        final String st13=pro.getTest13();
//        final String st14=pro.getTest14();
//        final String st15=pro.getTest15();
//        final String st16=pro.getTest16();
//        final String st17=pro.getTest17();
//
//        TextView txt1=(TextView)convertView.findViewById(R.id.textView111);
//        txt1.setText(pro.getTest1());
//
//        TextView txt2=(TextView)convertView.findViewById(R.id.textView222);
//        txt2.setText(pro.getTest3());
//
//        TextView txt3=(TextView)convertView.findViewById(R.id.textView333);
//        txt3.setText(pro.getTest4());
//
//        TextView txt4=(TextView)convertView.findViewById(R.id.textView7);
//        txt4.setText(pro.getTest5());
//
//        TextView txt5=(TextView)convertView.findViewById(R.id.textView444);
//        txt5.setText(pro.getTest6());
//
//        final TextView txt6=(TextView)convertView.findViewById(R.id.textView555);
//        txt6.setText(pro.getTest15());

        ImageButton imgb=(ImageButton)convertView.findViewById(R.id.imageButton);
        imgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context.getApplicationContext(), Full_info_page.class);
//                intent.putExtra("client_name", String.valueOf(st1));
//                intent.putExtra("client_phone", String.valueOf(st2));
//                intent.putExtra("show_name", String.valueOf(st3));
//                intent.putExtra("show_from_date", String.valueOf(st4));
//                intent.putExtra("show_to_date", String.valueOf(st5));
//                intent.putExtra("board_size", String.valueOf(st6));
//                intent.putExtra("total_panels", String.valueOf(st7));
//                intent.putExtra("panel_setup", String.valueOf(st8));
//                intent.putExtra("total_pixels", String.valueOf(st9));
//                intent.putExtra("spare", String.valueOf(st10));
//                intent.putExtra("signal_loop", String.valueOf(st11));
//                intent.putExtra("power_loop", String.valueOf(st12));
//                intent.putExtra("processor", String.valueOf(st13));
//                intent.putExtra("laptop", String.valueOf(st14));
//                intent.putExtra("numberofbox", String.valueOf(st15));
//                intent.putExtra("marketed_by", String.valueOf(st16));
//                intent.putExtra("Timestamp", String.valueOf(st17));

                context.startActivity(intent);
            }
        });


        return convertView;
    }
}