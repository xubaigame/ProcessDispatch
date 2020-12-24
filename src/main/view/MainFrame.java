/*
 * Created by JFormDesigner on Fri Nov 02 13:04:22 CST 2018
 */

package main.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author jframe
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("进程调度模拟系统");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        loadMenuItem = new JMenuItem();
        mainTabbedPane = new JTabbedPane();
        createProcessPanel = new JPanel();
        panel3 = new JPanel();
        initialBtn = new JButton();
        printerJFT = new JTextField();
        label1 = new JLabel();
        label3 = new JLabel();
        label5 = new JLabel();
        panel4 = new JPanel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label11 = new JLabel();
        processNameJFT = new JTextField();
        submitTimeJFT = new JTextField();
        serveTimeJFT = new JTextField();
        printerReqJFT = new JTextField();
        newProcessBtn = new JButton();
        label18 = new JLabel();
        priorityJFT = new JTextField();
        LoadFileBtn = new JButton();
        scrollPane6 = new JScrollPane();
        createProcessTable = new JTable();
        panel5 = new JPanel();
        label12 = new JLabel();
        noGrabRadioBtn = new JRadioButton();
        grabRadioBtnButton2 = new JRadioButton();
        startBtn = new JButton();
        panel6 = new JPanel();
        label13 = new JLabel();
        scrollPane1 = new JScrollPane();
        currentProcessTable = new JTable();
        label19 = new JLabel();
        currentTimeJFT = new JLabel();
        label24 = new JLabel();
        currentPrinterJFT = new JLabel();
        blockBtn = new JButton();
        panel7 = new JPanel();
        label14 = new JLabel();
        scrollPane2 = new JScrollPane();
        readyProcessTable = new JTable();
        panel8 = new JPanel();
        label15 = new JLabel();
        scrollPane3 = new JScrollPane();
        blockProcessTable = new JTable();
        wakeBtn = new JButton();
        resetBtn = new JButton();
        exitBtn = new JButton();
        pauseBtn = new JButton();
        continueBtn = new JButton();
        panel2 = new JPanel();
        panel1 = new JPanel();
        label16 = new JLabel();
        scrollPane4 = new JScrollPane();
        inputProcessTable = new JTable();
        panel9 = new JPanel();
        label17 = new JLabel();
        scrollPane5 = new JScrollPane();
        outputProcessTable = new JTable();
        label21 = new JLabel();
        avgWeightTurnTime = new JLabel();
        avgTurnTime = new JLabel();
        label20 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar1 ========
        {
            menuBar1.setVisible(false);

            //======== menu1 ========
            {
                menu1.setText("\u6587\u4ef6");

                //---- loadMenuItem ----
                loadMenuItem.setText("\u5bfc\u5165");
                menu1.add(loadMenuItem);
            }
            menuBar1.add(menu1);
        }
        setJMenuBar(menuBar1);

        //======== mainTabbedPane ========
        {

            //======== createProcessPanel ========
            {
                createProcessPanel.setLayout(null);

                //======== panel3 ========
                {
                    panel3.setBorder(new EtchedBorder());
                    panel3.setLayout(null);

                    //---- initialBtn ----
                    initialBtn.setText("\u8bbe\u7f6e\u6253\u5370\u673a");
                    panel3.add(initialBtn);
                    initialBtn.setBounds(510, 5, 115, 45);
                    panel3.add(printerJFT);
                    printerJFT.setBounds(120, 20, 64, 30);

                    //---- label1 ----
                    label1.setText("\u521d\u59cb\u8bbe\u7f6e");
                    panel3.add(label1);
                    label1.setBounds(5, 0, 55, 25);

                    //---- label3 ----
                    label3.setText("\u6253\u5370\u673a");
                    label3.setHorizontalAlignment(SwingConstants.CENTER);
                    panel3.add(label3);
                    label3.setBounds(50, 20, 66, 27);

                    //---- label5 ----
                    label5.setText("\u53f0");
                    label5.setHorizontalAlignment(SwingConstants.CENTER);
                    panel3.add(label5);
                    label5.setBounds(180, 20, 45, 27);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel3.getComponentCount(); i++) {
                            Rectangle bounds = panel3.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel3.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel3.setMinimumSize(preferredSize);
                        panel3.setPreferredSize(preferredSize);
                    }
                }
                createProcessPanel.add(panel3);
                panel3.setBounds(5, 10, 715, 55);

                //======== panel4 ========
                {
                    panel4.setBorder(new EtchedBorder());
                    panel4.setLayout(null);

                    //---- label6 ----
                    label6.setText("\u65b0\u5efa\u8fdb\u7a0b");
                    panel4.add(label6);
                    label6.setBounds(5, 5, 60, label6.getPreferredSize().height);

                    //---- label7 ----
                    label7.setText("\u8fdb\u7a0b\u540d\u79f0 ");
                    label7.setHorizontalAlignment(SwingConstants.CENTER);
                    panel4.add(label7);
                    label7.setBounds(45, 20, 70, 25);

                    //---- label8 ----
                    label8.setText("\u63d0\u4ea4\u65f6\u95f4");
                    label8.setHorizontalAlignment(SwingConstants.CENTER);
                    panel4.add(label8);
                    label8.setBounds(130, 20, 70, 25);

                    //---- label9 ----
                    label9.setText("\u670d\u52a1\u65f6\u95f4");
                    label9.setHorizontalAlignment(SwingConstants.CENTER);
                    panel4.add(label9);
                    label9.setBounds(195, 20, 70, 25);

                    //---- label11 ----
                    label11.setText("\u6253\u5370\u673a\u8bf7\u6c42\u6570\u91cf");
                    label11.setHorizontalAlignment(SwingConstants.CENTER);
                    panel4.add(label11);
                    label11.setBounds(345, 20, 105, 25);
                    panel4.add(processNameJFT);
                    processNameJFT.setBounds(45, 50, 69, 25);
                    panel4.add(submitTimeJFT);
                    submitTimeJFT.setBounds(130, 50, 64, 25);
                    panel4.add(serveTimeJFT);
                    serveTimeJFT.setBounds(200, 50, 64, 25);
                    panel4.add(printerReqJFT);
                    printerReqJFT.setBounds(365, 50, 64, 25);

                    //---- newProcessBtn ----
                    newProcessBtn.setText("\u65b0\u5efa\u8fdb\u7a0b");
                    panel4.add(newProcessBtn);
                    newProcessBtn.setBounds(480, 20, 100, 45);

                    //---- label18 ----
                    label18.setText("\u4f18\u5148\u7ea7");
                    label18.setHorizontalAlignment(SwingConstants.CENTER);
                    panel4.add(label18);
                    label18.setBounds(275, 25, 50, label18.getPreferredSize().height);
                    panel4.add(priorityJFT);
                    priorityJFT.setBounds(275, 50, 64, 25);

                    //---- LoadFileBtn ----
                    LoadFileBtn.setText("\u5bfc\u5165\u6587\u4ef6");
                    panel4.add(LoadFileBtn);
                    LoadFileBtn.setBounds(595, 20, 100, 45);

                    //======== scrollPane6 ========
                    {
                        scrollPane6.setViewportView(createProcessTable);
                    }
                    panel4.add(scrollPane6);
                    scrollPane6.setBounds(15, 80, 680, 95);
                }
                createProcessPanel.add(panel4);
                panel4.setBounds(5, 60, 715, 180);

                //======== panel5 ========
                {
                    panel5.setBorder(new EtchedBorder());
                    panel5.setLayout(null);

                    //---- label12 ----
                    label12.setText("\u8bf7\u9009\u62e9\u6a21\u62df\u65b9\u6cd5\uff1a");
                    label12.setHorizontalAlignment(SwingConstants.CENTER);
                    panel5.add(label12);
                    label12.setBounds(15, 15, 125, 25);

                    //---- noGrabRadioBtn ----
                    noGrabRadioBtn.setText("\u975e\u62a2\u5360\u5f0f\u4f18\u5148\u8c03\u5ea6");
                    noGrabRadioBtn.setSelected(true);
                    panel5.add(noGrabRadioBtn);
                    noGrabRadioBtn.setBounds(165, 15, 140, noGrabRadioBtn.getPreferredSize().height);

                    //---- grabRadioBtnButton2 ----
                    grabRadioBtnButton2.setText("\u62a2\u5360\u5f0f\u4f18\u5148\u8c03\u5ea6");
                    panel5.add(grabRadioBtnButton2);
                    grabRadioBtnButton2.setBounds(340, 20, 140, 19);

                    //---- startBtn ----
                    startBtn.setText("\u5f00\u59cb\u6a21\u62df");
                    panel5.add(startBtn);
                    startBtn.setBounds(530, 10, 110, 35);
                }
                createProcessPanel.add(panel5);
                panel5.setBounds(5, 240, 715, 50);

                //======== panel6 ========
                {
                    panel6.setBorder(new EtchedBorder());
                    panel6.setLayout(null);

                    //---- label13 ----
                    label13.setText("\u8fd0\u884c\u8fdb\u7a0b\u961f\u5217");
                    panel6.add(label13);
                    label13.setBounds(5, 5, 120, 25);

                    //======== scrollPane1 ========
                    {
                        scrollPane1.setViewportView(currentProcessTable);
                    }
                    panel6.add(scrollPane1);
                    scrollPane1.setBounds(15, 40, 605, 40);

                    //---- label19 ----
                    label19.setText("\u5f53\u524d\u65f6\u95f4\uff1a");
                    panel6.add(label19);
                    label19.setBounds(150, 10, 75, label19.getPreferredSize().height);

                    //---- currentTimeJFT ----
                    currentTimeJFT.setHorizontalAlignment(SwingConstants.LEFT);
                    currentTimeJFT.setText("0");
                    currentTimeJFT.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                    currentTimeJFT.setVerticalAlignment(SwingConstants.TOP);
                    panel6.add(currentTimeJFT);
                    currentTimeJFT.setBounds(220, 10, 50, 20);

                    //---- label24 ----
                    label24.setText("\u5f53\u524d\u5269\u4f59\u6253\u5370\u673a\u6570\uff1a");
                    panel6.add(label24);
                    label24.setBounds(295, 10, 125, label24.getPreferredSize().height);

                    //---- currentPrinterJFT ----
                    currentPrinterJFT.setText("0");
                    currentPrinterJFT.setHorizontalAlignment(SwingConstants.LEFT);
                    currentPrinterJFT.setVerticalAlignment(SwingConstants.TOP);
                    currentPrinterJFT.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
                    panel6.add(currentPrinterJFT);
                    currentPrinterJFT.setBounds(415, 10, 50, 20);

                    //---- blockBtn ----
                    blockBtn.setText("\u963b\u585e");
                    panel6.add(blockBtn);
                    blockBtn.setBounds(630, 30, 75, 50);
                }
                createProcessPanel.add(panel6);
                panel6.setBounds(5, 285, 715, 110);

                //======== panel7 ========
                {
                    panel7.setBorder(new EtchedBorder());
                    panel7.setLayout(null);

                    //---- label14 ----
                    label14.setText("\u5c31\u7eea\u961f\u5217");
                    label14.setHorizontalAlignment(SwingConstants.CENTER);
                    panel7.add(label14);
                    label14.setBounds(0, 5, 85, 25);

                    //======== scrollPane2 ========
                    {
                        scrollPane2.setViewportView(readyProcessTable);
                    }
                    panel7.add(scrollPane2);
                    scrollPane2.setBounds(10, 30, 690, 70);
                }
                createProcessPanel.add(panel7);
                panel7.setBounds(5, 390, 715, 120);

                //======== panel8 ========
                {
                    panel8.setBorder(new EtchedBorder());
                    panel8.setLayout(null);

                    //---- label15 ----
                    label15.setText("\u963b\u585e\u961f\u5217");
                    label15.setHorizontalAlignment(SwingConstants.CENTER);
                    panel8.add(label15);
                    label15.setBounds(0, 0, 80, 30);

                    //======== scrollPane3 ========
                    {
                        scrollPane3.setViewportView(blockProcessTable);
                    }
                    panel8.add(scrollPane3);
                    scrollPane3.setBounds(10, 30, 615, 70);

                    //---- wakeBtn ----
                    wakeBtn.setText("\u5524\u9192");
                    panel8.add(wakeBtn);
                    wakeBtn.setBounds(635, 40, 68, 45);
                }
                createProcessPanel.add(panel8);
                panel8.setBounds(5, 510, 715, 105);

                //---- resetBtn ----
                resetBtn.setText("\u91cd\u7f6e");
                createProcessPanel.add(resetBtn);
                resetBtn.setBounds(420, 635, 95, 40);

                //---- exitBtn ----
                exitBtn.setText("\u9000\u51fa");
                createProcessPanel.add(exitBtn);
                exitBtn.setBounds(630, 635, 90, 40);

                //---- pauseBtn ----
                pauseBtn.setText("\u6682\u505c");
                createProcessPanel.add(pauseBtn);
                pauseBtn.setBounds(10, 635, 85, 40);

                //---- continueBtn ----
                continueBtn.setText("\u7ee7\u7eed");
                createProcessPanel.add(continueBtn);
                continueBtn.setBounds(190, 635, 85, 40);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < createProcessPanel.getComponentCount(); i++) {
                        Rectangle bounds = createProcessPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = createProcessPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    createProcessPanel.setMinimumSize(preferredSize);
                    createProcessPanel.setPreferredSize(preferredSize);
                }
            }
            mainTabbedPane.addTab("\u8fdb\u7a0b\u521b\u5efa", createProcessPanel);

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //======== panel1 ========
                {
                    panel1.setLayout(null);

                    //---- label16 ----
                    label16.setText("\u8f93\u5165\u8fdb\u7a0b\u961f\u5217\u60c5\u51b5\uff1a");
                    label16.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 18));
                    panel1.add(label16);
                    label16.setBounds(0, 0, 165, 30);

                    //======== scrollPane4 ========
                    {
                        scrollPane4.setViewportView(inputProcessTable);
                    }
                    panel1.add(scrollPane4);
                    scrollPane4.setBounds(5, 40, 720, 190);
                }
                panel2.add(panel1);
                panel1.setBounds(0, 0, 730, 255);

                //======== panel9 ========
                {
                    panel9.setLayout(null);

                    //---- label17 ----
                    label17.setText("\u6267\u884c\u540e\u8fdb\u7a0b\u961f\u5217\u60c5\u51b5\uff1a");
                    label17.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 18));
                    panel9.add(label17);
                    label17.setBounds(5, 0, 190, 50);

                    //======== scrollPane5 ========
                    {
                        scrollPane5.setViewportView(outputProcessTable);
                    }
                    panel9.add(scrollPane5);
                    scrollPane5.setBounds(0, 55, 720, 160);
                }
                panel2.add(panel9);
                panel9.setBounds(0, 255, 730, 240);

                //---- label21 ----
                label21.setText("\u5e73\u5747\u5e26\u6743\u5468\u8f6c\u65f6\u95f4\uff1a");
                label21.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 22));
                panel2.add(label21);
                label21.setBounds(5, 580, 210, 65);

                //---- avgWeightTurnTime ----
                avgWeightTurnTime.setText("0");
                avgWeightTurnTime.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 22));
                panel2.add(avgWeightTurnTime);
                avgWeightTurnTime.setBounds(250, 505, 140, 65);

                //---- avgTurnTime ----
                avgTurnTime.setText("0");
                avgTurnTime.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 22));
                panel2.add(avgTurnTime);
                avgTurnTime.setBounds(250, 580, 140, 65);

                //---- label20 ----
                label20.setText("\u5e73\u5747\u5468\u8f6c\u65f6\u95f4\uff1a");
                label20.setFont(new Font("\u65b9\u6b63\u8212\u4f53", Font.PLAIN, 22));
                panel2.add(label20);
                label20.setBounds(10, 505, 175, 65);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            mainTabbedPane.addTab("\u7ed3\u679c\u9884\u89c8", panel2);
        }
        contentPane.add(mainTabbedPane);
        mainTabbedPane.setBounds(0, 0, 730, 715);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(noGrabRadioBtn);
        buttonGroup1.add(grabRadioBtnButton2);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem loadMenuItem;
    private JTabbedPane mainTabbedPane;
    private JPanel createProcessPanel;
    private JPanel panel3;
    private JButton initialBtn;
    private JTextField printerJFT;
    private JLabel label1;
    private JLabel label3;
    private JLabel label5;
    private JPanel panel4;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label11;
    private JTextField processNameJFT;
    private JTextField submitTimeJFT;
    private JTextField serveTimeJFT;
    private JTextField printerReqJFT;
    private JButton newProcessBtn;
    private JLabel label18;
    private JTextField priorityJFT;
    private JButton LoadFileBtn;
    private JScrollPane scrollPane6;
    private JTable createProcessTable;
    private JPanel panel5;
    private JLabel label12;
    private JRadioButton noGrabRadioBtn;
    private JRadioButton grabRadioBtnButton2;
    private JButton startBtn;
    private JPanel panel6;
    private JLabel label13;
    private JScrollPane scrollPane1;
    private JTable currentProcessTable;
    private JLabel label19;
    private JLabel currentTimeJFT;
    private JLabel label24;
    private JLabel currentPrinterJFT;
    private JButton blockBtn;
    private JPanel panel7;
    private JLabel label14;
    private JScrollPane scrollPane2;
    private JTable readyProcessTable;
    private JPanel panel8;
    private JLabel label15;
    private JScrollPane scrollPane3;
    private JTable blockProcessTable;
    private JButton wakeBtn;
    private JButton resetBtn;
    private JButton exitBtn;
    private JButton pauseBtn;
    private JButton continueBtn;
    private JPanel panel2;
    private JPanel panel1;
    private JLabel label16;
    private JScrollPane scrollPane4;
    private JTable inputProcessTable;
    private JPanel panel9;
    private JLabel label17;
    private JScrollPane scrollPane5;
    private JTable outputProcessTable;
    private JLabel label21;
    private JLabel avgWeightTurnTime;
    private JLabel avgTurnTime;
    private JLabel label20;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JButton getInitialBtn() {
        return initialBtn;
    }

    public JTextField getPrinterJFT() {
        return printerJFT;
    }

    public JTextField getProcessNameJFT() {
        return processNameJFT;
    }

    public JTextField getSubmitTimeJFT() {
        return submitTimeJFT;
    }

    public JTextField getServeTimeJFT() {
        return serveTimeJFT;
    }

    public JTextField getPrinterReqJFT() {
        return printerReqJFT;
    }

    public JButton getNewProcessBtn() {
        return newProcessBtn;
    }

    public JButton getLoadFileBtn(){return LoadFileBtn;}

    public JRadioButton getNoGrabRadioBtn() {
        return noGrabRadioBtn;
    }

    public JRadioButton getGrabRadioBtnButton2() {
        return grabRadioBtnButton2;
    }

    public JButton getStartBtn() {
        return startBtn;
    }

    public JTable getCurrentProcessTable() {
        return currentProcessTable;
    }

    public JButton getBlockBtn() {
        return blockBtn;
    }

    public JButton getPauseBtn() {
        return pauseBtn;
    }

    public JButton getContinueBtn() {
        return continueBtn;
    }

    public JTable getReadyProcessTable() {
        return readyProcessTable;
    }

    public JTable getBlockProcessTable() {
        return blockProcessTable;
    }

    public JTable getCreateProcessTable(){return createProcessTable;}

    public JButton getWakeBtn() {
        return wakeBtn;
    }

    public JButton getResetBtn() {
        return resetBtn;
    }

    public JButton getExitBtn() {
        return exitBtn;
    }

    public JTextField getPriorityJFT() {
        return priorityJFT;
    }

    public JLabel getCurrentTimeJFT() {
        return currentTimeJFT;
    }

    public JTabbedPane getMainTabbedPane() {
        return mainTabbedPane;
    }

    public JTable getInputProcessTable() {
        return inputProcessTable;
    }

    public JTable getOutputProcessTable() {
        return outputProcessTable;
    }

    public JMenuItem getLoadMenuItem() {
        return loadMenuItem;
    }

    public JLabel getAvgTurnTime() {
        return avgTurnTime;
    }

    public JLabel getAvgWeightTurnTime() {
        return avgWeightTurnTime;
    }

    public JLabel getCurrentPrinterJFT() {
        return currentPrinterJFT;
    }
}
