package org.eclipse.swt.internal.win32;

/*
 * (c) Copyright IBM Corp. 2000, 2001.
 * All Rights Reserved
 */
public class TEXTMETRIC {
	public int tmHeight;
	public int tmAscent; 
	public int tmDescent;
	public int tmInternalLeading;  
	public int tmExternalLeading;
	public int tmAveCharWidth;
	public int tmMaxCharWidth;
	public int tmWeight; 
	public int tmOverhang;
	public int tmDigitizedAspectX;
	public int tmDigitizedAspectY; 
	public char tmFirstChar;
	public char tmLastChar;
	public char tmDefaultChar; 
	public char tmBreakChar;
	public byte tmItalic;
	public byte tmUnderlined; 
	public byte tmStruckOut;
	public byte tmPitchAndFamily;
	public byte tmCharSet;
	public byte ___MISSING_ALIGNMENT__0; 
	public short ___MISSING_ALIGNMENT__1;
	public static final int sizeof = OS.IsUnicode ? 60 : 56;
}
