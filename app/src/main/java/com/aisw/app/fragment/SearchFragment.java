package com.aisw.app.fragment;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.aisw.app.R;
import com.aisw.app.utils.AshTable;
import com.aisw.app.utils.AshTable2;
import com.aisw.app.utils.CustomListViewAdapter2;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import static java.util.Calendar.DATE;


public class SearchFragment extends Fragment {


    ListView lstv22;
    ArrayList<AshTable2> array222;

    EditText inputSearch1;
    CustomListViewAdapter2 adapter2;

    int day1, month1, year1;

    private int mYearIni, mMonthIni, mDayIni, sYearIni, sMonthIni, sDayIni, mYearIni1, mMonthIni1, mDayIni1, sYearIni2, sMonthIni2, sDayIni2, mYearIni3, mMonthIni3, mDayIni3;

    Calendar C = Calendar.getInstance();

    TextView noSearch;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_fragment,
                container, false);


        sMonthIni = C.get(Calendar.MONTH);
        sDayIni = C.get(Calendar.DAY_OF_MONTH);
        sYearIni = C.get(Calendar.YEAR);


        getActivity().setTitle("Search");
        array222 = new ArrayList<>();

        lstv22 = (ListView) view.findViewById(R.id.lst_vw2);

        inputSearch1 = (EditText) view.findViewById(R.id.inputSearch1);

        noSearch = (TextView) view.findViewById(R.id.noSearch);


        inputSearch1.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg) {
                // TODO Auto-generated method stub

                String text = inputSearch1.getText().toString().toLowerCase(Locale.getDefault());
                adapter2.filter(text);
                listCheck();


            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1,
                                          int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2,
                                      int arg3) {

            }

        });


        adapter2 = new CustomListViewAdapter2(getActivity(), R.layout.home_list_view, array222);


        lstv22.setAdapter(adapter2);


        inputSearch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(inputSearch1.getWindowToken(), 0);

                showDispatchCalendar();

            }
        });


//
//            // AishwaryaLED
//        getActivity().runOnUiThread(  new Runnable() {
//            @Override
//            public void run() {
//                new SearchFragment.ReadJSON().execute("https://script.google.com/macros/s/AKfycbygukdW3tt8sCPcFDlkMnMuNu9bH5fpt7bKV50p2bM/exec?id=12BMlJD76KCb3wTB8F3v08pKBEWnY4J-y21zSze-eeDg&sheet=BaseAshTable");
//            }
//        });


//         AishwaryaLED_Dev

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new SearchFragment.ReadJSON().execute("https://script.google.com/macros/s/AKfycbygukdW3tt8sCPcFDlkMnMuNu9bH5fpt7bKV50p2bM/exec?id=12BMlJD76KCb3wTB8F3v08pKBEWnY4J-y21zSze-eeDg&sheet=BaseAshTable");
            }
        });


        return view;


    }

//    @Override
//    public void onRefresh() {
//
//        array111.clear();
//
////        // AishwaryaLED
////        getActivity().runOnUiThread(  new Runnable() {
////            @Override
////            public void run() {
////                new SearchFragment.ReadJSON().execute("https://script.google.com/macros/s/AKfycbygukdW3tt8sCPcFDlkMnMuNu9bH5fpt7bKV50p2bM/exec?id=12BMlJD76KCb3wTB8F3v08pKBEWnY4J-y21zSze-eeDg&sheet=BaseAshTable");
////            }
////        });
//
//
////         AishwaryaLED_Dev
//
//        getActivity().runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                new SearchFragment.ReadJSON().execute("https://script.google.com/macros/s/AKfycbygukdW3tt8sCPcFDlkMnMuNu9bH5fpt7bKV50p2bM/exec?id=12BMlJD76KCb3wTB8F3v08pKBEWnY4J-y21zSze-eeDg&sheet=BaseAshTable");
//            }
//        });


//


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


                    array222.add(new AshTable2(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40, test41, test42, test43, test44, test45));
                }


            } catch (JSONException e) {
                e.printStackTrace();
            }

            adapter2.setWholeList(array222);

//            lstv22.setAdapter(adapter2);

//            mSwipeRefreshLayout.setRefreshing(true);

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

    private void showDispatchCalendar() {
        Calendar c1 = Calendar.getInstance();
        DatePickerDialog da = new DatePickerDialog(getActivity(), mDateSetListener, mYearIni, mMonthIni, mDayIni);
        c1.add(Calendar.DAY_OF_MONTH, 10);
//        Date newDate = c1.getTime();
//        da.getDatePicker().setMinDate(newDate.getTime());
        long newDate = System.currentTimeMillis();
//        da.getDatePicker().setMinDate(newDate);
        da.getDatePicker().setMinDate(newDate);
        da.show();

    }


    private void colocar_fecha() {

        day1 = mDayIni;
        month1 = mMonthIni + 1;
        year1 = mYearIni;
        inputSearch1.setText(day1 + "-" + month1 + "-" + year1 + " ");
    }


    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    mYearIni = year;
                    mMonthIni = monthOfYear;
                    mDayIni = dayOfMonth;

                    colocar_fecha();
                }
            };


    public void listCheck() {

        if (adapter2.getCount() != 0) {
            noSearch.setText(" ");
        } else {
            noSearch.setText("No Search Result Found");
        }
    }


//    private void colocar_fecha() {
//        inputSearch1.setText((mMonthIni + 1) + "-" + mDayIni + "-" + mYearIni+" ");
//    }
//
//
//
//    private DatePickerDialog.OnDateSetListener mDateSetListener =
//            new DatePickerDialog.OnDateSetListener() {
//                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                    mYearIni = year;
//                    mMonthIni = monthOfYear;
//                    mDayIni = dayOfMonth;
//                    colocar_fecha();
//
//                }
//
//            };
//
//
//    @Override
//    protected Dialog onCreateDialog(int id) {
//        switch (id) {
//            case DATE_ID:
//                return new DatePickerDialog(this, mDateSetListener, sYearIni, sMonthIni, sDayIni);
//
//
//        }
//
//
//        return null;
//    }


    @Override
    public void onResume() {
//        Log.e("DEBUG", "onResume of LoginFragment");
        inputSearch1.setText("");
        super.onResume();
    }


    @Override
    public void onPause() {
//        Log.e("DEBUG", "OnPause of loginFragment");
        super.onPause();
    }


}

