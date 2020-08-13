package com.example.resume.cv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resume.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CVFragment extends Fragment {
    RecyclerView RvCv;
    CVAdapter adapter;
    List<CVItem> items;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RvCv = view.findViewById(R.id.recyclerview_cv);

        items= new ArrayList<>();
        items.add(new CVItem("INTERNSHIPS",getString(R.string.intership)));
        items.add(new CVItem("APPLICATION 1",getString(R.string.project1)));
        items.add(new CVItem("APPLICATION 2",getString(R.string.project2)));
        items.add(new CVItem("APPLICATION 3",getString(R.string.project3)));
        items.add(new CVItem("APPLICATION 4",getString(R.string.project4)));
        items.add(new CVItem("APPLICATION 5",getString(R.string.project5)));

        adapter = new CVAdapter(items);
        RvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        RvCv.setAdapter(adapter);

    }

    public CVFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cv, container, false);
    }
}