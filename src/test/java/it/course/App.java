package it.course;

import helpers.*;

public class App {
    public CloseHelper close;
    public LoginHelper login;
    public WriteHelper write;
    public MakeMessageHelp makeMessag;
    public ConfirmMailHelper newMailInfo;

    public App() {
        close = new CloseHelper();
        login = new LoginHelper();
        write = new WriteHelper();
        makeMessag = new MakeMessageHelp();
        newMailInfo= new ConfirmMailHelper();
    }
}
