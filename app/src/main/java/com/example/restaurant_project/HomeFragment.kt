package com.example.restaurant_project

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.restaurant_project.Adapter.FoodListAdapter
import com.example.restaurant_project.databinding.FragmentHomeBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val BASE_URL = "http://127.0.0.1:5000"
    private val TAG = "CHECK_RESPONSE"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        getAllMenu()
    }
//
//    private fun getAllMenu(){
//        val api = Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(MyAPI::class.java)
//
//        api.getMenu().enqueue(object : Callback<List<Menu>> {
//            override fun onResponse(call: Call<List<Menu>>, response: Response<List<Menu>>) {
//                if (response.isSuccessful){
//                    response.body()?.let {
//                        binding.menuList.adapter = FoodListAdapter(it)
//                        binding.menuList.layoutManager = LinearLayoutManager(this@HomeFragment)
//                    }
//                }
//            }
//
//            override fun onFailure(call: Call<List<Menu>>, t: Throwable) {
//                Log.i(">>>$TAG", "onFailure: ${t.message}")
//            }
//
//        })
//    }

}