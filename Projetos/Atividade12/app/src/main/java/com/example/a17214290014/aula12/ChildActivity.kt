package com.example.a17214290014.aula12

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.support.v4.app.NotificationManagerCompat
import android.view.View
import android.widget.Button
import android.widget.TextView

class ChildActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)
        setTitle("Child")

        val texto = findViewById<View>(R.id.textView) as TextView
        texto.setText(intent.getStringExtra("msg"))

        val botao = findViewById<View>(R.id.button) as Button
        botao.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intencao = Intent(this@ChildActivity, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                val pendente = PendingIntent.getActivity(this@ChildActivity, 0, intencao, 0)

                val CHANNEL_ID = "meu_canal_id"
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    val name = "meu_canal"
                    val description = "teste de notificacao"
                    val importance = NotificationManager.IMPORTANCE_DEFAULT
                    val channel = NotificationChannel(CHANNEL_ID, name, importance)
                    channel.description = description
                    val notificationManager = getSystemService(NotificationManager::class.java)
                    notificationManager!!.createNotificationChannel(channel)
                }

                val builder = NotificationCompat.Builder(this@ChildActivity, CHANNEL_ID)
                builder.setSmallIcon(android.R.drawable.ic_dialog_info)
                    .setContentTitle("Minha notificacao")
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .setContentIntent(pendente)
                    .setContentText("Chegou uma notificacao importante!")

                val manager = NotificationManagerCompat.from(this@ChildActivity)
                manager.notify(123, builder.build())

            }
        })


    }
}
