package package02;

import package03.ProjectThree;

import javax.swing.*;

public class ProjectTwo {
    public static void invokeMe() {
        JOptionPane.showMessageDialog(null, "ProjectTwo");
        ProjectThree.invokeMe();
    }

    public static void callMe() {
        JOptionPane.showMessageDialog(null, "ProjectTwo callMe()");
    }
}
