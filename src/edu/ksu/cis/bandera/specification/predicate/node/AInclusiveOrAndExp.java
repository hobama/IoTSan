package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AInclusiveOrAndExp extends PAndExp
{
	private PInclusiveOrExp _inclusiveOrExp_;

	public AInclusiveOrAndExp()
	{
	}
	public AInclusiveOrAndExp(
		PInclusiveOrExp _inclusiveOrExp_)
	{
		setInclusiveOrExp(_inclusiveOrExp_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAInclusiveOrAndExp(this);
	}
	public Object clone()
	{
		return new AInclusiveOrAndExp(
			(PInclusiveOrExp) cloneNode(_inclusiveOrExp_));
	}
	public PInclusiveOrExp getInclusiveOrExp()
	{
		return _inclusiveOrExp_;
	}
	void removeChild(Node child)
	{
		if(_inclusiveOrExp_ == child)
		{
			_inclusiveOrExp_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_inclusiveOrExp_ == oldChild)
		{
			setInclusiveOrExp((PInclusiveOrExp) newChild);
			return;
		}

	}
	public void setInclusiveOrExp(PInclusiveOrExp node)
	{
		if(_inclusiveOrExp_ != null)
		{
			_inclusiveOrExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_inclusiveOrExp_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_inclusiveOrExp_);
	}
}
