import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testSelfOp extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      return new TailcallVarargs(abcde,sub$1,varargsOf(_2,_4));
   }
   static final LuaValue abcde = valueOf("abcde");
   static final LuaValue sub$1 = valueOf("sub");
   static final LuaValue _2 = valueOf(2);
   static final LuaValue _4 = valueOf(4);
}