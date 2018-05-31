package com.example.lironsegev.lirons291;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView action;
    Button result;
    EditText a2, b1, c;
    double a02, b01, c0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action=(WebView)findViewById(R.id.wvinternet);
        result=(Button)findViewById(R.id.btnres);
        a2=(EditText)findViewById(R.id.editText);
        b1=(EditText)findViewById(R.id.editText2);
        c=(EditText)findViewById(R.id.editText3);
        action.setWebViewClient(new MyWebViewClient());
    }
    String strurl="https://www.google.co.il/search?hl=en&source=hp&ei=ukh4WpPCJcaBkwXKlKToDw&q=";

    public void getresult(View view) {
        String aa= a2.getText().toString();
        String bb= b1.getText().toString();
        String cc= c.getText().toString();
        a02= Integer.parseInt(aa);
        b01=Integer.parseInt(bb);
        c0= Integer.parseInt(cc);
        if (a02==0)
        {
            result.setText("error");
        }
        else {
            action.getSettings().setJavaScriptEnabled(true);
            strurl = strurl + a02 + "x%5E2%2B" + b01 + "x%2B" + c0;
            action.loadUrl(strurl);
        }
    }

}
    class MyWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView action, String strurl) {
            action.loadUrl(strurl);
             return true;
    }
}


