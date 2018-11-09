package com.example.swt;

import org.eclipse.swt.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class Snippet280 {

public static void main (String [] args) {
	final Display display = new Display ();
	final Shell shell = new Shell (display, SWT.SHELL_TRIM | SWT.NO_BACKGROUND);
	shell.setLayout(new FillLayout ());
	shell.addListener (SWT.Paint, e -> {
		GC gc = e.gc;
		Rectangle rect = shell.getClientArea ();
		Color color1 = new Color (display, 234, 246, 253);
		Color color2 = new Color (display, 217, 240, 252);
		gc.setForeground(color1);
		gc.setBackground(color2);
		gc.fillGradientRectangle (rect.x, rect.y, rect.width, rect.height / 2, true);
		color1.dispose ();
		color2.dispose ();
		Color color3 = new Color (display, 190, 230, 253);
		Color color4 = new Color (display, 167, 217, 245);
		gc.setForeground(color3);
		gc.setBackground(color4);
		gc.fillGradientRectangle (rect.x, rect.y + (rect.height / 2), rect.width, rect.height / 2 + 1, true);
		color3.dispose ();
		color4.dispose ();

	});
	shell.setSize (200, 64);
	shell.open ();
	while (!shell.isDisposed ()) {
		if (!display.readAndDispatch ())
			display.sleep ();
	}
	display.dispose ();
}

}