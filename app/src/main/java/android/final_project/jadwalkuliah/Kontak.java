package android.final_project.jadwalkuliah;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Kontak extends AppCompatActivity {
    ImageButton fb1, fb2, fb3, fb4;
    ImageButton in1, in2, in3, in4;
    ImageButton gm1, gm2, gm3, gm4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);

        fb1 = findViewById(R.id.fb1);
        fb2 = findViewById(R.id.fb2);
        fb3 = findViewById(R.id.fb3);
        fb4 = findViewById(R.id.fb4);
        fb4 = findViewById(R.id.fb5);
        in1 = findViewById(R.id.in1);
        in2 = findViewById(R.id.in2);
        in3 = findViewById(R.id.in3);
        in4 = findViewById(R.id.in4);
        in4 = findViewById(R.id.in5);
        gm1 = findViewById(R.id.gm1);
        gm2 = findViewById(R.id.gm2);
        gm3 = findViewById(R.id.gm3);
        gm4 = findViewById(R.id.gm4);
        gm4 = findViewById(R.id.gm5);

        //Inten ke facebook
        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001786966711"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rizki.aditia.5851")));
                }
            }
        });

        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001786966711"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rizki.aditia.5851")));
                }
            }
        });

        fb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002391598852"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/FatihBasketball")));
                }
            }
        });

        fb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100009339596491"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100009339596491")));
                }
            }
        });

        //Intent ke email
        gm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","aditia20.riz@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Kritik & Saran");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Saran saya adalah :  ");
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });

        gm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","aditia20.riz@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Kritik & Saran");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Saran saya adalah :  ");
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });

        gm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","fatihseidaaaaa@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Kritik & Saran");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Saran saya adalah :  ");
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });

        gm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","akunkhusus4@@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Kritik & Saran");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Saran saya adalah :  ");
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });


        //Intent ke Instagram
        in1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/_u/pearl_maknun");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/mj_uhuy")));
                }
            }
        });

        in2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/_u/mj_uhuy");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/mj_uhuy")));
                }
            }
        });

        in3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/_u/fatihseidaa");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/fatihseidaa")));
                }
            }
        });

        in4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/_u/m_furqon27");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/m_furqon27")));
                }
            }
        });


    }
}
