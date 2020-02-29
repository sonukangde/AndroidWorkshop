package com.android.retrofit.rest;


import com.android.retrofit.domain.EmployeeResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/api/v1/employees")
    Call<EmployeeResponse> getAllEmployee();

    Call<EmployeeResponse> getAllEmployees();
}
