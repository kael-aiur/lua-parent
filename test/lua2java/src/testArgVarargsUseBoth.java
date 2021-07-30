import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testArgVarargsUseBoth extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.set(v,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue arg$1 = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            return varargsOf(arg,$arg);
         }
      });
      return new TailcallVarargs(env.get(v),varargsOf(a,b,c));
   }
   static final LuaValue v = valueOf("v");
   static final LuaValue a = valueOf("a");
   static final LuaValue b = valueOf("b");
   static final LuaValue c = valueOf("c");
}