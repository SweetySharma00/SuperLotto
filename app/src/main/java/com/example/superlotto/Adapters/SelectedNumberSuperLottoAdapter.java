package com.example.superlotto.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.superlotto.Models.SelectedNumber;
import com.example.superlotto.R;

import java.util.ArrayList;

public class SelectedNumberSuperLottoAdapter  extends RecyclerView.Adapter<SelectedNumberSuperLottoAdapter.SelectedNumberLottoViewHolder>{

    ArrayList<SelectedNumber> selectedNumberLottos = new ArrayList<>();
    SelectedNumberSuperLottoClick selectedNumberLottoClick;
    int width;
    Context context;

    public SelectedNumberSuperLottoAdapter(SelectedNumberSuperLottoClick selectedNumberSuperLottoClick, Context context) {
        this.selectedNumberLottoClick=selectedNumberSuperLottoClick;
        this.context=context;
    }


    public void setSelectedNumberLottos(ArrayList<SelectedNumber> selectedNumbers) {
        this.selectedNumberLottos = selectedNumbers;
    }

    @NonNull
    @Override
    public SelectedNumberLottoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.selected_number_superlotto_item,parent,false);
        return new SelectedNumberLottoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectedNumberLottoViewHolder holder, int position) {
        if (Integer.parseInt(selectedNumberLottos.get(position).getAmount().getText().toString()) % 2 == 0) {
            holder.imgBall.setImageResource(R.drawable.blue_ball_superlotto);

        } else
            holder.imgBall.setImageResource(R.drawable.orange_ball_superlotto);


        holder.txtNumber.setText(selectedNumberLottos.get(position).getAmount().getText());
    }

    @Override
    public int getItemCount() {
        return selectedNumberLottos.size();
    }

    public class SelectedNumberLottoViewHolder extends RecyclerView.ViewHolder {
        ImageView imgRemove,imgBall;
        TextView txtNumber;
        FrameLayout layoutMain;

        public SelectedNumberLottoViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNumber = itemView.findViewById(R.id.txtNumber);
            imgRemove = itemView.findViewById(R.id.imgRemove);
            imgBall = itemView.findViewById(R.id.imgBall);
            layoutMain = itemView.findViewById(R.id.layoutMain);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedNumberLottoClick.selectedNumberLottoClickListener(selectedNumberLottos.get(getAdapterPosition()));
                }
            });
        }
    }
    public interface SelectedNumberSuperLottoClick{
        void selectedNumberLottoClickListener(SelectedNumber selectedNumberLotto);
    }
}
