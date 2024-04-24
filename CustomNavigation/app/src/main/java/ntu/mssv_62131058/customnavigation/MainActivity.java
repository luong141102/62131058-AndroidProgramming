package ntu.mssv_62131058.customnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;

import ntu.mssv_62131058.customnavigation.page.HomePage;
import ntu.mssv_62131058.customnavigation.page.LogoutPage;
import ntu.mssv_62131058.customnavigation.page.ProfilePage;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout mDrawerLayout;
    int HOMEPAGE = 0;
    int PROFILEPAGE = 1;
    int LOGOUT = 2;
    int mCurrent = HOMEPAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                R.string.nav_open, R.string.nav_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        replaceFragment(new HomePage());
        navigationView.getMenu().findItem(R.id.nav_home).setChecked(true);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_home){
            if (mCurrent != HOMEPAGE){
                replaceFragment(new HomePage());
                mCurrent = HOMEPAGE;
            }
        } else if (id == R.id.nav_prof) {
            if (mCurrent != PROFILEPAGE){
                replaceFragment(new ProfilePage());
                mCurrent = PROFILEPAGE;
            }
        } else if (id == R.id.nav_logout) {
            if (mCurrent != LOGOUT){
                replaceFragment(new LogoutPage());
                mCurrent = LOGOUT;
            }
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
    void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, fragment);
        transaction.commit();
    }
}