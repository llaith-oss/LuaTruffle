package org.luatruffle.main.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;

/**
 * Created by lucas on 2014-09-14.
 */
@NodeChildren({@NodeChild("leftNode"), @NodeChild("rightNode")})
public abstract class LuaBinaryNode extends LuaExpressionNode {

    protected boolean isEitherString(Object a, Object b) {
        return a instanceof String || b instanceof String;
    }

}
