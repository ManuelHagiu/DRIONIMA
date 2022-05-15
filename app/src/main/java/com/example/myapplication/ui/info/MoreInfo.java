package com.example.myapplication.ui.info;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentInfoBinding;
import com.example.myapplication.databinding.FragmentMoreinfoBinding;

import org.w3c.dom.Text;

public class MoreInfo extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_moreinfo);

        MoreInfoViewModel moreInfoViewModel = new ViewModelProvider(this).get(MoreInfoViewModel.class);
        Button dragosButton= findViewById(R.id.dragoslinked);
        Button nicolaButton  = findViewById(R.id.nicolalinked);
        Button ionutButton = findViewById(R.id.ionutlikded);
        Button manuButton = findViewById(R.id.manulinked);
        dragosButton.setOnClickListener(v->
        {
            String url="https://www.linkedin.com/in/dragos-emanuel-baias/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        nicolaButton.setOnClickListener(v->
        {
            String url="https://www.linkedin.com/in/nicola-santolini/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        ionutButton.setOnClickListener(v->
        {
            String url="https://www.linkedin.com/in/ionut-adrian-rotaru-040373233/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        manuButton.setOnClickListener(v->
        {
            String url="https://www.linkedin.com/in/manuel-hagiu-89927a239/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
    }


}