package co.edu.unipiloto.beeradvise;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer (View view){
        //Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Get a reference to the spinner
        Spinner color = (Spinner)findViewById(R.id.color);
        //get the selected item on the spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //display the selected item
        brands.setText(beerType);
    }

}