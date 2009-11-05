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
 * Automated Test Suite for class org.eclipse.swt.ole.win32.OleListener
 *
 * @see org.eclipse.swt.ole.win32.OleListener
 */
public class Test_org_eclipse_swt_ole_win32_OleListener extends SwtTestCase {

public Test_org_eclipse_swt_ole_win32_OleListener(String name) {
	super(name);
}

public static void main(String[] args) {
	TestRunner.run(suite());
}

protected void setUp() {
}

protected void tearDown() {
}

public void test_handleEventLorg_eclipse_swt_ole_win32_OleEvent() {
	warnUnimpl("Test test_handleEventLorg_eclipse_swt_ole_win32_OleEvent not written");
}


public static Test suite() {
	TestSuite suite = new TestSuite();
	java.util.Vector methodNames = methodNames();
	java.util.Enumeration e = methodNames.elements();
	while (e.hasMoreElements()) {
		suite.addTest(new Test_org_eclipse_swt_ole_win32_OleListener((String)e.nextElement()));
	}
	return suite;
}

public static java.util.Vector methodNames() {
	java.util.Vector methodNames = new java.util.Vector();
	methodNames.addElement("test_handleEventLorg_eclipse_swt_ole_win32_OleEvent");
	return methodNames;
}

protected void runTest() throws Throwable {
	if (getName().equals("test_handleEventLorg_eclipse_swt_ole_win32_OleEvent")) test_handleEventLorg_eclipse_swt_ole_win32_OleEvent();
}
}