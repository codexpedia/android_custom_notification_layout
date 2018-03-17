package com.example.customnotificationlayout

import android.app.NotificationManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.view.View
import android.widget.RemoteViews

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun showNotification(v: View) {
        val contentView = RemoteViews(packageName, R.layout.notification_layout)

        val mBuilder = NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("collapsed title")
                .setContentText("collapsed text")
                .setCustomBigContentView(contentView)

        val notification = mBuilder.build()
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(1, notification)
    }

}
