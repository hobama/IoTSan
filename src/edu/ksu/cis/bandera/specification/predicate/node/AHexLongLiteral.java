package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AHexLongLiteral extends PLiteral
{
	private THexLongLiteral _hexLongLiteral_;

	public AHexLongLiteral()
	{
	}
	public AHexLongLiteral(
		THexLongLiteral _hexLongLiteral_)
	{
		setHexLongLiteral(_hexLongLiteral_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAHexLongLiteral(this);
	}
	public Object clone()
	{
		return new AHexLongLiteral(
			(THexLongLiteral) cloneNode(_hexLongLiteral_));
	}
	public THexLongLiteral getHexLongLiteral()
	{
		return _hexLongLiteral_;
	}
	void removeChild(Node child)
	{
		if(_hexLongLiteral_ == child)
		{
			_hexLongLiteral_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_hexLongLiteral_ == oldChild)
		{
			setHexLongLiteral((THexLongLiteral) newChild);
			return;
		}

	}
	public void setHexLongLiteral(THexLongLiteral node)
	{
		if(_hexLongLiteral_ != null)
		{
			_hexLongLiteral_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_hexLongLiteral_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_hexLongLiteral_);
	}
}
