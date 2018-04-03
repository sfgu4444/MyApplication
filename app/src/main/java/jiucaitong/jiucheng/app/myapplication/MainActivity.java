package jiucaitong.jiucheng.app.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private list_mode list_mode;
    private List<list_mode> list_mode_List=new ArrayList<list_mode>();
        private Recycler_AdapterBase adapterBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                recycler=findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        for (int i=0;i<50;i++){
            list_mode list_mode=new list_mode();
            list_mode.setName("我是可爱： "+i);
            list_mode.setStatus("1");
            if(i%2==0){
                list_mode.setTag(1);
            }else{
                list_mode.setTag(2);
            }
            list_mode_List.add(list_mode);
        }
        adapterBase=new Recycler_AdapterBase(this,list_mode_List);
        recycler.setAdapter(adapterBase);
    }
}
