package com.example.swt;


import static org.eclipse.swt.events.SelectionListener.*;

import org.eclipse.swt.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class Snippet250 {

public static void main (String [] args) {
	Display display = new Display ();
	Shell shell = new Shell (display);
	shell.setLayout (new RowLayout ());

	DateTime calendar = new DateTime (shell, SWT.CALENDAR | SWT.CALENDAR_WEEKNUMBERS);
	calendar.addSelectionListener (widgetSelectedAdapter(e -> System.out.println ("calendar date changed")));

	DateTime calendarDropDown = new DateTime (shell, SWT.DROP_DOWN | SWT.CALENDAR_WEEKNUMBERS);
	calendarDropDown.addSelectionListener (
		widgetSelectedAdapter(e -> System.out.println ("calendar date changed via drop-down")));

	DateTime time = new DateTime (shell, SWT.TIME);
	time.addSelectionListener (widgetSelectedAdapter(e -> System.out.println ("time changed")));

	shell.pack ();
	shell.open ();
	while (!shell.isDisposed ()) {
		if (!display.readAndDispatch ()) display.sleep ();
	}
	display.dispose ();
}
}