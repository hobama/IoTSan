/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AWaitLockOp extends PLockOp
{
    private TWait _wait_;

    public AWaitLockOp()
    {
    }

    public AWaitLockOp(
        TWait _wait_)
    {
        setWait(_wait_);

    }
    public Object clone()
    {
        return new AWaitLockOp(
            (TWait) cloneNode(_wait_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWaitLockOp(this);
    }

    public TWait getWait()
    {
        return _wait_;
    }

    public void setWait(TWait node)
    {
        if(_wait_ != null)
        {
            _wait_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _wait_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_wait_);
    }

    void removeChild(Node child)
    {
        if(_wait_ == child)
        {
            _wait_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_wait_ == oldChild)
        {
            setWait((TWait) newChild);
            return;
        }

    }
}
