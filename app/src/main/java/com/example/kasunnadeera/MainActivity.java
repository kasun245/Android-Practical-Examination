package com.example.kasunnadeera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().toString().equals("test") && password.getText().toString().equals("Test123")){
                    Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, HomeScreen.class);
                    startActivity(intent);
                    finish();

                    //performLogin(username.toString(), password.toString());
                }else
                    Toast.makeText(MainActivity.this, "Login Failed check your user name password.!", Toast.LENGTH_SHORT).show();
            }
        });
    }

//    private void performLogin(String username, String password) {
//        // Run the API request in a background thread
//        new AsyncTask<Void, Void, String>() {
//            @Override
//            protected String doInBackground(Void... voids) {
//                try {
//                    URL url = new URL("http://123.231.9.43:3999");
//                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                    connection.setRequestMethod("POST");
//                    connection.setRequestProperty("Content-Type", "application/json");
//
//                    // Create the request body in JSON format
//                    JSONObject requestBody = new JSONObject();
//                    requestBody.put("username", username);
//                    requestBody.put("password", password);
//
//                    // Set the request body
//                    connection.setDoOutput(true);
//                    DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
//                    outputStream.writeBytes(requestBody.toString());
//                    outputStream.flush();
//                    outputStream.close();
//
//                    int responseCode = connection.getResponseCode();
//                    if (responseCode == HttpURLConnection.HTTP_OK) {
//                        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                        String inputLine;
//                        StringBuilder response = new StringBuilder();
//
//                        while ((inputLine = in.readLine()) != null) {
//                            response.append(inputLine);
//                        }
//                        in.close();
//
//                        return response.toString();
//                    } else {
//                        Toast.makeText(MainActivity.this, "response Failed.!", Toast.LENGTH_SHORT).show();
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                return null;
//            }
//
//            @Override
//            protected void onPostExecute(String response) {
//                if (response != null) {
//                    // Process the response JSON data
//                    // Parse the JSON response and extract the user information
//                    try {
//                        JSONObject jsonResponse = new JSONObject(response);
//                        String username = jsonResponse.getString("username");
//                        String email = jsonResponse.getString("email");
//                        // Process the user information and update the UI or perform any required actions
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }.execute();
//    }
}
