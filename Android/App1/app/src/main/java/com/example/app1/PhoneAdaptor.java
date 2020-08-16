package com.example.app1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.app1.model.Member;

import java.util.ArrayList;
import java.util.List;

public class PhoneAdaptor extends ArrayAdapter<Member> {
    private Context context;
    private ArrayList<Member> list;
    private int resId;


    public PhoneAdaptor(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public PhoneAdaptor(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public PhoneAdaptor(@NonNull Context context, int resource, @NonNull Member[] objects) {
        super(context, resource, objects);
    }

    public PhoneAdaptor(@NonNull Context context, int resource, int textViewResourceId, @NonNull Member[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public PhoneAdaptor(@NonNull Context context, int resource, @NonNull List<Member> objects) {
        super(context, resource, objects);
        this.context = context;
        this.list = (ArrayList<Member>)objects;
        this.resId = resource;
    }

    public PhoneAdaptor(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Member> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;

        if(itemView == null){
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = vi.inflate(resId, null);
        }
        final Member m = list.get(position);
        if(m != null) {
            TextView t1 = (TextView) itemView.findViewById(R.id.txtName);
            TextView t2 = (TextView) itemView.findViewById(R.id.txtPhoneNum);
            ImageView imgv = itemView.findViewById(R.id.imageView);
            Button buttonCall=itemView.findViewById(R.id.btnCall);
            imgv.setImageResource(R.drawable.ic_launcher_foreground);       //set default image

            if(t1!=null) t1.setText(m.getName());
            if(t2!=null) t2.setText(m.getTel());

            buttonCall.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + m.getTel()));
                    context.startActivity(intent);
                }
            });
        }
        return itemView;
    }
}
