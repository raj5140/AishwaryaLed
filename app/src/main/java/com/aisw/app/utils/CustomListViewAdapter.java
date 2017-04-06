package com.aisw.app.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.aisw.app.R;
import com.aisw.app.activity.Full_info_page;

import java.util.ArrayList;
import java.util.Locale;


public class CustomListViewAdapter extends ArrayAdapter<AshTable> implements Filterable {

    private static final String LOG_TAG = "CustomViewAdapter";
    private ArrayList<AshTable> wholeList = new ArrayList<>();
    private ArrayList<AshTable> currentList;
    Context context;
    int resource;


    public CustomListViewAdapter(Context context, int resource, ArrayList<AshTable> prod) {
        super(context, resource, prod);

        this.context = context;
        this.resource = resource;
        this.currentList = prod;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(R.layout.list_view, null, true);
        }

        try {



        AshTable pro = getItem(position);

        final String st1 = pro.getTimestamp();
        final String st2 = pro.getCompname();
        final String st3 = pro.getPersonname();
        final String st4 = pro.getAddress();
        final String st5 = pro.getMailid();
        final String st6 = pro.getMobile1();
        final String st7 = pro.getMobile2();
        final String st8 = pro.getShowname();
        final String st9 = pro.getDispatchdate();
        final String st10 = pro.getDispatchtime();
        final String st11 = pro.getStartdate();
        final String st12 = pro.getStarttime();
        final String st13 = pro.getSetupdate();
        final String st14 = pro.getSetuptime();
        final String st15 = pro.getShowenddate();
        final String st16 = pro.getShowendtime();
        final String st17 = pro.getDismanteldate();
        final String st18 = pro.getDismanteltime();
        final String st19 = pro.getVenu();
        final String st20 = pro.getVenueaddress();
        final String st21 = pro.getBoardsize();
        final String st22 = pro.getOverallsqft();
        final String st23 = pro.getRatepersqft();
        final String st24 = pro.getTotalamount();
        final String st25 = pro.getTransport();
        final String st26 = pro.getStage();
        final String st27 = pro.getPower();
        final String st28 = pro.getOthercosts1();
        final String st29 = pro.getOthercost2();
        final String st30 = pro.getGrossamount();
        final String st31 = pro.getBillrequired();
        final String st32 = pro.getCompanyname2();
        final String st33 = pro.getBillinginnameof();
        final String st34 = pro.getServicetax();
        final String st35 = pro.getTotalamount2();
        final String st36 = pro.getAdvanceamount();
        final String st37 = pro.getBalanceamount();
        final String st38 = pro.getCreditperiod();
        final String st39 = pro.getPhotographerdetails();
        final String st40 = pro.getVideodetails();
        final String st41 = pro.getStagedetails();
        final String st42 = pro.getSounddetails();
        final String st43 = pro.getLightdetails();
        final String st44 = pro.getMarketingname();
        final String st45 = pro.getRemarksremarks();


        TextView txt1 = (TextView) convertView.findViewById(R.id.textView11);
        txt1.setText(pro.getPersonname());

        TextView txt2 = (TextView) convertView.findViewById(R.id.textView22);
        txt2.setText(pro.getMobile1());

        TextView txt3 = (TextView) convertView.findViewById(R.id.textView33);
        txt3.setText(pro.getShowname());

        TextView txt5 = (TextView) convertView.findViewById(R.id.textView44);
        txt5.setText(pro.getStartdate());

        TextView txt4 = (TextView) convertView.findViewById(R.id.textView6);
        txt4.setText(pro.getShowenddate());

        TextView txt6 = (TextView) convertView.findViewById(R.id.textView55);
        txt6.setText(pro.getBoardsize());

        TextView txt7 = (TextView) convertView.findViewById(R.id.teextView);
        txt7.setText("( " + pro.getCompname() + " )");


        Button imgb = (Button) convertView.findViewById(R.id.imageButton2);
        imgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent().setClass(getContext(), Full_info_page.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);

                intent.putExtra("name1", String.valueOf(st1));
                intent.putExtra("name2", String.valueOf(st2));
                intent.putExtra("name3", String.valueOf(st3));
                intent.putExtra("name4", String.valueOf(st4));
                intent.putExtra("name5", String.valueOf(st5));
                intent.putExtra("name6", String.valueOf(st6));
                intent.putExtra("name7", String.valueOf(st7));
                intent.putExtra("name8", String.valueOf(st8));
                intent.putExtra("name9", String.valueOf(st9));
                intent.putExtra("name10", String.valueOf(st10));
                intent.putExtra("name11", String.valueOf(st11));
                intent.putExtra("name12", String.valueOf(st12));
                intent.putExtra("name13", String.valueOf(st13));
                intent.putExtra("name14", String.valueOf(st14));
                intent.putExtra("name15", String.valueOf(st15));
                intent.putExtra("name16", String.valueOf(st16));
                intent.putExtra("name17", String.valueOf(st17));
                intent.putExtra("name18", String.valueOf(st18));
                intent.putExtra("name19", String.valueOf(st19));
                intent.putExtra("name20", String.valueOf(st20));
                intent.putExtra("name21", String.valueOf(st21));
                intent.putExtra("name22", String.valueOf(st22));
                intent.putExtra("name23", String.valueOf(st23));
                intent.putExtra("name24", String.valueOf(st24));
                intent.putExtra("name25", String.valueOf(st25));
                intent.putExtra("name26", String.valueOf(st26));
                intent.putExtra("name27", String.valueOf(st27));
                intent.putExtra("name28", String.valueOf(st28));
                intent.putExtra("name29", String.valueOf(st29));
                intent.putExtra("name30", String.valueOf(st30));
                intent.putExtra("name31", String.valueOf(st31));
                intent.putExtra("name32", String.valueOf(st32));
                intent.putExtra("name33", String.valueOf(st33));
                intent.putExtra("name34", String.valueOf(st34));
                intent.putExtra("name35", String.valueOf(st35));
                intent.putExtra("name36", String.valueOf(st36));
                intent.putExtra("name37", String.valueOf(st37));
                intent.putExtra("name38", String.valueOf(st38));
                intent.putExtra("name39", String.valueOf(st39));
                intent.putExtra("name40", String.valueOf(st40));
                intent.putExtra("name41", String.valueOf(st41));
                intent.putExtra("name42", String.valueOf(st42));
                intent.putExtra("name43", String.valueOf(st43));
                intent.putExtra("name44", String.valueOf(st44));
                intent.putExtra("name45", String.valueOf(st45));


                context.startActivity(intent);
            }
        });

        }catch (Exception e){

        }

        return convertView;
    }


}