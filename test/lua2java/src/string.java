import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class string extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      env.get(print).call(valueOf(3+4));
      return _8;
   }
   static final LuaValue print = valueOf("print");
   static final LuaValue _8 = valueOf(8);
}