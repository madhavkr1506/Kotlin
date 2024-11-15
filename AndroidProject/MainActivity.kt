package com.example.projectid001

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLConnection


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar);
        setSupportActionBar(toolbar);
        supportActionBar?.title = "Weather Application";
        supportActionBar?.subtitle = "Developer: Madhav";

        val checkButton = findViewById<Button>(R.id.Check);
        checkButton.setOnClickListener{
            val inputCity = findViewById<EditText>(R.id.inputCity);
            val cityName : String = inputCity.text.toString();

            if(cityName.isNotBlank()){
                val baseUrl : String = "https://api.openweathermap.org/data/2.5/weather?q=";
                val city : String = cityName;
                val apiId : String = "&appid=1abda653c4c413b0f3be7e69d5ce7e12";
                val apiURL : String = "$baseUrl$city$apiId";
                makeRequest(apiURL);
            }
        }

    }

    private fun makeRequest(apiURL: String) {
        val details = findViewById<EditText>(R.id.Details)
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val url = URL(apiURL)
                val connection = url.openConnection() as HttpURLConnection
                val responseString = StringBuilder()

                BufferedReader(InputStreamReader(connection.inputStream)).use { reader ->
                    var inputLine: String?
                    while (reader.readLine().also { inputLine = it } != null) {
                        responseString.append(inputLine)
                    }
                }

                val jsonObject = JSONObject(responseString.toString())
                val temperature = jsonObject.getJSONObject("main").getDouble("temp")
                val description = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description")


                withContext(Dispatchers.Main) {
                    details.setText("Temperature: $temperature\nDescription: $description")
                }
            } catch (e: Exception) {
                e.printStackTrace()

                withContext(Dispatchers.Main) {
                    details.setText("Error fetching data. Please try again.")
                }
            }
        }
    }

}