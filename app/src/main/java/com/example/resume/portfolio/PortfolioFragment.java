package com.example.resume.portfolio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resume.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PortfolioFragment extends Fragment implements PortfolioCallback{

    List<PortfolioItem> mdata;
    RecyclerView rv_portfolio;
    PortfolioAdapter portfolioAdapter;

    public PortfolioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv_portfolio = view.findViewById(R.id.rv_portfolio);

        mdata = new ArrayList<>();

        mdata.add(new PortfolioItem(R.drawable.img0));
        mdata.add(new PortfolioItem(R.drawable.img1));
        mdata.add(new PortfolioItem(R.drawable.img2));
        mdata.add(new PortfolioItem(R.drawable.img3));
        mdata.add(new PortfolioItem(R.drawable.img4));
        mdata.add(new PortfolioItem(R.drawable.img5));
        mdata.add(new PortfolioItem(R.drawable.img6));
        mdata.add(new PortfolioItem(R.drawable.img77));
        mdata.add(new PortfolioItem(R.drawable.img88));

        portfolioAdapter=new PortfolioAdapter(mdata,this);

        rv_portfolio.setLayoutManager(new GridLayoutManager(getActivity(),3));
        rv_portfolio.setAdapter(portfolioAdapter);

    }

    @Override
    public void onPortfolioItemClick(int pos) {
        PortfolioFragmentDetails portfolioFragmentDetails =
                new PortfolioFragmentDetails();

        Bundle bundle = new Bundle();
        bundle.putSerializable("object",mdata.get(pos));
        portfolioFragmentDetails.setArguments(bundle);

        portfolioFragmentDetails.show(getActivity().getSupportFragmentManager(),"tagname");
    }
}