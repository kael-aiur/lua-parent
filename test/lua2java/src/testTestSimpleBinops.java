import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testTestSimpleBinops extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue b = _2_5.neg();
      return varargsOf(new LuaValue[] {_2.eq(ZERO),b.eq(ZERO),_2.eq(_2),_2.gt(ZERO),},b.gt(ZERO));
   }
   static final LuaValue _2_5 = valueOf(2.5);
   static final LuaValue _2 = valueOf(2);
}