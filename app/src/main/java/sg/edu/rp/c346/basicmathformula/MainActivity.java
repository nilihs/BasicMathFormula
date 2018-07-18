package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;
    ArrayList<Formula> alFormulaList;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.ListViewFormula);

        alFormulaList = new ArrayList<>();

        Formula item1 = new Formula("Area of rectangle", "Length x Length","Formula type is Area");
        Formula item2 = new Formula("Area of triangle", "(Length of base x Length) / 2", "Formula type is Area");
        Formula item3 = new Formula("Volume of cube", "Length x Length x Length", "Formula type is Volume");

        alFormulaList.add(item1);
        alFormulaList.add(item2);
        alFormulaList.add(item3);

        caFormula = new CustomAdapter(this, R.layout.math_formula, alFormulaList);
        lvFormula.setAdapter(caFormula);


    }
}
