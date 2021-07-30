import org.luaj.vm2.*;
import org.luaj.vm2.lib.*;
public class testNonAsciiStringLiterals extends VarArgFunction {
   public Varargs onInvoke(Varargs $arg) {
      final LuaValue t = LuaValue.listOf(new LuaValue[]{}, env.get(string).get(byte$1).invoke(varargsOf(________,ONE,________.len())));
      return new TailcallVarargs(env.get(table).get(concat$1),varargsOf(t,_));
   }
   static final LuaValue string = valueOf("string");
   static final LuaValue byte$1 = valueOf("byte");
   static final LuaValue ________ = valueOf(new byte[]{7,8,12,'\n','\t',11,-123,-34});
   static final LuaValue table = valueOf("table");
   static final LuaValue concat$1 = valueOf("concat");
   static final LuaValue _ = valueOf(",");
}