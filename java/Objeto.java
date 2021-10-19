package java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Objeto extends JFrame{
    JPanel panelImage;
    JPanel panelOptions;
    public Objeto(){
        setTitle("Algoritmo Dijkstra");
        setSize(500,500);
        setLocation(new Point(300,200));
        setLayout(new GridLayout(2,2));
        setResizable(false);

        initComponent();
        initEvent();
    }
    private Void initComponent(){
        this.panelImage = new JPanel();
        this.panelOptions = new JPanel();
        this.add(this.panelImage);
        this.add(this.panelOptions);
    }
    private Void initEvent(){
        this.addWindowListener(new WindowAdapter(){
            public void WindowsClosing(WindowEvent e){
                System.out.println("Cerrando....");
                System.exit(1);
            }
        });
    }
}
