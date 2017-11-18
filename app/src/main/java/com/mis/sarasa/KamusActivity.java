package com.mis.sarasa;

/**
 * Created by Hanifmhd on 11/14/2017.
 */

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.mis.sarasa.entity.Dictionary;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class KamusActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamus);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


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
        int countJawa = 0;
        int countIndo = 0;

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Snackbar.make(mViewPager, "Terdapat " + jawa(countJawa) + " kata bahasa jawa-indonesia\n" +
                    "Terdapat " + indo(countIndo) + " kata bahasa indonesia-jawa", Snackbar.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.action_keterangan) {
            Intent intent = new Intent(KamusActivity.this, KeteranganActivity.class);
            startActivity(intent);
        } else if (id == R.id.action_saran) {
            Intent intent = new Intent(Intent.ACTION_SEND_MULTIPLE);
//            Intent intent = new Intent(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse("mailto:mobilitylab@gmail.com"));
          intent.setType("message/rfc822");
//            intent.setType("text/email");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mobilitylab@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Saran dan Kritik untuk Sarasa");
            startActivity(Intent.createChooser(intent, "Pilih Aplikasi pengiriman E-Mail"));
        }


        return super.onOptionsItemSelected(item);
    }


    public int jawa(int linecount) {
        StringBuilder text = new StringBuilder();
        BufferedReader bufferedReader;
        try {
            Resources res = getResources();
            InputStream inputStream = res.openRawResource(R.raw.jawa_indonesia);

            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
                text.append('\n');
                linecount++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return linecount;
    }

    public int indo(int linecount) {
        StringBuilder text = new StringBuilder();
        BufferedReader bufferedReader;
        try {
            Resources res = getResources();
            InputStream inputStream = res.openRawResource(R.raw.indonesia_jawa);

            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
                text.append('\n');
                linecount++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return linecount;
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return KamusFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "JAWA - INA";
                case 1:
                    return "INA - JAWA";
            }
            return null;
        }
    }
}