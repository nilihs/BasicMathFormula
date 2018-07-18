package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by 17001227 on 18/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Formula> formulaList;


    public CustomAdapter(@NonNull Context context, int resource, ArrayList<Formula> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.formulaList = objects;
    }


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvFormula = rowView.findViewById(R.id.tvFormula);
        TextView tvType = rowView.findViewById(R.id.tvType);

        Formula currentItem = formulaList.get(position);
        tvFormula.setText(currentItem.getMathFormula());
        tvTitle.setText(currentItem.getMathTitle());
        tvType.setText(currentItem.getMathType());

        return rowView;

    }

}

