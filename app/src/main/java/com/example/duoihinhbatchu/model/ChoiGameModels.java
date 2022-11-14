package com.example.duoihinhbatchu.model;

import com.example.duoihinhbatchu.ChoiGameActivity;
import com.example.duoihinhbatchu.DATA;
import com.example.duoihinhbatchu.object.CauDo;
import com.example.duoihinhbatchu.object.NguoiDung;

import java.util.ArrayList;

public class ChoiGameModels {
    ChoiGameActivity c;
    ArrayList<CauDo> arr;
    int cauSo=-1;

    public NguoiDung nguoiDung;


    public ChoiGameModels(ChoiGameActivity c) {
        this.c = c;
        nguoiDung = new NguoiDung();
        taoData();
    }
    private void taoData(){
        arr = new ArrayList<>(DATA.getData().arrCauDo);
        //arr.add(new CauDo("","matuy","https://cdn.lazi.vn/storage/uploads/dhbc/1466676944_ma-tuy.jpg"));
        //arr.add(new CauDo("","baola","https://files.vfo.vn/2014/T10/img/vforum.vn-133676-10431540-671362626263774-1717932326842688214-n.jpg"));
        //arr.add(new CauDo("","chamcong","https://i2-vnexpress.vnecdn.net/2015/08/25/untitled1-1440513136.jpg?w=1200&h=0&q=100&dpr=1&fit=crop&s=C_BYKt5dsA29MsngkngzlA"));
        //arr.add(new CauDo("","tienmattatmang","http://lazi.vn/uploads/dhbc/1489470745_dhbc4.jpg"));
        //arr.add(new CauDo("","yeuot","https://cdn.zenquiz.net/external/2016/11/09/07/744978c0-a652-11e6-940a-050901070303-compressed.jpg"));
    }
    public CauDo layCauDo(){
        cauSo++;
        if (cauSo>=arr.size()){
            cauSo=arr.size()-1;
        }
        return arr.get(cauSo);
    }

    public void layThongTin(){
        nguoiDung.getTT(c);
    }
    public void luuThongTin(){
        nguoiDung.saveTT(c);
    }
}
