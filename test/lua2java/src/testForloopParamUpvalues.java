import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testForloopParamUpvalues extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue f,s,var;
      Varargs v;
      final Varargs v$1 = env.get(ipairs).invoke(LuaValue.listOf(new LuaValue[]{_77,}));
      f = v$1.arg1();
      s = v$1.arg(2);
      var = v$1.arg(3);
      while (true) {
         v = f.invoke(varargsOf(s,var));
         if ((var=v.arg1()).isnil()) break;
         final LuaValue n = var;
         final LuaValue p = v.arg(2);
         env.get(print).call(n_p,n,p);
         env.set(foo,new VarArgFunction(env) {
            public Varargs invoke(Varargs $arg) {
               return varargsOf(p,n);
            }
         });
         return new TailcallVarargs(env.get(foo),NONE);
      }
      return NONE;
   }
   static final LuaValue ipairs = valueOf("ipairs");
   static final LuaValue _77 = valueOf(77);
   static final LuaValue print = valueOf("print");
   static final LuaValue n_p = valueOf("n,p");
   static final LuaValue foo = valueOf("foo");
}