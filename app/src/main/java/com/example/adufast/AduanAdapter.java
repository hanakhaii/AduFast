package com.example.adufast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adufast.R;

import java.util.List;

public class AduanAdapter extends RecyclerView.Adapter<AduanAdapter.ViewHolder> {

    private Context context;
    private List<AduanModel> aduanList;

    public AduanAdapter(Context context, List<AduanModel> aduanList) {
        this.context = context;
        this.aduanList = aduanList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.activity_list_aduan_anda, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AduanModel aduan = aduanList.get(position);

        holder.etSubjekPengaduan.setText(aduan.getSubjek());
        holder.etDeskripsi.setText(aduan.getDeskripsi());
        holder.etStatus.setText(aduan.getStatus());
        holder.etFoto.setImageResource(aduan.getFotoResId());

        holder.btnEdit.setOnClickListener(v ->
                Toast.makeText(context, "Edit: " + aduan.getSubjek(), Toast.LENGTH_SHORT).show()
        );

        holder.btnDelete.setOnClickListener(v -> {
            Toast.makeText(context, "Hapus: " + aduan.getSubjek(), Toast.LENGTH_SHORT).show();
            aduanList.remove(position);
            notifyItemRemoved(position);
            notifyItemRangeChanged(position, aduanList.size());
        });
    }

    @Override
    public int getItemCount() {
        return aduanList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView etFoto;
        TextView etSubjekPengaduan, etDeskripsi, etStatus;
        Button btnEdit, btnDelete;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            etFoto = itemView.findViewById(R.id.etFoto);
            etSubjekPengaduan = itemView.findViewById(R.id.etSubjekPengaduan);
            etDeskripsi = itemView.findViewById(R.id.etDeskripsi);
            etStatus = itemView.findViewById(R.id.etStatus);
            btnEdit = itemView.findViewById(R.id.btnEdit);
            btnDelete = itemView.findViewById(R.id.btnDelete);
        }
    }
}