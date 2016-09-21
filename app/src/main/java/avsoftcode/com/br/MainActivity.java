package avsoftcode.com.br.novoprojeto;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 frag1 = new Fragment1();
        Fragment2 frag2 = new Fragment2();
        Fragment3 frag3 = new Fragment3();
        Fragment4 frag4 = new Fragment4();

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.frag1, frag1, "frag1").addToBackStack("frag1").commit();
        manager.beginTransaction().add(R.id.frag2, frag2, "frag2").addToBackStack("frag2").commit();
        manager.beginTransaction().add(R.id.frag3, frag3, "frag3").addToBackStack("frag3").commit();
        manager.beginTransaction().add(R.id.frag4, frag4, "frag4").addToBackStack("frag4").commit();
    }
}