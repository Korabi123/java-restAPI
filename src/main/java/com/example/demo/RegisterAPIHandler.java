package com.example.demo;

import java.io.IOException;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class RegisterAPIHandler {
  public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

  final OkHttpClient client = new OkHttpClient();

  public String post(String url, String json) throws IOException {
      RequestBody body = RequestBody.create(JSON, json);
      Request request = new Request.Builder()
              .url(url)
              .post(body)
              .build();
      Response response = client.newCall(request).execute();
      return response.body().string();
  }

  public String bowlingJson(String name, String email, String password, String userId) {
      return String.format("[{\"name\":\"%s\", \"email\":\"%s\", \"password\":\"%s\", \"userId\":\"%s\"}]", name, email, password, userId);
  }
}
