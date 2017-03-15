//package com.aisw.app.activity;
//
//import android.app.DatePickerDialog;
//import android.app.Dialog;
//import android.app.TimePickerDialog;
//import android.content.Context;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.text.Editable;
//import android.text.InputType;
//import android.text.TextWatcher;
//import android.util.Log;
//import android.view.View;
//import android.view.inputmethod.InputMethodManager;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.DatePicker;
//import android.widget.EditText;
//import android.widget.Spinner;
//import android.widget.TextView;
//import android.widget.TimePicker;
//import android.widget.Toast;
//
//import com.aisw.app.R;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Timer;
//import java.util.TimerTask;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.http.Field;
//import retrofit2.http.FormUrlEncoded;
//import retrofit2.http.POST;
//
//
//public class Order_Form extends AppCompatActivity implements View.OnClickListener {
//
//    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9,editText10,editText11,editText12,editText13,editText14,editText15,editText16,editText17,editText18,editText19,editText20,editText21,editText22,editText23,editText24;
//
//    String[] board_size = {"Select Your Size", "8 x 6 ft", "10 x 8 ft", "12 x 8 ft", "12 x 10 ft", "16 x 10 ft", "16 x 12 ft", "20 x 10 ft", "22 x 10 ft", "24 x 12 ft", "30 x 10 ft", "40 x 10 ft", "50 x 10 ft", "60 x 10 ft", "70 x 10 ft", "80 x 10 ft"};
//
//    Button bt_save,bt_back;
//
//    TextView auto_txt1, auto_txt2, auto_txt3, auto_txt4, auto_txt5, auto_txt6, auto_txt7, auto_txt8, auto_txt9;
//
//    String nameInput1,nameInput2,nameInput3,nameInput4,nameInput5,nameInput6,nameInput7, nameInput8,nameInput9,nameInput10,nameInput11,nameInput12,nameInput13,nameInput14,nameInput15,nameInput16,nameInput17,nameInput18,nameInput19,nameInput20,nameInput21,nameInput22,nameInput23, nameInput24, nameInput25, nameInput26, nameInput27, nameInput28, nameInput29, nameInput30, nameInput31, nameInput32, nameInput33;
//
//    Spinner spinner1;
//
//    Calendar C = Calendar.getInstance();
//    private int mYearIni, mMonthIni, mDayIni, sYearIni, sMonthIni, sDayIni,dYearIni, dMonthIni, dDayIni;
//    static final int DATE_ID = 0;
//    static final int DATE_ID1 = 1;
//    static final int DATE_ID2 = 2;
//
//    Calendar c4;
//
//    int day1,month1,year1,day2,month2,year2,day3,month3,year3;
//
//    Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl("https://docs.google.com/a/aishwaryaled.com/forms/d/e/")
//            .build();
//    final Order_Form.QuestionsSpreadsheetWebService spreadsheetWebService = retrofit.create(Order_Form.QuestionsSpreadsheetWebService.class);
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_order__form);
//
//        editText1=(EditText)findViewById(R.id.edtxt1);
//        editText2=(EditText)findViewById(R.id.edtxt2);
//        editText3=(EditText)findViewById(R.id.edtxt3);
//        editText4=(EditText)findViewById(R.id.edtxt4);
//        editText5=(EditText)findViewById(R.id.edtxt5);
//        editText6=(EditText)findViewById(R.id.edtxt6);
//        editText7=(EditText)findViewById(R.id.edtxt7);
//        editText8=(EditText)findViewById(R.id.edtxt8);
//        editText9=(EditText)findViewById(R.id.edtxt9);
//        editText10=(EditText)findViewById(R.id.edtxt10);
//        editText11=(EditText)findViewById(R.id.edtxt11);
//        editText12=(EditText)findViewById(R.id.edtxt12);
//        editText13=(EditText)findViewById(R.id.edtxt13);
//        editText14=(EditText)findViewById(R.id.edtxt14);
//        editText15=(EditText)findViewById(R.id.edtxt15);
//        editText16=(EditText)findViewById(R.id.edtxt16);
//        editText17=(EditText)findViewById(R.id.edtxt17);
//        editText18=(EditText)findViewById(R.id.edtxt18);
//        editText19=(EditText)findViewById(R.id.edtxt19);
//        editText20=(EditText)findViewById(R.id.edtxt20);
//        editText21=(EditText)findViewById(R.id.edtxt21);
//        editText22=(EditText)findViewById(R.id.edtxt22);
//        editText23=(EditText)findViewById(R.id.edtxt23);
//        editText24=(EditText)findViewById(R.id.edtxt24);
//
//
//        bt_save=(Button)findViewById(R.id.but_save);
//        bt_save.setOnClickListener(this);
//
//
//
//
//        sMonthIni = C.get(Calendar.MONTH);
//        sDayIni = C.get(Calendar.DAY_OF_MONTH);
//        sYearIni = C.get(Calendar.YEAR);
//
//
//        auto_txt1 = (TextView) findViewById(R.id.textView8);
//        auto_txt2 = (TextView) findViewById(R.id.textView10);
//        auto_txt3 = (TextView) findViewById(R.id.textView21);
//        auto_txt4 = (TextView) findViewById(R.id.textView23);
//        auto_txt5 = (TextView) findViewById(R.id.textView24);
//        auto_txt6 = (TextView) findViewById(R.id.textView25);
//        auto_txt7 = (TextView) findViewById(R.id.textView26);
//        auto_txt8 = (TextView) findViewById(R.id.textView27);
//        auto_txt9 = (TextView) findViewById(R.id.textView28);
//
//        editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
//        editText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
//        editText7.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
//        editText12.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
//        editText20.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
//        editText23.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
//
//
//
//
//
//
//
//        spinner1 = (Spinner) findViewById(R.id.spinner1aa);
//        ArrayAdapter<String> adapter123 = new ArrayAdapter<String>(Order_Form.this, android.R.layout.simple_spinner_item, board_size);
//        adapter123.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner1.setAdapter(adapter123);
//        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
//                String s0 = (String) adapterView.getItemAtPosition(position);
//                auto_txt1.setText(s0);
//                getData();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//        editText10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//                imm.hideSoftInputFromWindow(editText10.getWindowToken(), 0);
//
//
//                showDialog(DATE_ID);
//
//
//
//            }
//        });
//
//
//        editText11.setOnClickListener(new View.OnClickListener() {
//
//
//            @Override
//            public void onClick(View view) {
//
//
//
//                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//                imm.hideSoftInputFromWindow(editText11.getWindowToken(), 0);
//
//                showDialog(DATE_ID1);
//
//            }
//        });
//
//        editText8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//                imm.hideSoftInputFromWindow(editText8.getWindowToken(), 0);
//
//
//                showDialog(DATE_ID2);
//
//            }
//        });
//
////        editText9.setOnClickListener(new View.OnClickListener() {
////
////            public void onClick(View v) {
////                new TimePickerDialog(Order_Form.this, onStartTimeListener, c4
////                        .get(Calendar.HOUR), c4.get(Calendar.MINUTE), false).show();
////
////            }
////        });
//
//        editText9.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//
//                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//                imm.hideSoftInputFromWindow(editText8.getWindowToken(), 0);
//
//                Calendar mcurrentTime = Calendar.getInstance();
//                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
//                int minute = mcurrentTime.get(Calendar.MINUTE);
//                TimePickerDialog mTimePicker;
//                mTimePicker = new TimePickerDialog(Order_Form.this, new TimePickerDialog.OnTimeSetListener() {
//                    @Override
//                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
//                        editText9.setText( selectedHour + ":" + selectedMinute);
//                    }
//                }, hour, minute, true);//Yes 24 hour time
//                mTimePicker.setTitle("Select Time");
//                mTimePicker.show();
//
//            }
//        });
//
//
//
//        editText5.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//            }
//
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//                if (s.length() > 10) {
//                    editText5.setError("More than 10-digit");
//                } else {
//                }
//            }
//        });
//
//        editText6.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//            }
//
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//                if (s.length() > 10) {
//                    editText6.setError("More than 10-digit");
//                } else {
//                }
//            }
//        });
//
//        editText21.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//            }
//
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//                if (s.length() > 10) {
//                    editText21.setError("More than 10-digit");
//                } else {
//                }
//            }
//        });
//
//
//        editText10.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//            }
//
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//                if(s.toString().length() > 0) {
//                    editText10.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
//                } else {
//                    //Assign your image again to the view, otherwise it will always be gone even if the text is 0 again.
//                    editText10.setCompoundDrawablesWithIntrinsicBounds(R.drawable.calendar_icon, 0, 0, 0);
//                }
//            }
//        });
//
//        editText11.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//            }
//
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//                if(s.toString().length() > 0) {
//                    editText11.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
//                } else {
//                    //Assign your image again to the view, otherwise it will always be gone even if the text is 0 again.
//                    editText11.setCompoundDrawablesWithIntrinsicBounds(R.drawable.calendar_icon, 0, 0, 0);
//                }
//            }
//        });
//
//        editText8.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//            }
//
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//                if(s.toString().length() > 0) {
//                    editText8.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
//                } else {
//                    //Assign your image again to the view, otherwise it will always be gone even if the text is 0 again.
//                    editText8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.calendar_icon, 0, 0, 0);
//                }
//            }
//        });
//
//
//
//    }
//
//
//
//    @Override
//    public void onClick(View v) {
//
//        nameInput1 = editText1.getText().toString();
//        nameInput2 = editText2.getText().toString();
//        nameInput3 = editText3.getText().toString();
//        nameInput4 = editText4.getText().toString();
//        nameInput5 = editText5.getText().toString();
//        nameInput6 = editText6.getText().toString();
//        nameInput7 = editText7.getText().toString();
//        nameInput8 = editText8.getText().toString();
//        nameInput9 = editText9.getText().toString();
//        nameInput10 = editText10.getText().toString();
//        nameInput11 = editText11.getText().toString();
//        nameInput12 = editText12.getText().toString();
//        nameInput13 = editText13.getText().toString();
//        nameInput14 = editText14.getText().toString();
//        nameInput15 = auto_txt1.getText().toString();
//        nameInput16 = auto_txt2.getText().toString();
//        nameInput17 = auto_txt3.getText().toString();
//        nameInput18 = auto_txt4.getText().toString();
//        nameInput19 = auto_txt5.getText().toString();
//        nameInput20 = auto_txt6.getText().toString();
//        nameInput21 = auto_txt7.getText().toString();
//        nameInput22 = auto_txt8.getText().toString();
//        nameInput23 = auto_txt9.getText().toString();
//        nameInput24 = editText15.getText().toString();
//        nameInput25 = editText16.getText().toString();
//        nameInput26 = editText17.getText().toString();
//        nameInput27 = editText18.getText().toString();
//        nameInput28 = editText19.getText().toString();
//        nameInput29 = editText20.getText().toString();
//        nameInput30 = editText21.getText().toString();
//        nameInput31 = editText22.getText().toString();
//        nameInput32 = editText23.getText().toString();
//        nameInput33 = editText24.getText().toString();
//
//
//
//
//        Call<Void> completeQuestionnaireCall = spreadsheetWebService.completeQuestionnaire(nameInput1,nameInput2,nameInput3,nameInput4,nameInput5,nameInput6,nameInput7, nameInput8,nameInput9,nameInput10,nameInput11,nameInput12,nameInput13,nameInput14,nameInput15,nameInput16,nameInput17,nameInput18,nameInput19,nameInput20,nameInput21,nameInput22,nameInput23, nameInput24, nameInput25, nameInput26, nameInput27, nameInput28, nameInput29, nameInput30, nameInput31, nameInput32,nameInput33);
//        completeQuestionnaireCall.enqueue(callCallback);
//
//        finish();
//
//        Toast.makeText(getApplicationContext(),"Updated Successfully",Toast.LENGTH_LONG).show();
//
//    }
//
//
//
//
//    void getData() {
//        if (auto_txt1.getText().equals("8 x 6 ft")) {
//            auto_txt2.setText("20");
//            auto_txt3.setText("5 x 4");
//            auto_txt4.setText("640 x 512");
//            auto_txt5.setText("4");
//            auto_txt6.setText("20 + 4 = 24");
//            auto_txt7.setText("20 + 4 = 24");
//            auto_txt8.setText("1, Low End");
//            auto_txt9.setText("1");
//        } else if (auto_txt1.getText().equals("10 x 8 ft")) {
//            auto_txt2.setText("30");
//            auto_txt3.setText("6 x 5");
//            auto_txt4.setText("768 x 640");
//            auto_txt5.setText("6");
//            auto_txt6.setText("30 + 6 = 36");
//            auto_txt7.setText("30 + 6 = 36");
//            auto_txt8.setText("1, Low End");
//            auto_txt9.setText("1");
//        } else if (auto_txt1.getText().equals("12 x 8 ft")) {
//            auto_txt2.setText("35");
//            auto_txt3.setText("7 x 5");
//            auto_txt4.setText("896 x 640");
//            auto_txt5.setText("0");
//            auto_txt6.setText("35 + 1 = 36");
//            auto_txt7.setText("35 + 1 = 36");
//            auto_txt8.setText("1, Low End");
//            auto_txt9.setText("1");
//        } else if (auto_txt1.getText().equals("12 x 10 ft")) {
//            auto_txt2.setText("60");
//            auto_txt3.setText("7 x 6");
//            auto_txt4.setText("896 x 768");
//            auto_txt5.setText("0");
//            auto_txt6.setText("48 + 0 = 48");
//            auto_txt7.setText("48 + 0 = 48");
//            auto_txt8.setText("1, Low End");
//            auto_txt9.setText("1");
//        } else if (auto_txt1.getText().equals("16 x 10 ft")) {
//            auto_txt2.setText("60");
//            auto_txt3.setText("10 x 6");
//            auto_txt4.setText("1280 x 768");
//            auto_txt5.setText("6");
//            auto_txt6.setText("60 + 6 = 66");
//            auto_txt7.setText("60 + 6 = 66");
//            auto_txt8.setText("1, Low End");
//            auto_txt9.setText("1");
//        } else if (auto_txt1.getText().equals("16 x 12 ft")) {
//            auto_txt2.setText("70");
//            auto_txt3.setText("10 x 7");
//            auto_txt4.setText("1280 x 896");
//            auto_txt5.setText("4");
//            auto_txt6.setText("70 + 4 = 74");
//            auto_txt7.setText("70 + 4 = 74");
//            auto_txt8.setText("1, Low End");
//            auto_txt9.setText("1");
//        } else if (auto_txt1.getText().equals("20 x 10 ft")) {
//            auto_txt2.setText("72");
//            auto_txt3.setText("12 x 6");
//            auto_txt4.setText("1536 x 768");
//            auto_txt5.setText("6");
//            auto_txt6.setText("72 + 6 = 78");
//            auto_txt7.setText("72 + 6 = 78");
//            auto_txt8.setText("1, Low End");
//            auto_txt9.setText("1");
//        } else if (auto_txt1.getText().equals("22 x 10 ft")) {
//            auto_txt2.setText("84");
//            auto_txt3.setText("14 x 6");
//            auto_txt4.setText("1792 x 1280");
//            auto_txt5.setText("6");
//            auto_txt6.setText("84 + 6 = 90");
//            auto_txt7.setText("84 + 6 = 90");
//            auto_txt8.setText("1, Low End");
//            auto_txt9.setText("1");
//        } else if (auto_txt1.getText().equals("24 x 12 ft")) {
//            auto_txt2.setText("105");
//            auto_txt3.setText("15 x 7");
//            auto_txt4.setText("1920 x 896");
//            auto_txt5.setText("3");
//            auto_txt6.setText("105 + 3 = 108");
//            auto_txt7.setText("105 + 3 = 108");
//            auto_txt8.setText("1, High End");
//            auto_txt9.setText("2");
//        } else if (auto_txt1.getText().equals("30 x 10 ft")) {
//            auto_txt2.setText("108");
//            auto_txt3.setText("18 x 6");
//            auto_txt4.setText("2304 x 768");
//            auto_txt5.setText("6");
//            auto_txt6.setText("108 + 6 = 114");
//            auto_txt7.setText("108 + 6 = 114");
//            auto_txt8.setText("1, High End");
//            auto_txt9.setText("2");
//        } else if (auto_txt1.getText().equals("40 x 10 ft")) {
//            auto_txt2.setText("144");
//            auto_txt3.setText("24 x 6");
//            auto_txt4.setText("3072 x 768");
//            auto_txt5.setText("6");
//            auto_txt6.setText("144 + 6 = 150");
//            auto_txt7.setText("144 + 6 = 150");
//            auto_txt8.setText("1, High End");
//            auto_txt9.setText("2");
//        } else if (auto_txt1.getText().equals("50 x 10 ft")) {
//            auto_txt2.setText("180");
//            auto_txt3.setText("30 x 6");
//            auto_txt4.setText("3840 x 768");
//            auto_txt5.setText("6");
//            auto_txt6.setText("180 + 6 = 186");
//            auto_txt7.setText("180 + 6 = 186");
//            auto_txt8.setText("1, High End");
//            auto_txt9.setText("2");
//        } else if (auto_txt1.getText().equals("60 x 10 ft")) {
//            auto_txt2.setText("216");
//            auto_txt3.setText("36 x 6");
//            auto_txt4.setText("4608 x 768");
//            auto_txt5.setText("6");
//            auto_txt6.setText("216 + 6 = 222");
//            auto_txt7.setText("216 + 6 = 222");
//            auto_txt8.setText("1, High End");
//            auto_txt9.setText("3");
//        } else if (auto_txt1.getText().equals("70 x 10 ft")) {
//            auto_txt2.setText("252");
//            auto_txt3.setText("42 x 6");
//            auto_txt4.setText("5376 x 768");
//            auto_txt5.setText("6");
//            auto_txt6.setText("252 + 6 = 258");
//            auto_txt7.setText("252 + 6 = 258");
//            auto_txt8.setText("1, High End");
//            auto_txt9.setText("3");
//        } else if (auto_txt1.getText().equals("80 x 10 ft")) {
//            auto_txt2.setText("288");
//            auto_txt3.setText("48 x 6");
//            auto_txt4.setText("6144 x 768");
//            auto_txt5.setText("6");
//            auto_txt6.setText("288 + 6 = 294");
//            auto_txt7.setText("288 + 6 = 294");
//            auto_txt8.setText("1, High End");
//            auto_txt9.setText("3");
//        } else if (auto_txt1.getText().equals("Select Your Size")) {
//            auto_txt2.setText("Null");
//            auto_txt3.setText("Null");
//            auto_txt4.setText("Null");
//            auto_txt5.setText("Null");
//            auto_txt6.setText("Null");
//            auto_txt7.setText("Null");
//            auto_txt8.setText("Null");
//            auto_txt9.setText("Null");
//        }
//    }
//
//    private void colocar_fecha() {
//
//        day1 = mDayIni;
//        month1 = mMonthIni+1;
//        year1 = mYearIni;
//        editText10.setText(day1 + "-" + month1 + "-" + year1 + " ");
//        Log.e("day:::::",day1+"::moth::::::"+month1+"::year::::::::::"+year1);
//
//    }
//
//    private void colocar_fecha1() {
//        day2 = sDayIni;
//        month2 = sMonthIni+1;
//        year2 = sYearIni;
//        editText11.setText(day2 + "-" + month2 + "-" + year2 + " ");
//        Log.e("day2:::::",day2+"::moth2::::::"+month2+"::year2::::::::::"+year2);
//
//    }
//
//    private void colocar_fecha2() {
//
//        day3 = dDayIni;
//        month3 = dMonthIni+1;
//        year3 = dYearIni;
//        editText8.setText(day3 + "-" + month3 + "-" + year3 + " ");
//        Log.e("day:::::",day3+"::moth::::::"+month3+"::year::::::::::"+year3);
//
//    }
//
//    private DatePickerDialog.OnDateSetListener mDateSetListener =
//            new DatePickerDialog.OnDateSetListener() {
//                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//
//                    mYearIni = year;
//                    mMonthIni = monthOfYear;
//                    mDayIni = dayOfMonth;
//
//                    colocar_fecha();
//
//                }
//
//            };
//
//    private DatePickerDialog.OnDateSetListener sDateSetListener =
//            new DatePickerDialog.OnDateSetListener() {
//                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//
//                    sYearIni = year;
//                    sMonthIni = monthOfYear;
//                    sDayIni = dayOfMonth;
//
//                    colocar_fecha1();
//
//
//                }
//
//            };
//
//    private DatePickerDialog.OnDateSetListener dDateSetListener =
//            new DatePickerDialog.OnDateSetListener() {
//                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//
//                    dYearIni = year;
//                    dMonthIni = monthOfYear;
//                    dDayIni = dayOfMonth;
//
//                    colocar_fecha2();
//
//
//                }
//
//            };
//
//
//
//    @Override
//    protected Dialog onCreateDialog(int id) {
//
//        Calendar c1=Calendar.getInstance();
//        Calendar c2 = Calendar.getInstance();
//        Calendar c3 = Calendar.getInstance();
//
//
//
//        switch (id) {
//            case DATE_ID:
//
//                DatePickerDialog da = new DatePickerDialog(this, mDateSetListener, mYearIni, mMonthIni, mDayIni);
//
//
//                c1.add(Calendar.DATE, 1);
//                Date newDate = c1.getTime();
//                da.getDatePicker().setMinDate(newDate.getTime());
//                return da;
//
//
//            case DATE_ID1:
//
//                DatePickerDialog da1 = new DatePickerDialog(this, sDateSetListener, sYearIni, sMonthIni, sDayIni);
//
//                c2.add(Calendar.DATE, 1);
//                Date newDate1 = c2.getTime();
//                da1.getDatePicker().setMinDate(newDate1.getTime());
//                return da1;
//
//            case DATE_ID2:
//
//                DatePickerDialog da2 = new DatePickerDialog(this, dDateSetListener, dYearIni, dMonthIni, dDayIni);
//
//                c3.add(Calendar.DATE, 1);
//                Date newDate2 = c3.getTime();
//                da2.getDatePicker().setMinDate(newDate2.getTime());
//                return da2;
//
//        }
//
//        return null;
//    }
//
//
//
//
//    private final Callback<Void> callCallback = new Callback<Void>() {
//        @Override
//        public void onResponse(Call<Void> call, Response<Void> response) {
//            Log.d("XXX", "Submitted. " + response);
//        }
//
//        @Override
//        public void onFailure(Call<Void> call, Throwable t) {
//            Log.e("XXX", "Failed", t);
//        }
//    };
//
//    public interface QuestionsSpreadsheetWebService {
//
//        @POST("1FAIpQLSdqF7mQPN46RcFZAXW0Kffh7--mxa2nlSxawKGtV-yrw4sFYw/formResponse")
//        @FormUrlEncoded
//        Call<Void> completeQuestionnaire(
//                @Field("entry.983823941") String name,
//                @Field("entry.3378242") String person_name,
//                @Field("entry.1196423754") String address,
//                @Field("entry.1277683454") String email,
//                @Field("entry.1757113119") String mobile_1,
//                @Field("entry.1625598011") String mobile_alt,
//                @Field("entry.212828666") String show_name,
//                @Field("entry.1339156267") String setup_date,
//                @Field("entry.2004174998") String setup_time,
//                @Field("entry.1087499936") String from_date,
//                @Field("entry.777148563") String to_date,
//                @Field("entry.1369747423") String venue,
//                @Field("entry.2102714671") String stage_height,
//                @Field("entry.691932346") String venue_address,
//                @Field("entry.973583678") String board_size,
//                @Field("entry.2099892388") String total_panels,
//                @Field("entry.1513598255") String panel_setup,
//                @Field("entry.1641345089") String total_pixels,
//                @Field("entry.1898601532") String spare,
//                @Field("entry.609661218") String signal_loop,
//                @Field("entry.2100628986") String power_loop,
//                @Field("entry.832273253") String processor,
//                @Field("entry.1276972900") String laptop,
//                @Field("entry.2068008371") String numberofbox,
//                @Field("entry.987435900") String total_amount,
//                @Field("entry.2032681669") String advance_amount,
//                @Field("entry.1229693144") String credit_period,
//                @Field("entry.388366845") String transport,
//                @Field("entry.1852653284") String photographer_name,
//                @Field("entry.1504543351") String photo_mobile,
//                @Field("entry.1719059728") String photo_email,
//                @Field("entry.1265497114") String marketing_person_name,
//                @Field("entry.17460981") String remarks
//                );
//    }
//
//
//
//
//}
