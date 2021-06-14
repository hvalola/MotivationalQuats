package com.pubudu.motivationalquats.framework.data

import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.pubudu.motivationalquats.framework.controller.AppController
import com.pubudu.motivationalquats.framework.model.Quote
import org.json.JSONArray
import org.json.JSONException


class QuoteData {
    val quoteArrayList = ArrayList<Quote>()

    fun getQuates(){
        var url = "https://raw.githubusercontent.com/pdichone/UIUX-Android-Course/master/Quotes.json%20";
        val jsonArrayRequest = JsonArrayRequest(
            Request.Method.GET,
            url,null, { response ->
                for (i in 0 until response.length()) {
                    try {
                        val quoteObject = response.getJSONObject(i)
                        val quote = Quote(quoteObject.getString("quote"),quoteObject.getString("name"))
                        //quote.quote = quoteObject.getString("quote")
                        //quote.author = quoteObject.getString("name")
                        //Log.d("STUFFF::", quoteObject.getString("name"))
                        quoteArrayList.add(quote)
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }
               // if (null != callBack) callBack.processFinished(quoteArrayList)
            }, {

            })

        AppController().addToRequestQueue(jsonArrayRequest)
    }


}