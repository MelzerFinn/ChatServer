package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Markus
 *
 */
public class Logger {
	
	public static String path = "/tmp/ChatServerLogs";

	/**
	 * This method writes logs
	 * 
	 * @author Markus
	 * @param message
	 *            The message which will be added to the log
	 * @throws IOException
	 */
	public static void log(String message) {
		try {
			// Creating the Date
			Date Date = new Date();
			SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yy - HH:mm:ss");

			// Creating the DataFolder
			File dataFolder = new File(path);
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			}

			// Creating the output File
			File saveTo = new File(path, "latest.log");
			if (!saveTo.exists()) {
				saveTo.createNewFile();
			}

			// Logging the Data with Date and Time
			FileWriter fw = new FileWriter(saveTo, true);

			PrintWriter pw = new PrintWriter(fw);

			pw.println(ft.format(Date) + "     " + message);

			pw.flush();

			pw.close();
		} catch (Exception e) {
			main.Main.ErrorQuit(e);
		}
	}
	
	public static void elog(String message) {
		try {
			// Creating the Date
			Date Date = new Date();
			SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yy - HH:mm:ss");

			// Creating the DataFolder
			File dataFolder = new File(path);
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			}

			// Creating the output File
			File saveTo = new File(path, "latest.log");
			if (!saveTo.exists()) {
				saveTo.createNewFile();
			}

			// Logging the Data with Date and Time
			FileWriter fw = new FileWriter(saveTo, true);

			PrintWriter pw = new PrintWriter(fw);

			pw.println(ft.format(Date) + "     " + message);

			pw.flush();

			pw.close();
		} catch (Exception e) {
			//nothin to do here
		}
	}
	
	public static void clear(){
		File x = new File(path, "latest.log");
		if (x.exists()) x.delete();
	}
}
