package org.eclipse.swt.events;

/*
 * Copyright (c) 2000, 2002 IBM Corp.  All rights reserved.
 * This file is made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 */

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.internal.SWTEventObject;

/**
 * This is the super class for all typed event classes provided
 * by SWT. Typed events contain particular information which is
 * applicable to the event occurance.
 *
 * @see org.eclipse.swt.widgets.Event
 */
public class TypedEvent extends SWTEventObject {
	
	/**
	 * the display where the event occurred
	 * 
	 * @since 2.0 
	 */	
	public Display display;
		
	/**
	 * the widget that issued the event
	 */
	public Widget widget;
	
	/**
	 * the time that the event occurred
	 */
	public int time;
	
	/**
	 * a field for application use
	 */
	public Object data;

/**
 * Constructs a new instance of this class.
 *
 * @param source the object that fired the event
 */
public TypedEvent(Object object) {
	super(object);
}

/**
 * Constructs a new instance of this class based on the
 * information in the argument.
 *
 * @param e the low level event to initialize the receiver with
 */
public TypedEvent(Event e) {
	super(e.widget);
	this.display = e.display;
	this.widget = e.widget;
	this.time = e.time;
	this.data = e.data;
}

}
