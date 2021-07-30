import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testVarVarargsUseArg extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.set(q,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = LuaValue.tableOf($arg,1);
            return varargsOf(new LuaValue[] {a,arg.get(n),arg.get(ONE),arg.get(_2),},arg.get(_3));
         }
      });
      return new TailcallVarargs(env.get(q),varargsOf(a,b,c));
   }
   static final LuaValue n = valueOf("n");
   static final LuaValue _2 = valueOf(2);
   static final LuaValue _3 = valueOf(3);
   static final LuaValue q = valueOf("q");
   static final LuaValue a = valueOf("a");
   static final LuaValue b = valueOf("b");
   static final LuaValue c = valueOf("c");
}