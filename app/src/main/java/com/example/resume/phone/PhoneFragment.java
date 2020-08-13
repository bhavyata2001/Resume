package com.example.resume.phone;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.resume.R;

import androidx.fragment.app.Fragment;


public class PhoneFragment extends Fragment {
TextView mail;
TextView linkdin;
TextView github;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_phone, container, false);
        TextView mail = (TextView)v.findViewById(R.id.textView13);
        TextView linkdin = (TextView)v.findViewById(R.id.textView28);
        TextView github = (TextView)v.findViewById(R.id.textView30);
        mail.setMovementMethod(LinkMovementMethod.getInstance());
        linkdin.setMovementMethod(LinkMovementMethod.getInstance());
        github.setMovementMethod(LinkMovementMethod.getInstance());

        return v;
    }
}