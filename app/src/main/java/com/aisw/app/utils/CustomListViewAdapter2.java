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
import android.widget.ListView;
import android.widget.TextView;

import com.aisw.app.R;
import com.aisw.app.activity.Full_info_page;

import java.util.ArrayList;
import java.util.Locale;


public class CustomListViewAdapter2 extends ArrayAdapter<AshTable2> implements Filterable {

    private static final String LOG_TAG = "CustomViewAdapter2";
    private ArrayList<AshTable2> wholeList = new ArrayList<>();
    private ArrayList<AshTable2> currentList;
    Context context;
    int resource;



    public CustomListViewAdapter2(Context context, int resource, ArrayList<AshTable2> prod) {
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

        AshTable2 pro = getItem(position);

        final String st1 = pro.getCompname();
        final String st2 = pro.getPersonname();
        final String st3 = pro.getAddress();
        final String st4 = pro.getMailid();
        final String st5 = pro.getMob1();
        final String st6 = pro.getMob2();
        final String st7 = pro.getShowname();
        final String st8 = pro.getDispatchdate();
        final String st9 = pro.getDispatchtime();
        final String st10 = pro.getStatedate();
        final String st11 = pro.getStarttime();
        final String st12 = pro.getSetupdate();
        final String st13 = pro.getSetuptime();
        final String st14 = pro.getEnddate();
        final String st15 = pro.getEndtime();
        final String st16 = pro.getDismanteldate();
        final String st17 = pro.getDismanteltime();
        final String st18 = pro.getVenu();
        final String st19 = pro.getVenuaddress();
        final String st20 = pro.getBoardsize();
        final String st21 = pro.getOverallsqft();
        final String st22 = pro.getRatepersqft();
        final String st23 = pro.getTotalamt();
        final String st24 = pro.getTransport();
        final String st25 = pro.getStage();
        final String st26 = pro.getPower();
        final String st27 = pro.getOthercost1();
        final String st28 = pro.getOthercost2();
        final String st29 = pro.getGrossamt();
        final String st30 = pro.getBillrequired();
        final String st31 = pro.getBillinnameof();
        final String st32 = pro.getServicetax();
        final String st33 = pro.getTotalamt2();
        final String st34 = pro.getAdvanceamt();
        final String st35 = pro.getCreditperiod();
        final String st36 = pro.getPhotoname();
        final String st37 = pro.getPhotomob();
        final String st38 = pro.getPhotoemail();
        final String st39 = pro.getMarketingname();
        final String st40 = pro.getRemark();


        TextView txt1 = (TextView) convertView.findViewById(R.id.textView11);
        txt1.setText(pro.getPersonname());

        TextView txt2 = (TextView) convertView.findViewById(R.id.textView22);
        txt2.setText(pro.getMob1());

        TextView txt3 = (TextView) convertView.findViewById(R.id.textView33);
        txt3.setText(pro.getShowname());

        TextView txt5 = (TextView) convertView.findViewById(R.id.textView44);
        txt5.setText(pro.getStatedate());

        TextView txt4 = (TextView) convertView.findViewById(R.id.textView6);
        txt4.setText(pro.getEnddate());

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


                context.startActivity(intent);
            }
        });

        return convertView;
    }

    public void filter(String charText) {

        charText = charText.toLowerCase(Locale.getDefault());
        currentList.clear();

        if (charText.length() == 0) {

            currentList.addAll(wholeList);
            currentList.clear();

        } else {
            for (AshTable2 pro : wholeList) {
                Log.d(LOG_TAG, "filter: 2 searching " + charText + " in " + pro.getStatedate());
                if (pro.getStatedate().toLowerCase().contains(charText)) {
                    Log.d(LOG_TAG, "filter: found " + pro.getStatedate());
                    currentList.add(pro);
                }
            }
            notifyDataSetChanged();
        }

    }

    public void setWholeList(ArrayList<AshTable2> list) {
        wholeList.addAll(list);
    }
}