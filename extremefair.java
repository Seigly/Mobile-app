package com.example.skinelixirfire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class extremefair extends AppCompatActivity {


    Button btn;

    RadioButton r1;
    RadioGroup rg1,rg2,rg3,rg4,rg5;
    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extremefair);

        btn = findViewById(R.id.button3);
        rg1=findViewById(R.id.rad);
        rg2=findViewById(R.id.rad2);
        rg3=findViewById(R.id.rad4);
        rg4=findViewById(R.id.radioGroup);
        rg5=findViewById(R.id.rad3);

        btn.setOnClickListener(new View.OnClickListener() {






            @Override
            public void onClick(View view) {

                int selectedId  = rg1.getCheckedRadioButtonId();
                int selectedId1 = rg2.getCheckedRadioButtonId();
                int selectedId2 = rg3.getCheckedRadioButtonId();
                int selectedId3 = rg4.getCheckedRadioButtonId();
                int selectedId4 = rg5.getCheckedRadioButtonId();
if(selectedId==-1)
{
    Toast.makeText(getApplicationContext(),"SELECT THE GENDER",Toast.LENGTH_LONG).show();
}
                if(selectedId1==-1)
                {
                    Toast.makeText(getApplicationContext(),"SELECT THE UNDERTONE",Toast.LENGTH_LONG).show();
                }
                if(selectedId2==-1)
                {
                    Toast.makeText(getApplicationContext(),"SELECT THE TAN CONDITION",Toast.LENGTH_LONG).show();
                }
                if(selectedId3==-1)
                {
                    Toast.makeText(getApplicationContext(),"SELECT THE LIP SIZE",Toast.LENGTH_LONG).show();
                }
                if(selectedId4==-1)
                {
                    Toast.makeText(getApplicationContext(),"SELECT HAIR COLOR",Toast.LENGTH_LONG).show();
                }

                if (rg1.getCheckedRadioButtonId() == R.id.radioButton3 && rg2.getCheckedRadioButtonId() == R.id.radioButton6 && rg3.getCheckedRadioButtonId() ==R.id.radioButton9 && rg4.getCheckedRadioButtonId() ==R.id.radioButton11 && rg5.getCheckedRadioButtonId() ==R.id.radioButton14)
                {
                    String textToPass = "Men's Lip Revival Set";
                    String url1="https://nourishmantra.in/products/rose-repair-and-beetroot-lip-balm-combo";
                    String des1="Our Men's Lip Revival Set is an effective solution for men suffering from dry, chapped, and discolored lips. Our set includes two powerful products - the Rose Repair Lip Balm and the Beetroot Blast Lip Balm with SPF. Our Rose Repair Lip Balm, enriched with organic rose extract and shea butter, deeply moisturizes and nourishes your lips. Our Beetroot Blast Lip Balm, with SPF and beetroot extract, restores your lips' natural color. Our Lip Revival Set is designed specifically for men, providing the ultimate care and protection your lips need to look and feel their finest.";
                    Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.men1);
                    Intent intent1 = new Intent(extremefair.this, Final.class);
                    intent1.putExtra("textKey", textToPass);
                    intent1.putExtra("imageUriKey", imageUri.toString());
                    intent1.putExtra("textKey2", url1);
                    intent1.putExtra("desc1", des1);


                    String text2 = "Aegte Men Natural Pink Lip Balm with Beetroot andTomato";
                    Uri imageUri1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.men2);
                    intent1.putExtra("textKey1", text2);
                    intent1.putExtra("imageUriKey1", imageUri1.toString());
                    String url2="https://www.aegte.in/products/men-natural-pink-lip-balm";
                    intent1.putExtra("textKey4", url2);
                    String text3 = "Velvet kiss";
                    Uri imageUri3 = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.men3);
                    intent1.putExtra("textKey3", text3);
                    intent1.putExtra("imageUriKey3", imageUri3.toString());
                    String url3="https://vanitywagon.in/products/o-o-beauty-velvet-kiss-lipstick?variant=44287796150426&currency=INR&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&gad_source=1&gclid=CjwKCAiAzJOtBhALEiwAtwj8tk3DdmKVFYJZ7HX1EBUjYK1LP4-fIrt3TiVyS0rmaeKdDDS2KqLzdhoCvvIQAvD_BwE";
                    intent1.putExtra("textKey5", url3);
                    startActivity(intent1);

                }





            }

        });
        }
}




