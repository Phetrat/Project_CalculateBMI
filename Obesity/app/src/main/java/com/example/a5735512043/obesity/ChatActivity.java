package com.example.a5735512043.obesity;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ChatActivity extends AppCompatActivity {

    String username;
    DatabaseReference child;
    EditText et_message;
    Button btn_send;
    String key;
    String child_username;
    String child_value;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        //ActionBar
        ActionBar actionBat = getSupportActionBar();
        //set title
        actionBat.setTitle("Chat");

        listView = (ListView)findViewById(R.id.ListView_chat);
        et_message = (EditText)findViewById(R.id.messageEt);
        btn_send = (Button)findViewById(R.id.bntsend);

        onRequest_userName();

        child = FirebaseDatabase.getInstance().getReference().child("Chat");
        list = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,list);
        listView.setAdapter(adapter);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Map<String,Object>map = new HashMap<String, Object>();
                key = child.push().getKey();
                map.put(key,"");
                child.updateChildren(map);

                DatabaseReference messgae_key = child.child(key);
                Map<String,Object>map2 = new HashMap<String, Object>();
                map2.put("username", username);
                map2.put("msg",et_message.getText().toString());
                messgae_key.updateChildren(map2);

                Toast.makeText(ChatActivity.this, "ส่ง", Toast.LENGTH_SHORT).show();

                et_message.setText("");
            }
        });
    }

    @Override
    protected void onResume() {
        child.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                onGetChild(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                onGetChild(dataSnapshot);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d("databaseError",databaseError.toString());
                Toast.makeText(ChatActivity.this, "onCancelled", Toast.LENGTH_SHORT).show();

            }
        });
        super.onResume();
    }

    private void onRequest_userName() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("UserName");
        final EditText input_username = new EditText(this);
        alert.setView(input_username);
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                username = input_username.getText().toString();
                dialogInterface.dismiss();
            }
        });
        alert.setCancelable(false);
        alert.show();

    }
    private void onGetChild(DataSnapshot dataSnapshot){
        Iterator i = dataSnapshot.getChildren().iterator();
        while (i.hasNext()){
            child_value = (String)((DataSnapshot)i.next()).getValue();
            child_username = (String) ((DataSnapshot)i.next()).getValue();
            list.add(child_username+":"+child_value);
        }
        adapter.notifyDataSetChanged();
    }


}
