package com.example.kevinwong.criminalintent;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
