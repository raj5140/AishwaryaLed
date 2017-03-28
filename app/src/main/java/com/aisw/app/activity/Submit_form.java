package com.aisw.app.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.aisw.app.R;
import com.aisw.app.fragment.PagerAdapterrr;
import com.aisw.app.fragment.Welcome_Slide1;
import com.aisw.app.fragment.Welcome_Slide2;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class Submit_form extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout dotsLayout;
    private TextView[] dots;
    private int[] layouts;
    private Button btnSkip, btnNext;


//    String[] board_size = {"Select Your Size", "8 x 6 ft", "10 x 8 ft", "12 x 8 ft", "12 x 10 ft", "16 x 10 ft", "16 x 12 ft", "20 x 10 ft", "22 x 10 ft", "24 x 12 ft", "30 x 10 ft", "40 x 10 ft", "50 x 10 ft", "60 x 10 ft", "70 x 10 ft", "80 x 10 ft"};

    String nameInput1,nameInput2,nameInput3,nameInput4,nameInput5,nameInput6,nameInput7, nameInput8,nameInput9,nameInput10,nameInput11,nameInput12,nameInput13,nameInput14,nameInput15,nameInput16,nameInput17,nameInput18,nameInput19,nameInput20,nameInput21,nameInput22,nameInput23, nameInput24, nameInput25, nameInput26, nameInput27, nameInput28, nameInput29, nameInput30, nameInput31, nameInput32, nameInput33,nameInput34,nameInput35,nameInput36,nameInput37,nameInput38,nameInput39,nameInput40,nameInput41;

    EditText edtxt1,edtxt2,edtxt3,edtxt4,edtxt5,edtxt6,edtxt7,edtxt1a,edtext11,edtxt2a,edtext22,edtxt3a,edtext33,edtxt4a,edtext44,edtxt5a,edtext55,edtxt12,edtxt13,Board_Size,editText5a,editText5,editText6,editText7,radioButtonxxx,radioButton,editText13,editText13b,editText14,radioButton5,edtxt22,edtxt17,edtxt18,edtxt19,edtxt20,edtxt21,edtxt20x,edtxt21x,edtxt22x,edtxt23,edtxt24;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://docs.google.com/a/aishwaryaled.com/forms/d/e/")
            .build();
    final Submit_form.QuestionsSpreadsheetWebService spreadsheetWebService = retrofit.create(Submit_form.QuestionsSpreadsheetWebService.class);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        // Making notification bar transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        setContentView(R.layout.activity_submit_form);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Client"));
        tabLayout.addTab(tabLayout.newTab().setText("Show & Board"));
        tabLayout.addTab(tabLayout.newTab().setText("Payment"));
        tabLayout.addTab(tabLayout.newTab().setText("Photo"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        layouts = new int[]{
                R.layout.welcome_slide1,
                R.layout.welcome_slide2,
                R.layout.welcome_slide3,
                R.layout.welcome_slide4};


        viewPager = (ViewPager) findViewById(R.id.view_pager);

        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        final PagerAdapterrr adapter = new PagerAdapterrr
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        viewPager.setOffscreenPageLimit(4);
        dotsLayout = (LinearLayout) findViewById(R.id.layoutDots);
        btnSkip = (Button) findViewById(R.id.btn_skip);
        btnNext = (Button) findViewById(R.id.btn_next);


        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // checking for last page
                // if last page home screen will be launched
                int current = getItem(+1);
                if (current < layouts.length) {
                    // move to next screen
                    viewPager.setCurrentItem(current);
                } else {

                    edtxt1=(EditText)findViewById(R.id.edtxt1);
                    edtxt2=(EditText)findViewById(R.id.edtxt2);
                    edtxt3=(EditText)findViewById(R.id.edtxt3);
                    edtxt4=(EditText)findViewById(R.id.edtxt4);
                    edtxt5=(EditText)findViewById(R.id.edtxt5);
                    edtxt6=(EditText)findViewById(R.id.edtxt6);
                    edtxt7=(EditText)findViewById(R.id.edtxt7);
                    edtxt1a=(EditText)findViewById(R.id.edtxt1a);
                    edtext11=(EditText)findViewById(R.id.edtext11);
                    edtxt2a=(EditText)findViewById(R.id.edtxt2a);
                    edtext22=(EditText)findViewById(R.id.edtext22);
                    edtxt3a=(EditText)findViewById(R.id.edtxt3a);
                    edtext33=(EditText)findViewById(R.id.edtext33);
                    edtxt4a=(EditText)findViewById(R.id.edtxt4a);
                    edtext44=(EditText)findViewById(R.id.edtext44);
                    edtxt5a=(EditText)findViewById(R.id.edtxt5a);
                    edtext55=(EditText)findViewById(R.id.edtext55);
                    edtxt12=(EditText)findViewById(R.id.edtxt12);
                    edtxt13=(EditText)findViewById(R.id.edtxt13);
                    Board_Size=(EditText)findViewById(R.id.editTextInv);
                    editText5a=(EditText)findViewById(R.id.editText5a);
                    editText5=(EditText)findViewById(R.id.editText5);
                    editText6=(EditText)findViewById(R.id.editText6);
                    editText7=(EditText)findViewById(R.id.editText7);
                    radioButtonxxx=(EditText)findViewById(R.id.editText2Inv);
                    radioButton=(EditText)findViewById(R.id.editText3Inv);
                    editText13=(EditText)findViewById(R.id.editText13);
                    editText13b=(EditText)findViewById(R.id.editText13b);
                    editText14=(EditText)findViewById(R.id.editText14);
                    radioButton5=(EditText)findViewById(R.id.editTextVisib);
                    edtxt22=(EditText)findViewById(R.id.edtxt22);
                    edtxt17=(EditText)findViewById(R.id.edtxt17);
                    edtxt18=(EditText)findViewById(R.id.edtxt18);
                    edtxt19=(EditText)findViewById(R.id.edtxt19);
                    edtxt20=(EditText)findViewById(R.id.edtxt20);
                    edtxt21=(EditText)findViewById(R.id.edtxt21);
                    edtxt20x=(EditText)findViewById(R.id.edtxt20x);
                    edtxt21x=(EditText)findViewById(R.id.edtxt21x);
                    edtxt22x=(EditText)findViewById(R.id.edtxt22x);
                    edtxt23=(EditText)findViewById(R.id.edtxt23);
                    edtxt24=(EditText)findViewById(R.id.edtxt24);


                    nameInput1	=	edtxt1.getText().toString();
                    nameInput2	=	edtxt2.getText().toString();
                    nameInput3	=	edtxt3.getText().toString();
                    nameInput4	=	edtxt4.getText().toString();
                    nameInput5	=	edtxt5.getText().toString();
                    nameInput6	=	edtxt6.getText().toString();
                    nameInput7	=	edtxt7.getText().toString();
                    nameInput8	=	edtxt1a.getText().toString();
                    nameInput9	=	edtext11.getText().toString();
                    nameInput10	=	edtxt2a.getText().toString();
                    nameInput11	=	edtext22.getText().toString();
                    nameInput12	=	edtxt3a.getText().toString();
                    nameInput13	=	edtext33.getText().toString();
                    nameInput14	=	edtxt4a.getText().toString();
                    nameInput15	=	edtext44.getText().toString();
                    nameInput16	=	edtxt5a.getText().toString();
                    nameInput17	=	edtext55.getText().toString();
                    nameInput18	=	edtxt12.getText().toString();
                    nameInput19	=	edtxt13.getText().toString();
                    nameInput20	=	Board_Size.getText().toString();
                    nameInput21	=	editText5a.getText().toString();
                    nameInput22	=	editText5.getText().toString();
                    nameInput23	=	editText6.getText().toString();
                    nameInput24	=	editText7.getText().toString();
                    nameInput25	=	radioButtonxxx.getText().toString();
                    nameInput26	=	radioButton.getText().toString();
                    nameInput27	=	editText13.getText().toString();
                    nameInput28	=	editText13b.getText().toString();
                    nameInput29	=	editText14.getText().toString();
                    nameInput30	=	radioButton5.getText().toString();
                    nameInput31	=	edtxt22.getText().toString();
                    nameInput32	=	edtxt17.getText().toString();
                    nameInput33	=	edtxt18.getText().toString();
                    nameInput34	=	edtxt19.getText().toString();
                    nameInput35	=	edtxt20.getText().toString();
                    nameInput36	=	edtxt21.getText().toString();
                    nameInput37	=	edtxt20x.getText().toString();
                    nameInput38	=	edtxt21x.getText().toString();
                    nameInput39	=	edtxt22x.getText().toString();
                    nameInput40	=	edtxt23.getText().toString();
                    nameInput41	=	edtxt24.getText().toString();



                    Call<Void> completeQuestionnaireCall = spreadsheetWebService.completeQuestionnaire(nameInput1,nameInput2,nameInput3,nameInput4,nameInput5,nameInput6,nameInput7, nameInput8,nameInput9,nameInput10,nameInput11,nameInput12,nameInput13,nameInput14,nameInput15,nameInput16,nameInput17,nameInput18,nameInput19,nameInput20,nameInput21,nameInput22,nameInput23, nameInput24, nameInput25, nameInput26, nameInput27, nameInput28, nameInput29, nameInput30, nameInput31, nameInput32,nameInput33,nameInput34,nameInput35,nameInput36,nameInput37,nameInput38,nameInput39,nameInput40,nameInput41);
                    completeQuestionnaireCall.enqueue(callCallback);

                    finish();

                    Toast.makeText(getApplicationContext(),"Updated Successfully",Toast.LENGTH_LONG).show();
                }
            }
        });


        // making notification bar transparent
        changeStatusBarColor();

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


    private int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }

    //	viewpager change listener
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
//            addBottomDots(position);

            // changing the next button text 'NEXT' / 'GOT IT'
            if (position == layouts.length - 1) {
                // last page. make button text to GOT IT
                btnNext.setText(getString(R.string.start));
                btnSkip.setVisibility(View.GONE);
            } else {
                // still pages are left
                btnNext.setText(getString(R.string.next));
                btnSkip.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };

    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
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

        @POST("1FAIpQLSeWOeprhdB9lEeO8TyKTnImWnyAcoRGty6X-WxQ08thqocrXg/formResponse")
        @FormUrlEncoded
        Call<Void> completeQuestionnaire(
                @Field("entry.1904163707") String Company_Name1,
                @Field("entry.1546431046") String Person_Name1,
                @Field("entry.157511848") String Address1,
                @Field("entry.1998032940") String Mail_ID1,
                @Field("entry.1031705451") String Mobile_11,
                @Field("entry.710547591") String Mobile_21,
                @Field("entry.249623189") String Show_Name1,
                @Field("entry.561188514") String Dispatch_Date1,
                @Field("entry.1326603882") String Dispatch_Time1,
                @Field("entry.1008414970") String Setup_Date1,
                @Field("entry.2033044481") String Setup_Time1,
                @Field("entry.131904756") String Show_Start_Date1,
                @Field("entry.1270241177") String Show_Start_Time1,
                @Field("entry.310227836") String Show_End_Date1,
                @Field("entry.1559092619") String Show_End_Time1,
                @Field("entry.839399087") String Dismantel_Date1,
                @Field("entry.67200787") String Dismantel_Time1,
                @Field("entry.1373965508") String Venu1,
                @Field("entry.2066095847") String Venue_Address1,
                @Field("entry.1288596102") String Stage_Height1,
                @Field("entry.1841629465") String Board_Size1,
                @Field("entry.2108316541") String Total_Panels1,
                @Field("entry.1023285294") String Panels_Setup1,
                @Field("entry.1799212699") String Total_Pixels1,
                @Field("entry.957849475") String Spare1,
                @Field("entry.1643744412") String Total_Signal_Loop1,
                @Field("entry.538143366") String Total_Power_Loop1,
                @Field("entry.1261200824") String Processor1,
                @Field("entry.1772285500") String Laptop1,
                @Field("entry.593065819") String Number_Of_Box1,
                @Field("entry.1343221992") String Total_Amount1,
                @Field("entry.2014047467") String Advance_Amount1,
                @Field("entry.295780783") String Credit_Period1,
                @Field("entry.177800233") String Transport1,
                @Field("entry.590484574") String Photographer_Name1,
                @Field("entry.2085495574") String Photographer_Mobile11,
                @Field("entry.1425852692") String Photographer_Name_l1,
                @Field("entry.1738232962") String Marketing_Person_Name1,
                @Field("entry.1946067072") String Marketing_Person_Name2,
                @Field("entry.881927960") String Marketing_Person_Name3,
                @Field("entry.1824115693") String Marketing_Remarks1
        );
    }




//    void getData() {
//        if (textView8.getText().equals("8 x 6 ft")) {
//            textView10.setText("20");
//            textView21.setText("5 x 4");
//            textView23.setText("640 x 512");
//            textView24.setText("4");
//            textView25.setText("20 + 4 = 24");
//            textView26.setText("20 + 4 = 24");
//            textView27.setText("1, Low End");
//            textView28.setText("1");
//        } else if (textView8.getText().equals("10 x 8 ft")) {
//            textView10.setText("30");
//            textView21.setText("6 x 5");
//            textView23.setText("768 x 640");
//            textView24.setText("6");
//            textView25.setText("30 + 6 = 36");
//            textView26.setText("30 + 6 = 36");
//            textView27.setText("1, Low End");
//            textView28.setText("1");
//        } else if (textView8.getText().equals("12 x 8 ft")) {
//            textView10.setText("35");
//            textView21.setText("7 x 5");
//            textView23.setText("896 x 640");
//            textView24.setText("0");
//            textView25.setText("35 + 1 = 36");
//            textView26.setText("35 + 1 = 36");
//            textView27.setText("1, Low End");
//            textView28.setText("1");
//        } else if (textView8.getText().equals("12 x 10 ft")) {
//            textView10.setText("60");
//            textView21.setText("7 x 6");
//            textView23.setText("896 x 768");
//            textView24.setText("0");
//            textView25.setText("48 + 0 = 48");
//            textView26.setText("48 + 0 = 48");
//            textView27.setText("1, Low End");
//            textView28.setText("1");
//        } else if (textView8.getText().equals("16 x 10 ft")) {
//            textView10.setText("60");
//            textView21.setText("10 x 6");
//            textView23.setText("1280 x 768");
//            textView24.setText("6");
//            textView25.setText("60 + 6 = 66");
//            textView26.setText("60 + 6 = 66");
//            textView27.setText("1, Low End");
//            textView28.setText("1");
//        } else if (textView8.getText().equals("16 x 12 ft")) {
//            textView10.setText("70");
//            textView21.setText("10 x 7");
//            textView23.setText("1280 x 896");
//            textView24.setText("4");
//            textView25.setText("70 + 4 = 74");
//            textView26.setText("70 + 4 = 74");
//            textView27.setText("1, Low End");
//            textView28.setText("1");
//        } else if (textView8.getText().equals("20 x 10 ft")) {
//            textView10.setText("72");
//            textView21.setText("12 x 6");
//            textView23.setText("1536 x 768");
//            textView24.setText("6");
//            textView25.setText("72 + 6 = 78");
//            textView26.setText("72 + 6 = 78");
//            textView27.setText("1, Low End");
//            textView28.setText("1");
//        } else if (textView8.getText().equals("22 x 10 ft")) {
//            textView10.setText("84");
//            textView21.setText("14 x 6");
//            textView23.setText("1792 x 1280");
//            textView24.setText("6");
//            textView25.setText("84 + 6 = 90");
//            textView26.setText("84 + 6 = 90");
//            textView27.setText("1, Low End");
//            textView28.setText("1");
//        } else if (textView8.getText().equals("24 x 12 ft")) {
//            textView10.setText("105");
//            textView21.setText("15 x 7");
//            textView23.setText("1920 x 896");
//            textView24.setText("3");
//            textView25.setText("105 + 3 = 108");
//            textView26.setText("105 + 3 = 108");
//            textView27.setText("1, High End");
//            textView28.setText("2");
//        } else if (textView8.getText().equals("30 x 10 ft")) {
//            textView10.setText("108");
//            textView21.setText("18 x 6");
//            textView23.setText("2304 x 768");
//            textView24.setText("6");
//            textView25.setText("108 + 6 = 114");
//            textView26.setText("108 + 6 = 114");
//            textView27.setText("1, High End");
//            textView28.setText("2");
//        } else if (textView8.getText().equals("40 x 10 ft")) {
//            textView10.setText("144");
//            textView21.setText("24 x 6");
//            textView23.setText("3072 x 768");
//            textView24.setText("6");
//            textView25.setText("144 + 6 = 150");
//            textView26.setText("144 + 6 = 150");
//            textView27.setText("1, High End");
//            textView28.setText("2");
//        } else if (textView8.getText().equals("50 x 10 ft")) {
//            textView10.setText("180");
//            textView21.setText("30 x 6");
//            textView23.setText("3840 x 768");
//            textView24.setText("6");
//            textView25.setText("180 + 6 = 186");
//            textView26.setText("180 + 6 = 186");
//            textView27.setText("1, High End");
//            textView28.setText("2");
//        } else if (textView8.getText().equals("60 x 10 ft")) {
//            textView10.setText("216");
//            textView21.setText("36 x 6");
//            textView23.setText("4608 x 768");
//            textView24.setText("6");
//            textView25.setText("216 + 6 = 222");
//            textView26.setText("216 + 6 = 222");
//            textView27.setText("1, High End");
//            textView28.setText("3");
//        } else if (textView8.getText().equals("70 x 10 ft")) {
//            textView10.setText("252");
//            textView21.setText("42 x 6");
//            textView23.setText("5376 x 768");
//            textView24.setText("6");
//            textView25.setText("252 + 6 = 258");
//            textView26.setText("252 + 6 = 258");
//            textView27.setText("1, High End");
//            textView28.setText("3");
//        } else if (textView8.getText().equals("80 x 10 ft")) {
//            textView10.setText("288");
//            textView21.setText("48 x 6");
//            textView23.setText("6144 x 768");
//            textView24.setText("6");
//            textView25.setText("288 + 6 = 294");
//            textView26.setText("288 + 6 = 294");
//            textView27.setText("1, High End");
//            textView28.setText("3");
//        } else if (textView8.getText().equals("Select Your Size")) {
//            textView10.setText("Null");
//            textView21.setText("Null");
//            textView23.setText("Null");
//            textView24.setText("Null");
//            textView25.setText("Null");
//            textView26.setText("Null");
//            textView27.setText("Null");
//            textView28.setText("Null");
//        }
//    }
}