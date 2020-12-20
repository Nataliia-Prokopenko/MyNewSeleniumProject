package com.it.project;

import com.it.project.helpers.CommonHelper;
import com.it.project.helpers.DashBoardHelper;
import com.it.project.helpers.LoginHelper;
import com.it.project.helpers.MakeMessageHelper;
import com.it.project.users.User;

public class App {
    public CommonHelper common;
    public DashBoardHelper dashBoard;
    public LoginHelper login;
    public MakeMessageHelper makeMessage;

    public App() {
        common = new CommonHelper();
        dashBoard = new DashBoardHelper();
        login = new LoginHelper();
        makeMessage = new MakeMessageHelper();
    }

    public boolean login(User user){
        login.login(user);
        common.takeSnapShot();
        return dashBoard.userIsLogined(user);
    }
}
