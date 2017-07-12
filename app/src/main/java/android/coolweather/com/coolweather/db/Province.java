package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by WithLin on 2017/7/12.
 */

public class Province extends DataSupport {
    private  int id;
    private  String provinceName;
    private   int provinceCode;
    public int getId(){
        return  id;
    }
    public  void setId(int id){
        this.id=id;
    }
    public  String getProvinceName(){
        return provinceName;
    }
    public  void getProvinceName(String provinceName){
        this.provinceName=provinceName;
    }

    public  int getProvinceCode(){
        return  provinceCode;
    }
    public  void getProvinceCode(int provinceCode){
        this
                .provinceCode=provinceCode;
    }

}
