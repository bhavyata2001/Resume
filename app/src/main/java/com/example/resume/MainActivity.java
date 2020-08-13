package com.example.resume;

import android.os.Bundle;

import com.example.resume.cv.CVFragment;
import com.example.resume.home.HomeFragment;
import com.example.resume.phone.PhoneFragment;
import com.example.resume.portfolio.PortfolioFragment;
import com.example.resume.sidemenu.Callback;
import com.example.resume.sidemenu.MenuAdapter;
import com.example.resume.sidemenu.MenuItem;
import com.example.resume.sidemenu.MenuUtil;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements Callback {

    RecyclerView menuRv;
    List<MenuItem> menuItems;
    MenuAdapter adapter;
    int selectedMenuPos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        setupSideMenu();

        setHomeFragment();


        //setCvFragment();
        //setHomeFragment();
    }

    private void setupSideMenu() {
        menuRv = findViewById(R.id.rv_side_menu);

        menuItems = MenuUtil.getMenuList();
        adapter = new MenuAdapter(menuItems,this);
        menuRv.setLayoutManager(new LinearLayoutManager(this));
        menuRv.setAdapter(adapter);

    }

    void setPrtfoliofragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new PortfolioFragment()).commit();
    }

    void setCvFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new CVFragment()).commit();
    }

    void setHomeFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
    }

    void setPhoneFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new PhoneFragment()).commit();
    }

    @Override
    public void onSideMenuItemClick(int i) {

        switch (menuItems.get(i).getCode()){
            case MenuUtil.HOME_FRAGMENT_CODE : setHomeFragment();
            break;
            case MenuUtil.CV_FRAGMENT_CODE: setCvFragment();
            break;
            case MenuUtil.PORTFOLIO_FRAGMENT_CODE :setPrtfoliofragment();
            break;
            case MenuUtil.PHONE_FRAGMENT_CODE :setPhoneFragment();
            break;


            default:setHomeFragment();
        }


        menuItems.get(selectedMenuPos).setSelected(false);
        menuItems.get(i).setSelected(true);
        selectedMenuPos =i;
        adapter.notifyDataSetChanged();
    }
}