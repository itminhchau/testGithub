package com.minhchaudm.learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var a : String = "chau"
//            a = " hien"
//        val b: Int = 10
//        Log.d("AAA","da tim thay " + a + b)
//
//        var a: Int = 0
//        for (i in 1..10 step 2){
//            Log.d("BBB","thuc hien" + i)
//        }
//        checknumber(5)
//        var mang : Array<Int> = arrayOf(1,2,3,4);
//        for (number in mang){
//            Log.d("AAA","Number in array: "+ number)
//            Log.d("AAA", mang.size.toString())
//        }

        var sv1 : Sinhvien = Sinhvien()
        sv1.HoTen = " Dao Minh Chau"
        sv1.DiaChi = " Quang Ngai"
        sv1.setNamsinh(2003)
        Log.d("BBB","Sinh vien ten"+ sv1.HoTen + " nam sinh " + sv1.getNamsinh() + "-" + sv1.tinhtuoi())
    }
//    fun  checknumber ( innumber : Int)= when(innumber){
//       0 -> Log.d("AAA","number is zero")
//       1,2 -> Log.d("AAA","one or two")
//       in 3..9 -> Log.d("AAA","big")
//       else -> Log.d("AAA","default")
//        }

}
