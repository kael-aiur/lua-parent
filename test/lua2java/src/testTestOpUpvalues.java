import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testTestOpUpvalues extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue $b;
      env.get(print).call((($b=(!($b=NIL).toboolean()?$b:T)).toboolean()?$b:F));
      env.set(foo,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            return varargsOf(ONE,_2,_3);
         }
      });
      return new TailcallVarargs(env.get(foo),NONE);
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue T = valueOf("T");
   static final LuaValue F = valueOf("F");
   static final LuaValue _2 = valueOf(2);
   static final LuaValue _3 = valueOf(3);
   static final LuaValue foo = valueOf("foo");
}