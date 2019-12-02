package com.boat.exchange.api

import com.boat.exchange.mvp.model.bean.HomeBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

/**
 * Created by xuhao on 2017/11/16.
 * Api 接口
 */

interface ApiService{
  /**
   * 首页精选
   */
  @GET("v2/feed?")
  fun getFirstHomeData(@Query("num") num:Int): Observable<HomeBean>

  /**
   * 根据 nextPageUrl 请求数据下一页数据
   */
  @GET
  fun getMoreHomeData(@Url url: String): Observable<HomeBean>
}
