package main.model;

import main.process.ProcessData;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/11/2 22:44
 * @Description:
 */
public class OutputProcessTableModel extends AbstractTableModel {
    private String[] columnNames = {"进程名", "到达时间", "服务时间", "进程优先数", "开始时间", "完成时间", "周转时间", "带权周转时间" };
    private List<ProcessData> outputProcessQueue = new ArrayList<>();

    public void setProcessQueue(List<ProcessData> processQueue) {
        outputProcessQueue = processQueue;
    }

    @Override
    public int getRowCount() {
        return outputProcessQueue.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProcessData rowProcess = outputProcessQueue.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowProcess.getName();
            case 1:
                return rowProcess.getArriveTime();
            case 2:
                return rowProcess.getNeedTime();
            case 3:
                return rowProcess.getPrio();
            case 4:
                return rowProcess.getBeginTime();
            case 5:
                return rowProcess.getFinishTime();
            case 6:
                return rowProcess.getFinishTime() - rowProcess.getArriveTime();
            case 7:
                return Math.round(1.0 * (rowProcess.getFinishTime() - rowProcess.getArriveTime()) / rowProcess.getNeedTime() * 100) /100.0;

        }
        return null;
    }
}
