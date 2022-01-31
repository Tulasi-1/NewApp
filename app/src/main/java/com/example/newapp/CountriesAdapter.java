package com.example.newapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
//step1-- implement the methods
//step2-- created a class CountriesViewHolder[import]
// step3--extend CountriesViewHolder with RecyclerView.ViewHolder
//step4-- create constructor for CountriesViewHolder
//step5-- rv_item_row_plank represents one row in the recycler view
//step 6--implemented onCreateViewHolder
//7 -- in CountriesViewHolder i got the handle of textview
//8 -- passed the array from  recycleractivity to the countriesadapter
//9 -- implemented getItemCount
//10-- onBindViewHolder -- set the country on to the textview


public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder>{

    String[] mCountries;
    public CountriesAdapter(String[] countries) {
        mCountries = countries ;
    }

    @NonNull
    @Override // person a--inflate rows[buy wooden planks]
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rowPlank = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_row_plank,parent,false);

        return new CountriesViewHolder(rowPlank);
    }

    @Override // person c- good at handwriting -- write on plank
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        holder.rowTextView.setText(mCountries[position]);

    }

    @Override //person d -- keep the count of no. of items in  array
    public int getItemCount() {
        return mCountries.length;
    }
//box holding planks --person b holding box
    class CountriesViewHolder extends RecyclerView.ViewHolder{
        TextView rowTextView;

        public CountriesViewHolder(@NonNull View itemView) {
            super(itemView);
            rowTextView = itemView.findViewById(R.id.tvRow);
        }
    }

}
