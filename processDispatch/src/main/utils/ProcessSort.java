package main.utils;

import main.process.ProcessData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/11/2 15:12
 * @Description:
 */
public class ProcessSort {

    public static void sortByPriority(List<ProcessData> processDataList){
        // 根据优先级排序
        Collections.sort(processDataList, new Comparator<ProcessData>() {
            @Override
            public int compare(ProcessData p1, ProcessData p2) {
                if(p1.getArriveTime()==p2.getArriveTime())
                    // 优先级相同先来先服务
                    return p1.getId() - p2.getId();
                // 数大优先级高
                return p2.getPrio() - p1.getPrio();
            }
        });
    }
    public static void sortByArriveTime(List<ProcessData> processDataList){
        // 根据优先级排序
        Collections.sort(processDataList, new Comparator<ProcessData>() {
            @Override
            public int compare(ProcessData p1, ProcessData p2) {
                // 按到达时间升序排列
                if(p1.getArriveTime()==p2.getArriveTime())
                    // 到达时间相同先来先服务
                    return p1.getId() - p2.getId();
                return p1.getArriveTime() - p2.getArriveTime();
            }
        });
    }

    public static void main(String[] args) {
        List<ProcessData> processDataList = new ArrayList<>();
        sortByPriority(processDataList);
        System.out.println(processDataList.remove(0));

        for(ProcessData processData:processDataList){
            System.out.println(processData);
        }
    }


}
