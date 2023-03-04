package com.myagrishop.customer.network;

import com.myagrishop.customer.modelclass.CountryCodeModel;
import com.myagrishop.customer.modelclass.FirebaseStatusModel;
import com.myagrishop.customer.modelclass.ForgotEmailModel;
import com.myagrishop.customer.modelclass.MapSelectionModel;
import com.myagrishop.customer.modelclass.NotificationBannerStatus;
import com.myagrishop.customer.modelclass.NotifyModelUser;
import com.myagrishop.customer.modelclass.PaymentVia;
import com.myagrishop.customer.modelclass.VerifyOtp;
import com.myagrishop.customer.modelclass.homemodel.MainHomeModel;
import com.myagrishop.customer.modelclass.reordermodel.NewReorderModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("forgot_password")
    @FormUrlEncoded
    Call<ForgotEmailModel> getEmailOtp(@Field("user_email") String userEmail,@Field("user_phone") String userPhone);

    @POST("verify_via_firebase")
    @FormUrlEncoded
    Call<VerifyOtp> getVerifyOtpStatus(@Field("status") String status , @Field("user_phone") String userPhone);

    @GET("checkotponoff")
    Call<ForgotEmailModel> getOtpOnOffStatus();

    @GET("pymnt_via")
    Call<PaymentVia> getPaymentVia();

    @POST("notifyby")
    @FormUrlEncoded
    Call<NotifyModelUser> getNotifyUser(@Field("user_id") String userId);

    @GET("mapby")
    Call<MapSelectionModel> getMapSelectionStatus();

    @GET("firebase")
    Call<FirebaseStatusModel> getFirebaseOtpStatus();

    @GET("countrycode")
    Call<CountryCodeModel> getCountryCode();

    @GET("app_notice")
    Call<NotificationBannerStatus> getNotificationBannerStatus();

    @POST("firebase_otp_ver")
    @FormUrlEncoded
    Call<VerifyOtp> getOtpVerifiyStatus(@Field("status") String status , @Field("user_phone") String userPhone);

    @POST("checknum")
    @FormUrlEncoded
    Call<VerifyOtp> checkNumIsRegisterOrNot(@Field("user_phone") String userPhone);

    @POST("homepage")
    @FormUrlEncoded
    Call<MainHomeModel> getMainHomeModel(@Field("lat") String lat , @Field("lng") String lng);

    @POST("checkstock")
    @FormUrlEncoded
    Call<NewReorderModel> getReorderModel(@Field("cart_id") String cart_id);

}
