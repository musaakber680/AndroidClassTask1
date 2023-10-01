package com.example.classtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    CheckBox firstFlavour, secondFlavour;
    TextView qtyNumber;
    Button qtyMinus, qtyPlus, orderBtn;
    private int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orderBtn = (Button) findViewById(R.id.orderBtn);
        editText = (EditText) findViewById(R.id.editText);
        firstFlavour = (CheckBox) findViewById(R.id.firstFlavour);
        secondFlavour = (CheckBox) findViewById(R.id.secondFlavour);
        qtyNumber = (TextView) findViewById(R.id.qtyNumber);
        qtyMinus = (Button) findViewById(R.id.qtyMinus);
        qtyPlus = (Button) findViewById(R.id.qtyPlus);

        qtyMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantity > 0) {
                    --quantity;
                    updateQuantityText();
                }
            }
        });

        qtyPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++quantity;
                updateQuantityText();
            }
        });

        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String itemName = editText.getText().toString();
                boolean whipped = false;
                boolean chocolate = false;

                if (firstFlavour.isChecked()) {
                    whipped = true;
                }

                if (secondFlavour.isChecked()) {
                    chocolate = true;
                }

                int total = quantity * 150;

                String order = "Name : " + itemName +
                        "\n Added Whipped : " + whipped +
                        "\n Added Chocolate : " + chocolate +
                        "\n Total Quantity : " + quantity +
                        "\n Total Bill : Rs " + total +
                        "\n Thank You! ";

                // For Email

                // for sending the email

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("mailto:"));

                intent.putExtra(Intent.EXTRA_SUBJECT, "Total Bill For : " + itemName);
                intent.putExtra(Intent.EXTRA_TEXT, order);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

                // end

                // rough

                // int num = 80;
                // qtyNumber.setText(Integer.toString(num));

                // Toast.makeText(MainActivity.this, "Text Value : " + itemName + " " + whipped + " " + chocolate + " " + quantity + " " + total, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateQuantityText() {
        qtyNumber.setText(String.valueOf(quantity));
    }
}