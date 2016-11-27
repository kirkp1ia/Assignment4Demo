package edu.cmich.cps596a.kirkp1ia.assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import kirkModels.orm.Project;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

//        try {
//            Project.initialize("settings/settings.json");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
