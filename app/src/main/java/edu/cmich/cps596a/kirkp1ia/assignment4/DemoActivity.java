package edu.cmich.cps596a.kirkp1ia.assignment4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import edu.cmich.cps596a.kirkp1ia.assignment4.demos.Person;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
    }

    public void getAllPeople(View v) {
        List<Person> people = Person.listAll(Person.class);
        String strPeople = "";
        for (Person p : people) {
            strPeople = strPeople + "\n" + p.toString();
        }

        TextView peopleView = (TextView) this.findViewById(R.id.view_people);
        peopleView.setText(strPeople);
    }

    public void newPersonClicked(View v) {
        String name = ((EditText) this.findViewById(R.id.input__name)).getText().toString();
        String nickName = ((EditText) this.findViewById(R.id.input__nickname)).getText().toString();
        int age = Integer.valueOf(((EditText) this.findViewById(R.id.input__age)).getText().toString());

        Person p = new Person(name, nickName, age);
        p.save();
    }
}
