package com.sust.notifLearn.SendNotificationPack;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAOGcVojc:APA91bFGrXuw0LDEuk1wr8p5l8bs5IB373R02-rwcaTToRLoVs6v9FwHGd6_4yhst79kCG5VicPlMrJBajdezskhmS18vaK7GEMz6Ll6fr_pQ0nA-DvZLiA4FELnKvKIhkTar1hsOeFpv" // Your server key refer to video for finding your server key
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotifcation(@Body NotificationSender body);
}