import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testNestedUpvalues extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue[] x = {_3};
      final LuaValue[] y = {_5};
      final LuaValue f = new ZeroArgFunction(env) {
         public LuaValue call() {
            return y[0];
         }
      };
      final LuaValue g = new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue x1 = $arg.arg1();
            final LuaValue y1 = $arg.arg(2);
            x[0] = x1;
            y[0] = y1;
            return varargsOf(x[0],y[0]);
         }
      };
      return varargsOf(f.call(),g.invoke(varargsOf(_8,_9)));
   }
   static final LuaValue _3 = valueOf(3);
   static final LuaValue _5 = valueOf(5);
   static final LuaValue _8 = valueOf(8);
   static final LuaValue _9 = valueOf(9);
}