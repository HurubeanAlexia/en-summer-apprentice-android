package com.example.endavamobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.ViewHolder>{

    OrderData[] orderData;
    Context context;

    public OrdersAdapter(OrderData[] orderData, OrderActivity activity) {
        this.orderData = orderData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.orders_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final OrderData orderDataList = orderData[position];
        holder.festivalName.setText(orderDataList.getFestivalName());
        holder.ticketOrderedAt.setText(orderDataList.getOrderData());
        holder.numberOfTickets.setText(orderDataList.getTicketNumber());
        holder.ticketCategory.setText(orderDataList.getTicketCategory());
        holder.totalPrice.setText(orderDataList.getTotalPrice());

    }

    @Override
    public int getItemCount() {
        return orderData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView festivalName;
        TextView ticketOrderedAt;
        TextView numberOfTickets;
        TextView ticketCategory;
        TextView totalPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            festivalName = itemView.findViewById(R.id.festival);
            ticketOrderedAt = itemView.findViewById(R.id.orderedAt);
            numberOfTickets = itemView.findViewById(R.id.numberOfTickets);
            ticketCategory = itemView.findViewById(R.id.ticketCategory);
            totalPrice =itemView.findViewById(R.id.totalPrice);

        }
    }


}
