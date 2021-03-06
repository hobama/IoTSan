/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AInternChoice extends PChoice
{
    private PLhs _lhs_;
    private TAssign _assign_;
    private TInternchoose _internchoose_;
    private TLparen _lparen_;
    private PValue _value_;
    private final LinkedList _rest_ = new TypedLinkedList(new Rest_Cast());
    private TRparen _rparen_;
    private TSemicolon _semicolon_;

    public AInternChoice()
    {
    }

    public AInternChoice(
        PLhs _lhs_,
        TAssign _assign_,
        TInternchoose _internchoose_,
        TLparen _lparen_,
        PValue _value_,
        List _rest_,
        TRparen _rparen_,
        TSemicolon _semicolon_)
    {
        setLhs(_lhs_);

        setAssign(_assign_);

        setInternchoose(_internchoose_);

        setLparen(_lparen_);

        setValue(_value_);

        {
            this._rest_.clear();
            this._rest_.addAll(_rest_);
        }

        setRparen(_rparen_);

        setSemicolon(_semicolon_);

    }

    public AInternChoice(
        PLhs _lhs_,
        TAssign _assign_,
        TInternchoose _internchoose_,
        TLparen _lparen_,
        PValue _value_,
        XPChoicetail _rest_,
        TRparen _rparen_,
        TSemicolon _semicolon_)
    {
        setLhs(_lhs_);

        setAssign(_assign_);

        setInternchoose(_internchoose_);

        setLparen(_lparen_);

        setValue(_value_);

        if(_rest_ != null)
        {
            while(_rest_ instanceof X1PChoicetail)
            {
                this._rest_.addFirst(((X1PChoicetail) _rest_).getPChoicetail());
                _rest_ = ((X1PChoicetail) _rest_).getXPChoicetail();
            }
            this._rest_.addFirst(((X2PChoicetail) _rest_).getPChoicetail());
        }

        setRparen(_rparen_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new AInternChoice(
            (PLhs) cloneNode(_lhs_),
            (TAssign) cloneNode(_assign_),
            (TInternchoose) cloneNode(_internchoose_),
            (TLparen) cloneNode(_lparen_),
            (PValue) cloneNode(_value_),
            cloneList(_rest_),
            (TRparen) cloneNode(_rparen_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInternChoice(this);
    }

    public PLhs getLhs()
    {
        return _lhs_;
    }

    public void setLhs(PLhs node)
    {
        if(_lhs_ != null)
        {
            _lhs_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lhs_ = node;
    }

    public TAssign getAssign()
    {
        return _assign_;
    }

    public void setAssign(TAssign node)
    {
        if(_assign_ != null)
        {
            _assign_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _assign_ = node;
    }

    public TInternchoose getInternchoose()
    {
        return _internchoose_;
    }

    public void setInternchoose(TInternchoose node)
    {
        if(_internchoose_ != null)
        {
            _internchoose_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _internchoose_ = node;
    }

    public TLparen getLparen()
    {
        return _lparen_;
    }

    public void setLparen(TLparen node)
    {
        if(_lparen_ != null)
        {
            _lparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lparen_ = node;
    }

    public PValue getValue()
    {
        return _value_;
    }

    public void setValue(PValue node)
    {
        if(_value_ != null)
        {
            _value_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _value_ = node;
    }

    public LinkedList getRest()
    {
        return _rest_;
    }

    public void setRest(List list)
    {
        _rest_.clear();
        _rest_.addAll(list);
    }

    public TRparen getRparen()
    {
        return _rparen_;
    }

    public void setRparen(TRparen node)
    {
        if(_rparen_ != null)
        {
            _rparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rparen_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_lhs_)
            + toString(_assign_)
            + toString(_internchoose_)
            + toString(_lparen_)
            + toString(_value_)
            + toString(_rest_)
            + toString(_rparen_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_lhs_ == child)
        {
            _lhs_ = null;
            return;
        }

        if(_assign_ == child)
        {
            _assign_ = null;
            return;
        }

        if(_internchoose_ == child)
        {
            _internchoose_ = null;
            return;
        }

        if(_lparen_ == child)
        {
            _lparen_ = null;
            return;
        }

        if(_value_ == child)
        {
            _value_ = null;
            return;
        }

        if(_rest_.remove(child))
        {
            return;
        }

        if(_rparen_ == child)
        {
            _rparen_ = null;
            return;
        }

        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_lhs_ == oldChild)
        {
            setLhs((PLhs) newChild);
            return;
        }

        if(_assign_ == oldChild)
        {
            setAssign((TAssign) newChild);
            return;
        }

        if(_internchoose_ == oldChild)
        {
            setInternchoose((TInternchoose) newChild);
            return;
        }

        if(_lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(_value_ == oldChild)
        {
            setValue((PValue) newChild);
            return;
        }

        for(ListIterator i = _rest_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(_rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }

    private class Rest_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PChoicetail node = (PChoicetail) o;

            if((node.parent() != null) &&
                (node.parent() != AInternChoice.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AInternChoice.this))
            {
                node.parent(AInternChoice.this);
            }

            return node;
        }
    }
}
