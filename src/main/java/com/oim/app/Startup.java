package com.oim.app;

import javax.swing.UIManager;

import com.oim.fx.app.AppStartup;
import com.oim.fx.app.Launcher;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author: XiaHui
 * @date: 2018-02-28 13:13:01
 */
public class Startup extends Application {

	Launcher startup = new Launcher();

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			java.util.logging.Logger.getLogger(AppStartup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
	}
}
