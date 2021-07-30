import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class sample extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.get(print).call(hello__w);
      return NONE;
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue hello__w = valueOf("hello, world");
}