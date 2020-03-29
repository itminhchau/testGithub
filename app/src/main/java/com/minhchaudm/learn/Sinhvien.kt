package com.minhchaudm.learn

class Sinhvien {
    var HoTen : String = ""
    var DiaChi : String = ""
  private  var NamSinh : Int = 0
    fun setNamsinh (ns: Int){
        if(ns > 2002){
            NamSinh = 2002
        }
        else {
            NamSinh = ns
        }
    }
    fun getNamsinh() : Int{
        return  NamSinh;
    }
    fun tinhtuoi(): Int{
        return 2020 - NamSinh + 1;
    }
}