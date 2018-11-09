package com.example.swt;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class Snippet33 {

public static void main (String [] args) {
	Display display = new Display ();
	Shell shell = new Shell (display);
	shell.open ();
	DirectoryDialog dialog = new DirectoryDialog (shell);
	String platform = SWT.getPlatform();
	dialog.setFilterPath (platform.equals("win32") ? "c:\\" : "/");
	System.out.println ("RESULT=" + dialog.open ());
	while (!shell.isDisposed()) {
		if (!display.readAndDispatch ()) display.sleep ();
	}
	display.dispose ();
}

}
