/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.tests.junit;

import junit.framework.*;
import junit.textui.*;

/**
 * Automated Test Suite for class org.eclipse.swt.events.SelectionListener
 *
 * @see org.eclipse.swt.events.SelectionListener
 */
public class Test_org_eclipse_swt_events_SelectionListener extends SwtTestCase {

public Test_org_eclipse_swt_events_SelectionListener(String name) {
	super(name);
}

public static void main(String[] args) {
	TestRunner.run(suite());
}

protected void setUp() {
}

protected void tearDown() {
}

public void test_widgetDefaultSelectedLorg_eclipse_swt_events_SelectionEvent() {
	warnUnimpl("Test test_widgetDefaultSelectedLorg_eclipse_swt_events_SelectionEvent not written");
}

public void test_widgetSelectedLorg_eclipse_swt_events_SelectionEvent() {
	warnUnimpl("Test test_widgetSelectedLorg_eclipse_swt_events_SelectionEvent not written");
}

public static Test suite() {
	TestSuite suite = new TestSuite();
	java.util.Vector methodNames = methodNames();
	java.util.Enumeration e = methodNames.elements();
	while (e.hasMoreElements()) {
		suite.addTest(new Test_org_eclipse_swt_events_SelectionListener((String)e.nextElement()));
	}
	return suite;
}

public static java.util.Vector methodNames() {
	java.util.Vector methodNames = new java.util.Vector();
	methodNames.addElement("test_widgetDefaultSelectedLorg_eclipse_swt_events_SelectionEvent");
	methodNames.addElement("test_widgetSelectedLorg_eclipse_swt_events_SelectionEvent");
	return methodNames;
}
protected void runTest() throws Throwable {
	if (getName().equals("test_widgetDefaultSelectedLorg_eclipse_swt_events_SelectionEvent")) test_widgetDefaultSelectedLorg_eclipse_swt_events_SelectionEvent();
	else if (getName().equals("test_widgetSelectedLorg_eclipse_swt_events_SelectionEvent")) test_widgetSelectedLorg_eclipse_swt_events_SelectionEvent();
}
}