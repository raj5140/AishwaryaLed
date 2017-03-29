package com.aisw.app.fragment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;


import com.aisw.app.R;


import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;


public class Welcome_Slide2 extends Fragment {

    EditText edtxt12, edtxt13, editText7, edtxt1a, edtxt2a, edtxt3a, edtxt4a, edtxt5a, edtext11, edtext22, edtext33, edtext44, edtext55;

    EditText editText2, editText3, editText8, editText9, editText10, editText11, width, height, boardNum, totalCst;

    EditText zerotextView, noOfDaysEdt, noOfDaysView, noOfDaysTotal, overAllSqFt, ratePerSqFt, totalAmount, transport, stageHeight, powerModel, otherCost1, otherCost2, grossAmount;

    EditText editTextInv,editText2Inv,editText3Inv;
    int e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19;

    private static final String LOG_TAG = "Welcome_Slide2";

    View view;

    String eE;


    ImageButton plusbtn;
    LinearLayout linearBelowBoard;

    int i = 0;

    RadioButton radioButton, radioButton2, radioButton3, radioButton4;

    int day1, month1, year1, day2, month2, year2, day3, month3, year3, day4, month4, year4, day5, month5, year5;

    private int mYearIni, mMonthIni, mDayIni, sYearIni, sMonthIni, sDayIni, mYearIni1, mMonthIni1, mDayIni1, sYearIni2, sMonthIni2, sDayIni2, mYearIni3, mMonthIni3, mDayIni3;


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View myFragmentView = inflater.inflate(R.layout.welcome_slide2, container, false);

        view = myFragmentView;
        linearBelowBoard = (LinearLayout) myFragmentView.findViewById(R.id.linearBelowBoard);
//        noOfBoards=(LinearLayout)myFragmentView.findViewById(R.id.linearBelowBoard2);
//        total=(LinearLayout)myFragmentView.findViewById(R.id.linearBelowBoard3);


        edtxt12 = (EditText) myFragmentView.findViewById(R.id.edtxt12);
        edtxt13 = (EditText) myFragmentView.findViewById(R.id.edtxt13);
        radioButton = (RadioButton) myFragmentView.findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) myFragmentView.findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) myFragmentView.findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) myFragmentView.findViewById(R.id.radioButton4);
        editTextInv= (EditText) myFragmentView.findViewById(R.id.editTextInv);
        editText2Inv= (EditText) myFragmentView.findViewById(R.id.editText2Inv);
        editText3Inv= (EditText) myFragmentView.findViewById(R.id.editText3Inv);



        edtxt12.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);

        edtxt1a = (EditText) myFragmentView.findViewById(R.id.edtxt1a);
        edtxt2a = (EditText) myFragmentView.findViewById(R.id.edtxt2a);
        edtxt3a = (EditText) myFragmentView.findViewById(R.id.edtxt3a);
        edtxt4a = (EditText) myFragmentView.findViewById(R.id.edtxt4a);
        edtxt5a = (EditText) myFragmentView.findViewById(R.id.edtxt5a);
        edtext11 = (EditText) myFragmentView.findViewById(R.id.edtext11);
        edtext22 = (EditText) myFragmentView.findViewById(R.id.edtext22);
        edtext33 = (EditText) myFragmentView.findViewById(R.id.edtext33);
        edtext44 = (EditText) myFragmentView.findViewById(R.id.edtext44);
        edtext55 = (EditText) myFragmentView.findViewById(R.id.edtext55);
        editText9 = (EditText) myFragmentView.findViewById(R.id.editText9);
        editText11 = (EditText) myFragmentView.findViewById(R.id.editText11);

        overAllSqFt = (EditText) myFragmentView.findViewById(R.id.editText5a);
        ratePerSqFt = (EditText) myFragmentView.findViewById(R.id.editText5);
        totalAmount = (EditText) myFragmentView.findViewById(R.id.editText6);
        transport = (EditText) myFragmentView.findViewById(R.id.editText7);
        stageHeight = (EditText) myFragmentView.findViewById(R.id.editText8);
        powerModel = (EditText) myFragmentView.findViewById(R.id.editText10);
        otherCost1 = (EditText) myFragmentView.findViewById(R.id.editText13);
        otherCost2 = (EditText) myFragmentView.findViewById(R.id.editText13b);
        grossAmount = (EditText) myFragmentView.findViewById(R.id.editText14);




        plusbtn = (ImageButton) myFragmentView.findViewById(R.id.imageButton3);


        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked(radioButton);
            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked(radioButton2);

            }
        });

        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked(radioButton3);
            }
        });

        radioButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked(radioButton4);
            }
        });


        editText9.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                radioAction();
            }
        });

        stageHeight.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                radioAction();
            }
        });

        editText11.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                radioAction1();

            }
        });

        powerModel.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                radioAction1();
            }
        });

        edtxt1a.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.toString().length() > 0) {
                    edtxt1a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                } else {
                    //Assign your image again to the view, otherwise it will always be gone even if the text is 0 again.
                    edtxt1a.setCompoundDrawablesWithIntrinsicBounds(R.drawable.calendar_icon, 0, 0, 0);
                }
            }
        });

        edtxt2a.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.toString().length() > 0) {
                    edtxt2a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                } else {
                    //Assign your image again to the view, otherwise it will always be gone even if the text is 0 again.
                    edtxt2a.setCompoundDrawablesWithIntrinsicBounds(R.drawable.calendar_icon, 0, 0, 0);
                }
            }
        });

        edtxt3a.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.toString().length() > 0) {
                    edtxt3a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                } else {
                    //Assign your image again to the view, otherwise it will always be gone even if the text is 0 again.
                    edtxt3a.setCompoundDrawablesWithIntrinsicBounds(R.drawable.calendar_icon, 0, 0, 0);
                }
            }
        });

        edtxt4a.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.toString().length() > 0) {
                    edtxt4a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                } else {
                    //Assign your image again to the view, otherwise it will always be gone even if the text is 0 again.
                    edtxt4a.setCompoundDrawablesWithIntrinsicBounds(R.drawable.calendar_icon, 0, 0, 0);
                }
            }
        });

        edtxt5a.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.toString().length() > 0) {
                    edtxt5a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                } else {
                    //Assign your image again to the view, otherwise it will always be gone even if the text is 0 again.
                    edtxt5a.setCompoundDrawablesWithIntrinsicBounds(R.drawable.calendar_icon, 0, 0, 0);
                }
            }
        });

        edtxt1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edtxt1a.getWindowToken(), 0);

                showDispatchCalendar();

            }
        });


        edtxt2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edtxt2a.getWindowToken(), 0);
                showStartCalendar();
            }
        });

        edtxt3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edtxt3a.getWindowToken(), 0);
                showSetupCalendar();
            }
        });

        edtxt4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edtxt4a.getWindowToken(), 0);
                showEndCalendar();
            }
        });

        edtxt5a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edtxt5a.getWindowToken(), 0);
                showDismantelCalendar();
            }
        });

        edtext11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edtext11.getWindowToken(), 0);

                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        edtext11.setText(selectedHour + ":" + selectedMinute);

                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });

        edtext22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edtext22.getWindowToken(), 0);

                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        edtext22.setText(selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });

        edtext33.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edtext33.getWindowToken(), 0);

                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        edtext33.setText(selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });

        edtext44.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edtext44.getWindowToken(), 0);

                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        edtext44.setText(selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });

        edtext55.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edtext55.getWindowToken(), 0);

                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        edtext55.setText(selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });


        ratePerSqFt.addTextChangedListener(new MyTextWatcher2(ratePerSqFt, transport, stageHeight, powerModel, otherCost1, otherCost2));


        transport.addTextChangedListener(new MyTextWatcher2(ratePerSqFt, transport, stageHeight, powerModel, otherCost1, otherCost2));

        stageHeight.addTextChangedListener(new MyTextWatcher2(ratePerSqFt, transport, stageHeight, powerModel, otherCost1, otherCost2));

        powerModel.addTextChangedListener(new MyTextWatcher2(ratePerSqFt, transport, stageHeight, powerModel, otherCost1, otherCost2));

        otherCost1.addTextChangedListener(new MyTextWatcher2(ratePerSqFt, transport, stageHeight, powerModel, otherCost1, otherCost2));

        otherCost2.addTextChangedListener(new MyTextWatcher2(ratePerSqFt, transport, stageHeight, powerModel, otherCost1, otherCost2));


        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater =
                        (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View addView = layoutInflater.inflate(R.layout.row, null);


                width = (EditText) addView.findViewById(R.id.width);
                zerotextView = (EditText) addView.findViewById(R.id.zerotextView);
                height = (EditText) addView.findViewById(R.id.height);
                boardNum = (EditText) addView.findViewById(R.id.boardNum);
                totalCst = (EditText) addView.findViewById(R.id.totalCst);

                noOfDaysEdt = (EditText) addView.findViewById(R.id.noOfDaysEdt);
                noOfDaysView = (EditText) addView.findViewById(R.id.editTotal);
                noOfDaysTotal = (EditText) addView.findViewById(R.id.daysEditTotal);

                width.addTextChangedListener(new MyTextWatcher(height, width, boardNum, totalCst, zerotextView, noOfDaysEdt, noOfDaysView, noOfDaysTotal));
                height.addTextChangedListener(new MyTextWatcher(height, width, boardNum, totalCst, zerotextView, noOfDaysEdt, noOfDaysView, noOfDaysTotal));
                boardNum.addTextChangedListener(new MyTextWatcher(height, width, boardNum, totalCst, zerotextView, noOfDaysEdt, noOfDaysView, noOfDaysTotal));
                noOfDaysEdt.addTextChangedListener(new MyTextWatcher(height, width, boardNum, totalCst, zerotextView, noOfDaysEdt, noOfDaysView, noOfDaysTotal));

                ImageButton buttonRemove = (ImageButton) addView.findViewById(R.id.remove);
                final View.OnClickListener thisListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ((LinearLayout) addView.getParent()).removeView(addView);

                        calCheck4();

                    }
                };


                buttonRemove.setOnClickListener(thisListener);
                linearBelowBoard.addView(addView);
            }

        });


        grossAmount.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                EventBus.getDefault().post(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        return myFragmentView;
    }


    private void showDispatchCalendar() {
        Calendar c1 = Calendar.getInstance();
        DatePickerDialog da = new DatePickerDialog(getActivity(), mDateSetListener, sYearIni, sMonthIni, sDayIni);
        c1.add(DATE, 0);
        Date newDate = c1.getTime();
        da.getDatePicker().setMinDate(newDate.getTime());
//        long newDate = System.currentTimeMillis();
//        da.getDatePicker().setMinDate(newDate);
        da.show();

    }

    private void showStartCalendar() {

        Calendar c2 = Calendar.getInstance();
        DatePickerDialog da1 = new DatePickerDialog(getActivity(), sDateSetListener, mYearIni, mMonthIni, mDayIni);
        c2.set(YEAR, mYearIni);
        c2.set(MONTH, mMonthIni);
        c2.set(DAY_OF_MONTH, mDayIni);
        c2.add(DATE, 0);
        Date newDate1 = c2.getTime();
        da1.getDatePicker().setMinDate(newDate1.getTime());
        da1.show();

    }

    private DatePickerDialog.OnDateSetListener sDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    sYearIni = year;
                    sMonthIni = monthOfYear;
                    sDayIni = dayOfMonth;

                    colocar_fecha1();
                }
            };

    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    mYearIni = year;
                    mMonthIni = monthOfYear;
                    mDayIni = dayOfMonth;

                    colocar_fecha();
                }
            };

    private void colocar_fecha() {

        day1 = mDayIni;
        month1 = mMonthIni + 1;
        year1 = mYearIni;
        edtxt2a.setEnabled(true);
        edtxt2a.setBackgroundResource(R.drawable.rounded_border_edittext);
        edtxt1a.setText(day1 + "-" + month1 + "-" + year1 + " ");
    }

    private void colocar_fecha1() {

        day2 = sDayIni;
        month2 = sMonthIni + 1;
        year2 = sYearIni;
        edtxt3a.setEnabled(true);
        edtxt3a.setBackgroundResource(R.drawable.rounded_border_edittext);

        edtxt2a.setText(day2 + "-" + month2 + "-" + year2 + " ");

        edtext22.setEnabled(true);
        edtext22.setBackgroundResource(R.drawable.rounded_border_edittext);
        dateCheck();
    }

    private void showSetupCalendar() {
        Calendar c3 = Calendar.getInstance();
        DatePickerDialog da2 = new DatePickerDialog(getActivity(), sDateSetListener3, sYearIni, sMonthIni, sDayIni);
        c3.set(YEAR, sYearIni);
        c3.set(MONTH, sMonthIni);
        c3.set(DAY_OF_MONTH, sDayIni);
        c3.add(DATE, 0);
        Date newDate2 = c3.getTime();
        da2.getDatePicker().setMinDate(newDate2.getTime());
        da2.show();
    }

    private DatePickerDialog.OnDateSetListener sDateSetListener3 =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    mYearIni1 = year;
                    mMonthIni1 = monthOfYear;
                    mDayIni1 = dayOfMonth;

                    colocar_fecha2();
                }
            };


    private void colocar_fecha2() {
        day3 = mDayIni1;
        month3 = mMonthIni1 + 1;
        year3 = mYearIni1;
        edtxt4a.setEnabled(true);
        edtxt4a.setBackgroundResource(R.drawable.rounded_border_edittext);

        edtxt3a.setText(day3 + "-" + month3 + "-" + year3 + " ");

        edtext33.setEnabled(true);
        edtext33.setBackgroundResource(R.drawable.rounded_border_edittext);

    }

    private void showEndCalendar() {
        Calendar c4 = Calendar.getInstance();
        DatePickerDialog da3 = new DatePickerDialog(getActivity(), sDateSetListener4, mYearIni1, mMonthIni1, mDayIni1);
        c4.set(YEAR, mYearIni1);
        c4.set(MONTH, mMonthIni1);
        c4.set(DAY_OF_MONTH, mDayIni1);
        c4.add(DATE, 0);
        Date newDate3 = c4.getTime();
        da3.getDatePicker().setMinDate(newDate3.getTime());
        da3.show();
    }

    private DatePickerDialog.OnDateSetListener sDateSetListener4 =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    sYearIni2 = year;
                    sMonthIni2 = monthOfYear;
                    sDayIni2 = dayOfMonth;

                    colocar_fecha3();
                }
            };


    private void colocar_fecha3() {
        day4 = sDayIni2;
        month4 = sMonthIni2 + 1;
        year4 = sYearIni2;
        edtxt5a.setEnabled(true);
        edtxt5a.setBackgroundResource(R.drawable.rounded_border_edittext);
        edtxt4a.setText(day4 + "-" + month4 + "-" + year4 + " ");
        edtext44.setEnabled(true);
        edtext44.setBackgroundResource(R.drawable.rounded_border_edittext);
    }

    private void showDismantelCalendar() {
        Calendar c5 = Calendar.getInstance();
        DatePickerDialog da4 = new DatePickerDialog(getActivity(), sDateSetListener5, sYearIni2, sMonthIni2, sDayIni2);
        c5.set(YEAR, sYearIni2);
        c5.set(MONTH, sMonthIni2);
        c5.set(DAY_OF_MONTH, sDayIni2);
        c5.add(DATE, 0);
        Date newDate4 = c5.getTime();
        da4.getDatePicker().setMinDate(newDate4.getTime());
        da4.show();
    }

    private DatePickerDialog.OnDateSetListener sDateSetListener5 =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                    mYearIni3 = year;
                    mMonthIni3 = monthOfYear;
                    mDayIni3 = dayOfMonth;

                    colocar_fecha4();
                }
            };


    private void colocar_fecha4() {
        day5 = mDayIni3;
        month5 = mMonthIni3 + 1;
        year5 = mYearIni3;
        edtxt5a.setText(day5 + "-" + month5 + "-" + year5 + " ");
        edtext55.setEnabled(true);
        edtext55.setBackgroundResource(R.drawable.rounded_border_edittext);
    }

    public void dateCheck() {

//        if (day1 >= day2 || month1 >= month2 || year1 >= year2) {
//            if (year1 + month1 + day1 >= year2 + month2 + day2) {
//                Toast.makeText(getContext(), "From-Date Should not be greater than To-Date", Toast.LENGTH_LONG).show();
//                edtxt2a.setError("From-Date Should not be greater than To-Date");
//
//            } else {
//
//            }
//        } else {
//            edtxt2a.setError(null);
//
//        }
    }


    private class MyTextWatcher implements TextWatcher {

        EditText mEditText1 = null;
        EditText mEditText2 = null;
        EditText mEditText3 = null;
        EditText mEditText4 = null;
        EditText textView = null;
        EditText mEditText5 = null;
        EditText mEditText6 = null;
        EditText mEditText7 = null;


        public MyTextWatcher(EditText mEditText1, EditText mEditText2, EditText mEditText3, EditText mEditText4, EditText textView, EditText mEditText5, EditText mEditText6, EditText mEditText7) {
            this.textView = textView;
            this.mEditText1 = mEditText1;
            this.mEditText2 = mEditText2;
            this.mEditText3 = mEditText3;
            this.mEditText4 = mEditText4;
            this.mEditText5 = mEditText5;
            this.mEditText6 = mEditText6;
            this.mEditText7 = mEditText7;
        }


        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            calCheck(mEditText1, mEditText2, mEditText3, mEditText4, textView, mEditText5, mEditText6, mEditText7);


        }
    }

    public void calCheck(EditText height, EditText width, EditText boardNum, EditText totalCst, EditText zerotextView, EditText noOfDaysEdt, EditText noOfDaysView, EditText noOfDaysTotal) {

        try {

            e1 = width.getText().toString().equals("") ? 0 : Integer.parseInt(width.getText().toString());

            e2 = height.getText().toString().equals("") ? 0 : Integer.parseInt(height.getText().toString());
            e3 = e1 * e2;
            zerotextView.setText(Integer.toString(e3));

            e4 = zerotextView.getText().toString().equals("") ? 0 : Integer.parseInt(zerotextView.getText().toString());
            e5 = boardNum.getText().toString().equals("") ? 0 : Integer.parseInt(boardNum.getText().toString());
            e6 = e4 * e5;
            totalCst.setText(Integer.toString(e6));

            e7 = noOfDaysEdt.getText().toString().equals("") ? 0 : Integer.parseInt(noOfDaysEdt.getText().toString());
            e8 = totalCst.getText().toString().equals("") ? 0 : Integer.parseInt(totalCst.getText().toString());
            e9 = e7 * e8;

            noOfDaysView.setText(Integer.toString(e7));
            noOfDaysTotal.setText(Integer.toString(e9));

            calCheck2();
            plusAction();


            e11 = overAllSqFt.getText().toString().equals("") ? 0 : Integer.parseInt(overAllSqFt.getText().toString());
            e19 = e13 + e14 + e15 + e16 + e17 + e18;
            grossAmount.setText(Integer.toString(e19));

            e12 = ratePerSqFt.getText().toString().equals("") ? 0 : Integer.parseInt(ratePerSqFt.getText().toString());
            e13 = e11 * e12;
            totalAmount.setText(Integer.toString(e13));

            e19 = e13 + e14 + e15 + e16 + e17 + e18;
            grossAmount.setText(Integer.toString(e19));

            e14 = transport.getText().toString().equals("") ? 0 : Integer.parseInt(transport.getText().toString());
            e19 = e13 + e14 + e15 + e16 + e17 + e18;
            grossAmount.setText(Integer.toString(e19));


            e17 = otherCost1.getText().toString().equals("") ? 0 : Integer.parseInt(otherCost1.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));

            e18 = otherCost2.getText().toString().equals("") ? 0 : Integer.parseInt(otherCost2.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));

            e15 = stageHeight.getText().toString().equals("") ? 0 : Integer.parseInt(stageHeight.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));

            e16 = powerModel.getText().toString().equals("") ? 0 : Integer.parseInt(powerModel.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void calCheck2() {

        try {
            if (linearBelowBoard != null) {
                e10 = 0;
                for (int i = 0; i < linearBelowBoard.getChildCount(); i++) {
                    EditText editTett = getEditTextFromPosition(i);
                    String str = editTett.getText().toString();
                    if (!str.isEmpty()) {
                        e10 = e10 + Integer.parseInt(editTett.getText().toString());
                    }
                }
            }
            overAllSqFt.setText(String.valueOf(e10));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void plusAction() {




        try {
            eE="";
            editTextInv.setSingleLine(false);
            for (int i = 0; i < linearBelowBoard.getChildCount(); i++) {
                EditText editTett = getEditTextFromPosition(i);
                String str = editTett.getText().toString();
                EditText widthi = getEditTextFromPositionWidth(i);

                String widthii = widthi.getText().toString();

                editTextInv.setText("Board Size : "+widthi.getText().toString()+" X "+height.getText().toString()+" = "+zerotextView.getText().toString()+"\n No. of Boards : "+boardNum.getText().toString()+" = "+totalCst.getText().toString()+"(Total Sqft)"+"\n Days : "+noOfDaysEdt.getText().toString()+" = "+noOfDaysTotal.getText().toString()+"(in sqft)");

                eE= eE+"\n \n"+"Board Size : "+widthi.getText().toString()+" X "+height.getText().toString()+" = "+zerotextView.getText().toString()+"\n No. of Boards : "+boardNum.getText().toString()+" = "+totalCst.getText().toString()+"(Total Sqft)"+"\n Days : "+noOfDaysEdt.getText().toString()+" = "+noOfDaysTotal.getText().toString()+"(in sqft)";



                Log.d(LOG_TAG, "plusAction: " + "total days : " + str + "         width " + widthii);

                }
            editTextInv.setText(eE);
//            editTextInv.setText("Board Size : "+widthii.getText().toString()+" X "+height.getText().toString()+" = "+zerotextView.getText().toString()+"\n No. of Boards : "+boardNum.getText().toString()+" = "+totalCst.getText().toString()+"(Total Sqft)"+"\n Days : "+noOfDaysEdt.getText().toString()+" = "+noOfDaysTotal.getText().toString()+"(in sqft)");
            }catch (Exception e){

        }

    }

    private EditText getEditTextFromPosition3(int position) {
        EditText ed =(EditText) linearBelowBoard.getChildAt(position).findViewById(R.id.daysEditTotal);
        String[]a = new String[position];
        for( int j=0; j < a.length;j++)
        {
            a[j]=ed.getText().toString();
            Log.d(LOG_TAG,"<--position-->"+Integer.toString(position)+"<======>"+a[j]);
        }



//        String finalVal = a[j].toString();
//        ed.setText(finalVal);
        return ed;

    }

    private EditText getEditTextFromPosition(int position) {

        return (EditText) linearBelowBoard.getChildAt(position).findViewById(R.id.daysEditTotal);

    }

    private EditText getEditTextFromPositionWidth(int position) {

        return (EditText) linearBelowBoard.getChildAt(position).findViewById(R.id.width);

    }


    private class MyTextWatcher2 implements TextWatcher {

        EditText mEditText11 = null;
        EditText mEditText22 = null;
        EditText mEditText33 = null;
        EditText mEditText44 = null;
        EditText mEditText55 = null;
        EditText mEditText66 = null;


        public MyTextWatcher2(EditText mEditText11, EditText mEditText22, EditText mEditText33, EditText mEditText44, EditText mEditText55, EditText mEditText66) {

            this.mEditText11 = mEditText11;
            this.mEditText22 = mEditText22;
            this.mEditText33 = mEditText33;
            this.mEditText44 = mEditText44;
            this.mEditText55 = mEditText55;
            this.mEditText66 = mEditText66;

        }


        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            calCheck3(mEditText11, mEditText22, mEditText33, mEditText44, mEditText55, mEditText66);

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            calCheck3(mEditText11, mEditText22, mEditText33, mEditText44, mEditText55, mEditText66);

        }

        @Override
        public void afterTextChanged(Editable s) {


            calCheck3(mEditText11, mEditText22, mEditText33, mEditText44, mEditText55, mEditText66);

        }
    }

    public void calCheck3(EditText ratePerSqFt, EditText transport, EditText stageHeight, EditText powerModel, EditText otherCost1, EditText otherCost2) {


        try {

            e11 = overAllSqFt.getText().toString().equals("") ? 0 : Integer.parseInt(overAllSqFt.getText().toString());
            e19 = e13 + e14 + e15 + e16 + e17 + e18;
            grossAmount.setText(Integer.toString(e19));

            e12 = ratePerSqFt.getText().toString().equals("") ? 0 : Integer.parseInt(ratePerSqFt.getText().toString());
            e13 = e11 * e12;
            totalAmount.setText(Integer.toString(e13));

            e19 = e13 + e14 + e15 + e16 + e17 + e18;
            grossAmount.setText(Integer.toString(e19));

            e14 = transport.getText().toString().equals("") ? 0 : Integer.parseInt(transport.getText().toString());
            e19 = e13 + e14 + e15 + e16 + e17 + e18;
            grossAmount.setText(Integer.toString(e19));


            e17 = otherCost1.getText().toString().equals("") ? 0 : Integer.parseInt(otherCost1.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));

            e18 = otherCost2.getText().toString().equals("") ? 0 : Integer.parseInt(otherCost2.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));




            e15 = stageHeight.getText().toString().equals("") ? 0 : Integer.parseInt(stageHeight.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));

            e16 = powerModel.getText().toString().equals("") ? 0 : Integer.parseInt(powerModel.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));



        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void calCheck4() {


        try {

            e1 = width.getText().toString().equals("") ? 0 : Integer.parseInt(width.getText().toString());

            e2 = height.getText().toString().equals("") ? 0 : Integer.parseInt(height.getText().toString());
            e3 = e1 * e2;
            zerotextView.setText(Integer.toString(e3));

            e4 = zerotextView.getText().toString().equals("") ? 0 : Integer.parseInt(zerotextView.getText().toString());
            e5 = boardNum.getText().toString().equals("") ? 0 : Integer.parseInt(boardNum.getText().toString());
            e6 = e4 * e5;
            totalCst.setText(Integer.toString(e6));

            e7 = noOfDaysEdt.getText().toString().equals("") ? 0 : Integer.parseInt(noOfDaysEdt.getText().toString());
            e8 = totalCst.getText().toString().equals("") ? 0 : Integer.parseInt(totalCst.getText().toString());
            e9 = e7 * e8;

            noOfDaysView.setText(Integer.toString(e7));
            noOfDaysTotal.setText(Integer.toString(e9));

            calCheck2();


            e11 = overAllSqFt.getText().toString().equals("") ? 0 : Integer.parseInt(overAllSqFt.getText().toString());
            e19 = e13 + e14 + e15 + e16 + e17 + e18;
            grossAmount.setText(Integer.toString(e19));

            e12 = ratePerSqFt.getText().toString().equals("") ? 0 : Integer.parseInt(ratePerSqFt.getText().toString());
            e13 = e11 * e12;
            totalAmount.setText(Integer.toString(e13));

            e19 = e13 + e14 + e15 + e16 + e17 + e18;
            grossAmount.setText(Integer.toString(e19));

            e14 = transport.getText().toString().equals("") ? 0 : Integer.parseInt(transport.getText().toString());
            e19 = e13 + e14 + e15 + e16 + e17 + e18;
            grossAmount.setText(Integer.toString(e19));


            e17 = otherCost1.getText().toString().equals("") ? 0 : Integer.parseInt(otherCost1.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));

            e18 = otherCost2.getText().toString().equals("") ? 0 : Integer.parseInt(otherCost2.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));

            e15 = stageHeight.getText().toString().equals("") ? 0 : Integer.parseInt(stageHeight.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));

            e16 = powerModel.getText().toString().equals("") ? 0 : Integer.parseInt(powerModel.getText().toString());
            e19 = e13 + e14 + e17 + e18 + e15 + e16;
            grossAmount.setText(Integer.toString(e19));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        if (view == radioButton) {
            radioButton2.setChecked(false);
            editText2Inv.setText("Client123");
            stageHeight.setVisibility(View.INVISIBLE);
            editText9.setVisibility(View.INVISIBLE);

        } else if (view == radioButton2) {
            radioButton.setChecked(false);
            radioAction();
            stageHeight.setVisibility(View.VISIBLE);
            editText9.setVisibility(View.VISIBLE);
        } else if (view == radioButton3) {
            radioButton4.setChecked(false);
            editText11.setVisibility(View.INVISIBLE);
            powerModel.setVisibility(View.INVISIBLE);
        } else if (view == radioButton4) {
            radioButton3.setChecked(false);
            radioAction1();
            editText11.setVisibility(View.VISIBLE);
            powerModel.setVisibility(View.VISIBLE);
        }
    }

    public void radioAction() {

        try {
            editText2Inv.setSingleLine(false);
            editText2Inv.setText("By Aishwarya \n"+"Height : "+editText9.getText().toString()+"\nCost : "+stageHeight.getText().toString());
        }catch (Exception e){

        }

    }

    public void radioAction1() {

        try {
            editText3Inv.setSingleLine(false);
            editText3Inv.setText("By Aishwarya \n"+"Model : "+editText11.getText().toString()+"\nCost : "+powerModel.getText().toString());
        }catch (Exception e){

        }

    }

}


