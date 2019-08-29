package com.fizhu.recyclerviewwithdetail.data;

import com.fizhu.recyclerviewwithdetail.model.ProcessorIntel;

import java.util.ArrayList;

/**
 * Created by fizhu on 27,August,2019
 */
public class ProcessorIntelData {

    public static String [] [] data = new String[][]{
            {"Celeron", "1998", "Ini processor intel yang memiliki nama Celeron","266 MHz to 3.6 GHz","66 MHz to 1333 MT/s","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/KL_Intel_Celeron_Mendocino_S370.jpg/800px-KL_Intel_Celeron_Mendocino_S370.jpg" },
            {"Pentium M", "2003","Ini processor intel yang memiliki nama Pentium M","900 MHz to 2.26 GHz","400 MT/s to 533 MT/s", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Intel_Pentium_M_1.4_%28RH80535GC0171M%29-bottom_oblique_PNr%C2%B00336.jpg/1024px-Intel_Pentium_M_1.4_%28RH80535GC0171M%29-bottom_oblique_PNr%C2%B00336.jpg" },
            {"Intel Core", "2017","Ini processor intel yang memiliki nama Intel Core", "1.06 GHz to 2.33 GHz","533 MT/s to 667 MT/s","https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Intel_CPU_Core_i7_6700K_Skylake_bottom.jpg/220px-Intel_CPU_Core_i7_6700K_Skylake_bottom.jpg" },
            {"Pentium 4", "2000","Ini processor intel yang memiliki nama Pentium 4", "1.3 GHz to 3.8 GHz","400 MT/s to 1066 MT/s","https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Intel_Pentium_4_1%2C5_GHz_Willamette_Socket_423.jpg/220px-Intel_Pentium_4_1%2C5_GHz_Willamette_Socket_423.jpg" },
            {"Pentium D", "2005","Ini processor intel yang memiliki nama Pentium D", "2.66 GHz to 3.73 GHz","533 MT/s to 1,066 MT/s","https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Pentium_d_820.jpg/180px-Pentium_d_820.jpg" },
            {"Intel Core 2", "2006","Ini processor intel yang memiliki nama Intel Core 2", "1.06 GHz to 3.33 GHz","800 MT/s to 1600 MT/s","https://upload.wikimedia.org/wikipedia/commons/6/64/IntelCore2DuoE6600.jpg" },
            {"Intel Pentium Dual Core", "Ini processor intel yang memiliki nama Intel Pentium Dual Core","1.3 GHz to 3.4 GHz","533 MHz to 800 MHz","2006", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Pentium_Dual_Core_E2160.JPG/800px-Pentium_Dual_Core_E2160.JPG" }
    };

    public static ArrayList<ProcessorIntel> getListData(){
        ProcessorIntel processorIntel = null;
        ArrayList<ProcessorIntel> list = new ArrayList<>();
        for (String[] aData : data){
            processorIntel = new ProcessorIntel();
            processorIntel.setNamaPro(aData[0]);
            processorIntel.setTahun(aData[1]);
            processorIntel.setDetail(aData[2]);
            processorIntel.setClock(aData[3]);
            processorIntel.setSpeed(aData[4]);
            processorIntel.setFoto(aData[5]);
            list.add(processorIntel);
        }
        return list;
    }
}
