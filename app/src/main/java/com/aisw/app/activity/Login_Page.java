package com.aisw.app.activity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.InputType;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.aisw.app.R;
import com.aisw.app.fragment.HomeFragment;
import com.aisw.app.utils.AshTable;
import com.aisw.app.utils.CheckNetwork;
import com.aisw.app.utils.CustomListViewAdapter;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public class Login_Page extends Activity implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener {

    String[] board_size = {"Select Your Size", "8 x 6 ft", "10 x 8 ft", "12 x 8 ft", "12 x 10 ft", "16 x 10 ft", "16 x 12 ft", "20 x 10 ft", "22 x 10 ft", "24 x 12 ft", "30 x 10 ft", "40 x 10 ft", "50 x 10 ft", "60 x 10 ft", "70 x 10 ft", "80 x 10 ft"};

    Spinner spinner11;
    TextView auto_txt1, auto_txt2, auto_txt3, auto_txt4, auto_txt5, auto_txt6, auto_txt7, auto_txt8, auto_txt9;
    EditText data_txt1, data_txt2, data_txt3, data_txt4, data_txt5, data_txt6, data_txt7;

    String nameInput1,nameInput2,nameInput3,nameInput4,nameInput5,nameInput6,nameInput7,
            nameInput8,nameInput9,nameInput10,nameInput11,nameInput12,nameInput13,nameInput14,nameInput15,nameInput16;

    TextView data_txt11, data_txt22, data_txt33, data_txt44, data_txt55, data_txt66, data_txt77, data_txt88, data_txt99;

    TextView txt1;
    ListView listView11;
    ArrayList<AshTable> array111;
    Button bt1;
    Button bt2;
    ProgressDialog pd;
    Button button;


    String dateFim,dateInic;

    SwipeRefreshLayout sSwipeRefreshLayout;

    AlertDialog.Builder alertDialogBuilder;
    Dialog dialog;

    int day1,month1,year1,day2,month2,year2;

    EditText edtdate;
    private int mYearIni, mMonthIni, mDayIni, sYearIni, sMonthIni, sDayIni;
    static final int DATE_ID = 0;
    static final int DATE_ID1 = 1;

    Calendar C = Calendar.getInstance();
    SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyy");
    Calendar c1= Calendar.getInstance();
    Calendar c2= Calendar.getInstance();


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);
        if(CheckNetwork.isInternetAvailable(Login_Page.this)){

        }else {
            startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
        }


        Bundle bundle = getIntent().getExtras();
        String idname1 = bundle.getString("idname");

        bt1 = (Button) findViewById(R.id.but_add);
        bt1.setOnClickListener(this);


        sSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swiperefresh2);
        sSwipeRefreshLayout.setOnRefreshListener(this);


        txt1 = (TextView) findViewById(R.id.textView3);
        txt1.setText(idname1);

        listView11 = (ListView) findViewById(R.id.lst_vw);
        registerForContextMenu(listView11);
        array111 = new ArrayList<>();


        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new ReadJSON().execute("https://script.google.com/macros/s/AKfycbygukdW3tt8sCPcFDlkMnMuNu9bH5fpt7bKV50p2bM/exec?id=12ZLwJsIqyZh7JJt63hHYikxIsU5-jpj5_D1K88HfuTY&sheet=AshTable");
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }




    @Override
    public void onClick(View v) {

        if (v == bt1) {
//            showLoginDialog1();
            Intent intent=new Intent(getApplicationContext(),Submit_form.class);
            startActivity(intent);

        }
    }


    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Login_Page Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    @Override
    public void onRefresh() {

        array111.clear();

        runOnUiThread(  new Runnable() {
            @Override
            public void run() {
                new ReadJSON().execute("https://script.google.com/macros/s/AKfycbygukdW3tt8sCPcFDlkMnMuNu9bH5fpt7bKV50p2bM/exec?id=12ZLwJsIqyZh7JJt63hHYikxIsU5-jpj5_D1K88HfuTY&sheet=AshTable");
            }
        });
    }


    class ReadJSON extends AsyncTask<String, Integer, String> {


        private ProgressDialog dialog = new ProgressDialog(Login_Page.this);

        @Override
        protected String doInBackground(String... params) {
            return readURL(params[0]);
        }

        @Override
        protected void onPreExecute() {
            pd = ProgressDialog.show(Login_Page.this, "", "Please Wait", false);
        }


        @Override
        protected void onPostExecute(String content) {

            try {
                JSONObject jsonObject = new JSONObject(content);
                JSONArray jsonArray = jsonObject.getJSONArray("AshTable");

                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject prdobj = jsonArray.getJSONObject(i);

                    String test1 = prdobj.getString("Timestamp");
                    String test2 = prdobj.getString("customer_name");
                    String test3= prdobj.getString("person_name");
                    String test4 = prdobj.getString("address");
                    String test5 = prdobj.getString("email");
                    String test6 = prdobj.getString("mobile_1");
                    String test7 = prdobj.getString("mobile_alt");
                    String test8 = prdobj.getString("show_name");
                    String test9 = prdobj.getString("setup_date");
                    String test10 = prdobj.getString("setup_time");
                    String test11 = prdobj.getString("from_date");
                    String test12 = prdobj.getString("to_date");
                    String test13 = prdobj.getString("venue");
                    String test14 = prdobj.getString("stage_height");
                    String test15 = prdobj.getString("venue_address");
                    String test16 = prdobj.getString("board_size");
                    String test17 = prdobj.getString("total_panels");
                    String test18 = prdobj.getString("panel_setup");
                    String test19 = prdobj.getString("total_pixels");
                    String test20 = prdobj.getString("spare");
                    String test21 = prdobj.getString("signal_loop");
                    String test22 = prdobj.getString("power_loop");
                    String test23 = prdobj.getString("processor");
                    String test24 = prdobj.getString("laptop");
                    String test25 = prdobj.getString("numberofbox");
                    String test26 = prdobj.getString("total_amount");
                    String test27 = prdobj.getString("advance_amount");
                    String test28 = prdobj.getString("credit_period");
                    String test29 = prdobj.getString("transport");
                    String test30 = prdobj.getString("photographer_name");
                    String test31 = prdobj.getString("photo_mobile");
                    String test32 = prdobj.getString("photo_email");
                    String test33 = prdobj.getString("marketing_person_name");
                    String test34 = prdobj.getString("remarks");



//                    String test177 = prdobj.getString("Timestamp");
//                    String test1a = prdobj.getString("client_name");
//                    String test2b = prdobj.getString("client_phone");
//                    String test3c = prdobj.getString("show_name");
//                    String test4d = prdobj.getString("show_from_date");
//                    String test5e = prdobj.getString("show_to_date");
//                    String test6f = prdobj.getString("board_size");
//                    String test7g = prdobj.getString("total_panels");
//                    String test8h = prdobj.getString("panel_setup");
//                    String test9i = prdobj.getString("total_pixels");
//                    String test100 = prdobj.getString("spare");
//                    String test111 = prdobj.getString("signal_loop");
//                    String test122 = prdobj.getString("power_loop");
//                    String test133 = prdobj.getString("processor");
//                    String test144 = prdobj.getString("laptop");
//                    String test155 = prdobj.getString("numberofbox");
//                    String test166 = prdobj.getString("marketed_by");


//                    array111.add(new AshTable(test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34));

                }


            } catch (JSONException e) {
                e.printStackTrace();
            }

            CustomListViewAdapter adapter = new CustomListViewAdapter(getApplicationContext(), R.layout.list_view, array111);
            listView11.setAdapter(adapter);
            pd.dismiss();

            sSwipeRefreshLayout.setRefreshing(false);
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

    private void showLoginDialog1() {
        LayoutInflater li = LayoutInflater.from(this);
        View prompt = li.inflate(R.layout.activity_add_to_sheet, null);
        alertDialogBuilder = new AlertDialog.Builder(this);
        dialog = alertDialogBuilder.create();

        alertDialogBuilder.setView(prompt);

//        dialog.getButton(android.app.AlertDialog.BUTTON_POSITIVE).setEnabled(false);



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://docs.google.com/a/aishwaryaled.com/forms/d/e/")
                .build();
        final QuestionsSpreadsheetWebService spreadsheetWebService = retrofit.create(QuestionsSpreadsheetWebService.class);


        sMonthIni = C.get(Calendar.MONTH);
        sDayIni = C.get(Calendar.DAY_OF_MONTH);
        sYearIni = C.get(Calendar.YEAR);


        auto_txt1 = (TextView) prompt.findViewById(R.id.textView99911);
        auto_txt2 = (TextView) prompt.findViewById(R.id.textView99922);
        auto_txt3 = (TextView) prompt.findViewById(R.id.textView99933);
        auto_txt4 = (TextView) prompt.findViewById(R.id.textView99944);
        auto_txt5 = (TextView) prompt.findViewById(R.id.textView99955);
        auto_txt6 = (TextView) prompt.findViewById(R.id.textView99966);
        auto_txt7 = (TextView) prompt.findViewById(R.id.textView99977);
        auto_txt8 = (TextView) prompt.findViewById(R.id.textView99988);
        auto_txt9 = (TextView) prompt.findViewById(R.id.textView99999);


        data_txt1 = (EditText) prompt.findViewById(R.id.editText2222);
        data_txt2 = (EditText) prompt.findViewById(R.id.editText333);
        data_txt3 = (EditText) prompt.findViewById(R.id.editText444);
        data_txt4 = (EditText) prompt.findViewById(R.id.editText555);
        data_txt5 = (EditText) prompt.findViewById(R.id.editText555bb);
        data_txt6 = (EditText) prompt.findViewById(R.id.editText999a);
        data_txt7 = (EditText) prompt.findViewById(R.id.editText999);

        data_txt1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
        data_txt3.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
        data_txt7.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);





        spinner11 = (Spinner) prompt.findViewById(R.id.spinner1aa);
        ArrayAdapter<String> adapter123 = new ArrayAdapter<String>(Login_Page.this, android.R.layout.simple_spinner_item, board_size);
        adapter123.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner11.setAdapter(adapter123);
        spinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String s0 = (String) adapterView.getItemAtPosition(i);
                auto_txt1.setText(s0);
                getData();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        data_txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(data_txt4.getWindowToken(), 0);

                showDialog(DATE_ID);

            }
        });

        data_txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(data_txt5.getWindowToken(), 0);

                showDialog(DATE_ID1);

            }
        });


        alertDialogBuilder.setTitle("ORDER FORM");

        data_txt2.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.length() > 10) {
                    data_txt2.setError("More than 10-digit");
//                    dialog.getButton(Dialog.BUTTON_POSITIVE).setEnabled(false);
                } else {
//                    dialog.getButton(Dialog.BUTTON_POSITIVE).setEnabled(true);
                }
            }
        });



        alertDialogBuilder.setPositiveButton("SAVE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {



                         nameInput1 = data_txt1.getText().toString();
                         nameInput2 = data_txt2.getText().toString();
                         nameInput3 = data_txt3.getText().toString();
                         nameInput4 = data_txt4.getText().toString();
                         nameInput5 = data_txt5.getText().toString();

                         nameInput6 = auto_txt1.getText().toString();
                         nameInput7 = auto_txt2.getText().toString();
                         nameInput8 = auto_txt3.getText().toString();
                         nameInput9 = auto_txt4.getText().toString();
                         nameInput10 = auto_txt5.getText().toString();
                         nameInput11 = auto_txt6.getText().toString();
                         nameInput12 = auto_txt7.getText().toString();
                         nameInput13 = auto_txt8.getText().toString();
                         nameInput14 = auto_txt9.getText().toString();

                         nameInput15 = data_txt6.getText().toString();
                         nameInput16 = data_txt7.getText().toString();





                        new Timer().schedule(
                                new TimerTask() {
                                    @Override
                                    public void run() {
                                        onRefresh();
                                    }
                                },
                                2000
                        );



                        Call<Void> completeQuestionnaireCall = spreadsheetWebService.completeQuestionnaire(nameInput1, nameInput2, nameInput3, nameInput4, nameInput5, nameInput6, nameInput7, nameInput8, nameInput9, nameInput10, nameInput11, nameInput12, nameInput13, nameInput14, nameInput15, nameInput16);
                        completeQuestionnaireCall.enqueue(callCallback);
                        dialog.dismiss();

                        Toast.makeText(getApplicationContext(),"Updated Successfully",Toast.LENGTH_LONG).show();

//                        if(TextUtils.isEmpty(nameInput1)) {
//                            data_txt1.setError("Your message");
//
//                            return;
//                        }else {
//
//
//
//                        }

                    }
                });

        alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });


        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        alertDialogBuilder.show();
    }

    private void colocar_fecha() {

        day1 = mDayIni;
        month1 = mMonthIni+1;
        year1 = mYearIni;
        data_txt4.setText(day1 + "-" + month1 + "-" + year1 + " ");
        Log.e("day:::::",day1+"::moth::::::"+month1+"::year::::::::::"+year1);

    }

    private void colocar_fecha1() {
        day2 = sDayIni;
        month2 = sMonthIni+1;
        year2 = sYearIni;
        data_txt5.setText(day2 + "-" + month2 + "-" + year2 + " ");
        Log.e("day2:::::",day2+"::moth2::::::"+month2+"::year2::::::::::"+year2);

    }

//    public void dateCheck(){
//
////        if(day1>day2 ||month1>month2 ||year1>year2 ){
////            if(day1+month1+year1 >= day2+month2+year2 ){
////            Toast.makeText(getApplicationContext(),"From-Date Should not be greater than To-Date",Toast.LENGTH_LONG).show();
////            System.out.println("::::::::inside date check");
////            data_txt5.setError("From-Date Should not be greater than To-Date");
////
////        }else {
////
////            data_txt5.setError(null);
////        }


    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                    mYearIni = year;
                    mMonthIni = monthOfYear;
                    mDayIni = dayOfMonth;

                    colocar_fecha();

                }

            };

    private DatePickerDialog.OnDateSetListener sDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                    sYearIni = year;
                    sMonthIni = monthOfYear;
                    sDayIni = dayOfMonth;

                    colocar_fecha1();


                }

            };



    @Override
    protected Dialog onCreateDialog(int id) {


        form  = new SimpleDateFormat("dd-MM-yyy");

        c1=Calendar.getInstance();
        c2 = Calendar.getInstance();


        switch (id) {
            case DATE_ID:

                DatePickerDialog da = new DatePickerDialog(this, mDateSetListener, mYearIni, mMonthIni, mDayIni);


                c1.add(Calendar.DATE, 1);
                Date newDate = c1.getTime();
                da.getDatePicker().setMinDate(newDate.getTime());
                return da;


            case DATE_ID1:

                DatePickerDialog da1 = new DatePickerDialog(this, sDateSetListener, sYearIni, sMonthIni, sDayIni);

                c2.add(Calendar.DATE, 1);
                Date newDate1 = c2.getTime();
                da1.getDatePicker().setMinDate(newDate1.getTime());
                return da1;

        }

        return null;
    }


    void getData() {
        if (auto_txt1.getText().equals("8 x 6 ft")) {
            auto_txt2.setText("20");
            auto_txt3.setText("5 x 4");
            auto_txt4.setText("640 x 512");
            auto_txt5.setText("4");
            auto_txt6.setText("20 + 4 = 24");
            auto_txt7.setText("20 + 4 = 24");
            auto_txt8.setText("1, Low End");
            auto_txt9.setText("1");
        } else if (auto_txt1.getText().equals("10 x 8 ft")) {
            auto_txt2.setText("30");
            auto_txt3.setText("6 x 5");
            auto_txt4.setText("768 x 640");
            auto_txt5.setText("6");
            auto_txt6.setText("30 + 6 = 36");
            auto_txt7.setText("30 + 6 = 36");
            auto_txt8.setText("1, Low End");
            auto_txt9.setText("1");
        } else if (auto_txt1.getText().equals("12 x 8 ft")) {
            auto_txt2.setText("35");
            auto_txt3.setText("7 x 5");
            auto_txt4.setText("896 x 640");
            auto_txt5.setText("0");
            auto_txt6.setText("35 + 1 = 36");
            auto_txt7.setText("35 + 1 = 36");
            auto_txt8.setText("1, Low End");
            auto_txt9.setText("1");
        } else if (auto_txt1.getText().equals("12 x 10 ft")) {
            auto_txt2.setText("60");
            auto_txt3.setText("7 x 6");
            auto_txt4.setText("896 x 768");
            auto_txt5.setText("0");
            auto_txt6.setText("48 + 0 = 48");
            auto_txt7.setText("48 + 0 = 48");
            auto_txt8.setText("1, Low End");
            auto_txt9.setText("1");
        } else if (auto_txt1.getText().equals("16 x 10 ft")) {
            auto_txt2.setText("60");
            auto_txt3.setText("10 x 6");
            auto_txt4.setText("1280 x 768");
            auto_txt5.setText("6");
            auto_txt6.setText("60 + 6 = 66");
            auto_txt7.setText("60 + 6 = 66");
            auto_txt8.setText("1, Low End");
            auto_txt9.setText("1");
        } else if (auto_txt1.getText().equals("16 x 12 ft")) {
            auto_txt2.setText("70");
            auto_txt3.setText("10 x 7");
            auto_txt4.setText("1280 x 896");
            auto_txt5.setText("4");
            auto_txt6.setText("70 + 4 = 74");
            auto_txt7.setText("70 + 4 = 74");
            auto_txt8.setText("1, Low End");
            auto_txt9.setText("1");
        } else if (auto_txt1.getText().equals("20 x 10 ft")) {
            auto_txt2.setText("72");
            auto_txt3.setText("12 x 6");
            auto_txt4.setText("1536 x 768");
            auto_txt5.setText("6");
            auto_txt6.setText("72 + 6 = 78");
            auto_txt7.setText("72 + 6 = 78");
            auto_txt8.setText("1, Low End");
            auto_txt9.setText("1");
        } else if (auto_txt1.getText().equals("22 x 10 ft")) {
            auto_txt2.setText("84");
            auto_txt3.setText("14 x 6");
            auto_txt4.setText("1792 x 1280");
            auto_txt5.setText("6");
            auto_txt6.setText("84 + 6 = 90");
            auto_txt7.setText("84 + 6 = 90");
            auto_txt8.setText("1, Low End");
            auto_txt9.setText("1");
        } else if (auto_txt1.getText().equals("24 x 12 ft")) {
            auto_txt2.setText("105");
            auto_txt3.setText("15 x 7");
            auto_txt4.setText("1920 x 896");
            auto_txt5.setText("3");
            auto_txt6.setText("105 + 3 = 108");
            auto_txt7.setText("105 + 3 = 108");
            auto_txt8.setText("1, High End");
            auto_txt9.setText("2");
        } else if (auto_txt1.getText().equals("30 x 10 ft")) {
            auto_txt2.setText("108");
            auto_txt3.setText("18 x 6");
            auto_txt4.setText("2304 x 768");
            auto_txt5.setText("6");
            auto_txt6.setText("108 + 6 = 114");
            auto_txt7.setText("108 + 6 = 114");
            auto_txt8.setText("1, High End");
            auto_txt9.setText("2");
        } else if (auto_txt1.getText().equals("40 x 10 ft")) {
            auto_txt2.setText("144");
            auto_txt3.setText("24 x 6");
            auto_txt4.setText("3072 x 768");
            auto_txt5.setText("6");
            auto_txt6.setText("144 + 6 = 150");
            auto_txt7.setText("144 + 6 = 150");
            auto_txt8.setText("1, High End");
            auto_txt9.setText("2");
        } else if (auto_txt1.getText().equals("50 x 10 ft")) {
            auto_txt2.setText("180");
            auto_txt3.setText("30 x 6");
            auto_txt4.setText("3840 x 768");
            auto_txt5.setText("6");
            auto_txt6.setText("180 + 6 = 186");
            auto_txt7.setText("180 + 6 = 186");
            auto_txt8.setText("1, High End");
            auto_txt9.setText("2");
        } else if (auto_txt1.getText().equals("60 x 10 ft")) {
            auto_txt2.setText("216");
            auto_txt3.setText("36 x 6");
            auto_txt4.setText("4608 x 768");
            auto_txt5.setText("6");
            auto_txt6.setText("216 + 6 = 222");
            auto_txt7.setText("216 + 6 = 222");
            auto_txt8.setText("1, High End");
            auto_txt9.setText("3");
        } else if (auto_txt1.getText().equals("70 x 10 ft")) {
            auto_txt2.setText("252");
            auto_txt3.setText("42 x 6");
            auto_txt4.setText("5376 x 768");
            auto_txt5.setText("6");
            auto_txt6.setText("252 + 6 = 258");
            auto_txt7.setText("252 + 6 = 258");
            auto_txt8.setText("1, High End");
            auto_txt9.setText("3");
        } else if (auto_txt1.getText().equals("80 x 10 ft")) {
            auto_txt2.setText("288");
            auto_txt3.setText("48 x 6");
            auto_txt4.setText("6144 x 768");
            auto_txt5.setText("6");
            auto_txt6.setText("288 + 6 = 294");
            auto_txt7.setText("288 + 6 = 294");
            auto_txt8.setText("1, High End");
            auto_txt9.setText("3");
        }else if (auto_txt1.getText().equals("Select Your Size")) {
            auto_txt2.setText("0");
            auto_txt3.setText("0");
            auto_txt4.setText("0");
            auto_txt5.setText("0");
            auto_txt6.setText("0");
            auto_txt7.setText("0");
            auto_txt8.setText("0");
            auto_txt9.setText("0");
        }
    }

    private final Callback<Void> callCallback = new Callback<Void>() {
        @Override
        public void onResponse(Call<Void> call, Response<Void> response) {
            Log.d("XXX", "Submitted. " + response);
        }

        @Override
        public void onFailure(Call<Void> call, Throwable t) {
            Log.e("XXX", "Failed", t);
        }
    };

    public interface QuestionsSpreadsheetWebService {

        @POST("1FAIpQLScxRJTcJ9oOfOSiotRJ1_JaZBw23_fRFWJzRv90SswemaD9qw/formResponse")
        @FormUrlEncoded
        Call<Void> completeQuestionnaire(
                @Field("entry.2063264145") String name,
                @Field("entry.398403989") String phone,
                @Field("entry.349123091") String showname,
                @Field("entry.402049047") String startdate,
                @Field("entry.1794026739") String todate,
                @Field("entry.1587307398") String boardsize,
                @Field("entry.39884541") String totalpanels,
                @Field("entry.610803877") String panelsetup,
                @Field("entry.1206329505") String pixels,
                @Field("entry.982833833") String spare,
                @Field("entry.589101414") String signalloop,
                @Field("entry.930623440") String powerloop,
                @Field("entry.1400016164") String processor,
                @Field("entry.774737258") String laptop,
                @Field("entry.1147364368") String numberofbox,
                @Field("entry.252811658") String marketedby
        );
    }


}


