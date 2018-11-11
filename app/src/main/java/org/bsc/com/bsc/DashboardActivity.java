package org.bsc.com.bsc;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.bsc.com.bsc.PdfView.SampleActivity;
import org.bsc.com.bsc.VideoPlayerView.FullscreenActivity;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;


public class DashboardActivity extends Activity {
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    HashMap<String,String> contentData;
    //FinalExpandableListAdapter listAdapter;
    ImageAdapter imageAdapter;
    GridView gridView;
    String FILE_NAME ="hello.txt";
    //Permision code that will be checked in the method onRequestPermissionsResult
    private int STORAGE_PERMISSION_CODE = 23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        // get the listview
        gridView = (GridView) findViewById(R.id.gridview);
        // Read json data from local file and parsing the data to arraylist
        String jsonData =    readFileFromAssets();
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        final Model model = gson.fromJson(jsonData, Model.class);
        System.out.print("JSON parse is done");
        imageAdapter = new ImageAdapter(this, model);
       // expListView.setAdapter(listAdapter);
        gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id){

                String fileType = model.getCategories().get(position).getFileType();
                String fileName = model.getCategories().get(position).getFileName();

                if(fileType.equalsIgnoreCase("youtube")) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(fileName));
                    startActivity(browserIntent);
                } else if(fileType.equalsIgnoreCase("pdf")){
                    Intent intent = new Intent(DashboardActivity.this, SampleActivity.class);
                    intent.putExtra("fileName",fileName);
                    startActivity(intent);
                }else if(fileType.equalsIgnoreCase("image")){
                    Intent intent = new Intent(DashboardActivity.this, ImageActivity.class);
                    intent.putExtra("fileName",fileName);
                    startActivity(intent);
                }else if(fileType.equalsIgnoreCase("video")){
                    Intent intent = new Intent(DashboardActivity.this, FullscreenActivity.class);
                    intent.putExtra("fileName",fileName);
                    startActivity(intent);
                }
            }
        });



//
    }

    public String readFileFromAssets(){
        String text = "";
        try{
            InputStream inputStream = getAssets().open("dashboardui.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            text = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
           }


//    //We are calling this method to check the permission status
//    private boolean isReadStorageAllowed() {
//        //Getting the permission status
//        int result = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
//
//        //If permission is granted returning true
//        if (result == PackageManager.PERMISSION_GRANTED)
//            return true;
//
//        //If permission is not granted returning false
//        return false;
//    }
//
//    //Requesting permission
//    private void requestStoragePermission(){
//
//        if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.READ_EXTERNAL_STORAGE)){
//            //If the user has denied the permission previously your code will come to this block
//            //Here you can explain why you need this permission
//            //Explain here why you need this permission
//        }
//
//        //And finally ask for the permission
//        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},STORAGE_PERMISSION_CODE);
//    }
//
//    //This method will be called when the user will tap on allow or deny
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//
//        //Checking the request code of our request
//        if(requestCode == STORAGE_PERMISSION_CODE){
//
//            //If permission is granted
//            if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
//
//                //Displaying a toast
//                Toast.makeText(this,"Permission granted now you can read the storage",Toast.LENGTH_LONG).show();
//            }else{
//                //Displaying another toast if permission is not granted
//                Toast.makeText(this,"Oops you just denied the permission",Toast.LENGTH_LONG).show();
//            }
//        }
//    }


}
