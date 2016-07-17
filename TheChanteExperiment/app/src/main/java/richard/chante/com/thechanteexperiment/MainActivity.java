package richard.chante.com.thechanteexperiment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*this is a java class
The name of the class is called MainActivity
it is public which means it can be seen and used anywhere in the project structure
it extends the AppCompatActivity which can be summarised as follows:
-->Activity is generally a screen that is viewed within an app (for instance a login screen in GeoVoucher)
-->AppCompat is a support package which allows cool features that didnt exist in old version of android to be
-->seen and viewed on older devices.
-->therefore appCompActivity is a screen that will support old and new versions of android
*/
public class MainActivity extends AppCompatActivity {

    /*When you see this override syntax it means it is using a method from the class it has extended
    When you extend a class it allows the class to have the same functionality as the extender class
    You can then "override" one of its methods so that you can add your own functionality to it*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //the line below is the layout you will view when the activity displays
        setContentView(R.layout.activity_main);
    }
}
