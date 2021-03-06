package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class TShiftLeft extends Token
{
	public TShiftLeft()
	{
		super.setText("<<");
	}
	public TShiftLeft(int line, int pos)
	{
		super.setText("<<");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTShiftLeft(this);
	}
	public Object clone()
	{
	  return new TShiftLeft(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TShiftLeft text.");
	}
}
