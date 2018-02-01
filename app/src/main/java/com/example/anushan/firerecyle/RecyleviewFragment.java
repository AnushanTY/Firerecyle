package com.example.anushan.firerecyle;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * A simple {@link Fragment} subclass.
 */
public class RecyleviewFragment extends Fragment {

    private RecyclerView mPostRecycleview;
    private  FirebaseRecyclerAdapter postPostviewholderFirebaseRecyclerAdapter;
    public RecyleviewFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recyleview, container, false);

    }

    public class viewHolder extends RecyclerView.ViewHolder{

        public viewHolder(View itemView) {
            super(itemView);
        }
    }


}
