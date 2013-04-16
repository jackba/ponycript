package com.example.appprova;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.text.Editable;
import android.util.*;
import java.math.*;
import java.util.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public boolean primo_tipo(EditText username)
    {
    	String a=username.getText().toString();
    	
    	char array[];
    	int lunghezza=username.length();
    	boolean uppercase=false;
    	
    	Log.w("boh","LETTERRRAAAA:"+array[0]+array[1]+array[2]+array[3]);
    	for(int i=0;i<lunghezza;i++){
    		if(array[i]<='Z' && array[i]>='A'){
    			uppercase=true;
    			array[i]=Character.toLowerCase(array[i]);
    		}else{
    			uppercase=false;
    		}
    		
    		if(array[i]>'l'){
    			for(int j=0;j<lunghezza;j++){
    				if(array[i]<'z'){
    					array[i]++;
    				}else{
    					array[i]='m';
    				}
    			}
    		}else if(array[i]<='l'){
    			for(int j=0;j<lunghezza;j++){
    				if(array[i]>'a'){
    					array[i]--;
    				}else{
    					array[i]='l';
    				}
    			}
    		}
    	
    	if(uppercase){
    		array[i]=Character.toUpperCase(array[i]);
    		uppercase=false;
    	}
    	Log.w("TEST","LETTERA: "+array[i]);
    	
    	}
    	

    	
    	return true;
    }

    public boolean secondo_tipo(EditText username)
    {
    	Log.w("Test","SECONDO TIPO");
    	return true;
    }

    public boolean terzo_tipo(EditText username)
    {
    	Log.w("Test","TERZO TIPO");
    	return true;
    }

    
    public boolean cripta(EditText username){
    	Random r=new Random();
    	
    	switch(r.nextInt(3)+1){
    	case 1:
    		primo_tipo(username);
    		break;
    	case 2:
    		secondo_tipo(username);
    		break;
    	case 3:
    		terzo_tipo(username);
    		break;
    	default:
    		Log.w("ERRORE","Numero random fuori");
    		return false;
    	}
    	
    	return true;
    }
    
    public void Main(){
    	final EditText username = (EditText) findViewById(R.id.editText1);
    	Button cambiatesto = (Button) findViewById(R.id.button1);
    	
    	cambiatesto.setOnClickListener(new View.OnClickListener() {
    		 public void onClick(View v) {
             	if(cripta(username))
             		Log.w("Criptazione","Password criptato con Successo");
             	else
             		Log.w("Criptazione","Password non criptata!");
             }
    	});
    		
    }
    	


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        Main();
        return true;
    }
    
}
