package com.example.kevinwong.criminalintent;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.text.TextWatcher;
import android.text.Editable;
import android.widget.Button;
import android.widget.CheckBox;
import java.text.SimpleDateFormat;

public class CrimeFragment extends Fragment {

    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;
    private SimpleDateFormat formatter;


    public CrimeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);

        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence c, int start, int before, int count) {
                    mCrime.setTitle(c.toString());
                }

            public void beforeTextChanged(CharSequence c, int start, int count, int after)
            {

            }

            public void afterTextChanged(Editable c)
            {

            }

        });

        mDateButton = (Button)v.findViewById(R.id.crime_date);
        formatter = new SimpleDateFormat("EEEE, MMM d yyyy");
        mDateButton.setText(formatter.format(mCrime.getDate()).toString());
        mDateButton.setEnabled(false);

        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //Set crime's solved property
                mCrime.setSolved(isChecked);
            }
        });
        return v;
    }

}
