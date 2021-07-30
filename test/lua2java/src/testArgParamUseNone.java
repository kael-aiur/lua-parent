import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testArgParamUseNone extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.set(v,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg$1 = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = LuaValue.tableOf($arg,1);
            return new TailcallVarargs(env.get(type$1),arg);
         }
      });
      return new TailcallVarargs(env.get(v),abc);
   }
   static final LuaValue type$1 = valueOf("type");
   static final LuaValue v = valueOf("v");
   static final LuaValue abc = valueOf("abc");
}