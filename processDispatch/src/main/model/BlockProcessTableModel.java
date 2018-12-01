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
public class BlockProcessTableModel extends AbstractTableModel {
    private String[] columnNames = {"进程名", "到达时间", "服务时间",  "开始时间","进程优先数", "占用打印机数", "剩余执行时间"};
    private List<ProcessData> blockProcessQueue = new ArrayList<>();

    public void setProcessQueue(List<ProcessData> processQueue) {
        blockProcessQueue = processQueue;
    }

    @Override
    public int getRowCount() {
        return blockProcessQueue.size();
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
        ProcessData rowProcess = blockProcessQueue.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowProcess.getName();
            case 1:
                return rowProcess.getArriveTime();
            case 2:
                return rowProcess.getNeedTime();
            case 3:
                return rowProcess.getBeginTime()!=-1? rowProcess.getBeginTime():"\\";
            case 4:
                return rowProcess.getPrio();
            case 5:
                return rowProcess.getPrinterReq();
            case 6:
                return rowProcess.getMoreTime();

        }
        return null;
    }
}
