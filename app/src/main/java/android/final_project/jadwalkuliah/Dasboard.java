package android.final_project.jadwalkuliah;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.Calendar;

public class Dasboard extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FloatingActionButton btnTambah;
    private RecyclerView.LayoutManager mLayoutManager;
    private String filter = "";
    private JadwalKuliahHelper myDB;
    private RecyclerView mRecyclerView;
    private AdapterJadwalKuliahHariIni mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);

        mRecyclerView = findViewById(R.id.list_matakuliahhariini);
        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        btnTambah = findViewById(R.id.tambah);
        myDB = new JadwalKuliahHelper(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), InputJadwal.class);
                startActivity(i);
            }
        });

        Calendar calendar = Calendar.getInstance();
        int Day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (Day){
            case Calendar.SUNDAY:
                populaterecyclerView(filter,"Minggu");
                break;
            case Calendar.MONDAY:
                populaterecyclerView(filter,"Senin");
                break;
            case Calendar.TUESDAY:
                populaterecyclerView(filter,"Selasa");
                break;
            case Calendar.WEDNESDAY:
                populaterecyclerView(filter,"Rabu");
                break;
            case Calendar.THURSDAY:
                populaterecyclerView(filter,"Kamis");
                break;
            case Calendar.FRIDAY:
                populaterecyclerView(filter,"Jumat");
                break;
            case Calendar.SATURDAY:
                populaterecyclerView(filter,"Sabtu");
                break;
        }
    }

    private void populaterecyclerView(String filter, String Hari){
        myDB = new JadwalKuliahHelper(this);
        mAdapter = new AdapterJadwalKuliahHariIni(myDB.jadwalListHariIni(filter, Hari), this, mRecyclerView);
        mRecyclerView.setAdapter(mAdapter);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dasboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.jadwal_saya) {
            Intent i = new Intent(Dasboard.this, ListMatakuliah.class);
            startActivity(i);
        } else if (id == R.id.about) {
            Intent i = new Intent(Dasboard.this, Tentang.class);
            startActivity(i);
        } else if (id == R.id.developer) {
            Intent i = new Intent(Dasboard.this, Kontak.class);
            startActivity(i);
        } else if (id == R.id.bagikan) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Hey, download this app! " +
                    "https://github.com/PearlMaknun/NgampusYuk");
            startActivity(shareIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
