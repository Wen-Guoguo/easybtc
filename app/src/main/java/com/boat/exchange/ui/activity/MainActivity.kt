package com.boat.exchange.ui.activity

import com.boat.exchange.R
import com.boat.exchange.base.BaseActivity

class MainActivity : BaseActivity() {
  private val mTitles = arrayOf("首页", "行情", "交易","我的")

  // 未被选中的图标
  private val mIconUnSelectIds = intArrayOf(R.mipmap.ic_home_normal, R.mipmap.ic_discovery_normal, R.mipmap.ic_hot_normal, R.mipmap.ic_mine_normal)
  // 被选中的图标
  private val mIconSelectIds = intArrayOf(R.mipmap.ic_home_selected, R.mipmap.ic_discovery_selected, R.mipmap.ic_hot_selected, R.mipmap.ic_mine_selected)

  override fun layoutId(): Int {
     return R.layout.activity_main
  }

  override fun initData() {
  }

  override fun initView() {
  }

  override fun start() {
  }

}
