import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testLoopVarUpvalues extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue $b;
      final LuaValue env$1 = LuaValue.tableOf();
      LuaValue f,s,var;
      Varargs v;
      final Varargs v$1 = env.get(pairs).invoke(env.get(_G));
      f = v$1.arg1();
      s = v$1.arg(2);
      var = v$1.arg(3);
      while (true) {
         v = f.invoke(varargsOf(s,var));
         if ((var=v.arg1()).isnil()) break;
         final LuaValue a = var;
         final LuaValue b = v.arg(2);
         env.set(c,new ZeroArgFunction(env) {
            public LuaValue call() {
               return b;
            }
         });
      }
      final LuaValue e = env$1;
      final LuaValue f$1 = LuaValue.tableOf(new LuaValue[]{a$1,b$1,});
      LuaValue f$2,s$1,var$1;
      Varargs v$2;
      final Varargs v$3 = env.get(pairs).invoke(f$1);
      f$2 = v$3.arg1();
      s$1 = v$3.arg(2);
      var$1 = v$3.arg(3);
      while (true) {
         v$2 = f$2.invoke(varargsOf(s$1,var$1));
         if ((var$1=v$2.arg1()).isnil()) break;
         final LuaValue k = var$1;
         final LuaValue v$4 = v$2.arg(2);
         return (($b=env$1.get(k)).toboolean()?$b:v$4);
      }
      return NONE;
   }
   static final LuaValue pairs = valueOf("pairs");
   static final LuaValue _G = valueOf("_G");
   static final LuaValue c = valueOf("c");
   static final LuaValue a$1 = valueOf("a");
   static final LuaValue b$1 = valueOf("b");
}