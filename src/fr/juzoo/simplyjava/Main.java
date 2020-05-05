package fr.juzoo.simplyjava;


import fr.juzoo.simplyjava.func.Func;
import fr.juzoo.simplyjava.func.SFrame;

public class Main {
    public static void main(String[] args) {
        SFrame frame = new SFrame();
        frame.setTitle("Atmos");
        frame.setVisible(true);
        frame.openFrame();
        if(frame.getWeight() == 722){
            Func func = new Func();
            func.sendConsoleMessage("Lol");
        }
    }
}
