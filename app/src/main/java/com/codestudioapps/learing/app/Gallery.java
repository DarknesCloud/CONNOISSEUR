package com.codestudioapps.learing.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.media.Image;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Gallery extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private ImageAdapter mImageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        mImageAdapter = new ImageAdapter(this, new ArrayList<String>());
        mRecyclerView.setAdapter(mImageAdapter);

        List<String> imageUrls = new ArrayList<>();
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        imageUrls.add("https://www.cmic.org/wp-content/uploads/2020/10/Construcci%C3%B3n-el-sector-con-mejores-resultados-en-generaci%C3%B3n-de-empleos.jpg");
        // Agrega más URL de imagen aquí

        mImageAdapter.setImages(imageUrls);

}
}