package com.example.endavamobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    EventsData[] eventsData;
    Context context;

    public EventAdapter(EventsData[] eventsData, MainActivity activity){
        this.eventsData = eventsData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.events_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final EventsData eventsDataList = eventsData[position];
        holder.textViewName.setText(eventsDataList.getEventName());
        holder.textViewDescription.setText(eventsDataList.getEventDescription());
        holder.eventImage.setImageResource(eventsDataList.getEventImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, eventsDataList.getEventName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return eventsData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView eventImage;
        TextView textViewName;
        TextView textViewDescription;
        public ViewHolder(@Nullable View itemView){
            super(itemView);
            eventImage = itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.textName);
            textViewDescription = itemView.findViewById(R.id.textDescription);

        }

    }
}
