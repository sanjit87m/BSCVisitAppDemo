package org.bsc.com.bsc.PdfView;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


import org.bsc.com.bsc.R;

import java.io.File;

public class SampleActivity extends Activity {
    private static final String TAG = "SampleActivity";
    //private static final String SAMPLE_FILE = "test.pdf";
    private static final String FILE_PATH = "filepath";
    private static final String SEARCH_TEXT = "text";
    private org.bsc.com.bsc.PdfView.PdfFragment fragment;
    private static Context context;
    private String fileName="";
    TextView header_back_tv;
    TextView header_detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        fileName = getIntent().getStringExtra("fileName");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        header_back_tv = (TextView) toolbar.findViewById(R.id.header_back_tv);
        header_back_tv.setVisibility(View.VISIBLE);
        header_detail =(TextView) toolbar.findViewById(R.id.header_detail);
        header_detail.setVisibility(View.INVISIBLE);
        context = SampleActivity.this;
       openPdfWithFragment();
        header_back_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    public void openPdfWithFragment() {
        fragment = new PdfFragment();
        Bundle args = new Bundle();
        args.putString(FILE_PATH, Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "Download"+File.separator+fileName);
        //.putString(FILE_PATH, getFilesDir() + File.separator + "Download"+File.separator+fileName);
        fragment.setArguments(args);
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
    }

}
