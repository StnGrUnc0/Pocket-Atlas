package com.example.myfirstapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ConstellationDetail extends AppCompatActivity
{

    public static ArrayList<Group> groupList = new ArrayList<>();
    public static ArrayList<Object> objectList = new ArrayList<>();

    private TableRow infoView1_2;
    private Button infoHead0;
    private TextView infoView01;
    private TextView infoView010;
    private TextView infoView02;
    private TextView infoView020;
    private TextView infoView03;
    private TextView infoView030;
    private TextView infoView04;
    private TextView infoView040;
    private TextView infoView05;
    private TextView infoView050;
    private TextView infoView06;
    private TextView infoView060;
    private TextView infoView07;
    private TextView infoView070;
    private Button infoView08;
    private TextView infoView080;
    private Button infoView09;
    private TextView infoView090;
    private Button infoView10;
    private TextView infoView100;

    boolean infoHead0Hidden = false;
    boolean infoRow8Hidden = true;
    boolean infoRow9Hidden = true;
    boolean infoRow10Hidden = true;

    boolean infoHead0Selected = true;
    boolean infoRow8Selected = false;
    boolean infoRow9Selected = false;
    boolean infoRow10Selected = false;

    private int unselectedColor, selectedColor;

    Group selectedGroup;
    private TextView codeValue;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_const_detail);

        TextView q1Button = (TextView) findViewById(R.id.row2);
        q1Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                showDialog(ConstellationDetail.this);
            }

            public void showDialog(Activity activity){

                final Dialog dialog = new Dialog(activity, android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                dialog.getWindow().setDimAmount(0.3f);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.dialog_q1);
                dialog.show();

                Button closeButton = (Button) dialog.findViewById(R.id.btnClose);
                closeButton.setOnClickListener(v -> dialog.dismiss());
            }
        });

        TextView q2Button = (TextView) findViewById(R.id.row3);
        q2Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                showDialog(ConstellationDetail.this);
            }

            public void showDialog(Activity activity){

                final Dialog dialog = new Dialog(activity, android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                dialog.getWindow().setDimAmount(0.3f);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.dialog_q2);
                dialog.show();

                Button closeButton = (Button) dialog.findViewById(R.id.btnClose);
                closeButton.setOnClickListener(v -> dialog.dismiss());
            }
        });

        getSelectedGroup();
        setValues();
        initWidgets();
        hideRow8();
        hideRow9();
        hideRow10();
        showInfo0();
        setUpData();
        setUpList();
        initColors();
        lookSelected(infoHead0);
    }

    private void setUpData()
    {//здесь хранится набор ArrayList, поменяй на каждое созвездие
        String code = codeValue.getText().toString();

        if(code.equals("HYA"))
        {
            Object c1 = new Object("1", "M48", "Heт", "Pacceяннoe cкoплeниe", "5.50");
            objectList.add(c1);

            Object c2 = new Object("2", "M68", "Heт", "Шapoвoe звeзднoe cкoплeниe", "7.80");
            objectList.add(c2);

            Object c3 = new Object("3", "M83", "Южнaя Bepтушкa", "Cпиpaльнaя гaлaктикa", "7.60");
            objectList.add(c3);

            Object c4 = new Object("4", "Aльфapд (Aльфa Гидpы)", "Cepдцe Гидpы", "Opaнжeвый гигaнт", "2.00");
            objectList.add(c4);

            Object c5 = new Object("5", "Гaммa Гидpы", "Heт", "Жeлтый гигaнт", "2.99");
            objectList.add(c5);

            Object c6 = new Object("6", "Дзeтa Гидpы", "Boдный житeль", "Жeлтo-бeлый cубкapлик", "3.11");
            objectList.add(c6);

            Object c7 = new Object("7", "Hю Гидpы", "Heт", "Opaнжeвый гигaнт", "3.12");
            objectList.add(c7);

            Object c8 = new Object("8", "Пи Гидpы", "Heт", "Opaнжeвый cубгигaнт", "3.25");
            objectList.add(c8);

            Object c9 = new Object("9", "Эпcилoн Гидpы", "Змий", "Двoйнaя звeзднaя cиcтeмa", "3.38");
            objectList.add(c9);

            Object c10 = new Object("10", "Kcи Гидpы", "Heт", "Kpacный гигaнт", "3.54");
            objectList.add(c10);

            Object c11 = new Object("11", "Лямбдa Гидpы (41 Гидpы)", "Heт", "Opaнжeвый гигaнт", "3.61");
            objectList.add(c11);

            Object c12 = new Object("12", "Mю Гидpы", "Heт", "Opaнжeвый гигaнт", "З.81");
            objectList.add(c12);

            Object c13 = new Object("13", "Teтa Гидpы (22 Гидpы)", "Heт", "Бeлo-гoлубoй кapлик", "З.88");
            objectList.add(c13);

            Object c14 = new Object("14", "Йoтa Гидpы (З5 Гидpы)", "Heт", "Opaнжeвый гигaнт", "3.91");
            objectList.add(c14);

            Object c15 = new Object("15", "Ипcилoн-1 Гидpы", "Heт", "Жeлтый гигaнт", "4.12");
            objectList.add(c15);

            Object c16 = new Object("16", "Дeльтa Гидpы", "Heт", "Двoйнaя звeзднaя cиcтeмa", "4.14");
            objectList.add(c16);

            Object c17 = new Object("17", "Бeтa Гидpы", "Heт", "Двoйнaя звeзднaя cиcтeмa", "4.28");
            objectList.add(c17);

            Object c18 = new Object("18", "Этa Гидpы (7 Гидpы)", "Heт", "Бeлo-гoлубoй кapлик", "4.30");
            objectList.add(c18);

            Object c19 = new Object("19", "Cигмa Гидpы (5 Гидpы)", "Hoздpи Гидpы", "Opaнжeвый гигaнт", "4.45");
            objectList.add(c19);


            return;
        }
        if(code.equals("CET"))
            {
                Object c1 = new Object("2", "M68", "Heт", "Шapoвoe звeзднoe cкoплeниe", "7.80");
                objectList.add(c1);

            }

    }

    private void setUpList()
    {
        //ListView listView = (ListView) findViewById(R.id.objectsListView);

        //ConstellationDetailAdapter adapter = new ConstellationDetailAdapter(getApplicationContext(), 0, objectList);
        //listView.setAdapter(adapter);
    }



    private void initWidgets()
    {
        infoView1_2 = (TableRow) findViewById(R.id.infoTab1_2);

        infoHead0 = (Button) findViewById(R.id.infoHead0);
        infoView01 = (TextView) findViewById(R.id.row1);
        infoView010 = (TextView) findViewById(R.id.codeValue);
        infoView02 = (TextView) findViewById(R.id.row2);
        infoView020 = (TextView) findViewById(R.id.r_ascValue);
        infoView03 = (TextView) findViewById(R.id.row3);
        infoView030 = (TextView) findViewById(R.id.declensionValue);
        infoView04 = (TextView) findViewById(R.id.row4);
        infoView040 = (TextView) findViewById(R.id.areaValue);
        infoView05 = (TextView) findViewById(R.id.row5);
        infoView050 = (TextView) findViewById(R.id.latitudeValue);
        infoView06 = (TextView) findViewById(R.id.row6);
        infoView060 = (TextView) findViewById(R.id.starsValue);
        infoView07 = (TextView) findViewById(R.id.row7);
        infoView070 = (TextView) findViewById(R.id.meteorshowersValue);
        infoView08 = (Button) findViewById(R.id.row8);
        infoView080 = (TextView) findViewById(R.id.neighbourValue);
        infoView09 = (Button) findViewById(R.id.row9);
        infoView090 = (TextView) findViewById(R.id.majorStarsValue);
        infoView10 = (Button) findViewById(R.id.row10);
        infoView100 = (TextView) findViewById(R.id.historyValue);
    }

    private void getSelectedGroup()
    {
        Intent previousIntent = getIntent();
        String parsedStringID = previousIntent.getStringExtra("id");
        selectedGroup = getParsedGroup(parsedStringID);
    }

    private Group getParsedGroup(String parsedID)
    {
        for (Group group : ConstellationActivity.groupList)
        {
            if(group.getId().equals(parsedID))
                return group;
        }
        return null;
    }

    @SuppressLint("SetTextI18n")
    private void setValues()
    {
        TextView tv = (TextView) findViewById(R.id.groupName);
        ImageView iv = (ImageView) findViewById(R.id.groupImage);

        codeValue = (TextView) findViewById(R.id.codeValue);
        TextView r_ascValue = (TextView) findViewById(R.id.r_ascValue);
        TextView declensionValue = (TextView) findViewById(R.id.declensionValue);
        TextView areaValue = (TextView) findViewById(R.id.areaValue);
        TextView latitudeValue = (TextView) findViewById(R.id.latitudeValue);
        TextView meteorshowersValue = (TextView) findViewById(R.id.meteorshowersValue);
        TextView neighbourValue = (TextView) findViewById(R.id.neighbourValue);
        TextView starsValue = (TextView) findViewById(R.id.starsValue);
        TextView majorStarsValue = (TextView) findViewById(R.id.majorStarsValue);
        TextView historyValue = (TextView) findViewById(R.id.historyValue);


        tv.setText(selectedGroup.getName() + "\n\nГруппа-семейство созвездий: " + selectedGroup.getFamilyGroupName());
        iv.setImageResource(selectedGroup.getImage());

        codeValue.setText(selectedGroup.getCodeValue());
        r_ascValue.setText(selectedGroup.getR_ascValue());
        declensionValue.setText(selectedGroup.getDeclensionValue());
        areaValue.setText(selectedGroup.getAreaValue());
        latitudeValue.setText(selectedGroup.getLatitudeValue());
        meteorshowersValue.setText(selectedGroup.getMeteorshowersValue());
        neighbourValue.setText(selectedGroup.getNeighbourValue());
        starsValue.setText(selectedGroup.getStarsValue());
        majorStarsValue.setText(selectedGroup.getMajorStarsValue());
        historyValue.setText(selectedGroup.getHistoryValue());
    }

    private void hideInfo0()
    {
        infoView01.setVisibility(View.GONE);
        infoView010.setVisibility(View.GONE);
        infoView02.setVisibility(View.GONE);
        infoView020.setVisibility(View.GONE);
        infoView03.setVisibility(View.GONE);
        infoView030.setVisibility(View.GONE);
        infoView04.setVisibility(View.GONE);
        infoView040.setVisibility(View.GONE);
        infoView05.setVisibility(View.GONE);
        infoView050.setVisibility(View.GONE);
        infoView06.setVisibility(View.GONE);
        infoView060.setVisibility(View.GONE);
        infoView07.setVisibility(View.GONE);
        infoView070.setVisibility(View.GONE);
        infoHead0.setText("Основная информация, положение и наблюдение\n(Развернуть)");
    }

    private void showInfo0()
    {
        infoView01.setVisibility(View.VISIBLE);
        infoView010.setVisibility(View.VISIBLE);
        infoView02.setVisibility(View.VISIBLE);
        infoView020.setVisibility(View.VISIBLE);
        infoView03.setVisibility(View.VISIBLE);
        infoView030.setVisibility(View.VISIBLE);
        infoView04.setVisibility(View.VISIBLE);
        infoView040.setVisibility(View.VISIBLE);
        infoView05.setVisibility(View.VISIBLE);
        infoView050.setVisibility(View.VISIBLE);
        infoView06.setVisibility(View.VISIBLE);
        infoView060.setVisibility(View.VISIBLE);
        infoView07.setVisibility(View.VISIBLE);
        infoView070.setVisibility(View.VISIBLE);
        infoHead0.setText("Основная информация, положение и наблюдение");
    }

    private void hideRow8()
    {
        infoView080.setVisibility(View.GONE);
        infoView08.setText("Соседние созвездия");
    }

    private void showRow8()
    {
        infoView080.setVisibility(View.VISIBLE);
        infoView08.setText("Соседние созвездия\n(Cвернуть)");
    }

    private void hideRow9()
    {
        infoView090.setVisibility(View.GONE);
        infoView09.setText("Главные звезды");
    }

    private void showRow9()
    {
        infoView090.setVisibility(View.VISIBLE);
        infoView09.setText("Главные звезды\n(Cвернуть)");
    }

    private void hideRow10()
    {
        infoView100.setVisibility(View.GONE);
        infoView10.setText("История");
    }

    private void showRow10()
    {
        infoView100.setVisibility(View.VISIBLE);
        infoView10.setText("История\n(Cвернуть)");
    }

    public void showHead0Tapped(View view)
    {
        if(infoHead0Selected)
        {
            infoHead0Selected = false;
            lookUnselected(infoHead0);
        }
        else
            {
                infoHead0Selected = true;
                lookSelected(infoHead0);
            }

        if(infoHead0Hidden)
        {
            infoHead0Hidden = false;
            showInfo0();
        }
        else
            {
                infoHead0Hidden = true;
                hideInfo0();
            }
    }

    public void showRow8Tapped(View view)
    {
        if(infoRow8Selected)
        {
            infoRow8Selected = false;
            lookUnselected(infoView08);
        }
        else
            {
                infoRow8Selected = true;
                lookSelected(infoView08);
            }

        if(infoRow8Hidden)
        {
            infoRow8Hidden = false;
            showRow8();
        }
        else
            {
                infoRow8Hidden = true;
                hideRow8();
            }
    }

    public void showRow9Tapped(View view)
    {
        if(infoRow9Selected)
        {
            infoRow9Selected = false;
            lookUnselected(infoView09);
        }
        else
        {
            infoRow9Selected = true;
            lookSelected(infoView09);
        }

        if(infoRow9Hidden)
        {
            infoRow9Hidden = false;
            showRow9();
        }
        else
        {
            infoRow9Hidden = true;
            hideRow9();
        }
    }

    public void showRow10Tapped(View view)
    {
        if(infoRow10Selected)
        {
            infoRow10Selected = false;
            lookUnselected(infoView10);
        }
        else
            {
                infoRow10Selected = true;
                lookSelected(infoView10);
            }

        if(infoRow10Hidden)
        {
            infoRow10Hidden = false;
            showRow10();
        }
        else
            {
                infoRow10Hidden = true;
                hideRow10();
            }
    }

    private void initColors()
    {
        selectedColor = ContextCompat.getColor(getApplicationContext(), R.color.black60);
        unselectedColor = ContextCompat.getColor(getApplicationContext(), R.color.black95);
    }

    private void lookSelected(Button parsedButton)
    {
        parsedButton.setBackgroundColor(selectedColor);
    }

    private void lookUnselected(Button parsedButton)
    {
        parsedButton.setBackgroundColor(unselectedColor);
    }

}
