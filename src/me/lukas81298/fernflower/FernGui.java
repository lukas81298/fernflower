package me.lukas81298.fernflower;

import org.jetbrains.java.decompiler.main.Fernflower;


public class FernGui {

    private static FernGui inst;
    
    public static FernGui getInstance() {
	return inst;
    }
    
    private Fernflower fernflower = new Fernflower(provider, saver, options, logger);
    public static void main(String[] args) {
	inst = new FernGui();
    }
}
