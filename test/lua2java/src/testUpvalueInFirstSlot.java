import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testUpvalueInFirstSlot extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue p = LuaValue.listOf(new LuaValue[]{foo,});
      env.set(bar,new ZeroArgFunction(env) {
         public LuaValue call() {
            return p;
         }
      });
      LuaValue f,s,var;
      Varargs v;
      final Varargs v$1 = env.get(ipairs).invoke(p);
      f = v$1.arg1();
      s = v$1.arg(2);
      var = v$1.arg(3);
      while (true) {
         v = f.invoke(varargsOf(s,var));
         if ((var=v.arg1()).isnil()) break;
         final LuaValue i = var;
         final LuaValue key = v.arg(2);
         env.get(print).call();
      }
      return env.get(bar).call().get(ONE);
   }
   static final LuaValue foo = valueOf("foo");
   static final LuaValue bar = valueOf("bar");
   static final LuaValue ipairs = valueOf("ipairs");
   static final LuaValue print = valueOf("print");
}