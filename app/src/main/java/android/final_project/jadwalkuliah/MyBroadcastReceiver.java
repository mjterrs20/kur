package android.final_project.jadwalkuliah;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;


/**
 * Created by Asus on 13/02/2018.
 */


public class MyBroadcastReceiver extends BroadcastReceiver{
    public void onReceive (Context context, Intent intent ){
        Toast.makeText(context, "MATKUL TELAH DIMULAI", Toast.LENGTH_SHORT).show();

//        NotificationChannel mChannel = new NotificationChannel("mNotif","android.final_project.jadwalkuliah", NotificationManager.IMPORTANCE_HIGH );
//        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, mChannel)
//                .setSmallIcon(R.drawable.icon)
//                .setContentTitle("e")
//                .setContentText("s")
//                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
//
//        NotificationManager notificationCompatManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
//        notificationCompatManager.notify(0, mBuilder);


        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(8000);
    }
}
