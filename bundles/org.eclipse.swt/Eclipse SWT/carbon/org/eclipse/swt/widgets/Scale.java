package org.eclipse.swt.widgets;

/*
 * Copyright (c) 2000, 2002 IBM Corp.  All rights reserved.
 * This file is made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 */

import org.eclipse.swt.internal.carbon.OS;
import org.eclipse.swt.internal.carbon.Rect;

import org.eclipse.swt.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.*;

public class Scale extends Control {
	int increment = 1;
	int pageIncrement = 10;

public Scale (Composite parent, int style) {
	super (parent, checkStyle (style));
}

int actionProc (int theControl, int partCode) {
	Event event = new Event ();
	sendEvent (SWT.Selection);
	return 0;
}

public void addSelectionListener(SelectionListener listener) {
	checkWidget();
	if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
	TypedListener typedListener = new TypedListener(listener);
	addListener(SWT.Selection,typedListener);
	addListener(SWT.DefaultSelection,typedListener);
}

static int checkStyle (int style) {
	return checkBits (style, SWT.HORIZONTAL, SWT.VERTICAL, 0, 0, 0, 0);
}

public Point computeSize (int wHint, int hHint, boolean changed) {
	checkWidget();
	Rect rect = new Rect ();
	OS.GetControlBounds (handle, rect);
	int width = rect.right - rect.left;
	int height = rect.bottom - rect.top;
	boolean horizontal = width > height;
	short [] base = new short [1];
	OS.GetBestControlRect (handle, rect, base);
	width = rect.right - rect.left;
	height = rect.bottom - rect.top;
	if ((style & SWT.HORIZONTAL) != 0) {
		if (!horizontal) height = width;
		width = height * 10;
	} else {
		if (horizontal) width = height;
		height = width * 10;
	}
	if (wHint != SWT.DEFAULT) width = wHint;
	if (hHint != SWT.DEFAULT) height = hHint;
	return new Point (width, height);
}

void createHandle () {
	Display display = getDisplay ();
	int [] outControl = new int [1];
	int window = OS.GetControlOwner (parent.handle);
	OS.CreateSliderControl (window, null, 0, 0, 100, OS.kControlSliderDoesNotPoint, (short)0, true, display.actionProc, outControl);
	if (outControl [0] == 0) error (SWT.ERROR_NO_HANDLES);
	handle = outControl [0];
	OS.HIViewAddSubview (parent.handle, handle);
	OS.HIViewSetZOrder (handle, OS.kHIViewZOrderBelow, 0);
}

public int getIncrement () {
	checkWidget();
	return increment;
}

public int getMaximum () {
	checkWidget();
    return  OS.GetControl32BitMaximum (handle);
}

public int getMinimum () {
	checkWidget();
    return OS.GetControl32BitMinimum (handle);
}

public int getPageIncrement () {
	checkWidget();
    return pageIncrement;
}

public int getSelection () {
	checkWidget();
    return OS.GetControl32BitValue (handle);
}

public void removeSelectionListener(SelectionListener listener) {
	checkWidget();
	if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
	if (eventTable == null) return;
	eventTable.unhook(SWT.Selection, listener);
	eventTable.unhook(SWT.DefaultSelection,listener);
}

public void setIncrement (int value) {
	checkWidget();
	if (value < 1) return;
	increment= value;
}

public void setMaximum (int value) {
	checkWidget();
	if (value < 0) return;
	if (OS.GetControl32BitValue(handle) > value) OS.SetControl32BitValue(handle, value);
	OS.SetControl32BitMaximum(handle, value);
}

public void setMinimum (int value) {
	checkWidget();
	if (value < 0) return;
	if (OS.GetControl32BitValue (handle) < value) OS.SetControl32BitValue(handle, value);
	OS.SetControl32BitMinimum (handle, value);
}

public void setPageIncrement (int value) {
	checkWidget();
	if (value < 1) return;
	pageIncrement = value;
}

public void setSelection (int value) {
	checkWidget();
	if (value < 0) return;
	OS.SetControl32BitValue (handle, value);
}

}
