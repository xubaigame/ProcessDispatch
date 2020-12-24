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
public class InputProcessTableModel extends AbstractTableModel {
    private String[] columnNames = {"进程名", "到达时间", "服务时间", "进程优先数","使用打印机数", };
    private List<ProcessData> inputProcessQueue = new ArrayList<>();

    public void addProcess(ProcessData process) {
        inputProcessQueue.add(process);
    }

    public void clearProcess(){
        inputProcessQueue.clear();
    }

    @Override
    public int getRowCount() {
        return inputProcessQueue.size();
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
        ProcessData rowProcess = inputProcessQueue.get(rowIndex);
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
                return rowProcess.getPrinterReq();
        }
        return null;
    }
}
