package com.example.josh.engineering;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {
    //string[2][3][28];
    int[][][] wireAmp =new int[][][]{
            //copper
            {
                    {15,20,30,40,55,70,85,95,110,125,145,165,195,215,245,260,280,320,350,385,400,410,435,455,495,525,545,555},
                    {15,20,30,50,65,85,100,115,130,150,175,200,230,255,285,310,335,380,420,460,475,490,520,545,590,625,650,665},
                    {15,20,30,55,75,95,115,130,145,170,195,225,260,290,320,350,380,430,475,520,535,555,585,615,665,705,735,750}
            },
            //aluminum
            {
                    {0,15,25,35,40,55,65,75,85,100,115,130,150,170,195,210,225,260,285,315,320,330,355,375,405,435,455,470},
                    {0,20,30,40,50,65,75,90,100,120,135,155,180,205,230,250,270,310,340,375,385,395,425,445,485,520,545,560},
                    {0,20,30,45,55,75,85,100,115,135,150,175,205,230,260,280,305,350,385,425,435,445,480,500,545,585,615,630}
            }

       };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
