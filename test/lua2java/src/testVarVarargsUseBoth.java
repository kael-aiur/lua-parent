import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testVarVarargsUseBoth extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.set(r,new VarArgFunction(env) {
         public Varargs invoke(Varargs $arg) {
            final LuaValue a = $arg.arg1();
            $arg = $arg.subargs(2);
            final LuaValue arg = NIL;
            return varargsOf(a,env.get(type$1).call(arg),$arg);
         }
      });
      return new TailcallVarargs(env.get(r),varargsOf(a,b,c));
   }
   static final LuaValue type$1 = valueOf("type");
   static final LuaValue r = valueOf("r");
   static final LuaValue a = valueOf("a");
   static final LuaValue b = valueOf("b");
   static final LuaValue c = valueOf("c");
}