package com.ismailhakkiaydin.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AlertDialog.Builder dlg = new AlertDialog.Builder(this, AlertDialog.BUTTON_POSITIVE);

        dlg.setTitle("WARNING");
        dlg.setMessage("Are you sure deleting this message?");
        dlg.setIcon(R.drawable.ic_launcher_foreground);


        dlg.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.setTitle("Deleted message");
            }
        });

        dlg.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.setTitle("Okay");
            }
        });
        AlertDialog ad = dlg.create();
        dlg.show();
    }
}
