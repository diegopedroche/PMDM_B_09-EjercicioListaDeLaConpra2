package com.cieep.pmdm_b_09_ejerciciolistadelaconpra.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cieep.pmdm_b_09_ejerciciolistadelaconpra.modelos.Producto;

import java.util.List;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ProductoVH> {

    private List<Producto> objects;
    private int resources;
    private Context context;

    @NonNull
    @Override
    public ProductoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    public class ProductoVH extends RecyclerView.ViewHolder {
        public ProductoVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
