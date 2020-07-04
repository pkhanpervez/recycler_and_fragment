package com.muphred.org.seller;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class InactiveFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
//        Log.d("parvez","nothing happen");
//        Toast.makeText(getContext(),"This is mesage", Toast.LENGTH_SHORT).show();

        return inflater.inflate(R.layout.inactive_layout, viewGroup, false);
    }
}