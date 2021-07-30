import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testLoadedNilUpvalue extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      LuaValue $b;
      final LuaValue a = env.get(print).call();
      final LuaValue b = (!($b=env.get(c)).toboolean()?$b:LuaValue.tableOf(new LuaValue[]{d,env.get(e),}));
      final LuaValue g = new ZeroArgFunction(env) {
         public LuaValue call() {
            return NIL;
         }
      };
      return new TailcallVarargs(g,NONE);
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue c = valueOf("c");
   static final LuaValue d = valueOf("d");
   static final LuaValue e = valueOf("e");
}