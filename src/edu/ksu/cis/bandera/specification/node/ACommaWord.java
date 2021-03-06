package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.analysis.*;

public final class ACommaWord extends PWord
{
	private TComma _comma_;

	public ACommaWord()
	{
	}
	public ACommaWord(
		TComma _comma_)
	{
		setComma(_comma_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseACommaWord(this);
	}
	public Object clone()
	{
		return new ACommaWord(
			(TComma) cloneNode(_comma_));
	}
	public TComma getComma()
	{
		return _comma_;
	}
	void removeChild(Node child)
	{
		if(_comma_ == child)
		{
			_comma_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_comma_ == oldChild)
		{
			setComma((TComma) newChild);
			return;
		}

	}
	public void setComma(TComma node)
	{
		if(_comma_ != null)
		{
			_comma_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_comma_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_comma_);
	}
}
