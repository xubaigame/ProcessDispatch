package main;

import main.controller.MainFrameController;

/**
 * @Auther: Administrator
 * @Date: 2018/11/2 13:46
 * @Description:
 */
public class Runner {

    public static void main(String[] args) {
        MainFrameController mainFrameController = new MainFrameController();

        mainFrameController.showMainFrameWindow();
    }
}
