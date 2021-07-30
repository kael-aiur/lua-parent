import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testUpvalues extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue a = new OneArgFunction(env) {
         public LuaValue call(LuaValue x$0) {
            final LuaValue x = x$0;
            return new OneArgFunction(env) {
               public LuaValue call(LuaValue y) {
                  return valueOf(x.checkdouble()+y.checkdouble());
               }
            };
         }
      };
      final LuaValue b = a.call(_222);
      final LuaValue c = b.call(_777);
      env.get(print).call(c_,c);
      return c;
   }
   static final LuaValue _222 = valueOf(222);
   static final LuaValue _777 = valueOf(777);
   static final LuaValue print = valueOf("print");
   static final LuaValue c_ = valueOf("c=");
}