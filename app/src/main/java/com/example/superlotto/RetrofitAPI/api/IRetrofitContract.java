package com.example.superlotto.RetrofitAPI.api;

import com.example.superlotto.RetrofitAPI.models.request.Pick4BetRequest;
import com.example.superlotto.RetrofitAPI.models.response.AvailableDrawResponse;
import com.example.superlotto.RetrofitAPI.models.response.GetCashpotGameDetailsResponse;
import com.example.superlotto.RetrofitAPI.models.response.LoginResponse;
import com.example.superlotto.RetrofitAPI.models.response.Pick4BetResponse;
import com.example.superlotto.RetrofitAPI.models.response.Pick4BetStartResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface IRetrofitContract {
    @FormUrlEncoded
    @POST("api/login")
    Observable<LoginResponse> hitLogin(@Header("Client-Version") String clientVersion,
                                       @Header("Platform-Type") String platformType,
                                       @Header("Client-Type") String clientType,
                                       @Header("Firebase-Token") String firebaseToken,
                                       @Field("loginId") String loginId,
                                       @Field("password") String password);
    @Headers("Accept:application/json")
    @GET("api/superlotto/avaliable-draw")
    Observable<AvailableDrawResponse> getAvailableDrawssuperlotto(@Header("Platform-Type") String platformType,
                                                                  @Header("Client-Type") String clientType,
                                                                  @Header("Authorization") String token);

    @Headers("Accept:application/json")
    @POST("api/bet/superlotto")
    Observable<Pick4BetStartResponse> betsuperlotto(@Header("Platform-Type") String platformType,
                                                    @Header("Client-Type") String clientType,
                                                    @Header("Authorization") String token,
                                                    @Body Pick4BetRequest pick4BetRequest);

    @Headers("Accept:application/json")
    @GET("api/game/superlotto")
    Observable<GetCashpotGameDetailsResponse> getsuperlottoGameDetails(@Header("Platform-Type") String platformType,
                                                                       @Header("Client-Type") String clientType,
                                                                       @Header("Authorization") String token);
    @Headers("Accept:application/json")
    @GET("api/bet/confirm/{id}")
    Observable<Pick4BetResponse> hitConfirmPick4Bet(@Header("Platform-Type") String platformType,
                                                    @Header("Client-Type") String clientType,
                                                    @Header("Authorization") String token,
                                                    @Path("id") int id);
}
