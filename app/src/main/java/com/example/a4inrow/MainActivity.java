package com.example.a4inrow;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Board board = new Board();
    boolean gameOver = false;
    boolean turnPlayer1 = true;

    @SuppressLint({"ResourceAsColor", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button taw16 = (Button) findViewById(R.id.taw16);
        taw16.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("1" , "6");
                return false;
            }
        });
        taw16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(0);
            }
        });
        Button taw15 = (Button) findViewById(R.id.taw15);
        taw15.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("1" , "5");
                return false;
            }
        });
        taw15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(0);
            }
        });
        Button taw14 = (Button) findViewById(R.id.taw14);
        taw14.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("1" , "4");
                return false;
            }
        });
        taw14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(0);
            }
        });
        Button taw13 = (Button) findViewById(R.id.taw13);
        taw13.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("1" , "3");
                return false;
            }
        });
        taw13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(0);
            }
        });
        Button taw12 = (Button) findViewById(R.id.taw12);
        taw12.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("1" , "2");
                return false;
            }
        });
        taw12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(0);
            }
        });
        Button taw11 = (Button) findViewById(R.id.taw11);
        taw11.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("1" , "1");
                return false;
            }
        });
        taw11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(0);
            }
        });
        Button taw10 = (Button) findViewById(R.id.taw10);
        taw10.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("1" , "0");
                return false;
            }
        });
        taw10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(0);
            }
        });
        Button taw26 = (Button) findViewById(R.id.taw26);
        taw26.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("2" , "6");
                return false;
            }
        });
        taw26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(1);
            }
        });
        Button taw25 = (Button) findViewById(R.id.taw25);
        taw25.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("2" , "5");
                return false;
            }
        });
        taw25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(1);
            }
        });
        Button taw24 = (Button) findViewById(R.id.taw24);
        taw24.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("2" , "4");
                return false;
            }
        });
        taw24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(1);
            }
        });
        Button taw23 = (Button) findViewById(R.id.taw23);
        taw23.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("2" , "3");
                return false;
            }
        });
        taw23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(1);
            }
        });
        Button taw22 = (Button) findViewById(R.id.taw22);
        taw22.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("2" , "2");
                return false;
            }
        });
        taw22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(1);
            }
        });
        Button taw21 = (Button) findViewById(R.id.taw21);
        taw21.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("2" , "1");
                return false;
            }
        });
        taw21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(1);
            }
        });
        Button taw20 = (Button) findViewById(R.id.taw20);
        taw20.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("2" , "0");
                return false;
            }
        });
        taw20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(1);
            }
        });
        Button taw36 = (Button) findViewById(R.id.taw36);
        taw36.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("3" , "6");
                return false;
            }
        });
        taw36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(2);
            }
        });
        Button taw35 = (Button) findViewById(R.id.taw35);
        taw35.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("3" , "5");
                return false;
            }
        });
        taw35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(2);
            }
        });
        Button taw34 = (Button) findViewById(R.id.taw34);
        taw34.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("3" , "4");
                return false;
            }
        });
        taw34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(2);
            }
        });
        Button taw33 = (Button) findViewById(R.id.taw33);
        taw33.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("3" , "3");
                return false;
            }
        });
        taw33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(2);
            }
        });
        Button taw32 = (Button) findViewById(R.id.taw32);
        taw32.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("3" , "2");
                return false;
            }
        });
        taw32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(2);
            }
        });
        Button taw31 = (Button) findViewById(R.id.taw31);
        taw31.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("3" , "1");
                return false;
            }
        });
        taw31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(2);
            }
        });
        Button taw30 = (Button) findViewById(R.id.taw30);
        taw30.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("3" , "0");
                return false;
            }
        });
        taw30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(2);
            }
        });
        Button taw46 = (Button) findViewById(R.id.taw46);
        taw46.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("4" , "6");
                return false;
            }
        });
        taw46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(3);
            }
        });
        Button taw45 = (Button) findViewById(R.id.taw45);
        taw45.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("4" , "5");
                return false;
            }
        });
        taw45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(3);
            }
        });
        Button taw44 = (Button) findViewById(R.id.taw44);
        taw44.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("4" , "4");
                return false;
            }
        });
        taw44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(3);
            }
        });
        Button taw43 = (Button) findViewById(R.id.taw43);
        taw43.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("4" , "3");
                return false;
            }
        });
        taw43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(3);
            }
        });
        Button taw42 = (Button) findViewById(R.id.taw42);
        taw42.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("4" , "2");
                return false;
            }
        });
        taw42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(3);
            }
        });
        Button taw41 = (Button) findViewById(R.id.taw41);
        taw41.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("4" , "1");
                return false;
            }
        });
        taw41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(3);
            }
        });
        Button taw40 = (Button) findViewById(R.id.taw40);
        taw40.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("4" , "0");
                return false;
            }
        });
        taw40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(3);
            }
        });
        Button taw56 = (Button) findViewById(R.id.taw56);
        taw56.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("5" , "6");
                return false;
            }
        });
        taw56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(4);
            }
        });
        Button taw55 = (Button) findViewById(R.id.taw55);
        taw55.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("5" , "5");
                return false;
            }
        });
        taw55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(4);
            }
        });
        Button taw54 = (Button) findViewById(R.id.taw54);
        taw54.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("5" , "4");
                return false;
            }
        });
        taw54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(4);
            }
        });
        Button taw53 = (Button) findViewById(R.id.taw53);
        taw53.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("5" , "3");
                return false;
            }
        });
        taw53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(4);
            }
        });
        Button taw52 = (Button) findViewById(R.id.taw52);
        taw52.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("5" , "2");
                return false;
            }
        });
        taw52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(4);
            }
        });
        Button taw51 = (Button) findViewById(R.id.taw51);
        taw51.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("5" , "1");
                return false;
            }
        });
        taw51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(4);
            }
        });
        Button taw50 = (Button) findViewById(R.id.taw50);
        taw50.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("5" , "0");
                return false;
            }
        });
        taw50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(4);
            }
        });
        Button taw66 = (Button) findViewById(R.id.taw66);
        taw66.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("6" , "6");
                return false;
            }
        });
        taw66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(5);
            }
        });
        Button taw65 = (Button) findViewById(R.id.taw65);
        taw65.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("6" , "5");
                return false;
            }
        });
        taw65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(5);
            }
        });
        Button taw64 = (Button) findViewById(R.id.taw64);
        taw64.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("6" , "4");
                return false;
            }
        });
        taw64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(5);
            }
        });
        Button taw63 = (Button) findViewById(R.id.taw63);
        taw63.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("6" , "3");
                return false;
            }
        });
        taw63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(5);
            }
        });
        Button taw62 = (Button) findViewById(R.id.taw62);
        taw62.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("6" , "2");
                return false;
            }
        });
        taw62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(5);
            }
        });
        Button taw61 = (Button) findViewById(R.id.taw61);
        taw61.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("6" , "1");
                return false;
            }
        });
        taw61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(5);
            }
        });
        Button taw60 = (Button) findViewById(R.id.taw60);
        taw60.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("6" , "0");
                return false;
            }
        });
        taw60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(5);
            }
        });
        Button taw76 = (Button) findViewById(R.id.taw76);
        taw76.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("7" , "6");
                return false;
            }
        });
        taw76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(6);
            }
        });
        Button taw75 = (Button) findViewById(R.id.taw75);
        taw75.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("7" , "5");
                return false;
            }
        });
        taw75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(6);
            }
        });
        Button taw74 = (Button) findViewById(R.id.taw74);
        taw74.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("7" , "4");
                return false;
            }
        });
        taw74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(6);
            }
        });
        Button taw73 = (Button) findViewById(R.id.taw73);
        taw73.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("7" , "3");
                return false;
            }
        });
        taw73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(6);
            }
        });
        Button taw72 = (Button) findViewById(R.id.taw72);
        taw72.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("7" , "2");
                return false;
            }
        });
        taw72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(6);
            }
        });
        Button taw71 = (Button) findViewById(R.id.taw71);
        taw71.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("7" , "1");
                return false;
            }
        });
        taw71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(6);
            }
        });
        Button taw70 = (Button) findViewById(R.id.taw70);
        taw70.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                touch("7" , "0");
                return false;
            }
        });
        taw70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement(6);
            }
        });
        Button retry = (Button) findViewById(R.id.retry);
        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gameOver){
                    board = new Board();
                    gameOver = false;
                    turnPlayer1 = true;
                    clearAll();
                }
                else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                            .setMessage("Are you sure you want to Restart?")
                            .setCancelable(false)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    board = new Board();
                                    gameOver = false;
                                    turnPlayer1 = true;
                                    clearAll();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            }
        });

    }
    private int findId(String colrow) {
        int id = 0;
        switch (colrow){
            case("16"):
                id = 2131230995 ;
                break;
            case ("15"):
                id = 2131230994;
                break;
            case("14"):
                id = 2131230993 ;
                break;
            case ("13"):
                id = 2131230992;
                break;
            case("12"):
                id = 2131230991 ;
                break;
            case ("11"):
                id = 2131230990;
                break;
            case ("10"):
                id = 2131230989;
                break;
            case("26"):
                id = 2131231002;
                break;
            case ("25"):
                id = 2131231001;
                break;
            case("24"):
                id = 2131231000 ;
                break;
            case ("23"):
                id = 2131230999;
                break;
            case("22"):
                id = 2131230998 ;
                break;
            case ("21"):
                id = 2131230997;
                break;
            case("20"):
                id = 2131230996 ;
                break;
            case("36"):
                id = 2131231009 ;
                break;
            case ("35"):
                id = 2131231008;
                break;
            case("34"):
                id = 2131231007 ;
                break;
            case ("33"):
                id = 2131231006;
                break;
            case("32"):
                id = 2131231005 ;
                break;
            case ("31"):
                id = 2131231004;
                break;
            case("30"):
                id = 2131231003 ;
                break;
            case("46"):
                id = 2131231016 ;
                break;
            case ("45"):
                id = 2131231015;
                break;
            case("44"):
                id = 2131231014 ;
                break;
            case ("43"):
                id = 2131231013;
                break;
            case("42"):
                id = 2131231012 ;
                break;
            case ("41"):
                id = 2131231011;
                break;
            case("40"):
                id = 2131231010 ;
                break;
            case("56"):
                id = 2131231023 ;
                break;
            case ("55"):
                id = 2131231022;
                break;
            case("54"):
                id = 2131231021 ;
                break;
            case ("53"):
                id = 2131231020;
                break;
            case("52"):
                id = 2131231019 ;
                break;
            case ("51"):
                id = 2131231018;
                break;
            case ("50"):
                id = 2131231017;
                break;
            case("66"):
                id = 2131231030 ;
                break;
            case ("65"):
                id = 2131231029;
                break;
            case("64"):
                id = 2131231028 ;
                break;
            case ("63"):
                id = 2131231027;
                break;
            case("62"):
                id = 2131231026 ;
                break;
            case ("61"):
                id = 2131231025;
                break;
            case("60"):
                id = 2131231024 ;
                break;
            case("76"):
                id = 2131231037 ;
                break;
            case ("75"):
                id = 2131231036;
                break;
            case("74"):
                id = 2131231035 ;
                break;
            case ("73"):
                id = 2131231034;
                break;
            case("72"):
                id = 2131231033 ;
                break;
            case ("71"):
                id = 2131231032;
                break;
            case ("70"):
                id = 2131231031;
                break;
        };
        return id;
    };
    private void movement (int colInput){
        if(!gameOver){
            int id = 0;
            if (turnPlayer1) {
//                System.out.print("Player1's turn, select column: ");
                if (!board.putTawBottom(colInput, Taw.RED)) {
                    System.out.println("Column is full!");
                } else {
                    int bottomRow = board.bottomRowIndex(colInput);
                    bottomRow+=2;
                    colInput++;
                    String bottom = String.valueOf(colInput) + String.valueOf(bottomRow);
                    id = findId(bottom);
                    @SuppressLint("ResourceType") Button fill = (Button) findViewById(id);
                    fill.setBackgroundTintList(getResources().getColorStateList(R.color.player_one));
                    this.turnPlayer1 = false;
                    Button state = (Button) findViewById(R.id.turn);
                    CharSequence text = "Player Two's Turn";
                    state.setText(text);
                    if (board.scoreCheck()) {
                        text = "Player One Is Winner";
                        state.setText(text);
                        state.setBackgroundTintList(getResources().getColorStateList(R.color.player_one));
                        state.setTextColor(getResources().getColor(R.color.white));
                        state.setTextSize(25);
                        gameOver = true;
                    }
                }
            } else {
                if (!board.putTawBottom(colInput, Taw.BLUE)) {
//                    System.out.println("Column is full!");
                } else {
                    int bottomRow = board.bottomRowIndex(colInput);
                    bottomRow+=2;
                    colInput++;
                    String bottom = String.valueOf(colInput) + String.valueOf(bottomRow);
                    id = findId(bottom);
                    @SuppressLint("ResourceType") Button fill = (Button) findViewById(id);
                    fill.setBackgroundTintList(getResources().getColorStateList(R.color.player_two));
                    this.turnPlayer1 = true;
                    Button state = (Button) findViewById(R.id.turn);
                    CharSequence text = "Player One's Turn";
                    state.setText(text);
                    if (board.scoreCheck()) {
                        text = "Player Two Is Winner";
                        state.setText(text);
                        state.setBackgroundTintList(getResources().getColorStateList(R.color.player_two));
                        state.setTextColor(getResources().getColor(R.color.white));
                        state.setTextSize(25);
                        gameOver = true;
                    }
                }
            }
        }


    }
    private void touch(String col ,String row){
        String bottom = String.valueOf(col) + String.valueOf(row);
        String topButton = String.valueOf(col) + String.valueOf(0);
        int top = findId(topButton);
        int bottomId = findId(bottom);
        Button button = (Button) findViewById(bottomId);
        if(!button.isPressed()) {
            Button button1 = (Button) findViewById(top);
            if (turnPlayer1) {
                button1.setBackgroundTintList(getResources().getColorStateList(R.color.player_one));
            }
            else{
                button1.setBackgroundTintList(getResources().getColorStateList(R.color.player_two));
            }

        }
        else if(button.isPressed()){
            Button button1 = (Button) findViewById(top);
            if(turnPlayer1){
                button1.setBackgroundTintList(getResources().getColorStateList(R.color.button));
            }
            else{
                button1.setBackgroundTintList(getResources().getColorStateList(R.color.button));
            }
        }
    }
    private void clearAll(){
        for (int i = 0 ; i<7 ;i++){
            for(int j = 1 ; j<8;j++){
                Button delete = (Button) findViewById(findId(String.valueOf(j) + String.valueOf(i)));
                delete.setBackgroundTintList(getResources().getColorStateList(R.color.button));
            }
        }
        Button state = (Button) findViewById(R.id.turn);
        state.setBackgroundTintList(getResources().getColorStateList(R.color.button));
        state.setText("Player One's Turn");
        state.setTextColor(getResources().getColor(R.color.text_color));
    }
}
