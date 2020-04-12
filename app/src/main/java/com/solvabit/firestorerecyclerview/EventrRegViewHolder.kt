package com.solvabit.firestorerecyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class EventrRegViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    public   TextView sub_event_name_text_view, prize_text_view
    public   CheckBox checkBox_bt


    public EventRegRecyclerViewHolder(View itemView)
    {
        super(itemView)

        sub_event_name_text_view = itemView.findViewById(R.id.sub_event_name_txt)
        prize_text_view = itemView.findViewById(R.id.prize_txt)
        checkBox_bt = itemView.findViewById(R.id.radio_bt_)
    }


}