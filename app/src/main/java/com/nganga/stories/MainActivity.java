package com.nganga.stories;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

import java.util.ArrayList;


public class MainActivity extends Activity {

    public static GoogleAnalytics analytics;
    public static Tracker tracker;


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mlayoutmanager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analytics = GoogleAnalytics.getInstance(this);
        analytics.setLocalDispatchPeriod(1800);

        tracker = analytics.newTracker("UA-65063952-2"); // Replace with actual tracker/property Id
        tracker.enableExceptionReporting(true);
        tracker.enableAdvertisingIdCollection(true);
        tracker.enableAutoActivityTracking(true);


        //referencing the Recyclerview
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        //use a linear layoutmanager
        mlayoutmanager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mlayoutmanager);

         ArrayList<MyStories> myStories = new ArrayList<MyStories>();

        //populating the Stories ArrayList

            myStories.add(new MyStories(
                    "The Crazy Monkey",
                    "How the monkey lost his beard"
            ));

             myStories.add(new MyStories(
                "The Little Dandy",
                "Why hearts get broken"
             ));
             myStories.add(new MyStories(
                "The Crazy Monkey",
                "How the monkey lost his beard"
             ));
            myStories.add(new MyStories(
                "How Many more?",
                "Tribulations of the lost boy"
            ));
            myStories.add(new MyStories(
                "The Sorry Morning",
                "Why we eat Breakfast"
            ));
           myStories.add(new MyStories(
                "The Cup And The Tree",
                "Why the Tree lives outside"
           ));
           myStories.add(new MyStories(
                   "The Black Zebra",
                   "How the monkey lost his Stripes"
           ));





        //specify an adapter
        mAdapter = new MyAdapter(myStories);
        mRecyclerView.setAdapter(mAdapter);


        MyFragment frag = new MyFragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.my_layout, frag,"myStories");
        transaction.commit();
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
