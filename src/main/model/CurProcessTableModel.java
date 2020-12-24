package main.model;

import main.process.ProcessData;

import javax.swing.table.AbstractTableModel;

/**
 * @Auther: Administrator
 * @Date: 2018/11/2 22:44
 * @Description:
 */
public class CurProcessTableModel extends AbstractTableModel {
    private String[] columnNames = {"进程名", "到达时间", "服务时间", "开始时间", "进程优先数",  "占用打印机数", "剩余执行时间"};
    private ProcessData currentProcess = null;

    public void setCurrentProcess(ProcessData currentProcess) {
        this.currentProcess = currentProcess;
    }


    @Override
    public int getRowCount() {
        if(currentProcess!=null)
            return 1;
        else return 0;
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
        switch (columnIndex){
            case 0:
                return currentProcess.getName();
            case 1:
                return currentProcess.getArriveTime();
            case 2:
                return currentProcess.getNeedTime();
            case 3:
                return currentProcess.getBeginTime()!=-1? currentProcess.getBeginTime():"\\";
            case 4:
                return currentProcess.getPrio();
            case 5:
                return currentProcess.getPrinterReq();
            case 6:
                return currentProcess.getMoreTime();

        }
        return null;
    }
}
