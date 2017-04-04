package com.aisw.app.fragment;

import android.app.LocalActivityManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;


import com.aisw.app.R;
import com.aisw.app.activity.Full_info_page;
import com.aisw.app.activity.MainActivity;
import com.aisw.app.activity.Submit_form;
import com.aisw.app.utils.AshTable;
import com.aisw.app.utils.CustomHomeAdapter;
import com.aisw.app.utils.CustomListViewAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import java.util.ArrayList;
import java.util.Locale;


public class HomeFragment extends Fragment implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener {

//    ProgressDialog pd;
//    private  String[] board_size = {"Select Your Size", "8 x 6 ft", "10 x 8 ft", "12 x 8 ft", "12 x 10 ft", "16 x 10 ft", "16 x 12 ft", "20 x 10 ft", "22 x 10 ft", "24 x 12 ft", "30 x 10 ft", "40 x 10 ft", "50 x 10 ft", "60 x 10 ft", "70 x 10 ft", "80 x 10 ft"};

//    TabHost tabHost;

    ListView lstv11;
    ArrayList<AshTable> array111;


    SwipeRefreshLayout mSwipeRefreshLayout;

    private Button bt1;
    private Button bt2;

    CustomListViewAdapter adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,
                container, false);


        getActivity().setTitle("Marketing");
        array111 = new ArrayList<>();

        mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swiperefresh);
        mSwipeRefreshLayout.setOnRefreshListener(this);


        lstv11 = (ListView) view.findViewById(R.id.lst_vw1);

        bt1 = (Button) view.findViewById(R.id.but_add);
        bt1.setOnClickListener(this);


//
//            // AishwaryaLED
//        getActivity().runOnUiThread(  new Runnable() {
//            @Override
//            public void run() {
//                new HomeFragment.ReadJSON().execute("https://script.google.com/macros/s/AKfycbygukdW3tt8sCPcFDlkMnMuNu9bH5fpt7bKV50p2bM/exec?id=12BMlJD76KCb3wTB8F3v08pKBEWnY4J-y21zSze-eeDg&sheet=BaseAshTable");
//            }
//        });


//         AishwaryaLED_Dev

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new HomeFragment.ReadJSON().execute("https://script.google.com/macros/s/AKfycbygukdW3tt8sCPcFDlkMnMuNu9bH5fpt7bKV50p2bM/exec?id=12BMlJD76KCb3wTB8F3v08pKBEWnY4J-y21zSze-eeDg&sheet=BaseAshTable");
            }
        });


//        return mTabHost;
        return view;


    }

    @Override
    public void onRefresh() {

        array111.clear();

//        // AishwaryaLED
//        getActivity().runOnUiThread(  new Runnable() {
//            @Override
//            public void run() {
//                new HomeFragment.ReadJSON().execute("https://script.google.com/macros/s/AKfycbygukdW3tt8sCPcFDlkMnMuNu9bH5fpt7bKV50p2bM/exec?id=12BMlJD76KCb3wTB8F3v08pKBEWnY4J-y21zSze-eeDg&sheet=BaseAshTable");
//            }
//        });


//         AishwaryaLED_Dev

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new HomeFragment.ReadJSON().execute("https://script.google.com/macros/s/AKfycbygukdW3tt8sCPcFDlkMnMuNu9bH5fpt7bKV50p2bM/exec?id=12BMlJD76KCb3wTB8F3v08pKBEWnY4J-y21zSze-eeDg&sheet=BaseAshTable");
            }
        });


    }


    public class ReadJSON extends AsyncTask<String, Integer, String> {


        @Override
        protected String doInBackground(String... params) {
            return readURL(params[0]);
        }

        @Override
        protected void onPreExecute() {

        }


        @Override
        protected void onPostExecute(String content) {

            try {

                JSONObject jsonObject = new JSONObject(content);
                JSONArray jsonArray = jsonObject.getJSONArray("BaseAshTable");

                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject prdobj = jsonArray.getJSONObject(i);

                    String test1 = prdobj.getString("Timestamp");
                    String test2 = prdobj.getString("Company_Name");
                    String test3 = prdobj.getString("Person_Name");
                    String test4 = prdobj.getString("Address");
                    String test5 = prdobj.getString("Mail_ID");
                    String test6 = prdobj.getString("Mobile_1");
                    String test7 = prdobj.getString("Mobile_2");
                    String test8 = prdobj.getString("Show_Name");
                    String test9 = prdobj.getString("Dispatch_Date");
                    String test10 = prdobj.getString("Dispatch_Time");
                    String test11 = prdobj.getString("Setup_Date");
                    String test12 = prdobj.getString("Setup_Time");
                    String test13 = prdobj.getString("Start_Date");
                    String test14 = prdobj.getString("Start_Time");
                    String test15 = prdobj.getString("Show_End_Date");
                    String test16 = prdobj.getString("Show_End_Time");
                    String test17 = prdobj.getString("Dismantel_Date");
                    String test18 = prdobj.getString("Dismantel_Time");
                    String test19 = prdobj.getString("Venu");
                    String test20 = prdobj.getString("Venue_Address");
                    String test21 = prdobj.getString("Board_Size");
                    String test22 = prdobj.getString("Overall_sqft");
                    String test23 = prdobj.getString("Rate_Per_Sqft");
                    String test24 = prdobj.getString("Total_Amount");
                    String test25 = prdobj.getString("Transport");
                    String test26 = prdobj.getString("Stage");
                    String test27 = prdobj.getString("Power");
                    String test28 = prdobj.getString("Other_Costs_1");
                    String test29 = prdobj.getString("Other_Cost_2");
                    String test30 = prdobj.getString("Gross_Amount");
                    String test31 = prdobj.getString("Bill_Required");
                    String test32 = prdobj.getString("Company_Name2");
                    String test33 = prdobj.getString("Billing_In_Name_Of");
                    String test34 = prdobj.getString("Service_Tax");
                    String test35 = prdobj.getString("Total_Amount_2");
                    String test36 = prdobj.getString("Advance_Amount");
                    String test37 = prdobj.getString("Balance_Amount");
                    String test38 = prdobj.getString("Credit_Period");
                    String test39 = prdobj.getString("Photographer_Details");
                    String test40 = prdobj.getString("Video_Person_Details");
                    String test41 = prdobj.getString("Stage_Details");
                    String test42 = prdobj.getString("Sound_Details");
                    String test43 = prdobj.getString("Stage_Details");
                    String test44 = prdobj.getString("Marketing_Person_Name");
                    String test45 = prdobj.getString("Remarks");



                    array111.add(new AshTable(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40, test41, test42, test43, test44, test45));
                }


            } catch (JSONException e) {
                e.printStackTrace();
            }

            final CustomListViewAdapter adapter = new CustomListViewAdapter(getActivity(), R.layout.home_list_view, array111);
            lstv11.setAdapter(adapter);


            mSwipeRefreshLayout.setRefreshing(false);

        }

    }


    private static String readURL(String theUrl) {

        StringBuilder content = new StringBuilder();

        try {
            URL url = new URL(theUrl);
            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line + "\n");
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();

    }

    @Override
    public void onClick(View v) {

        if (v == bt1) {
//            showLoginDialog1();
            Intent intent = new Intent(getActivity(), Submit_form.class);
            startActivity(intent);

        } else if (v == bt2) {


        }


    }

    @Override
    public void onResume() {
//        Log.e("DEBUG", "onResume of LoginFragment");
        onRefresh();
        super.onResume();
    }



    @Override
    public void onPause() {
//        Log.e("DEBUG", "OnPause of loginFragment");
        super.onPause();
    }


}



