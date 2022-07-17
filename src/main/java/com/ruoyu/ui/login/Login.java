package com.ruoyu.ui.login;

import javax.swing.*;

public class Login {
    private String loginusername,loginpassword;

    public Login() {
        JFrame loginFrame = new JFrame();
        JPanel jPanel = new JPanel();
        //设置窗口大小
        loginFrame.setSize(510,340);

        //设置窗口标题
        loginFrame.setTitle("欢迎使用若雨汽车维修管理系统");

        //设置窗口在屏幕中间显示
        loginFrame.setLocationRelativeTo(null);

        //设置大小不可改变
        loginFrame.setResizable(false);

        //点击关闭按钮时，正常退出。
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //设置窗口可见性；true：可见，false：不可见
//        loginFrame.setVisible(true);


/*
-----------------------------------------------------------------------------------------------------------------
    面板部分如下：
 */

        //设置用户名文本框，限制输入位数为16位
        JTextField loginnamejTextField = new JTextField(16);
        loginnamejTextField.setText("董先生");
        //设置密码框，限制输入位数为16位
        JPasswordField jPasswordField = new JPasswordField(16);
        //设置各便签
        JLabel loginnamejLabel = new JLabel("账号：");
        JLabel passwordjLabel = new JLabel("密码：");
        //设置登录和重置按钮
        JButton loginjButton = new JButton("登录");
        JButton resetjButton = new JButton("重置");

        jPanel.setLayout(null);

        loginnamejLabel.setBounds(120,80,80,30);
        jPanel.add(loginnamejLabel);
        loginnamejTextField.setBounds(200,80,180,30);
        jPanel.add(loginnamejTextField);
        passwordjLabel.setBounds(120,120,80,30);
        jPanel.add(passwordjLabel);
        jPasswordField.setBounds(200,120,180,30);
        jPanel.add(jPasswordField);
        loginjButton.setBounds(130,180,80,25);
        jPanel.add(loginjButton);
        resetjButton.setBounds(290,180,80,25);
        jPanel.add(resetjButton);

        loginjButton.addActionListener(e -> {
            loginusername = loginnamejTextField.getText();
            char[] chars = jPasswordField.getPassword();
            loginpassword = String.valueOf(chars);
//            for (char c : chars) {
//                loginpassword = loginpassword + c;
//            }
            if (!new CheckUser().CheckUser(loginusername, loginpassword)){
                System.out.println("账号密码输入有误");

                /*
                ！！！！！！需要增加弹窗提示！！！！！！
                 */


            }else {
                System.out.println("成功进入系统");

                //!!!!!!
                //new InUse();




                //发送Window_closing的消息给窗口，进行响应关闭。
                //loginFrame.dispatchEvent(new WindowEvent(loginFrame,WindowEvent.WINDOW_CLOSING));
                loginFrame.dispose();
            }
        });
        resetjButton.addActionListener(e -> {
            //输入框置空
            loginnamejTextField.setText(null);
            jPasswordField.setText(null);
        });





        loginFrame.add(jPanel);
        loginFrame.setVisible(true);
    }
}
