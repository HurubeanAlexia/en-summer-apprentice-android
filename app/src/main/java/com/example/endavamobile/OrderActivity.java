package com.example.endavamobile;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class OrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orders);

        RecyclerView recyclerViewOrders = findViewById(R.id.recyclerViewOrders);
        recyclerViewOrders.setHasFixedSize(true);
        recyclerViewOrders.setLayoutManager(new LinearLayoutManager(this));

        OrderData[] orderData = new OrderData[]{
                new OrderData("Festival: Untold", "Order date: 12-03-2022", "Number of tickets: 2", "Ticket category: Standard", "Total price: 1100.0"),
                new OrderData("Festival: Electric Castle", "Order date: 10-04-2023", "1", "VIP", "990.0"),
                new OrderData("Festival: Untold", "Order date: 10-06-2023", "Number of tickets: 3", "Ticket category: Standard", "Total price: 2000.0"),
                new OrderData("Festival: Neversea", "Order date: 01-01-2021", "1", "Standard", "600.0")

        };

        OrdersAdapter ordersAdapter = new OrdersAdapter(orderData, OrderActivity.this);
        recyclerViewOrders.setAdapter(ordersAdapter);


    }
}