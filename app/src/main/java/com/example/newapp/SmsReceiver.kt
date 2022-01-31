package com.example.newapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.SmsMessage
import android.util.Log
import android.widget.Toast

class SmsReceiver : BroadcastReceiver() {
    var TAG = SmsReceiver:: class.java.simpleName

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        //TODO("SmsReceiver.onReceive() is not implemented")
        Toast.makeText(context, "sms from bajaj", Toast.LENGTH_SHORT).show()

        val bundle = intent.extras
        if (bundle != null)
        val pdus = bundle?.get("pdus") as Array<Any>?
        val messages: Array<SmsMessage?> = arrayOfNulls<SmsMessage>(pdus!!.size)
        for (i in pdus!!.indices) {
            messages[i] = SmsMessage.createFromPdu(Pdus!![i] as ByteArray)
        }
        if (messages.size > -1) {
            val msg =  ""
            Log.i(TAG, msg :"Message received:"+messages[0].getMessageBody())
        }
    }
}