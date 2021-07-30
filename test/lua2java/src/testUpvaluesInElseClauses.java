import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testUpvaluesInElseClauses extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      if ( env.get(a).toboolean() ) {
         env.get(foo).call(env.get(bar));
      } else if ( env.get(_G).toboolean() ) {
         if ( env.get(d).toboolean() ) {
            env.get(foo).call(env.get(bar));
         } else {
            final LuaValue y = new ZeroArgFunction(env) {
               public LuaValue call() {
                  return _111;
               }
            };
            return new TailcallVarargs(y,NONE);
         }
      }
      return NONE;
   }
   static final LuaValue a = valueOf("a");
   static final LuaValue foo = valueOf("foo");
   static final LuaValue bar = valueOf("bar");
   static final LuaValue _G = valueOf("_G");
   static final LuaValue d = valueOf("d");
   static final LuaValue _111 = valueOf(111);
}